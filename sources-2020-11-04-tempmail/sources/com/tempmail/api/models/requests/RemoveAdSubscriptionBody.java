package com.tempmail.api.models.requests;

public class RemoveAdSubscriptionBody extends RpcBody {
    private RemoveAdSubsParams params;

    public RemoveAdSubscriptionBody(RemoveAdSubsParams removeAdSubsParams) {
        this.method = "subscription.remove_a";
        this.params = removeAdSubsParams;
    }

    public String toString() {
        return "ClassPojo [method = " + this.method + ", id = " + this.id + ", jsonrpc = " + this.jsonrpc + ", params = " + this.params + "]";
    }
}
