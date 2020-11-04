package com.tempmail.api.models.requests;

public class ActivationBody extends RpcBody {
    private ActivationParams params;

    public ActivationBody(ActivationParams activationParams) {
        this.method = "user.activation";
        this.params = activationParams;
    }

    public String toString() {
        return "ClassPojo [method = " + this.method + ", id = " + this.id + ", jsonrpc = " + this.jsonrpc + ", params = " + this.params + "]";
    }
}
