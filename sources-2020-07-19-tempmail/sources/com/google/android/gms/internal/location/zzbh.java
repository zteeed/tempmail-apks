package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

@SafeParcelable.Class
@SafeParcelable.Reserved
@VisibleForTesting
public final class zzbh extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final String f9341b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final long f9342c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final short f9343d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final double f9344e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final double f9345f;
    @SafeParcelable.Field
    private final float g;
    @SafeParcelable.Field
    private final int h;
    @SafeParcelable.Field
    private final int i;
    @SafeParcelable.Field
    private final int j;

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 7) int i2, @SafeParcelable.Param(id = 3) short s, @SafeParcelable.Param(id = 4) double d2, @SafeParcelable.Param(id = 5) double d3, @SafeParcelable.Param(id = 6) float f2, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 8) int i3, @SafeParcelable.Param(id = 9) int i4) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f2 <= 0.0f) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f2);
            throw new IllegalArgumentException(sb.toString());
        } else if (d2 > 90.0d || d2 < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d3 > 180.0d || d3 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d3);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i5 = i2 & 7;
            if (i5 != 0) {
                this.f9343d = s;
                this.f9341b = str;
                this.f9344e = d2;
                this.f9345f = d3;
                this.g = f2;
                this.f9342c = j2;
                this.h = i5;
                this.i = i3;
                this.j = i4;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i2);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzbh)) {
            return false;
        }
        zzbh zzbh = (zzbh) obj;
        return this.g == zzbh.g && this.f9344e == zzbh.f9344e && this.f9345f == zzbh.f9345f && this.f9343d == zzbh.f9343d;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9344e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9345f);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.g)) * 31) + this.f9343d) * 31) + this.h;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.f9343d != 1 ? null : "CIRCLE";
        objArr[1] = this.f9341b.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.h);
        objArr[3] = Double.valueOf(this.f9344e);
        objArr[4] = Double.valueOf(this.f9345f);
        objArr[5] = Float.valueOf(this.g);
        objArr[6] = Integer.valueOf(this.i / 1000);
        objArr[7] = Integer.valueOf(this.j);
        objArr[8] = Long.valueOf(this.f9342c);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final String u() {
        return this.f9341b;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 1, u(), false);
        SafeParcelWriter.o(parcel, 2, this.f9342c);
        SafeParcelWriter.s(parcel, 3, this.f9343d);
        SafeParcelWriter.g(parcel, 4, this.f9344e);
        SafeParcelWriter.g(parcel, 5, this.f9345f);
        SafeParcelWriter.i(parcel, 6, this.g);
        SafeParcelWriter.l(parcel, 7, this.h);
        SafeParcelWriter.l(parcel, 8, this.i);
        SafeParcelWriter.l(parcel, 9, this.j);
        SafeParcelWriter.b(parcel, a2);
    }
}
