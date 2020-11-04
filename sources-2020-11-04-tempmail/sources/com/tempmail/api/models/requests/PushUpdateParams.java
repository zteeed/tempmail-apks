package com.tempmail.api.models.requests;

public class PushUpdateParams {
    private boolean pushEnabled;
    private String sid;

    public PushUpdateParams(String str, boolean z) {
        this.sid = str;
        this.pushEnabled = z;
    }
}
