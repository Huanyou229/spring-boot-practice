package top.hyzhu.springboot.exception.result;

import lombok.Data;
import top.hyzhu.springboot.exception.enums.ErrorCode;

/**
 * @Author: zhy
 * @Description: Result
 * @Date: 2024-10-15 13:55
 **/
@Data
public class Result<T> {
    private int code = 0;
    private String msg = "success";
    private T data;
    public static <T> Result<T> ok() {
        return ok(null);
    }
    public static <T> Result<T> ok(T data) {
        Result<T> result = new Result<>();
        result.setData(data);
        return result;
    }
    public static <T> Result<T> error() {
        return error(ErrorCode.INTERNAL_SERVER_ERROR);
    }
    public static <T> Result<T> error(String msg) {
        return error(ErrorCode.INTERNAL_SERVER_ERROR.getCode(), msg);
    }
    public static <T> Result<T> error(ErrorCode errorCode) {
        return error(errorCode.getCode(), errorCode.getMsg());
    }
    public static <T> Result<T> error(int code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    } }
