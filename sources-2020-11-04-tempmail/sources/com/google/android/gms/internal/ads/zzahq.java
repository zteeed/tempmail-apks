package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzahq> CREATOR = new zzaht();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5895b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f5896c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final int f5897d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f5898e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final String[] f5899f;
    @SafeParcelable.Field
    public final String[] g;
    @SafeParcelable.Field
    public final boolean h;
    @SafeParcelable.Field
    public final long i;

    @SafeParcelable.Constructor
    zzahq(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) String[] strArr, @SafeParcelable.Param(id = 6) String[] strArr2, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 8) long j) {
        this.f5895b = z;
        this.f5896c = str;
        this.f5897d = i2;
        this.f5898e = bArr;
        this.f5899f = strArr;
        this.g = strArr2;
        this.h = z2;
        this.i = j;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.c(parcel, 1, this.f5895b);
        SafeParcelWriter.t(parcel, 2, this.f5896c, false);
        SafeParcelWriter.l(parcel, 3, this.f5897d);
        SafeParcelWriter.f(parcel, 4, this.f5898e, false);
        SafeParcelWriter.u(parcel, 5, this.f5899f, false);
        SafeParcelWriter.u(parcel, 6, this.g, false);
        SafeParcelWriter.c(parcel, 7, this.h);
        SafeParcelWriter.o(parcel, 8, this.i);
        SafeParcelWriter.b(parcel, a2);
    }
}
