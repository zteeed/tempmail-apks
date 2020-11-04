package com.tempmail.api.models.requests;

public class EmailListBody extends RpcBody {
    EmailParams params;

    public class EmailParams {
        String lastCheck;
        String sid;

        public EmailParams(String str, String str2) {
            this.sid = str;
            this.lastCheck = str2;
        }
    }

    public EmailListBody(String str, String str2) {
        this.method = "mailbox.list";
        this.params = new EmailParams(str, str2);
    }
}
