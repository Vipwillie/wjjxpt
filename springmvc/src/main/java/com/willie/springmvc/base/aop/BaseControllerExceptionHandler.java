package com.willie.springmvc.base.aop;

import com.willie.springmvc.base.response.Result;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <p>功能 描述:使用AOP统一处理方法返回信息</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/5 10:06</p>
 */
@Aspect
@Component
public class BaseControllerExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(BaseControllerExceptionHandler.class);

    @Pointcut("execution(* com.willie.springmvc.controller.*.*.*(..))")
    public void cutPoint() {
    }

    /**
     * 处理Controller中的方法
     *
     * @param pjp 切入连接点
     * @return 环绕通知
     */
    @Around("cutPoint()")
    public Result<?> handlerControllerMethod(ProceedingJoinPoint pjp) {
        Result<?> result = null;
        try {
            long startTime = System.currentTimeMillis();
            result = (Result<?>) pjp.proceed();
            Signature signature = pjp.getSignature();
            long endTime = System.currentTimeMillis();
            logger.info("Controller:[{}],执行方法[{}],耗时:[{}]毫秒", new Object[]{signature.getDeclaringTypeName(), signature.getName(), endTime - startTime});
        } catch (Throwable throwable) {
            result = handlerException(pjp, throwable);
        }
        return result;
    }

    /**
     * 异常处理
     *
     * @param pjp 切入连接点
     * @param throwable 异常
     * @return 异常通知
     */
    @AfterThrowing(value = "cutPoint()", throwing = "throwable")
    public Result<?> handlerException(ProceedingJoinPoint pjp, Throwable throwable) {
        Result<?> result = new Result();
        //已知异常
        result.setMessage(throwable.getLocalizedMessage());
        result.setCode(Result.FAIL);
        Signature signature = pjp.getSignature();
        logger.error("Controller:[{}],方法[{}]出现异常，异常信息:[{}]", new Object[]{signature.getDeclaringTypeName(), signature.getName(), throwable.getLocalizedMessage()});
        return result;
    }
}
