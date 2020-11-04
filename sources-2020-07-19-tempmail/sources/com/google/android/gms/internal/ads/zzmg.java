package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmg extends zzml {
    public static final Parcelable.Creator<zzmg> CREATOR = new ad0();

    /* renamed from: c  reason: collision with root package name */
    private final String f8871c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8872d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8873e;

    public zzmg(String str, String str2, String str3) {
        super("COMM");
        this.f8871c = str;
        this.f8872d = str2;
        this.f8873e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmg.class == obj.getClass()) {
            zzmg zzmg = (zzmg) obj;
            return zzpo.g(this.f8872d, zzmg.f8872d) && zzpo.g(this.f8871c, zzmg.f8871c) && zzpo.g(this.f8873e, zzmg.f8873e);
        }
    }

    public final int hashCode() {
        String str = this.f8871c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8872d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8873e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8876b);
        parcel.writeString(this.f8871c);
        parcel.writeString(this.f8873e);
    }

    zzmg(Parcel parcel) {
        super("COMM");
        this.f8871c = parcel.readString();
        this.f8872d = parcel.readString();
        this.f8873e = parcel.readString();
    }
}
