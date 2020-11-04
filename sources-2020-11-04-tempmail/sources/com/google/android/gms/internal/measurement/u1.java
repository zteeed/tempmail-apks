package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class u1 implements m3 {

    /* renamed from: a  reason: collision with root package name */
    private final zzes f9681a;

    /* renamed from: b  reason: collision with root package name */
    private int f9682b;

    /* renamed from: c  reason: collision with root package name */
    private int f9683c;

    /* renamed from: d  reason: collision with root package name */
    private int f9684d = 0;

    private u1(zzes zzes) {
        zzfr.f(zzes, "input");
        zzes zzes2 = zzes;
        this.f9681a = zzes2;
        zzes2.f9796c = this;
    }

    public static u1 P(zzes zzes) {
        u1 u1Var = zzes.f9796c;
        if (u1Var != null) {
            return u1Var;
        }
        return new u1(zzes);
    }

    private final Object Q(zziu zziu, Class<?> cls, zzfb zzfb) throws IOException {
        switch (w1.f9698a[zziu.ordinal()]) {
            case 1:
                return Boolean.valueOf(A());
            case 2:
                return f();
            case 3:
                return Double.valueOf(d());
            case 4:
                return Integer.valueOf(o());
            case 5:
                return Integer.valueOf(x());
            case 6:
                return Long.valueOf(r());
            case 7:
                return Float.valueOf(e());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(l());
            case 10:
                R(2);
                return U(l3.a().b(cls), zzfb);
            case 11:
                return Integer.valueOf(g());
            case 12:
                return Long.valueOf(h());
            case 13:
                return Integer.valueOf(y());
            case 14:
                return Long.valueOf(B());
            case 15:
                return n();
            case 16:
                return Integer.valueOf(k());
            case 17:
                return Long.valueOf(j());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final void R(int i) throws IOException {
        if ((this.f9682b & 7) != i) {
            throw zzfw.f();
        }
    }

    private final void S(List<String> list, boolean z) throws IOException {
        int a2;
        int a3;
        if ((this.f9682b & 7) != 2) {
            throw zzfw.f();
        } else if (!(list instanceof zzgh) || z) {
            do {
                list.add(z ? n() : u());
                if (!this.f9681a.z()) {
                    a2 = this.f9681a.a();
                } else {
                    return;
                }
            } while (a2 == this.f9682b);
            this.f9684d = a2;
        } else {
            zzgh zzgh = (zzgh) list;
            do {
                zzgh.S(f());
                if (!this.f9681a.z()) {
                    a3 = this.f9681a.a();
                } else {
                    return;
                }
            } while (a3 == this.f9682b);
            this.f9684d = a3;
        }
    }

    private static void T(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzfw.g();
        }
    }

    private final <T> T U(p3<T> p3Var, zzfb zzfb) throws IOException {
        int t = this.f9681a.t();
        zzes zzes = this.f9681a;
        if (zzes.f9794a < zzes.f9795b) {
            int h = zzes.h(t);
            T a2 = p3Var.a();
            this.f9681a.f9794a++;
            p3Var.d(a2, this, zzfb);
            p3Var.f(a2);
            this.f9681a.d(0);
            zzes zzes2 = this.f9681a;
            zzes2.f9794a--;
            zzes2.j(h);
            return a2;
        }
        throw new zzfw("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private static void V(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzfw.g();
        }
    }

    private final <T> T W(p3<T> p3Var, zzfb zzfb) throws IOException {
        int i = this.f9683c;
        this.f9683c = ((this.f9682b >>> 3) << 3) | 4;
        try {
            T a2 = p3Var.a();
            p3Var.d(a2, this, zzfb);
            p3Var.f(a2);
            if (this.f9682b == this.f9683c) {
                return a2;
            }
            throw zzfw.g();
        } finally {
            this.f9683c = i;
        }
    }

    private final void X(int i) throws IOException {
        if (this.f9681a.A() != i) {
            throw zzfw.a();
        }
    }

    public final boolean A() throws IOException {
        R(0);
        return this.f9681a.p();
    }

    public final long B() throws IOException {
        R(0);
        return this.f9681a.y();
    }

    public final void C(List<Boolean> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof j1) {
            j1 j1Var = (j1) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    j1Var.h(this.f9681a.p());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    j1Var.h(this.f9681a.p());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9681a.p()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Boolean.valueOf(this.f9681a.p()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final <T> T D(p3<T> p3Var, zzfb zzfb) throws IOException {
        R(3);
        return W(p3Var, zzfb);
    }

    public final void E(List<Integer> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i = this.f9682b & 7;
            if (i == 2) {
                int t = this.f9681a.t();
                V(t);
                int A = this.f9681a.A() + t;
                do {
                    k2Var.j(this.f9681a.o());
                } while (this.f9681a.A() < A);
            } else if (i == 5) {
                do {
                    k2Var.j(this.f9681a.o());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 2) {
                int t2 = this.f9681a.t();
                V(t2);
                int A2 = this.f9681a.A() + t2;
                do {
                    list.add(Integer.valueOf(this.f9681a.o()));
                } while (this.f9681a.A() < A2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f9681a.o()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else {
                throw zzfw.f();
            }
        }
    }

    public final <T> void F(List<T> list, p3<T> p3Var, zzfb zzfb) throws IOException {
        int a2;
        int i = this.f9682b;
        if ((i & 7) == 3) {
            do {
                list.add(W(p3Var, zzfb));
                if (!this.f9681a.z() && this.f9684d == 0) {
                    a2 = this.f9681a.a();
                } else {
                    return;
                }
            } while (a2 == i);
            this.f9684d = a2;
            return;
        }
        throw zzfw.f();
    }

    public final <T> T G(p3<T> p3Var, zzfb zzfb) throws IOException {
        R(2);
        return U(p3Var, zzfb);
    }

    public final void H(List<String> list) throws IOException {
        S(list, true);
    }

    public final void I(List<Double> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof z1) {
            z1 z1Var = (z1) list;
            int i = this.f9682b & 7;
            if (i == 1) {
                do {
                    z1Var.h(this.f9681a.e());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int t = this.f9681a.t();
                T(t);
                int A = this.f9681a.A() + t;
                do {
                    z1Var.h(this.f9681a.e());
                } while (this.f9681a.A() < A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f9681a.e()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int t2 = this.f9681a.t();
                T(t2);
                int A2 = this.f9681a.A() + t2;
                do {
                    list.add(Double.valueOf(this.f9681a.e()));
                } while (this.f9681a.A() < A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final void J(List<String> list) throws IOException {
        S(list, false);
    }

    public final <T> void K(List<T> list, p3<T> p3Var, zzfb zzfb) throws IOException {
        int a2;
        int i = this.f9682b;
        if ((i & 7) == 2) {
            do {
                list.add(U(p3Var, zzfb));
                if (!this.f9681a.z() && this.f9684d == 0) {
                    a2 = this.f9681a.a();
                } else {
                    return;
                }
            } while (a2 == i);
            this.f9684d = a2;
            return;
        }
        throw zzfw.f();
    }

    public final void L(List<Long> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    r2Var.h(this.f9681a.i());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    r2Var.h(this.f9681a.i());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f9681a.i()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Long.valueOf(this.f9681a.i()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (c() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        throw new com.google.android.gms.internal.measurement.zzfw("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void M(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.w2<K, V> r9, com.google.android.gms.internal.measurement.zzfb r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.R(r0)
            com.google.android.gms.internal.measurement.zzes r1 = r7.f9681a
            int r1 = r1.t()
            com.google.android.gms.internal.measurement.zzes r2 = r7.f9681a
            int r1 = r2.h(r1)
            K r2 = r9.f9700b
            V r3 = r9.f9702d
        L_0x0014:
            int r4 = r7.a()     // Catch:{ all -> 0x0064 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005b
            com.google.android.gms.internal.measurement.zzes r5 = r7.f9681a     // Catch:{ all -> 0x0064 }
            boolean r5 = r5.z()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x005b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0046
            if (r4 == r0) goto L_0x0039
            boolean r4 = r7.c()     // Catch:{ zzfz -> 0x004e }
            if (r4 == 0) goto L_0x0033
            goto L_0x0014
        L_0x0033:
            com.google.android.gms.internal.measurement.zzfw r4 = new com.google.android.gms.internal.measurement.zzfw     // Catch:{ zzfz -> 0x004e }
            r4.<init>(r6)     // Catch:{ zzfz -> 0x004e }
            throw r4     // Catch:{ zzfz -> 0x004e }
        L_0x0039:
            com.google.android.gms.internal.measurement.zziu r4 = r9.f9701c     // Catch:{ zzfz -> 0x004e }
            V r5 = r9.f9702d     // Catch:{ zzfz -> 0x004e }
            java.lang.Class r5 = r5.getClass()     // Catch:{ zzfz -> 0x004e }
            java.lang.Object r3 = r7.Q(r4, r5, r10)     // Catch:{ zzfz -> 0x004e }
            goto L_0x0014
        L_0x0046:
            com.google.android.gms.internal.measurement.zziu r4 = r9.f9699a     // Catch:{ zzfz -> 0x004e }
            r5 = 0
            java.lang.Object r2 = r7.Q(r4, r5, r5)     // Catch:{ zzfz -> 0x004e }
            goto L_0x0014
        L_0x004e:
            boolean r4 = r7.c()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0055
            goto L_0x0014
        L_0x0055:
            com.google.android.gms.internal.measurement.zzfw r8 = new com.google.android.gms.internal.measurement.zzfw     // Catch:{ all -> 0x0064 }
            r8.<init>(r6)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x005b:
            r8.put(r2, r3)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.measurement.zzes r8 = r7.f9681a
            r8.j(r1)
            return
        L_0x0064:
            r8 = move-exception
            com.google.android.gms.internal.measurement.zzes r9 = r7.f9681a
            r9.j(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.u1.M(java.util.Map, com.google.android.gms.internal.measurement.w2, com.google.android.gms.internal.measurement.zzfb):void");
    }

    public final void N(List<Float> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof g2) {
            g2 g2Var = (g2) list;
            int i = this.f9682b & 7;
            if (i == 2) {
                int t = this.f9681a.t();
                V(t);
                int A = this.f9681a.A() + t;
                do {
                    g2Var.h(this.f9681a.g());
                } while (this.f9681a.A() < A);
            } else if (i == 5) {
                do {
                    g2Var.h(this.f9681a.g());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 2) {
                int t2 = this.f9681a.t();
                V(t2);
                int A2 = this.f9681a.A() + t2;
                do {
                    list.add(Float.valueOf(this.f9681a.g()));
                } while (this.f9681a.A() < A2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f9681a.g()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else {
                throw zzfw.f();
            }
        }
    }

    public final void O(List<Long> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    r2Var.h(this.f9681a.l());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    r2Var.h(this.f9681a.l());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f9681a.l()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Long.valueOf(this.f9681a.l()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final int a() throws IOException {
        int i = this.f9684d;
        if (i != 0) {
            this.f9682b = i;
            this.f9684d = 0;
        } else {
            this.f9682b = this.f9681a.a();
        }
        int i2 = this.f9682b;
        if (i2 == 0 || i2 == this.f9683c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final int b() {
        return this.f9682b;
    }

    public final boolean c() throws IOException {
        int i;
        if (this.f9681a.z() || (i = this.f9682b) == this.f9683c) {
            return false;
        }
        return this.f9681a.f(i);
    }

    public final double d() throws IOException {
        R(1);
        return this.f9681a.e();
    }

    public final float e() throws IOException {
        R(5);
        return this.f9681a.g();
    }

    public final zzeg f() throws IOException {
        R(2);
        return this.f9681a.s();
    }

    public final int g() throws IOException {
        R(5);
        return this.f9681a.v();
    }

    public final long h() throws IOException {
        R(1);
        return this.f9681a.w();
    }

    public final void i(List<Integer> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    k2Var.j(this.f9681a.x());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    k2Var.j(this.f9681a.x());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9681a.x()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Integer.valueOf(this.f9681a.x()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final void i0(List<Integer> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    k2Var.j(this.f9681a.m());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    k2Var.j(this.f9681a.m());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9681a.m()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Integer.valueOf(this.f9681a.m()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final long j() throws IOException {
        R(0);
        return this.f9681a.i();
    }

    public final int k() throws IOException {
        R(0);
        return this.f9681a.t();
    }

    public final long l() throws IOException {
        R(0);
        return this.f9681a.l();
    }

    public final void m(List<Long> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            int i = this.f9682b & 7;
            if (i == 1) {
                do {
                    r2Var.h(this.f9681a.w());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int t = this.f9681a.t();
                T(t);
                int A = this.f9681a.A() + t;
                do {
                    r2Var.h(this.f9681a.w());
                } while (this.f9681a.A() < A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f9681a.w()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int t2 = this.f9681a.t();
                T(t2);
                int A2 = this.f9681a.A() + t2;
                do {
                    list.add(Long.valueOf(this.f9681a.w()));
                } while (this.f9681a.A() < A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final String n() throws IOException {
        R(2);
        return this.f9681a.r();
    }

    public final int o() throws IOException {
        R(0);
        return this.f9681a.u();
    }

    public final int p() throws IOException {
        R(0);
        return this.f9681a.m();
    }

    public final void q(List<Long> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            int i = this.f9682b & 7;
            if (i == 1) {
                do {
                    r2Var.h(this.f9681a.n());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int t = this.f9681a.t();
                T(t);
                int A = this.f9681a.A() + t;
                do {
                    r2Var.h(this.f9681a.n());
                } while (this.f9681a.A() < A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f9681a.n()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int t2 = this.f9681a.t();
                T(t2);
                int A2 = this.f9681a.A() + t2;
                do {
                    list.add(Long.valueOf(this.f9681a.n()));
                } while (this.f9681a.A() < A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final long r() throws IOException {
        R(1);
        return this.f9681a.n();
    }

    public final void s(List<Long> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof r2) {
            r2 r2Var = (r2) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    r2Var.h(this.f9681a.y());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    r2Var.h(this.f9681a.y());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f9681a.y()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Long.valueOf(this.f9681a.y()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final void t(List<Integer> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    k2Var.j(this.f9681a.t());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    k2Var.j(this.f9681a.t());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9681a.t()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Integer.valueOf(this.f9681a.t()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }

    public final String u() throws IOException {
        R(2);
        return this.f9681a.q();
    }

    public final void v(List<zzeg> list) throws IOException {
        int a2;
        if ((this.f9682b & 7) == 2) {
            do {
                list.add(f());
                if (!this.f9681a.z()) {
                    a2 = this.f9681a.a();
                } else {
                    return;
                }
            } while (a2 == this.f9682b);
            this.f9684d = a2;
            return;
        }
        throw zzfw.f();
    }

    public final void w(List<Integer> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i = this.f9682b & 7;
            if (i == 2) {
                int t = this.f9681a.t();
                V(t);
                int A = this.f9681a.A() + t;
                do {
                    k2Var.j(this.f9681a.v());
                } while (this.f9681a.A() < A);
            } else if (i == 5) {
                do {
                    k2Var.j(this.f9681a.v());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 2) {
                int t2 = this.f9681a.t();
                V(t2);
                int A2 = this.f9681a.A() + t2;
                do {
                    list.add(Integer.valueOf(this.f9681a.v()));
                } while (this.f9681a.A() < A2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f9681a.v()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else {
                throw zzfw.f();
            }
        }
    }

    public final int x() throws IOException {
        R(5);
        return this.f9681a.o();
    }

    public final int y() throws IOException {
        R(0);
        return this.f9681a.x();
    }

    public final void z(List<Integer> list) throws IOException {
        int a2;
        int a3;
        if (list instanceof k2) {
            k2 k2Var = (k2) list;
            int i = this.f9682b & 7;
            if (i == 0) {
                do {
                    k2Var.j(this.f9681a.u());
                    if (!this.f9681a.z()) {
                        a3 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a3 == this.f9682b);
                this.f9684d = a3;
            } else if (i == 2) {
                int A = this.f9681a.A() + this.f9681a.t();
                do {
                    k2Var.j(this.f9681a.u());
                } while (this.f9681a.A() < A);
                X(A);
            } else {
                throw zzfw.f();
            }
        } else {
            int i2 = this.f9682b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9681a.u()));
                    if (!this.f9681a.z()) {
                        a2 = this.f9681a.a();
                    } else {
                        return;
                    }
                } while (a2 == this.f9682b);
                this.f9684d = a2;
            } else if (i2 == 2) {
                int A2 = this.f9681a.A() + this.f9681a.t();
                do {
                    list.add(Integer.valueOf(this.f9681a.u()));
                } while (this.f9681a.A() < A2);
                X(A2);
            } else {
                throw zzfw.f();
            }
        }
    }
}
