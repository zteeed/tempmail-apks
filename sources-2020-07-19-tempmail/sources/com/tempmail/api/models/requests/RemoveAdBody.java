package com.tempmail.api.models.requests;

public class RemoveAdBody extends RpcBody {
    private OneTimePaymentParams params;

    public RemoveAdBody(OneTimePaymentParams oneTimePaymentParams) {
        this.method = "user.onetime_purchase";
        this.params = oneTimePaymentParams;
    }

    public String toString() {
        return "ClassPojo [method = " + this.method + ", id = " + this.id + ", jsonrpc = " + this.jsonrpc + ", params = " + this.params + "]";
    }
}
