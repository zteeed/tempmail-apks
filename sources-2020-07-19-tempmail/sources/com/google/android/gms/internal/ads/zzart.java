package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@SafeParcelable.Class
@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzart extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzart> CREATOR = new zzarw();
    @SafeParcelable.Field
    private final List<String> A;
    @SafeParcelable.Field
    private final long B;
    @SafeParcelable.Field
    private final String C;
    @SafeParcelable.Field
    private final float D;
    @SafeParcelable.Field
    private final int E;
    @SafeParcelable.Field
    private final int F;
    @SafeParcelable.Field
    private final boolean G;
    @SafeParcelable.Field
    private final boolean H;
    @SafeParcelable.Field
    private final String I;
    @SafeParcelable.Field
    private final boolean J;
    @SafeParcelable.Field
    private final String K;
    @SafeParcelable.Field
    private final boolean L;
    @SafeParcelable.Field
    private final int M;
    @SafeParcelable.Field
    private final Bundle N;
    @SafeParcelable.Field
    private final String O;
    @SafeParcelable.Field
    private final zzyo P;
    @SafeParcelable.Field
    private final boolean Q;
    @SafeParcelable.Field
    private final Bundle R;
    @SafeParcelable.Field
    private final String S;
    @SafeParcelable.Field
    private final String T;
    @SafeParcelable.Field
    private final String U;
    @SafeParcelable.Field
    private final boolean V;
    @SafeParcelable.Field
    private final List<Integer> W;
    @SafeParcelable.Field
    private final String X;
    @SafeParcelable.Field
    private final List<String> Y;
    @SafeParcelable.Field
    private final int Z;
    @SafeParcelable.Field
    private final boolean a0;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    private final int f5894b;
    @SafeParcelable.Field
    private final boolean b0;
    @SafeParcelable.Field

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f5895c;
    @SafeParcelable.Field
    private final boolean c0;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    private final zzve f5896d;
    @SafeParcelable.Field
    private final ArrayList<String> d0;
    @SafeParcelable.Field

    /* renamed from: e  reason: collision with root package name */
    private final zzvh f5897e;
    @SafeParcelable.Field
    private final String e0;
    @SafeParcelable.Field

    /* renamed from: f  reason: collision with root package name */
    private final String f5898f;
    @SafeParcelable.Field
    private final zzaio f0;
    @SafeParcelable.Field
    private final ApplicationInfo g;
    @SafeParcelable.Field
    private final String g0;
    @SafeParcelable.Field
    private final PackageInfo h;
    @SafeParcelable.Field
    private final Bundle h0;
    @SafeParcelable.Field
    private final String i;
    @SafeParcelable.Field
    private final String j;
    @SafeParcelable.Field
    private final String k;
    @SafeParcelable.Field
    private final zzbbd l;
    @SafeParcelable.Field
    private final Bundle m;
    @SafeParcelable.Field
    private final int n;
    @SafeParcelable.Field
    private final List<String> o;
    @SafeParcelable.Field
    private final Bundle p;
    @SafeParcelable.Field
    private final boolean q;
    @SafeParcelable.Field
    private final int r;
    @SafeParcelable.Field
    private final int s;
    @SafeParcelable.Field
    private final float t;
    @SafeParcelable.Field
    private final String u;
    @SafeParcelable.Field
    private final long v;
    @SafeParcelable.Field
    private final String w;
    @SafeParcelable.Field
    private final List<String> x;
    @SafeParcelable.Field
    private final String y;
    @SafeParcelable.Field
    private final zzadj z;

    @SafeParcelable.Constructor
    zzart(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) zzve zzve, @SafeParcelable.Param(id = 4) zzvh zzvh, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) ApplicationInfo applicationInfo, @SafeParcelable.Param(id = 7) PackageInfo packageInfo, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) String str3, @SafeParcelable.Param(id = 10) String str4, @SafeParcelable.Param(id = 11) zzbbd zzbbd, @SafeParcelable.Param(id = 12) Bundle bundle2, @SafeParcelable.Param(id = 13) int i3, @SafeParcelable.Param(id = 14) List<String> list, @SafeParcelable.Param(id = 15) Bundle bundle3, @SafeParcelable.Param(id = 16) boolean z2, @SafeParcelable.Param(id = 18) int i4, @SafeParcelable.Param(id = 19) int i5, @SafeParcelable.Param(id = 20) float f2, @SafeParcelable.Param(id = 21) String str5, @SafeParcelable.Param(id = 25) long j2, @SafeParcelable.Param(id = 26) String str6, @SafeParcelable.Param(id = 27) List<String> list2, @SafeParcelable.Param(id = 28) String str7, @SafeParcelable.Param(id = 29) zzadj zzadj, @SafeParcelable.Param(id = 30) List<String> list3, @SafeParcelable.Param(id = 31) long j3, @SafeParcelable.Param(id = 33) String str8, @SafeParcelable.Param(id = 34) float f3, @SafeParcelable.Param(id = 40) boolean z3, @SafeParcelable.Param(id = 35) int i6, @SafeParcelable.Param(id = 36) int i7, @SafeParcelable.Param(id = 37) boolean z4, @SafeParcelable.Param(id = 38) boolean z5, @SafeParcelable.Param(id = 39) String str9, @SafeParcelable.Param(id = 41) String str10, @SafeParcelable.Param(id = 42) boolean z6, @SafeParcelable.Param(id = 43) int i8, @SafeParcelable.Param(id = 44) Bundle bundle4, @SafeParcelable.Param(id = 45) String str11, @SafeParcelable.Param(id = 46) zzyo zzyo, @SafeParcelable.Param(id = 47) boolean z7, @SafeParcelable.Param(id = 48) Bundle bundle5, @SafeParcelable.Param(id = 49) String str12, @SafeParcelable.Param(id = 50) String str13, @SafeParcelable.Param(id = 51) String str14, @SafeParcelable.Param(id = 52) boolean z8, @SafeParcelable.Param(id = 53) List<Integer> list4, @SafeParcelable.Param(id = 54) String str15, @SafeParcelable.Param(id = 55) List<String> list5, @SafeParcelable.Param(id = 56) int i9, @SafeParcelable.Param(id = 57) boolean z9, @SafeParcelable.Param(id = 58) boolean z10, @SafeParcelable.Param(id = 59) boolean z11, @SafeParcelable.Param(id = 60) ArrayList<String> arrayList, @SafeParcelable.Param(id = 61) String str16, @SafeParcelable.Param(id = 63) zzaio zzaio, @SafeParcelable.Param(id = 64) String str17, @SafeParcelable.Param(id = 65) Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.f5894b = i2;
        this.f5895c = bundle;
        this.f5896d = zzve;
        this.f5897e = zzvh;
        this.f5898f = str;
        this.g = applicationInfo;
        this.h = packageInfo;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = zzbbd;
        this.m = bundle2;
        this.n = i3;
        this.o = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.A = list6;
        this.p = bundle3;
        this.q = z2;
        this.r = i4;
        this.s = i5;
        this.t = f2;
        this.u = str5;
        this.v = j2;
        this.w = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.x = list7;
        this.y = str7;
        this.z = zzadj;
        this.B = j3;
        this.C = str8;
        this.D = f3;
        this.J = z3;
        this.E = i6;
        this.F = i7;
        this.G = z4;
        this.H = z5;
        this.I = str9;
        this.K = str10;
        this.L = z6;
        this.M = i8;
        this.N = bundle4;
        this.O = str11;
        this.P = zzyo;
        this.Q = z7;
        this.R = bundle5;
        this.S = str12;
        this.T = str13;
        this.U = str14;
        this.V = z8;
        this.W = list4;
        this.X = str15;
        this.Y = list5;
        this.Z = i9;
        this.a0 = z9;
        this.b0 = z10;
        this.c0 = z11;
        this.d0 = arrayList;
        this.e0 = str16;
        this.f0 = zzaio;
        this.g0 = str17;
        this.h0 = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.l(parcel, 1, this.f5894b);
        SafeParcelWriter.e(parcel, 2, this.f5895c, false);
        SafeParcelWriter.r(parcel, 3, this.f5896d, i2, false);
        SafeParcelWriter.r(parcel, 4, this.f5897e, i2, false);
        SafeParcelWriter.t(parcel, 5, this.f5898f, false);
        SafeParcelWriter.r(parcel, 6, this.g, i2, false);
        SafeParcelWriter.r(parcel, 7, this.h, i2, false);
        SafeParcelWriter.t(parcel, 8, this.i, false);
        SafeParcelWriter.t(parcel, 9, this.j, false);
        SafeParcelWriter.t(parcel, 10, this.k, false);
        SafeParcelWriter.r(parcel, 11, this.l, i2, false);
        SafeParcelWriter.e(parcel, 12, this.m, false);
        SafeParcelWriter.l(parcel, 13, this.n);
        SafeParcelWriter.v(parcel, 14, this.o, false);
        SafeParcelWriter.e(parcel, 15, this.p, false);
        SafeParcelWriter.c(parcel, 16, this.q);
        SafeParcelWriter.l(parcel, 18, this.r);
        SafeParcelWriter.l(parcel, 19, this.s);
        SafeParcelWriter.i(parcel, 20, this.t);
        SafeParcelWriter.t(parcel, 21, this.u, false);
        SafeParcelWriter.o(parcel, 25, this.v);
        SafeParcelWriter.t(parcel, 26, this.w, false);
        SafeParcelWriter.v(parcel, 27, this.x, false);
        SafeParcelWriter.t(parcel, 28, this.y, false);
        SafeParcelWriter.r(parcel, 29, this.z, i2, false);
        SafeParcelWriter.v(parcel, 30, this.A, false);
        SafeParcelWriter.o(parcel, 31, this.B);
        SafeParcelWriter.t(parcel, 33, this.C, false);
        SafeParcelWriter.i(parcel, 34, this.D);
        SafeParcelWriter.l(parcel, 35, this.E);
        SafeParcelWriter.l(parcel, 36, this.F);
        SafeParcelWriter.c(parcel, 37, this.G);
        SafeParcelWriter.c(parcel, 38, this.H);
        SafeParcelWriter.t(parcel, 39, this.I, false);
        SafeParcelWriter.c(parcel, 40, this.J);
        SafeParcelWriter.t(parcel, 41, this.K, false);
        SafeParcelWriter.c(parcel, 42, this.L);
        SafeParcelWriter.l(parcel, 43, this.M);
        SafeParcelWriter.e(parcel, 44, this.N, false);
        SafeParcelWriter.t(parcel, 45, this.O, false);
        SafeParcelWriter.r(parcel, 46, this.P, i2, false);
        SafeParcelWriter.c(parcel, 47, this.Q);
        SafeParcelWriter.e(parcel, 48, this.R, false);
        SafeParcelWriter.t(parcel, 49, this.S, false);
        SafeParcelWriter.t(parcel, 50, this.T, false);
        SafeParcelWriter.t(parcel, 51, this.U, false);
        SafeParcelWriter.c(parcel, 52, this.V);
        SafeParcelWriter.m(parcel, 53, this.W, false);
        SafeParcelWriter.t(parcel, 54, this.X, false);
        SafeParcelWriter.v(parcel, 55, this.Y, false);
        SafeParcelWriter.l(parcel, 56, this.Z);
        SafeParcelWriter.c(parcel, 57, this.a0);
        SafeParcelWriter.c(parcel, 58, this.b0);
        SafeParcelWriter.c(parcel, 59, this.c0);
        SafeParcelWriter.v(parcel, 60, this.d0, false);
        SafeParcelWriter.t(parcel, 61, this.e0, false);
        SafeParcelWriter.r(parcel, 63, this.f0, i2, false);
        SafeParcelWriter.t(parcel, 64, this.g0, false);
        SafeParcelWriter.e(parcel, 65, this.h0, false);
        SafeParcelWriter.b(parcel, a2);
    }
}
