package com.tempmail.db;

public class MailHtmlTable {
    private String eid;
    private String text;

    public MailHtmlTable() {
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

    public MailHtmlTable(String str, String str2) {
        this.text = str;
        this.eid = str2;
    }
}
