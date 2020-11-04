package com.tempmail.api.models.requests;

public class PushUpdateBody extends RpcBody {
    private PushUpdateParams params;

    public PushUpdateBody(String str, boolean z) {
        this.method = "push.update";
        this.params = new PushUpdateParams(str, z);
    }

    public String toString() {
        return "ClassPojo [method = " + this.method + ", id = " + this.id + ", jsonrpc = " + this.jsonrpc + ", params = " + this.params + "]";
    }
}
