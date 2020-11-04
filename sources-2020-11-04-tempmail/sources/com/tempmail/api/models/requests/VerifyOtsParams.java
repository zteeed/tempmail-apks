package com.tempmail.api.models.requests;

public class VerifyOtsParams {
    private String ots;
    private String sid;

    public VerifyOtsParams(String str, String str2) {
        this.sid = str;
        this.ots = str2;
    }
}
