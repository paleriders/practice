package com.atlearn.practice.enums;

public enum ResultEnum {
    ok(200, "success"),error(500, "error");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
