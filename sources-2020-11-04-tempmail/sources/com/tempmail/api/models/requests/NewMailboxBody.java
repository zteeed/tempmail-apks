package com.tempmail.api.models.requests;

public class NewMailboxBody extends RpcBody {
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

        public String getDomain() {
            return this.domain;
        }

        public String getEmail() {
            return this.email;
        }
    }

    public NewMailboxBody(String str, String str2, String str3) {
        this.method = "mailbox.new";
        this.params = new EmailParams(str, str2, str3);
    }

    public EmailParams getParams() {
        return this.params;
    }
}
