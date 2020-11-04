package com.tempmail.api.models.answers;

public class DomainsWrapper extends RpcWrapper {
    private ResultDomains result;

    public ResultDomains getResult() {
        return this.result;
    }

    public void setResult(ResultDomains resultDomains) {
        this.result = resultDomains;
    }

    public String toString() {
        return "ClassPojo [result = " + this.result + ", id = " + getId() + ", jsonrpc = " + getJsonrpc() + "]";
    }
}
