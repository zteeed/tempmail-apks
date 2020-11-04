package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzz();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public String f10715b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public String f10716c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public zzkq f10717d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public long f10718e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public boolean f10719f;
    @SafeParcelable.Field
    public String g;
    @SafeParcelable.Field
    public zzao h;
    @SafeParcelable.Field
    public long i;
    @SafeParcelable.Field
    public zzao j;
    @SafeParcelable.Field
    public long k;
    @SafeParcelable.Field
    public zzao l;

    zzw(zzw zzw) {
        Preconditions.k(zzw);
        this.f10715b = zzw.f10715b;
        this.f10716c = zzw.f10716c;
        this.f10717d = zzw.f10717d;
        this.f10718e = zzw.f10718e;
        this.f10719f = zzw.f10719f;
        this.g = zzw.g;
        this.h = zzw.h;
        this.i = zzw.i;
        this.j = zzw.j;
        this.k = zzw.k;
        this.l = zzw.l;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f10715b, false);
        SafeParcelWriter.t(parcel, 3, this.f10716c, false);
        SafeParcelWriter.r(parcel, 4, this.f10717d, i2, false);
        SafeParcelWriter.o(parcel, 5, this.f10718e);
        SafeParcelWriter.c(parcel, 6, this.f10719f);
        SafeParcelWriter.t(parcel, 7, this.g, false);
        SafeParcelWriter.r(parcel, 8, this.h, i2, false);
        SafeParcelWriter.o(parcel, 9, this.i);
        SafeParcelWriter.r(parcel, 10, this.j, i2, false);
        SafeParcelWriter.o(parcel, 11, this.k);
        SafeParcelWriter.r(parcel, 12, this.l, i2, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    zzw(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzkq zzkq, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) zzao zzao, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) zzao zzao2, @SafeParcelable.Param(id = 11) long j4, @SafeParcelable.Param(id = 12) zzao zzao3) {
        this.f10715b = str;
        this.f10716c = str2;
        this.f10717d = zzkq;
        this.f10718e = j2;
        this.f10719f = z;
        this.g = str3;
        this.h = zzao;
        this.i = j3;
        this.j = zzao2;
        this.k = j4;
        this.l = zzao3;
    }
}
