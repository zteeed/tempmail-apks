package com.tempmail.api.models.requests;

public class DeleteEmailBody extends RpcBody {
    private EmailParams params;

    public class EmailParams {
        String email;
        String sid;

        EmailParams(String str, String str2) {
            this.sid = str;
            this.email = str2;
        }
    }

    public DeleteEmailBody(String str, String str2) {
        this.method = "mailbox.delete";
        this.params = new EmailParams(str, str2);
    }
}
