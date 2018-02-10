package com.jikon.basePackage;

/**
 * Created by shoung on 2018/1/30.
 */
public class Data<T> {
    private String errorCode;
    private boolean isSuccess;

    private T data;

    public Data(String errorCode, boolean isSuccess, T data) {
        this.errorCode = errorCode;
        this.isSuccess = isSuccess;
        this.data = data;
    }

    public Data(String errorCode,  T data) {
        this.errorCode = errorCode;
        this.isSuccess = true;
        this.data = data;
    }

    public Data(T data) {
        this.errorCode = ErrorCode.CODE_0001;
        this.isSuccess = true;
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
