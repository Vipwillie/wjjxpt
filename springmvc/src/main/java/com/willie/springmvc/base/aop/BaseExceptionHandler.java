package com.willie.springmvc.base.aop;

import com.willie.springmvc.base.Result;
import org.aspectj.lang.ProceedingJoinPoint;
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
public class BaseExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    @Pointcut("execution(* com.willie.springmvc.controller.*.*.*(..))")
    public void cutPoint() {
    }

    /**
     * 处理Controller中的方法
     *
     * @param proceedingJoinPoint
     * @return
     */
    @Around("cutPoint()")
    public Object handlerControllerMethod(ProceedingJoinPoint proceedingJoinPoint) {
        long startTime = System.currentTimeMillis();
        Result<?> result = null;
        try {
            result = (Result<?>) proceedingJoinPoint.proceed();
            long endTime = System.currentTimeMillis();
            logger.info("used time:[{}]毫秒", endTime - startTime);
        } catch (Throwable throwable) {
            result = handlerException(proceedingJoinPoint, throwable);
        }
        return result;
    }

    /**
     * 异常处理
     *
     * @param pjp
     * @param throwable
     * @return
     */
    @AfterThrowing(value = "cutPoint()",throwing="throwable")
    private Result<?> handlerException(ProceedingJoinPoint pjp, Throwable throwable) {
        Result<?> result = new Result();
        //已知异常
        result.setMessage(throwable.getLocalizedMessage());
        result.setCode(Result.FAIL);
        return result;
    }
}
