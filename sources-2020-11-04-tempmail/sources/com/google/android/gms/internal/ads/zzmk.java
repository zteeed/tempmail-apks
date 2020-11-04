package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmk extends zzml {
    public static final Parcelable.Creator<zzmk> CREATOR = new bd0();

    /* renamed from: c  reason: collision with root package name */
    private final String f9057c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9058d;

    public zzmk(String str, String str2, String str3) {
        super(str);
        this.f9057c = null;
        this.f9058d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmk.class == obj.getClass()) {
            zzmk zzmk = (zzmk) obj;
            return this.f9059b.equals(zzmk.f9059b) && zzpo.g(this.f9057c, zzmk.f9057c) && zzpo.g(this.f9058d, zzmk.f9058d);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f9059b.hashCode() + 527) * 31;
        String str = this.f9057c;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9058d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9059b);
        parcel.writeString(this.f9057c);
        parcel.writeString(this.f9058d);
    }

    zzmk(Parcel parcel) {
        super(parcel.readString());
        this.f9057c = parcel.readString();
        this.f9058d = parcel.readString();
    }
}
