package com.tempmail.api.models.requests;

import com.tempmail.utils.y.a;

public class RpcBody {
    public Integer id = 1;
    public Double jsonrpc = a.f12593a;
    public String method;

    public RpcBody() {
    }

    public Integer getId() {
        return this.id;
    }

    public Double getJsonrpc() {
        return this.jsonrpc;
    }

    public String getMethod() {
        return this.method;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setJsonrpc(Double d2) {
        this.jsonrpc = d2;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public RpcBody(String str) {
        this.method = str;
    }
}
