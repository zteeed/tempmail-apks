package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzarv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzarv> CREATOR = new zzary();
    @SafeParcelable.Field
    private final String A;
    @SafeParcelable.Field
    private final boolean B;
    @SafeParcelable.Field
    private final boolean C;
    @SafeParcelable.Field
    private final zzaub D;
    @SafeParcelable.Field
    private final List<String> E;
    @SafeParcelable.Field
    private final List<String> F;
    @SafeParcelable.Field
    private final boolean G;
    @SafeParcelable.Field
    private final zzarx H;
    @SafeParcelable.Field
    private final boolean I;
    @SafeParcelable.Field
    private String J;
    @SafeParcelable.Field
    private final List<String> K;
    @SafeParcelable.Field
    private final boolean L;
    @SafeParcelable.Field
    private final String M;
    @SafeParcelable.Field
    private final zzavq N;
    @SafeParcelable.Field
    private final String O;
    @SafeParcelable.Field
    private final boolean P;
    @SafeParcelable.Field
    private final boolean Q;
    @SafeParcelable.Field
    private Bundle R;
    @SafeParcelable.Field
    private final boolean S;
    @SafeParcelable.Field
    private final int T;
    @SafeParcelable.Field
    private final boolean U;
    @SafeParcelable.Field
    private final List<String> V;
    @SafeParcelable.Field
    private final boolean W;
    @SafeParcelable.Field
    private final String X;
    @SafeParcelable.Field
    private String Y;
    @SafeParcelable.Field
    private boolean Z;
    @SafeParcelable.Field
    private boolean a0;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f5899b;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final String f5900c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private String f5901d;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f5902e;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final int f5903f;
    @SafeParcelable.Field
    private final List<String> g;
    @SafeParcelable.Field
    private final long h;
    @SafeParcelable.Field
    private final boolean i;
    @SafeParcelable.Field
    private final long j;
    @SafeParcelable.Field
    private final List<String> k;
    @SafeParcelable.Field
    private final long l;
    @SafeParcelable.Field
    private final int m;
    @SafeParcelable.Field
    private final String n;
    @SafeParcelable.Field
    private final long o;
    @SafeParcelable.Field
    private final String p;
    @SafeParcelable.Field
    private final boolean q;
    @SafeParcelable.Field
    private final String r;
    @SafeParcelable.Field
    private final String s;
    @SafeParcelable.Field
    private final boolean t;
    @SafeParcelable.Field
    private final boolean u;
    @SafeParcelable.Field
    private final boolean v;
    @SafeParcelable.Field
    private final boolean w;
    @SafeParcelable.Field
    private final boolean x;
    @SafeParcelable.Field
    private zzash y;
    @SafeParcelable.Field
    private String z;

    @SafeParcelable.Constructor
    zzarv(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) List<String> list, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) List<String> list2, @SafeParcelable.Param(id = 7) long j2, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) List<String> list3, @SafeParcelable.Param(id = 11) long j4, @SafeParcelable.Param(id = 12) int i4, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) long j5, @SafeParcelable.Param(id = 15) String str4, @SafeParcelable.Param(id = 18) boolean z3, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 21) String str6, @SafeParcelable.Param(id = 22) boolean z4, @SafeParcelable.Param(id = 23) boolean z5, @SafeParcelable.Param(id = 24) boolean z6, @SafeParcelable.Param(id = 25) boolean z7, @SafeParcelable.Param(id = 26) boolean z8, @SafeParcelable.Param(id = 28) zzash zzash, @SafeParcelable.Param(id = 29) String str7, @SafeParcelable.Param(id = 30) String str8, @SafeParcelable.Param(id = 31) boolean z9, @SafeParcelable.Param(id = 32) boolean z10, @SafeParcelable.Param(id = 33) zzaub zzaub, @SafeParcelable.Param(id = 34) List<String> list4, @SafeParcelable.Param(id = 35) List<String> list5, @SafeParcelable.Param(id = 36) boolean z11, @SafeParcelable.Param(id = 37) zzarx zzarx, @SafeParcelable.Param(id = 38) boolean z12, @SafeParcelable.Param(id = 39) String str9, @SafeParcelable.Param(id = 40) List<String> list6, @SafeParcelable.Param(id = 42) boolean z13, @SafeParcelable.Param(id = 43) String str10, @SafeParcelable.Param(id = 44) zzavq zzavq, @SafeParcelable.Param(id = 45) String str11, @SafeParcelable.Param(id = 46) boolean z14, @SafeParcelable.Param(id = 47) boolean z15, @SafeParcelable.Param(id = 48) Bundle bundle, @SafeParcelable.Param(id = 49) boolean z16, @SafeParcelable.Param(id = 50) int i5, @SafeParcelable.Param(id = 51) boolean z17, @SafeParcelable.Param(id = 52) List<String> list7, @SafeParcelable.Param(id = 53) boolean z18, @SafeParcelable.Param(id = 54) String str12, @SafeParcelable.Param(id = 55) String str13, @SafeParcelable.Param(id = 56) boolean z19, @SafeParcelable.Param(id = 57) boolean z20) {
        zzaso zzaso;
        zzash zzash2 = zzash;
        this.f5899b = i2;
        this.f5900c = str;
        this.f5901d = str2;
        List<String> list8 = null;
        this.f5902e = list != null ? Collections.unmodifiableList(list) : null;
        this.f5903f = i3;
        this.g = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.h = j2;
        this.i = z2;
        this.j = j3;
        this.k = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.l = j4;
        this.m = i4;
        this.n = str3;
        this.o = j5;
        this.p = str4;
        this.q = z3;
        this.r = str5;
        this.s = str6;
        this.t = z4;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.P = z14;
        this.x = z8;
        this.y = zzash2;
        this.z = str7;
        this.A = str8;
        if (this.f5901d == null && zzash2 != null && (zzaso = (zzaso) zzash2.u(zzaso.CREATOR)) != null && !TextUtils.isEmpty(zzaso.f5914b)) {
            this.f5901d = zzaso.f5914b;
        }
        this.B = z9;
        this.C = z10;
        this.D = zzaub;
        this.E = list4;
        this.F = list5;
        this.G = z11;
        this.H = zzarx;
        this.I = z12;
        this.J = str9;
        this.K = list6;
        this.L = z13;
        this.M = str10;
        this.N = zzavq;
        this.O = str11;
        this.Q = z15;
        this.R = bundle;
        this.S = z16;
        this.T = i5;
        this.U = z17;
        this.V = list7 != null ? Collections.unmodifiableList(list7) : list8;
        this.W = z18;
        this.X = str12;
        this.Y = str13;
        this.Z = z19;
        this.a0 = z20;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f5899b);
        SafeParcelWriter.t(parcel, 2, this.f5900c, false);
        SafeParcelWriter.t(parcel, 3, this.f5901d, false);
        SafeParcelWriter.v(parcel, 4, this.f5902e, false);
        SafeParcelWriter.l(parcel, 5, this.f5903f);
        SafeParcelWriter.v(parcel, 6, this.g, false);
        SafeParcelWriter.o(parcel, 7, this.h);
        SafeParcelWriter.c(parcel, 8, this.i);
        SafeParcelWriter.o(parcel, 9, this.j);
        SafeParcelWriter.v(parcel, 10, this.k, false);
        SafeParcelWriter.o(parcel, 11, this.l);
        SafeParcelWriter.l(parcel, 12, this.m);
        SafeParcelWriter.t(parcel, 13, this.n, false);
        SafeParcelWriter.o(parcel, 14, this.o);
        SafeParcelWriter.t(parcel, 15, this.p, false);
        SafeParcelWriter.c(parcel, 18, this.q);
        SafeParcelWriter.t(parcel, 19, this.r, false);
        SafeParcelWriter.t(parcel, 21, this.s, false);
        SafeParcelWriter.c(parcel, 22, this.t);
        SafeParcelWriter.c(parcel, 23, this.u);
        SafeParcelWriter.c(parcel, 24, this.v);
        SafeParcelWriter.c(parcel, 25, this.w);
        SafeParcelWriter.c(parcel, 26, this.x);
        SafeParcelWriter.r(parcel, 28, this.y, i2, false);
        SafeParcelWriter.t(parcel, 29, this.z, false);
        SafeParcelWriter.t(parcel, 30, this.A, false);
        SafeParcelWriter.c(parcel, 31, this.B);
        SafeParcelWriter.c(parcel, 32, this.C);
        SafeParcelWriter.r(parcel, 33, this.D, i2, false);
        SafeParcelWriter.v(parcel, 34, this.E, false);
        SafeParcelWriter.v(parcel, 35, this.F, false);
        SafeParcelWriter.c(parcel, 36, this.G);
        SafeParcelWriter.r(parcel, 37, this.H, i2, false);
        SafeParcelWriter.c(parcel, 38, this.I);
        SafeParcelWriter.t(parcel, 39, this.J, false);
        SafeParcelWriter.v(parcel, 40, this.K, false);
        SafeParcelWriter.c(parcel, 42, this.L);
        SafeParcelWriter.t(parcel, 43, this.M, false);
        SafeParcelWriter.r(parcel, 44, this.N, i2, false);
        SafeParcelWriter.t(parcel, 45, this.O, false);
        SafeParcelWriter.c(parcel, 46, this.P);
        SafeParcelWriter.c(parcel, 47, this.Q);
        SafeParcelWriter.e(parcel, 48, this.R, false);
        SafeParcelWriter.c(parcel, 49, this.S);
        SafeParcelWriter.l(parcel, 50, this.T);
        SafeParcelWriter.c(parcel, 51, this.U);
        SafeParcelWriter.v(parcel, 52, this.V, false);
        SafeParcelWriter.c(parcel, 53, this.W);
        SafeParcelWriter.t(parcel, 54, this.X, false);
        SafeParcelWriter.t(parcel, 55, this.Y, false);
        SafeParcelWriter.c(parcel, 56, this.Z);
        SafeParcelWriter.c(parcel, 57, this.a0);
        SafeParcelWriter.b(parcel, a2);
    }
}
