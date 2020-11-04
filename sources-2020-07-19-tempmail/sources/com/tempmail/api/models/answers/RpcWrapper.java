package com.tempmail.api.models.answers;

public class RpcWrapper {
    private ApiError error;
    private String id;
    private String jsonrpc;

    public ApiError getError() {
        return this.error;
    }

    public String getId() {
        return this.id;
    }

    public String getJsonrpc() {
        return this.jsonrpc;
    }
}
