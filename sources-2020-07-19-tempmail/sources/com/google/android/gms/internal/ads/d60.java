package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class d60 implements t70 {

    /* renamed from: a  reason: collision with root package name */
    private final zzefc f3606a;

    /* renamed from: b  reason: collision with root package name */
    private int f3607b;

    /* renamed from: c  reason: collision with root package name */
    private int f3608c;

    /* renamed from: d  reason: collision with root package name */
    private int f3609d = 0;

    private d60(zzefc zzefc) {
        zzegd.d(zzefc, "input");
        zzefc zzefc2 = zzefc;
        this.f3606a = zzefc2;
        zzefc2.f8544d = this;
    }

    public static d60 a(zzefc zzefc) {
        d60 d60 = zzefc.f8544d;
        if (d60 != null) {
            return d60;
        }
        return new d60(zzefc);
    }

    private final Object b(zzejq zzejq, Class<?> cls, zzefo zzefo) throws IOException {
        switch (c60.f3519a[zzejq.ordinal()]) {
            case 1:
                return Boolean.valueOf(g0());
            case 2:
                return F();
            case 3:
                return Double.valueOf(L());
            case 4:
                return Integer.valueOf(Q());
            case 5:
                return Integer.valueOf(b0());
            case 6:
                return Long.valueOf(W());
            case 7:
                return Float.valueOf(f0());
            case 8:
                return Integer.valueOf(R());
            case 9:
                return Long.valueOf(M());
            case 10:
                f(2);
                return d(s70.b().c(cls), zzefo);
            case 11:
                return Integer.valueOf(U());
            case 12:
                return Long.valueOf(a0());
            case 13:
                return Integer.valueOf(d0());
            case 14:
                return Long.valueOf(O());
            case 15:
                return B();
            case 16:
                return Integer.valueOf(J());
            case 17:
                return Long.valueOf(H());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void c(List<String> list, boolean z) throws IOException {
        int e2;
        int e3;
        if ((this.f3607b & 7) != 2) {
            throw zzegl.f();
        } else if (!(list instanceof zzegw) || z) {
            do {
                list.add(z ? B() : V());
                if (!this.f3606a.t()) {
                    e2 = this.f3606a.e();
                } else {
                    return;
                }
            } while (e2 == this.f3607b);
            this.f3609d = e2;
        } else {
            zzegw zzegw = (zzegw) list;
            do {
                zzegw.n(F());
                if (!this.f3606a.t()) {
                    e3 = this.f3606a.e();
                } else {
                    return;
                }
            } while (e3 == this.f3607b);
            this.f3609d = e3;
        }
    }

    private final <T> T d(z70<T> z70, zzefo zzefo) throws IOException {
        int n = this.f3606a.n();
        zzefc zzefc = this.f3606a;
        if (zzefc.f8541a < zzefc.f8542b) {
            int y = zzefc.y(n);
            T g = z70.g();
            this.f3606a.f8541a++;
            z70.j(g, this, zzefo);
            z70.b(g);
            this.f3606a.w(0);
            zzefc zzefc2 = this.f3606a;
            zzefc2.f8541a--;
            zzefc2.z(y);
            return g;
        }
        throw new zzegl("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final <T> T e(z70<T> z70, zzefo zzefo) throws IOException {
        int i = this.f3608c;
        this.f3608c = ((this.f3607b >>> 3) << 3) | 4;
        try {
            T g = z70.g();
            z70.j(g, this, zzefo);
            z70.b(g);
            if (this.f3607b == this.f3608c) {
                return g;
            }
            throw zzegl.h();
        } finally {
            this.f3608c = i;
        }
    }

    private final void f(int i) throws IOException {
        if ((this.f3607b & 7) != i) {
            throw zzegl.f();
        }
    }

    private static void g(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzegl.h();
        }
    }

    private static void h(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzegl.h();
        }
    }

    private final void j(int i) throws IOException {
        if (this.f3606a.u() != i) {
            throw zzegl.a();
        }
    }

    public final void A(List<Integer> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    r60.L(this.f3606a.r());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    r60.L(this.f3606a.r());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3606a.r()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Integer.valueOf(this.f3606a.r()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final String B() throws IOException {
        f(2);
        return this.f3606a.l();
    }

    public final <T> void C(List<T> list, z70<T> z70, zzefo zzefo) throws IOException {
        int e2;
        int i = this.f3607b;
        if ((i & 7) == 2) {
            do {
                list.add(d(z70, zzefo));
                if (!this.f3606a.t() && this.f3609d == 0) {
                    e2 = this.f3606a.e();
                } else {
                    return;
                }
            } while (e2 == i);
            this.f3609d = e2;
            return;
        }
        throw zzegl.f();
    }

    public final void D(List<Long> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            int i = this.f3607b & 7;
            if (i == 1) {
                do {
                    y60.m(this.f3606a.q());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int n = this.f3606a.n();
                g(n);
                int u = this.f3606a.u() + n;
                do {
                    y60.m(this.f3606a.q());
                } while (this.f3606a.u() < u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f3606a.q()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int n2 = this.f3606a.n();
                g(n2);
                int u2 = this.f3606a.u() + n2;
                do {
                    list.add(Long.valueOf(this.f3606a.q()));
                } while (this.f3606a.u() < u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void E(List<Integer> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            int i = this.f3607b & 7;
            if (i == 2) {
                int n = this.f3606a.n();
                h(n);
                int u = this.f3606a.u() + n;
                do {
                    r60.L(this.f3606a.p());
                } while (this.f3606a.u() < u);
            } else if (i == 5) {
                do {
                    r60.L(this.f3606a.p());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 2) {
                int n2 = this.f3606a.n();
                h(n2);
                int u2 = this.f3606a.u() + n2;
                do {
                    list.add(Integer.valueOf(this.f3606a.p()));
                } while (this.f3606a.u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f3606a.p()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else {
                throw zzegl.f();
            }
        }
    }

    public final zzeer F() throws IOException {
        f(2);
        return this.f3606a.m();
    }

    public final <T> void G(List<T> list, z70<T> z70, zzefo zzefo) throws IOException {
        int e2;
        int i = this.f3607b;
        if ((i & 7) == 3) {
            do {
                list.add(e(z70, zzefo));
                if (!this.f3606a.t() && this.f3609d == 0) {
                    e2 = this.f3606a.e();
                } else {
                    return;
                }
            } while (e2 == i);
            this.f3609d = e2;
            return;
        }
        throw zzegl.f();
    }

    public final long H() throws IOException {
        f(0);
        return this.f3606a.f();
    }

    public final <T> T I(z70<T> z70, zzefo zzefo) throws IOException {
        f(2);
        return d(z70, zzefo);
    }

    public final int J() throws IOException {
        f(0);
        return this.f3606a.n();
    }

    public final void K(List<Boolean> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof p50) {
            p50 p50 = (p50) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    p50.h(this.f3606a.k());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    p50.h(this.f3606a.k());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f3606a.k()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Boolean.valueOf(this.f3606a.k()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final double L() throws IOException {
        f(1);
        return this.f3606a.a();
    }

    public final long M() throws IOException {
        f(0);
        return this.f3606a.g();
    }

    public final <T> T N(z70<T> z70, zzefo zzefo) throws IOException {
        f(3);
        return e(z70, zzefo);
    }

    public final long O() throws IOException {
        f(0);
        return this.f3606a.s();
    }

    public final void P(List<Long> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    y60.m(this.f3606a.s());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    y60.m(this.f3606a.s());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f3606a.s()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Long.valueOf(this.f3606a.s()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final int Q() throws IOException {
        f(0);
        return this.f3606a.o();
    }

    public final int R() throws IOException {
        f(0);
        return this.f3606a.h();
    }

    public final void S(List<zzeer> list) throws IOException {
        int e2;
        if ((this.f3607b & 7) == 2) {
            do {
                list.add(F());
                if (!this.f3606a.t()) {
                    e2 = this.f3606a.e();
                } else {
                    return;
                }
            } while (e2 == this.f3607b);
            this.f3609d = e2;
            return;
        }
        throw zzegl.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (e0() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.ads.zzegl("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void T(java.util.Map<K, V> r8, com.google.android.gms.internal.ads.d70<K, V> r9, com.google.android.gms.internal.ads.zzefo r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.f(r0)
            com.google.android.gms.internal.ads.zzefc r1 = r7.f3606a
            int r1 = r1.n()
            com.google.android.gms.internal.ads.zzefc r2 = r7.f3606a
            int r1 = r2.y(r1)
            K r2 = r9.f3614b
            V r3 = r9.f3616d
        L_0x0014:
            int r4 = r7.X()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            com.google.android.gms.internal.ads.zzefc r5 = r7.f3606a     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.t()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.e0()     // Catch:{ zzego -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.ads.zzegl r4 = new com.google.android.gms.internal.ads.zzegl     // Catch:{ zzego -> 0x004e }
            r4.<init>(r6)     // Catch:{ zzego -> 0x004e }
            throw r4     // Catch:{ zzego -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.ads.zzejq r4 = r9.f3615c     // Catch:{ zzego -> 0x004e }
            V r5 = r9.f3616d     // Catch:{ zzego -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzego -> 0x004e }
            java.lang.Object r3 = r7.b(r4, r5, r10)     // Catch:{ zzego -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.ads.zzejq r4 = r9.f3613a     // Catch:{ zzego -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.b(r4, r5, r5)     // Catch:{ zzego -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.e0()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.ads.zzegl r8 = new com.google.android.gms.internal.ads.zzegl     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.ads.zzefc r8 = r7.f3606a
            r8.z(r1)
            return
        L_0x0064:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzefc r9 = r7.f3606a
            r9.z(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d60.T(java.util.Map, com.google.android.gms.internal.ads.d70, com.google.android.gms.internal.ads.zzefo):void");
    }

    public final int U() throws IOException {
        f(5);
        return this.f3606a.p();
    }

    public final String V() throws IOException {
        f(2);
        return this.f3606a.c();
    }

    public final long W() throws IOException {
        f(1);
        return this.f3606a.i();
    }

    public final int X() throws IOException {
        int i = this.f3609d;
        if (i != 0) {
            this.f3607b = i;
            this.f3609d = 0;
        } else {
            this.f3607b = this.f3606a.e();
        }
        int i2 = this.f3607b;
        if (i2 == 0 || i2 == this.f3608c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void Y(List<String> list) throws IOException {
        c(list, true);
    }

    public final void Z(List<String> list) throws IOException {
        c(list, false);
    }

    public final long a0() throws IOException {
        f(1);
        return this.f3606a.q();
    }

    public final int b0() throws IOException {
        f(5);
        return this.f3606a.j();
    }

    public final void c0(List<Integer> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    r60.L(this.f3606a.o());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    r60.L(this.f3606a.o());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3606a.o()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Integer.valueOf(this.f3606a.o()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final int d0() throws IOException {
        f(0);
        return this.f3606a.r();
    }

    public final boolean e0() throws IOException {
        int i;
        if (this.f3606a.t() || (i = this.f3607b) == this.f3608c) {
            return false;
        }
        return this.f3606a.x(i);
    }

    public final float f0() throws IOException {
        f(5);
        return this.f3606a.b();
    }

    public final boolean g0() throws IOException {
        f(0);
        return this.f3606a.k();
    }

    public final int getTag() {
        return this.f3607b;
    }

    public final void h0(List<Integer> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    r60.L(this.f3606a.n());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    r60.L(this.f3606a.n());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3606a.n()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Integer.valueOf(this.f3606a.n()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void i(List<Long> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            int i = this.f3607b & 7;
            if (i == 1) {
                do {
                    y60.m(this.f3606a.i());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int n = this.f3606a.n();
                g(n);
                int u = this.f3606a.u() + n;
                do {
                    y60.m(this.f3606a.i());
                } while (this.f3606a.u() < u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f3606a.i()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int n2 = this.f3606a.n();
                g(n2);
                int u2 = this.f3606a.u() + n2;
                do {
                    list.add(Long.valueOf(this.f3606a.i()));
                } while (this.f3606a.u() < u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void m(List<Integer> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    r60.L(this.f3606a.h());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    r60.L(this.f3606a.h());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f3606a.h()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Integer.valueOf(this.f3606a.h()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void s(List<Integer> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof r60) {
            r60 r60 = (r60) list;
            int i = this.f3607b & 7;
            if (i == 2) {
                int n = this.f3606a.n();
                h(n);
                int u = this.f3606a.u() + n;
                do {
                    r60.L(this.f3606a.j());
                } while (this.f3606a.u() < u);
            } else if (i == 5) {
                do {
                    r60.L(this.f3606a.j());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 2) {
                int n2 = this.f3606a.n();
                h(n2);
                int u2 = this.f3606a.u() + n2;
                do {
                    list.add(Integer.valueOf(this.f3606a.j()));
                } while (this.f3606a.u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f3606a.j()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void t(List<Float> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof p60) {
            p60 p60 = (p60) list;
            int i = this.f3607b & 7;
            if (i == 2) {
                int n = this.f3606a.n();
                h(n);
                int u = this.f3606a.u() + n;
                do {
                    p60.j(this.f3606a.b());
                } while (this.f3606a.u() < u);
            } else if (i == 5) {
                do {
                    p60.j(this.f3606a.b());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 2) {
                int n2 = this.f3606a.n();
                h(n2);
                int u2 = this.f3606a.u() + n2;
                do {
                    list.add(Float.valueOf(this.f3606a.b()));
                } while (this.f3606a.u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f3606a.b()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void v(List<Double> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof f60) {
            f60 f60 = (f60) list;
            int i = this.f3607b & 7;
            if (i == 1) {
                do {
                    f60.h(this.f3606a.a());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int n = this.f3606a.n();
                g(n);
                int u = this.f3606a.u() + n;
                do {
                    f60.h(this.f3606a.a());
                } while (this.f3606a.u() < u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f3606a.a()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int n2 = this.f3606a.n();
                g(n2);
                int u2 = this.f3606a.u() + n2;
                do {
                    list.add(Double.valueOf(this.f3606a.a()));
                } while (this.f3606a.u() < u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void w(List<Long> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    y60.m(this.f3606a.g());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    y60.m(this.f3606a.g());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f3606a.g()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Long.valueOf(this.f3606a.g()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }

    public final void z(List<Long> list) throws IOException {
        int e2;
        int e3;
        if (list instanceof y60) {
            y60 y60 = (y60) list;
            int i = this.f3607b & 7;
            if (i == 0) {
                do {
                    y60.m(this.f3606a.f());
                    if (!this.f3606a.t()) {
                        e3 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e3 == this.f3607b);
                this.f3609d = e3;
            } else if (i == 2) {
                int u = this.f3606a.u() + this.f3606a.n();
                do {
                    y60.m(this.f3606a.f());
                } while (this.f3606a.u() < u);
                j(u);
            } else {
                throw zzegl.f();
            }
        } else {
            int i2 = this.f3607b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f3606a.f()));
                    if (!this.f3606a.t()) {
                        e2 = this.f3606a.e();
                    } else {
                        return;
                    }
                } while (e2 == this.f3607b);
                this.f3609d = e2;
            } else if (i2 == 2) {
                int u2 = this.f3606a.u() + this.f3606a.n();
                do {
                    list.add(Long.valueOf(this.f3606a.f()));
                } while (this.f3606a.u() < u2);
                j(u2);
            } else {
                throw zzegl.f();
            }
        }
    }
}
