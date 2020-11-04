package com.tempmail.api.models.answers;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ResultEmails {
    @SerializedName("mails")
    private List<ExtendedMail> mailList;
    private String mailbox;
    private String sid;

    public List<ExtendedMail> getMailList() {
        return this.mailList;
    }

    public String getMailbox() {
        return this.mailbox;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public String toString() {
        return "ClassPojo [mails = " + this.mailList + ", sid = " + this.sid + "]";
    }
}
