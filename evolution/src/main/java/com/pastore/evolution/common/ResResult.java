package com.pastore.evolution.common;

import com.pastore.evolution.exception.BizCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 通用返回对象
 *
 * @author Qiao.Zhang
 * @version 1.0
 * @date 2021/5/18 上午10:20
 */
@Getter
@Setter
@AllArgsConstructor
public class ResResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResResult(BizCodeEnum bizCodeEnum) {
        this(bizCodeEnum.getCode(), bizCodeEnum.getDesc());
    }

    public ResResult(BizCodeEnum bizCodeEnum, String msg) {
        this(bizCodeEnum.getCode(), msg, null);
    }

    public ResResult(Integer code, String msg) {
        this(code, msg, null);
    }

    public ResResult(BizCodeEnum bizCodeEnum, T data) {
        this(bizCodeEnum.getCode(), bizCodeEnum.getDesc(), data);
    }

    /**
     * 成功返回结果
     */
    public static <T> ResResult<T> success() {
        return new ResResult<>(BizCodeEnum.SUCCESS);
    }

    public static <T> ResResult<T> success(String msg) {
        return new ResResult<>(BizCodeEnum.SUCCESS, msg);
    }

    public static <T> ResResult<T> success(T data) {
        return new ResResult<>(BizCodeEnum.SUCCESS, data);
    }

    public static <T> ResResult<T> success(String msg, T data) {
        return new ResResult<>(BizCodeEnum.SUCCESS.getCode(), msg, data);
    }

    /**
     * 返回失败结果
     */
    public static <T> ResResult<T> fail() {
        return new ResResult<>(BizCodeEnum.OPERATION_FAILED);
    }

    public static <T> ResResult<T> fail(String msg) {
        return new ResResult<>(BizCodeEnum.OPERATION_FAILED, msg);
    }

    public static <T> ResResult<T> fail(T data) {
        return new ResResult<>(BizCodeEnum.OPERATION_FAILED, data);
    }

    public static <T> ResResult<T> fail(String msg, T data) {
        return new ResResult<>(BizCodeEnum.OPERATION_FAILED.getCode(), msg, data);
    }
}
