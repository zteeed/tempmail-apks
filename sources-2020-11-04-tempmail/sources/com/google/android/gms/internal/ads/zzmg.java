package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmg extends zzml {
    public static final Parcelable.Creator<zzmg> CREATOR = new ad0();

    /* renamed from: c  reason: collision with root package name */
    private final String f9054c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9055d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9056e;

    public zzmg(String str, String str2, String str3) {
        super("COMM");
        this.f9054c = str;
        this.f9055d = str2;
        this.f9056e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmg.class == obj.getClass()) {
            zzmg zzmg = (zzmg) obj;
            return zzpo.g(this.f9055d, zzmg.f9055d) && zzpo.g(this.f9054c, zzmg.f9054c) && zzpo.g(this.f9056e, zzmg.f9056e);
        }
    }

    public final int hashCode() {
        String str = this.f9054c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f9055d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9056e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9059b);
        parcel.writeString(this.f9054c);
        parcel.writeString(this.f9056e);
    }

    zzmg(Parcel parcel) {
        super("COMM");
        this.f9054c = parcel.readString();
        this.f9055d = parcel.readString();
        this.f9056e = parcel.readString();
    }
}
