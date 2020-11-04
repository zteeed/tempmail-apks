package com.tempmail.api.models.answers;

public class DomainExpired {
    String domain;
    Long exp;

    public DomainExpired(String str, Long l) {
        this.domain = str;
        this.exp = l;
    }

    public String getDomain() {
        return this.domain;
    }

    public Long getExp() {
        return this.exp;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setExp(Long l) {
        this.exp = l;
    }
}
