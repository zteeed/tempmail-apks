package com.tempmail.api.models.requests;

public class EmailBody extends RpcBody {
    EmailParams params;

    public class EmailParams {
        String email;
        String lastCheck;
        String sid;

        public EmailParams(String str, String str2, String str3) {
            this.sid = str;
            this.lastCheck = str2;
            this.email = str3;
        }
    }

    public EmailBody(String str, String str2, String str3) {
        this.method = "mailbox.messages";
        this.params = new EmailParams(str, str2, str3);
    }
}
