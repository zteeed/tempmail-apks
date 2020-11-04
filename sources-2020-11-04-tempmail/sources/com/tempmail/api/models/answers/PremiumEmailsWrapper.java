package com.tempmail.api.models.answers;

public class PremiumEmailsWrapper extends RpcWrapper {
    private ResultEmails result;

    public ResultEmails getResult() {
        return this.result;
    }

    public void setResult(ResultEmails resultEmails) {
        this.result = resultEmails;
    }

    public String toString() {
        return "ClassPojo [result = " + this.result + ", id = " + getId() + ", jsonrpc = " + getJsonrpc() + "]";
    }
}
