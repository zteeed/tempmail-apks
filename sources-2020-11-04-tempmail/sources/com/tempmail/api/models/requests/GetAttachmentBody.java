package com.tempmail.api.models.requests;

import com.google.gson.annotations.SerializedName;

public class GetAttachmentBody extends RpcBody {
    private AttachmentParams params;

    public class AttachmentParams {
        @SerializedName("_id")
        Integer attachmentId;
        String attachmentName;
        @SerializedName("mail")
        String mailId;
        String sid;

        public AttachmentParams(String str, String str2, String str3, Integer num) {
            this.sid = str;
            this.attachmentName = str2;
            this.mailId = str3;
            this.attachmentId = num;
        }
    }

    public GetAttachmentBody(String str, String str2, String str3, Integer num) {
        this.method = "mail.attachment";
        this.params = new AttachmentParams(str, str2, str3, num);
    }
}
