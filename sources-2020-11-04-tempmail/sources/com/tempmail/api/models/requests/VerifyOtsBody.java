package com.tempmail.api.models.requests;

public class VerifyOtsBody extends RpcBody {
    private VerifyOtsParams params;

    public VerifyOtsBody(String str, String str2) {
        this.method = "user.verify_ots";
        this.params = new VerifyOtsParams(str, str2);
    }

    public String toString() {
        return "ClassPojo [method = " + this.method + ", id = " + this.id + ", jsonrpc = " + this.jsonrpc + ", params = " + this.params + "]";
    }
}
