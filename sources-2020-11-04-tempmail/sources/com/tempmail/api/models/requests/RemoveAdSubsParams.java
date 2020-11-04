package com.tempmail.api.models.requests;

public class RemoveAdSubsParams {
    private String payToken;
    private String provider;
    private String subscriptionId;

    public RemoveAdSubsParams(String str, String str2, String str3) {
        this.provider = str;
        this.subscriptionId = str2;
        this.payToken = str3;
    }
}
