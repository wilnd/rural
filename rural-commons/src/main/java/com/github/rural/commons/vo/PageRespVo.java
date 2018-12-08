package com.github.rural.commons.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by xiehf on 17:08
 * Concat 370693739@qq.com
 **/
@Data
public class PageRespVo<T> {

    private long count;

    private int code;

    private String msg;

    private List<T> data;


    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public PageRespVo(int code, String msg, long count, List<T> data) {
        this.count = count;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public PageRespVo() {
    }

    public static <T> PageRespVo<T> success() {
        return new PageRespVo<T>(0, "", 0, null);
    }

    public static <T> PageRespVo<T> success(long count, List<T> data) {
        return new PageRespVo<T>(0, "", count, data);
    }
}
