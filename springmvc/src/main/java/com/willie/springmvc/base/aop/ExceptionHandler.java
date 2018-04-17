package com.willie.springmvc.base.aop;

import com.willie.springmvc.base.Result;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能 描述:使用AOP统一处理方法返回信息</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/3/5 10:06</p>
 */
public class ExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    /**
     * 处理Controller中的方法
     *
     * @param proceedingJoinPoint
     * @return
     */
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
    private Result<?> handlerException(ProceedingJoinPoint pjp, Throwable throwable) {
        Result<?> result = new Result();
        //已知异常
        result.setMessage(throwable.getLocalizedMessage());
        result.setCode(Result.FAIL);
        return result;
    }
}