package com.tempmail.api.models.requests;

public class SubscriptionUpdateParams {
    private String firebaseToken;
    private String payToken;
    private boolean pushEnabled;
    private String sid;
    private String subscriptionId;

    public SubscriptionUpdateParams(String str, String str2, String str3, String str4, boolean z) {
        this.sid = str;
        this.payToken = str2;
        this.subscriptionId = str3;
        this.firebaseToken = str4;
        this.pushEnabled = z;
    }
}
