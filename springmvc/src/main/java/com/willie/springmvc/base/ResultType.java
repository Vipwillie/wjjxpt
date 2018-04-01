package com.willie.springmvc.base;

/**
 * <p>功能 描述:返回结果类型</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/2/2 10:37</p>
 */
public enum ResultType {
    ERROR(-1, "操作失败"),
    SUCCESS(0, "操作成功");

    private Integer code;
    private String message;

    ResultType(Integer code, String message) {
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
