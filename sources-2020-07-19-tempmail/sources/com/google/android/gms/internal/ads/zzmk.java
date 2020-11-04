package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmk extends zzml {
    public static final Parcelable.Creator<zzmk> CREATOR = new bd0();

    /* renamed from: c  reason: collision with root package name */
    private final String f8874c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8875d;

    public zzmk(String str, String str2, String str3) {
        super(str);
        this.f8874c = null;
        this.f8875d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmk.class == obj.getClass()) {
            zzmk zzmk = (zzmk) obj;
            return this.f8876b.equals(zzmk.f8876b) && zzpo.g(this.f8874c, zzmk.f8874c) && zzpo.g(this.f8875d, zzmk.f8875d);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f8876b.hashCode() + 527) * 31;
        String str = this.f8874c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8875d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8876b);
        parcel.writeString(this.f8874c);
        parcel.writeString(this.f8875d);
    }

    zzmk(Parcel parcel) {
        super(parcel.readString());
        this.f8874c = parcel.readString();
        this.f8875d = parcel.readString();
    }
}
