package com.tempmail.api.models.answers;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class ResultActivation {
    @SerializedName("mails")
    private Map<String, List<ExtendedMail>> mailAddresses;
    private String sid;

    public Map<String, List<ExtendedMail>> getMailAddresses() {
        return this.mailAddresses;
    }

    public String getSid() {
        return this.sid;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public String toString() {
        return "ClassPojo [mails = " + this.mailAddresses + ", sid = " + this.sid + "]";
    }
}
