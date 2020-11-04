package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzmf extends zzml {
    public static final Parcelable.Creator<zzmf> CREATOR = new zc0();

    /* renamed from: c  reason: collision with root package name */
    private final String f9050c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9051d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9052e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f9053f;

    public zzmf(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f9050c = str;
        this.f9051d = null;
        this.f9052e = 3;
        this.f9053f = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmf.class == obj.getClass()) {
            zzmf zzmf = (zzmf) obj;
            return this.f9052e == zzmf.f9052e && zzpo.g(this.f9050c, zzmf.f9050c) && zzpo.g(this.f9051d, zzmf.f9051d) && Arrays.equals(this.f9053f, zzmf.f9053f);
        }
    }

    public final int hashCode() {
        int i = (this.f9052e + 527) * 31;
        String str = this.f9050c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9051d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f9053f);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9050c);
        parcel.writeString(this.f9051d);
        parcel.writeInt(this.f9052e);
        parcel.writeByteArray(this.f9053f);
    }

    zzmf(Parcel parcel) {
        super("APIC");
        this.f9050c = parcel.readString();
        this.f9051d = parcel.readString();
        this.f9052e = parcel.readInt();
        this.f9053f = parcel.createByteArray();
    }
}
