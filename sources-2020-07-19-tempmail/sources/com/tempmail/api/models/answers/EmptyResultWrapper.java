package com.tempmail.api.models.answers;

public class EmptyResultWrapper extends RpcWrapper {
    private Result result;

    private class Result {
        private Result() {
        }
    }

    public Result getResult() {
        return this.result;
    }
}
