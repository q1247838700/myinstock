package com.lyg.instock.utils;

/**
 * @author van
 * @date
 */
public class ResultBuilder {

    /**
     * @param code
     * @param message
     * @param data
     * @return
     */
    public static <T> CommonResponse<T> buildResult(Integer code, String message,
                                                    T data) {
        CommonResponse<T> comRes = new CommonResponse<T>();
        comRes.setCode(code);
        comRes.setMessage(message);
        comRes.setData(data);
        return comRes;
    }

    /**
     * @param data
     * @return
     */
    public static <T> CommonResponse<T> buildSuccessResult(T data) {
        CommonResponse<T> comRes = new CommonResponse<T>();
        comRes.setCode(200);
        comRes.setMessage("success");
        comRes.setData(data);
        return comRes;
    }
}

