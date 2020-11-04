package com.tempmail.api.models.requests;

import com.google.gson.annotations.SerializedName;

public class GetMailSourceBody extends RpcBody {
    private SourceParams params;

    public class SourceParams {
        @SerializedName("mail")
        String mailId;
        String sid;

        public SourceParams(String str, String str2) {
            this.sid = str;
            this.mailId = str2;
        }
    }

    public GetMailSourceBody(String str, String str2) {
        this.method = "mail.source";
        this.params = new SourceParams(str, str2);
    }
}
