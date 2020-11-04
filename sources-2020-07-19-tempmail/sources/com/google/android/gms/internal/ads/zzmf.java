package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmf extends zzml {
    public static final Parcelable.Creator<zzmf> CREATOR = new zc0();

    /* renamed from: c  reason: collision with root package name */
    private final String f8867c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8868d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8869e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f8870f;

    public zzmf(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f8867c = str;
        this.f8868d = null;
        this.f8869e = 3;
        this.f8870f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmf.class == obj.getClass()) {
            zzmf zzmf = (zzmf) obj;
            return this.f8869e == zzmf.f8869e && zzpo.g(this.f8867c, zzmf.f8867c) && zzpo.g(this.f8868d, zzmf.f8868d) && Arrays.equals(this.f8870f, zzmf.f8870f);
        }
    }

    public final int hashCode() {
        int i = (this.f8869e + 527) * 31;
        String str = this.f8867c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8868d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f8870f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8867c);
        parcel.writeString(this.f8868d);
        parcel.writeInt(this.f8869e);
        parcel.writeByteArray(this.f8870f);
    }

    zzmf(Parcel parcel) {
        super("APIC");
        this.f8867c = parcel.readString();
        this.f8868d = parcel.readString();
        this.f8869e = parcel.readInt();
        this.f8870f = parcel.createByteArray();
    }
}
