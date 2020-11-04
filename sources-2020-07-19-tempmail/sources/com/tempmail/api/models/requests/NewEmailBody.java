package com.tempmail.api.models.requests;

public class NewEmailBody extends RpcBody {
    private EmailParams params;

    public class EmailParams {
        String domain;
        String email;
        String sid;

        public EmailParams(String str, String str2, String str3) {
            this.sid = str;
            this.email = str2;
            this.domain = str3;
        }
    }

    public NewEmailBody(String str, String str2, String str3) {
        this.method = "mailbox.new";
        this.params = new EmailParams(str, str2, str3);
    }
}
