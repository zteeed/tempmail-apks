package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzm();
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final String f10709b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    public final String f10710c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final String f10711d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    public final String f10712e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    public final long f10713f;
    @SafeParcelable.Field
    public final long g;
    @SafeParcelable.Field
    public final String h;
    @SafeParcelable.Field
    public final boolean i;
    @SafeParcelable.Field
    public final boolean j;
    @SafeParcelable.Field
    public final long k;
    @SafeParcelable.Field
    public final String l;
    @SafeParcelable.Field
    public final long m;
    @SafeParcelable.Field
    public final long n;
    @SafeParcelable.Field
    public final int o;
    @SafeParcelable.Field
    public final boolean p;
    @SafeParcelable.Field
    public final boolean q;
    @SafeParcelable.Field
    public final boolean r;
    @SafeParcelable.Field
    public final String s;
    @SafeParcelable.Field
    public final Boolean t;
    @SafeParcelable.Field
    public final long u;
    @SafeParcelable.Field
    public final List<String> v;
    @SafeParcelable.Field
    public final String w;

    zzn(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j7, List<String> list, String str8) {
        Preconditions.g(str);
        this.f10709b = str;
        this.f10710c = TextUtils.isEmpty(str2) ? null : str2;
        this.f10711d = str3;
        this.k = j2;
        this.f10712e = str4;
        this.f10713f = j3;
        this.g = j4;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = j5;
        this.n = j6;
        this.o = i2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = str7;
        this.t = bool;
        this.u = j7;
        this.v = list;
        this.w = str8;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.t(parcel, 2, this.f10709b, false);
        SafeParcelWriter.t(parcel, 3, this.f10710c, false);
        SafeParcelWriter.t(parcel, 4, this.f10711d, false);
        SafeParcelWriter.t(parcel, 5, this.f10712e, false);
        SafeParcelWriter.o(parcel, 6, this.f10713f);
        SafeParcelWriter.o(parcel, 7, this.g);
        SafeParcelWriter.t(parcel, 8, this.h, false);
        SafeParcelWriter.c(parcel, 9, this.i);
        SafeParcelWriter.c(parcel, 10, this.j);
        SafeParcelWriter.o(parcel, 11, this.k);
        SafeParcelWriter.t(parcel, 12, this.l, false);
        SafeParcelWriter.o(parcel, 13, this.m);
        SafeParcelWriter.o(parcel, 14, this.n);
        SafeParcelWriter.l(parcel, 15, this.o);
        SafeParcelWriter.c(parcel, 16, this.p);
        SafeParcelWriter.c(parcel, 17, this.q);
        SafeParcelWriter.c(parcel, 18, this.r);
        SafeParcelWriter.t(parcel, 19, this.s, false);
        SafeParcelWriter.d(parcel, 21, this.t, false);
        SafeParcelWriter.o(parcel, 22, this.u);
        SafeParcelWriter.v(parcel, 23, this.v, false);
        SafeParcelWriter.t(parcel, 24, this.w, false);
        SafeParcelWriter.b(parcel, a2);
    }

    @SafeParcelable.Constructor
    zzn(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) long j3, @SafeParcelable.Param(id = 8) String str5, @SafeParcelable.Param(id = 9) boolean z, @SafeParcelable.Param(id = 10) boolean z2, @SafeParcelable.Param(id = 11) long j4, @SafeParcelable.Param(id = 12) String str6, @SafeParcelable.Param(id = 13) long j5, @SafeParcelable.Param(id = 14) long j6, @SafeParcelable.Param(id = 15) int i2, @SafeParcelable.Param(id = 16) boolean z3, @SafeParcelable.Param(id = 17) boolean z4, @SafeParcelable.Param(id = 18) boolean z5, @SafeParcelable.Param(id = 19) String str7, @SafeParcelable.Param(id = 21) Boolean bool, @SafeParcelable.Param(id = 22) long j7, @SafeParcelable.Param(id = 23) List<String> list, @SafeParcelable.Param(id = 24) String str8) {
        this.f10709b = str;
        this.f10710c = str2;
        this.f10711d = str3;
        this.k = j4;
        this.f10712e = str4;
        this.f10713f = j2;
        this.g = j3;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = j5;
        this.n = j6;
        this.o = i2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = str7;
        this.t = bool;
        this.u = j7;
        this.v = list;
        this.w = str8;
    }
}
