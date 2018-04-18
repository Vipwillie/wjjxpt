package com.willie.springmvc.base.exception;

/**
 * <p>功能 描述:异常类型</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/2 10:18</p>
 */
public enum ExceptionTypeEnum {
    UN_KNOW_EXCEPTION(1, "未知异常!"),
    CUSTOM_EXCEPTION(2, "自定义异常!");
    private Integer code;
    private String message;

    ExceptionTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
