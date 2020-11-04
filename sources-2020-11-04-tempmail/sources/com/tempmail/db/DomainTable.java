package com.tempmail.db;

import android.os.Parcel;
import android.os.Parcelable;

public class DomainTable implements Parcelable {
    public static final Parcelable.Creator<DomainTable> CREATOR = new Parcelable.Creator<DomainTable>() {
        public DomainTable createFromParcel(Parcel parcel) {
            return new DomainTable(parcel);
        }

        public DomainTable[] newArray(int i) {
            return new DomainTable[i];
        }
    };
    private String domain;
    private Long expirationTimestamp;
    private Long id;

    public DomainTable(String str) {
        this.domain = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getDomain() {
        return this.domain;
    }

    public Long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    public Long getId() {
        return this.id;
    }

    public boolean isExpiredSoon() {
        return this.expirationTimestamp != null;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setExpirationTimestamp(Long l) {
        this.expirationTimestamp = l;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.id.longValue());
        }
        parcel.writeString(this.domain);
        if (this.expirationTimestamp == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeLong(this.expirationTimestamp.longValue());
    }

    public DomainTable(String str, Long l) {
        this.domain = str;
        this.expirationTimestamp = l;
    }

    public DomainTable(Parcel parcel) {
    }

    public DomainTable() {
    }

    public DomainTable(Long l) {
        this.id = l;
    }

    public DomainTable(Long l, String str, Long l2) {
        this.id = l;
        this.domain = str;
        this.expirationTimestamp = l2;
    }
}
