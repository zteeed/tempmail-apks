package com.tempmail.api.models.answers;

public class ApiError {
    private Integer code;
    private String message;

    public ApiError(Integer num, String str) {
        this.code = num;
        this.message = str;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
