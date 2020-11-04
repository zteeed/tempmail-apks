package com.tempmail.api.models.answers;

public class ActivationWrapper extends RpcWrapper {
    private ResultActivation result;

    public ResultActivation getResult() {
        return this.result;
    }

    public void setResult(ResultActivation resultActivation) {
        this.result = resultActivation;
    }

    public String toString() {
        return "ClassPojo [result = " + this.result + ", id = " + getId() + ", jsonrpc = " + getJsonrpc() + "]";
    }
}
