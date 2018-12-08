package com.github.rural.commons.vo;

import lombok.Data;

/**
 * Created by xiehf on 17:08
 * Concat 370693739@qq.com
 **/
@Data
public class RespVo<T> {

    private int code;

    private String msg;

    private T data;

    public RespVo(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RespVo() {
    }

    public static <T>RespVo<T> success() {
        return new RespVo<T>(0, "", null);
    }

    public static <T>RespVo<T> success(T data) {
        return new RespVo<T>(0, "", data);
    }
}
