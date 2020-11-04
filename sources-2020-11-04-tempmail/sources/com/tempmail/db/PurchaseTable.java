package com.tempmail.db;

public class PurchaseTable {
    private Long id;
    private String originalJson;
    private String signature;

    public PurchaseTable(String str, String str2) {
        this.originalJson = str;
        this.signature = str2;
    }

    public Long getId() {
        return this.id;
    }

    public String getOriginalJson() {
        return this.originalJson;
    }

    public String getSignature() {
        return this.signature;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setOriginalJson(String str) {
        this.originalJson = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public PurchaseTable() {
    }

    public PurchaseTable(Long l) {
        this.id = l;
    }

    public PurchaseTable(Long l, String str, String str2) {
        this.id = l;
        this.originalJson = str;
        this.signature = str2;
    }
}
