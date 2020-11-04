package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpt implements Parcelable {
    public static final Parcelable.Creator<zzpt> CREATOR = new ud0();

    /* renamed from: b  reason: collision with root package name */
    public final int f9003b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9004c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9005d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f9006e;

    /* renamed from: f  reason: collision with root package name */
    private int f9007f;

    public zzpt(int i, int i2, int i3, byte[] bArr) {
        this.f9003b = i;
        this.f9004c = i2;
        this.f9005d = i3;
        this.f9006e = bArr;
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
            return this.f9003b == zzpt.f9003b && this.f9004c == zzpt.f9004c && this.f9005d == zzpt.f9005d && Arrays.equals(this.f9006e, zzpt.f9006e);
        }
    }

    public final int hashCode() {
        if (this.f9007f == 0) {
            this.f9007f = ((((((this.f9003b + 527) * 31) + this.f9004c) * 31) + this.f9005d) * 31) + Arrays.hashCode(this.f9006e);
        }
        return this.f9007f;
    }

    public final String toString() {
        int i = this.f9003b;
        int i2 = this.f9004c;
        int i3 = this.f9005d;
        boolean z = this.f9006e != null;
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
        parcel.writeInt(this.f9003b);
        parcel.writeInt(this.f9004c);
        parcel.writeInt(this.f9005d);
        parcel.writeInt(this.f9006e != null ? 1 : 0);
        byte[] bArr = this.f9006e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    zzpt(Parcel parcel) {
        this.f9003b = parcel.readInt();
        this.f9004c = parcel.readInt();
        this.f9005d = parcel.readInt();
        this.f9006e = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
