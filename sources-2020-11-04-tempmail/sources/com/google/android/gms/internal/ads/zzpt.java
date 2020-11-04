package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpt implements Parcelable {
    public static final Parcelable.Creator<zzpt> CREATOR = new ud0();

    /* renamed from: b  reason: collision with root package name */
    public final int f9186b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9187c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9188d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f9189e;

    /* renamed from: f  reason: collision with root package name */
    private int f9190f;

    public zzpt(int i, int i2, int i3, byte[] bArr) {
        this.f9186b = i;
        this.f9187c = i2;
        this.f9188d = i3;
        this.f9189e = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpt.class == obj.getClass()) {
            zzpt zzpt = (zzpt) obj;
            return this.f9186b == zzpt.f9186b && this.f9187c == zzpt.f9187c && this.f9188d == zzpt.f9188d && Arrays.equals(this.f9189e, zzpt.f9189e);
        }
    }

    public final int hashCode() {
        if (this.f9190f == 0) {
            this.f9190f = ((((((this.f9186b + 527) * 31) + this.f9187c) * 31) + this.f9188d) * 31) + Arrays.hashCode(this.f9189e);
        }
        return this.f9190f;
    }

    public final String toString() {
        int i = this.f9186b;
        int i2 = this.f9187c;
        int i3 = this.f9188d;
        boolean z = this.f9189e != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9186b);
        parcel.writeInt(this.f9187c);
        parcel.writeInt(this.f9188d);
        parcel.writeInt(this.f9189e != null ? 1 : 0);
        byte[] bArr = this.f9189e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    zzpt(Parcel parcel) {
        this.f9186b = parcel.readInt();
        this.f9187c = parcel.readInt();
        this.f9188d = parcel.readInt();
        this.f9189e = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
