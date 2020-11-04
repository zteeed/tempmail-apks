package com.tempmail.api.models.requests;

public class OneTimePaymentParams {
    private String orderId;
    private String payToken;
    private String productId;
    private String provider;

    public OneTimePaymentParams(String str, String str2, String str3, String str4) {
        this.provider = str;
        this.productId = str2;
        this.payToken = str3;
        this.orderId = str4;
    }
}
