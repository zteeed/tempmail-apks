package com.tempmail.api.models.requests;

public class SubscriptionUpdateBody extends RpcBody {
    private SubscriptionUpdateParams params;

    public SubscriptionUpdateBody(String str, String str2, String str3, String str4, boolean z) {
        this.method = "subscription.update";
        this.params = new SubscriptionUpdateParams(str, str2, str3, str4, z);
    }

    public String toString() {
        return "ClassPojo [method = " + this.method + ", id = " + this.id + ", jsonrpc = " + this.jsonrpc + ", params = " + this.params + "]";
    }
}
