package com.tempmail.api.models.answers;

public class GetMailSourceWrapper extends RpcWrapper {
    private ResultMailSource result;

    public ResultMailSource getResult() {
        return this.result;
    }

    public void setResult(ResultMailSource resultMailSource) {
        this.result = resultMailSource;
    }
}
