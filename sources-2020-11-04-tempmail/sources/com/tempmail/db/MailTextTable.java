package com.tempmail.db;

public class MailTextTable {
    private String eid;
    private String text;

    public MailTextTable() {
    }

    public String getEid() {
        return this.eid;
    }

    public String getText() {
        return this.text;
    }

    public void setEid(String str) {
        this.eid = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public MailTextTable(String str, String str2) {
        this.text = str;
        this.eid = str2;
    }
}
