package com.tempmail.api.models.requests;

public class ActivationParams {
    private String firebaseToken;
    private String lastCheck;
    private String payToken;
    private String provider;
    private boolean pushEnabled;
    private String subscriptionId;

    public ActivationParams(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.lastCheck = str;
        this.firebaseToken = str2;
        this.provider = str3;
        this.subscriptionId = str4;
        this.payToken = str5;
        this.pushEnabled = z;
    }

    public String getFirebaseToken() {
        return this.firebaseToken;
    }

    public String getLastCheck() {
        return this.lastCheck;
    }

    public String getPayToken() {
        return this.payToken;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setFirebaseToken(String str) {
        this.firebaseToken = str;
    }

    public void setLastCheck(String str) {
        this.lastCheck = str;
    }

    public void setPayToken(String str) {
        this.payToken = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSubscriptionId(String str) {
        this.subscriptionId = str;
    }

    public String toString() {
        return "ClassPojo [lastCheck = " + this.lastCheck + ", firebaseToken = " + this.firebaseToken + ", provider = " + this.provider + ", subscriptionId = " + this.subscriptionId + ", payToken = " + this.payToken + "]";
    }
}
