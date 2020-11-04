package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class e3<T> implements p3<T> {

    /* renamed from: a  reason: collision with root package name */
    private final zzgw f9572a;

    /* renamed from: b  reason: collision with root package name */
    private final f4<?, ?> f9573b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9574c;

    /* renamed from: d  reason: collision with root package name */
    private final b2<?> f9575d;

    private e3(f4<?, ?> f4Var, b2<?> b2Var, zzgw zzgw) {
        this.f9573b = f4Var;
        this.f9574c = b2Var.h(zzgw);
        this.f9575d = b2Var;
        this.f9572a = zzgw;
    }

    static <T> e3<T> k(f4<?, ?> f4Var, b2<?> b2Var, zzgw zzgw) {
        return new e3<>(f4Var, b2Var, zzgw);
    }

    public final T a() {
        return this.f9572a.e().m();
    }

    public final int b(T t) {
        f4<?, ?> f4Var = this.f9573b;
        int r = f4Var.r(f4Var.k(t)) + 0;
        return this.f9574c ? r + this.f9575d.b(t).s() : r;
    }

    public final int c(T t) {
        int hashCode = this.f9573b.k(t).hashCode();
        return this.f9574c ? (hashCode * 53) + this.f9575d.b(t).hashCode() : hashCode;
    }

    public final void d(T t, m3 m3Var, zzfb zzfb) throws IOException {
        boolean z;
        f4<?, ?> f4Var = this.f9573b;
        b2<?> b2Var = this.f9575d;
        Object o = f4Var.o(t);
        c2<?> i = b2Var.i(t);
        do {
            try {
                if (m3Var.a() == Integer.MAX_VALUE) {
                    f4Var.n(t, o);
                    return;
                }
                int b2 = m3Var.b();
                if (b2 == 11) {
                    int i2 = 0;
                    Object obj = null;
                    zzeg zzeg = null;
                    while (m3Var.a() != Integer.MAX_VALUE) {
                        int b3 = m3Var.b();
                        if (b3 == 16) {
                            i2 = m3Var.k();
                            obj = b2Var.c(zzfb, this.f9572a, i2);
                        } else if (b3 == 26) {
                            if (obj == null) {
                                zzeg = m3Var.f();
                            } else {
                                b2Var.f(m3Var, obj, zzfb, i);
                                throw null;
                            }
                        } else if (!m3Var.c()) {
                            break;
                        }
                    }
                    if (m3Var.b() == 12) {
                        if (zzeg != null) {
                            if (obj == null) {
                                f4Var.e(o, i2, zzeg);
                            } else {
                                b2Var.e(zzeg, obj, zzfb, i);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw zzfw.e();
                    }
                } else if ((b2 & 7) == 2) {
                    Object c2 = b2Var.c(zzfb, this.f9572a, b2 >>> 3);
                    if (c2 == null) {
                        z = f4Var.j(o, m3Var);
                        continue;
                    } else {
                        b2Var.f(m3Var, c2, zzfb, i);
                        throw null;
                    }
                } else {
                    z = m3Var.c();
                    continue;
                }
            } finally {
                f4Var.n(t, o);
            }
        } while (z);
    }

    public final boolean e(T t) {
        return this.f9575d.b(t).r();
    }

    public final void f(T t) {
        this.f9573b.q(t);
        this.f9575d.j(t);
    }

    public final boolean g(T t, T t2) {
        if (!this.f9573b.k(t).equals(this.f9573b.k(t2))) {
            return false;
        }
        if (this.f9574c) {
            return this.f9575d.b(t).equals(this.f9575d.b(t2));
        }
        return true;
    }

    public final void h(T t, T t2) {
        r3.o(this.f9573b, t, t2);
        if (this.f9574c) {
            r3.m(this.f9575d, t, t2);
        }
    }

    public final void i(T t, w4 w4Var) throws IOException {
        Iterator<Map.Entry<?, Object>> p = this.f9575d.b(t).p();
        while (p.hasNext()) {
            Map.Entry next = p.next();
            zzfg zzfg = (zzfg) next.getKey();
            if (zzfg.c() != zzjb.MESSAGE || zzfg.d() || zzfg.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof n2) {
                w4Var.i(zzfg.a(), ((n2) next).a().d());
            } else {
                w4Var.i(zzfg.a(), next.getValue());
            }
        }
        f4<?, ?> f4Var = this.f9573b;
        f4Var.m(f4Var.k(t), w4Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.measurement.zzfo$zzd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.measurement.h1 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.measurement.zzfo r0 = (com.google.android.gms.internal.measurement.zzfo) r0
            com.google.android.gms.internal.measurement.zzig r1 = r0.zzb
            com.google.android.gms.internal.measurement.zzig r2 = com.google.android.gms.internal.measurement.zzig.a()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.measurement.zzig r1 = com.google.android.gms.internal.measurement.zzig.g()
            r0.zzb = r1
        L_0x0011:
            com.google.android.gms.internal.measurement.zzfo$zzb r10 = (com.google.android.gms.internal.measurement.zzfo.zzb) r10
            r10.D()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.measurement.i1.i(r11, r12, r14)
            int r2 = r14.f9590a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.measurement.b2<?> r12 = r9.f9575d
            com.google.android.gms.internal.measurement.zzfb r0 = r14.f9593d
            com.google.android.gms.internal.measurement.zzgw r3 = r9.f9572a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.c(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.measurement.zzfo$zzd r0 = (com.google.android.gms.internal.measurement.zzfo.zzd) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.measurement.i1.c(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.measurement.l3.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.measurement.i1.a(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.i1.i(r11, r4, r14)
            int r5 = r14.f9590a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.i1.q(r11, r4, r14)
            java.lang.Object r2 = r14.f9592c
            com.google.android.gms.internal.measurement.zzeg r2 = (com.google.android.gms.internal.measurement.zzeg) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.measurement.l3.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.measurement.i1.i(r11, r4, r14)
            int r12 = r14.f9590a
            com.google.android.gms.internal.measurement.b2<?> r0 = r9.f9575d
            com.google.android.gms.internal.measurement.zzfb r5 = r14.f9593d
            com.google.android.gms.internal.measurement.zzgw r6 = r9.f9572a
            java.lang.Object r0 = r0.c(r5, r6, r12)
            com.google.android.gms.internal.measurement.zzfo$zzd r0 = (com.google.android.gms.internal.measurement.zzfo.zzd) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.measurement.i1.a(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.c(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.measurement.zzfw r10 = com.google.android.gms.internal.measurement.zzfw.g()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.e3.j(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.h1):void");
    }
}
