package com.willie.springmvc.base.response;

import java.io.Serializable;

/**
 * <p>功能 描述:返回结果对象</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/2 10:36</p>
 */
public class Result<T> implements Serializable {
    public static final int SUCCESS = 0;
    public static final int FAIL = -1;
    public static final int NO_PERMISSION = 2;
    private int code = SUCCESS;
    private String message = "success";
    private T data;

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public Result(Throwable throwable) {
        this.message = throwable.toString();
        this.code = FAIL;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "Code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
