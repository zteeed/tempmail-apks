package com.tempmail.db;

import android.os.Parcel;
import android.os.Parcelable;

public class DomainTable implements Parcelable {
    public static final Parcelable.Creator<DomainTable> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private Long f12276b;

    /* renamed from: c  reason: collision with root package name */
    private String f12277c;

    /* renamed from: d  reason: collision with root package name */
    private Long f12278d;

    static class a implements Parcelable.Creator<DomainTable> {
        a() {
        }

        /* renamed from: a */
        public DomainTable createFromParcel(Parcel parcel) {
            return new DomainTable(parcel);
        }

        /* renamed from: b */
        public DomainTable[] newArray(int i) {
            return new DomainTable[i];
        }
    }

    public DomainTable(String str, Long l) {
        this.f12277c = str;
        this.f12278d = l;
    }

    public String a() {
        return this.f12277c;
    }

    public Long b() {
        return this.f12278d;
    }

    public Long c() {
        return this.f12276b;
    }

    public boolean d() {
        return this.f12278d != null;
    }

    public int describeContents() {
        return 0;
    }

    public void e(Long l) {
        this.f12276b = l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f12276b == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f12276b.longValue());
        }
        parcel.writeString(this.f12277c);
        if (this.f12278d == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeLong(this.f12278d.longValue());
    }

    public DomainTable(Parcel parcel) {
    }

    public DomainTable() {
    }

    public DomainTable(Long l, String str, Long l2) {
        this.f12276b = l;
        this.f12277c = str;
        this.f12278d = l2;
    }
}
