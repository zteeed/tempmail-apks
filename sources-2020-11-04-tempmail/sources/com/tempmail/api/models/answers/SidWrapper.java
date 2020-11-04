package com.tempmail.api.models.answers;

import com.tempmail.db.EmailAddressTable;

public class SidWrapper extends RpcWrapper {
    private EmailAddressTable emailAddressTable;
    private Result result;

    public class Result {
        String sid;

        public Result() {
        }

        public String getSid() {
            return this.sid;
        }
    }

    public EmailAddressTable getEmailAddressTable() {
        return this.emailAddressTable;
    }

    public Result getResult() {
        return this.result;
    }

    public void setEmailAddressTable(EmailAddressTable emailAddressTable2) {
        this.emailAddressTable = emailAddressTable2;
    }
}
