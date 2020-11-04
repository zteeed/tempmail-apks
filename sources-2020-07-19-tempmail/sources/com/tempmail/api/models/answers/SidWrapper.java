package com.tempmail.api.models.answers;

import com.tempmail.db.e;

public class SidWrapper extends RpcWrapper {
    private e emailAddressTable;
    private Result result;

    public class Result {
        String sid;

        public Result() {
        }

        public String getSid() {
            return this.sid;
        }
    }

    public e getEmailAddressTable() {
        return this.emailAddressTable;
    }

    public Result getResult() {
        return this.result;
    }

    public void setEmailAddressTable(e eVar) {
        this.emailAddressTable = eVar;
    }
}
