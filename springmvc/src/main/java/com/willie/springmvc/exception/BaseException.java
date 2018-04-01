package com.willie.springmvc.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/2 10:07</p>
 */
public class BaseException extends RuntimeException {
    private Logger logger = LoggerFactory.getLogger(getClass());
    public String message;

    public BaseException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
