package com.lyg.instock.utils;

/**
 * @description:
 * @author: lyg.liu
 * @date: 2021/4/16 15:10
 */

public class CommonResponse<T> {
    private Integer code;

    private String message;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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
        return "CommonReponse [code=" + code + ", message=" + message + ", data=" + data + "]";
    }
}