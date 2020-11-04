package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class k3 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a  reason: collision with root package name */
    private final zzfy f10085a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10086b;

    /* renamed from: c  reason: collision with root package name */
    private String f10087c;

    /* renamed from: d  reason: collision with root package name */
    private String f10088d;

    /* renamed from: e  reason: collision with root package name */
    private String f10089e;

    /* renamed from: f  reason: collision with root package name */
    private String f10090f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    k3(zzfy zzfy, String str) {
        Preconditions.k(zzfy);
        Preconditions.g(str);
        this.f10085a = zzfy;
        this.f10086b = str;
        zzfy.g().c();
    }

    public final String A() {
        this.f10085a.g().c();
        return this.f10088d;
    }

    public final void B(long j2) {
        this.f10085a.g().c();
        this.E |= this.n != j2;
        this.n = j2;
    }

    public final void C(String str) {
        this.f10085a.g().c();
        this.E |= !zzkr.A0(this.f10089e, str);
        this.f10089e = str;
    }

    public final String D() {
        this.f10085a.g().c();
        return this.s;
    }

    public final void E(long j2) {
        this.f10085a.g().c();
        this.E |= this.u != j2;
        this.u = j2;
    }

    public final void F(String str) {
        this.f10085a.g().c();
        this.E |= !zzkr.A0(this.f10090f, str);
        this.f10090f = str;
    }

    public final String G() {
        this.f10085a.g().c();
        return this.w;
    }

    public final void H(long j2) {
        boolean z2 = true;
        Preconditions.a(j2 >= 0);
        this.f10085a.g().c();
        boolean z3 = this.E;
        if (this.g == j2) {
            z2 = false;
        }
        this.E = z2 | z3;
        this.g = j2;
    }

    public final void I(String str) {
        this.f10085a.g().c();
        this.E |= !zzkr.A0(this.j, str);
        this.j = str;
    }

    public final String J() {
        this.f10085a.g().c();
        return this.f10089e;
    }

    public final void K(long j2) {
        this.f10085a.g().c();
        this.E |= this.F != j2;
        this.F = j2;
    }

    public final void L(String str) {
        this.f10085a.g().c();
        this.E |= !zzkr.A0(this.l, str);
        this.l = str;
    }

    public final String M() {
        this.f10085a.g().c();
        return this.f10090f;
    }

    public final void N(long j2) {
        this.f10085a.g().c();
        this.E |= this.G != j2;
        this.G = j2;
    }

    public final void O(String str) {
        this.f10085a.g().c();
        this.E |= !zzkr.A0(this.D, str);
        this.D = str;
    }

    public final long P() {
        this.f10085a.g().c();
        return this.h;
    }

    public final void Q(long j2) {
        this.f10085a.g().c();
        this.E |= this.x != j2;
        this.x = j2;
    }

    public final long R() {
        this.f10085a.g().c();
        return this.i;
    }

    public final void S(long j2) {
        this.f10085a.g().c();
        this.E |= this.y != j2;
        this.y = j2;
    }

    public final String T() {
        this.f10085a.g().c();
        return this.j;
    }

    public final void U(long j2) {
        this.f10085a.g().c();
        this.E |= this.z != j2;
        this.z = j2;
    }

    public final long V() {
        this.f10085a.g().c();
        return this.k;
    }

    public final void W(long j2) {
        this.f10085a.g().c();
        this.E |= this.A != j2;
        this.A = j2;
    }

    public final String X() {
        this.f10085a.g().c();
        return this.l;
    }

    public final void Y(long j2) {
        this.f10085a.g().c();
        this.E |= this.C != j2;
        this.C = j2;
    }

    public final long Z() {
        this.f10085a.g().c();
        return this.m;
    }

    public final void a(long j2) {
        this.f10085a.g().c();
        this.E |= this.h != j2;
        this.h = j2;
    }

    public final void a0(long j2) {
        this.f10085a.g().c();
        this.E |= this.B != j2;
        this.B = j2;
    }

    public final void b(Boolean bool) {
        this.f10085a.g().c();
        this.E |= !zzkr.b0(this.t, bool);
        this.t = bool;
    }

    public final long b0() {
        this.f10085a.g().c();
        return this.n;
    }

    public final void c(String str) {
        this.f10085a.g().c();
        this.E |= !zzkr.A0(this.f10087c, str);
        this.f10087c = str;
    }

    public final void c0(long j2) {
        this.f10085a.g().c();
        this.E |= this.p != j2;
        this.p = j2;
    }

    public final void d(List<String> list) {
        this.f10085a.g().c();
        if (!zzkr.m0(this.v, list)) {
            this.E = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }

    public final long d0() {
        this.f10085a.g().c();
        return this.u;
    }

    public final void e(boolean z2) {
        this.f10085a.g().c();
        this.E |= this.o != z2;
        this.o = z2;
    }

    public final boolean e0() {
        this.f10085a.g().c();
        return this.o;
    }

    public final boolean f() {
        this.f10085a.g().c();
        return this.E;
    }

    public final long f0() {
        this.f10085a.g().c();
        return this.g;
    }

    public final long g() {
        this.f10085a.g().c();
        return this.C;
    }

    public final long g0() {
        this.f10085a.g().c();
        return this.F;
    }

    public final long h() {
        this.f10085a.g().c();
        return this.B;
    }

    public final long h0() {
        this.f10085a.g().c();
        return this.G;
    }

    public final String i() {
        this.f10085a.g().c();
        return this.D;
    }

    public final void i0() {
        this.f10085a.g().c();
        long j2 = this.g + 1;
        if (j2 > 2147483647L) {
            this.f10085a.h().J().b("Bundle index overflow. appId", zzeu.x(this.f10086b));
            j2 = 0;
        }
        this.E = true;
        this.g = j2;
    }

    public final String j() {
        this.f10085a.g().c();
        String str = this.D;
        O((String) null);
        return str;
    }

    public final long j0() {
        this.f10085a.g().c();
        return this.x;
    }

    public final long k() {
        this.f10085a.g().c();
        return this.p;
    }

    public final long k0() {
        this.f10085a.g().c();
        return this.y;
    }

    public final boolean l() {
        this.f10085a.g().c();
        return this.q;
    }

    public final long l0() {
        this.f10085a.g().c();
        return this.z;
    }

    public final boolean m() {
        this.f10085a.g().c();
        return this.r;
    }

    public final long m0() {
        this.f10085a.g().c();
        return this.A;
    }

    public final Boolean n() {
        this.f10085a.g().c();
        return this.t;
    }

    public final List<String> o() {
        this.f10085a.g().c();
        return this.v;
    }

    public final void p() {
        this.f10085a.g().c();
        this.E = false;
    }

    public final void q(long j2) {
        this.f10085a.g().c();
        this.E |= this.i != j2;
        this.i = j2;
    }

    public final void r(String str) {
        this.f10085a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !zzkr.A0(this.f10088d, str);
        this.f10088d = str;
    }

    public final void s(boolean z2) {
        this.f10085a.g().c();
        this.E |= this.q != z2;
        this.q = z2;
    }

    public final String t() {
        this.f10085a.g().c();
        return this.f10086b;
    }

    public final void u(long j2) {
        this.f10085a.g().c();
        this.E |= this.k != j2;
        this.k = j2;
    }

    public final void v(String str) {
        this.f10085a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !zzkr.A0(this.s, str);
        this.s = str;
    }

    public final void w(boolean z2) {
        this.f10085a.g().c();
        this.E |= this.r != z2;
        this.r = z2;
    }

    public final String x() {
        this.f10085a.g().c();
        return this.f10087c;
    }

    public final void y(long j2) {
        this.f10085a.g().c();
        this.E |= this.m != j2;
        this.m = j2;
    }

    public final void z(String str) {
        this.f10085a.g().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !zzkr.A0(this.w, str);
        this.w = str;
    }
}
