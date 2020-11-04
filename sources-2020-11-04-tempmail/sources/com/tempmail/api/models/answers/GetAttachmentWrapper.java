package com.tempmail.api.models.answers;

public class GetAttachmentWrapper extends RpcWrapper {
    String cidInner;
    private ResultAttachments result;

    public String getCidInner() {
        return this.cidInner;
    }

    public ResultAttachments getResult() {
        return this.result;
    }

    public void setCidInner(String str) {
        this.cidInner = str;
    }

    public void setResult(ResultAttachments resultAttachments) {
        this.result = resultAttachments;
    }
}
