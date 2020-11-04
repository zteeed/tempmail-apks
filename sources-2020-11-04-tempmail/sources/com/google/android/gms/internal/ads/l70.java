package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class l70<T> implements z70<T> {

    /* renamed from: a  reason: collision with root package name */
    private final zzehl f4455a;

    /* renamed from: b  reason: collision with root package name */
    private final r80<?, ?> f4456b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4457c;

    /* renamed from: d  reason: collision with root package name */
    private final h60<?> f4458d;

    private l70(r80<?, ?> r80, h60<?> h60, zzehl zzehl) {
        this.f4456b = r80;
        this.f4457c = h60.j(zzehl);
        this.f4458d = h60;
        this.f4455a = zzehl;
    }

    static <T> l70<T> k(r80<?, ?> r80, h60<?> h60, zzehl zzehl) {
        return new l70<>(r80, h60, zzehl);
    }

    public final void a(T t, T t2) {
        b80.h(this.f4456b, t, t2);
        if (this.f4457c) {
            b80.f(this.f4458d, t, t2);
        }
    }

    public final void b(T t) {
        this.f4456b.g(t);
        this.f4458d.i(t);
    }

    public final int c(T t) {
        r80<?, ?> r80 = this.f4456b;
        int l = r80.l(r80.j(t)) + 0;
        return this.f4457c ? l + this.f4458d.g(t).q() : l;
    }

    public final void d(T t, j90 j90) throws IOException {
        Iterator<Map.Entry<?, Object>> d2 = this.f4458d.g(t).d();
        while (d2.hasNext()) {
            Map.Entry next = d2.next();
            zzefw zzefw = (zzefw) next.getKey();
            if (zzefw.C() != zzejt.MESSAGE || zzefw.F() || zzefw.j()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof u60) {
                j90.z(zzefw.i(), ((u60) next).a().a());
            } else {
                j90.z(zzefw.i(), next.getValue());
            }
        }
        r80<?, ?> r80 = this.f4456b;
        r80.p(r80.j(t), j90);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ads.zzegb$zzf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(T r10, byte[] r11, int r12, int r13, com.google.android.gms.internal.ads.n50 r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            com.google.android.gms.internal.ads.zzegb r0 = (com.google.android.gms.internal.ads.zzegb) r0
            com.google.android.gms.internal.ads.zzejc r1 = r0.zzieg
            com.google.android.gms.internal.ads.zzejc r2 = com.google.android.gms.internal.ads.zzejc.h()
            if (r1 != r2) goto L_0x0011
            com.google.android.gms.internal.ads.zzejc r1 = com.google.android.gms.internal.ads.zzejc.i()
            r0.zzieg = r1
        L_0x0011:
            com.google.android.gms.internal.ads.zzegb$zzd r10 = (com.google.android.gms.internal.ads.zzegb.zzd) r10
            r10.G()
            r10 = 0
            r0 = r10
        L_0x0018:
            if (r12 >= r13) goto L_0x00a4
            int r4 = com.google.android.gms.internal.ads.o50.h(r11, r12, r14)
            int r2 = r14.f4632a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L_0x0051
            r12 = r2 & 7
            if (r12 != r3) goto L_0x004c
            com.google.android.gms.internal.ads.h60<?> r12 = r9.f4458d
            com.google.android.gms.internal.ads.zzefo r0 = r14.f4635d
            com.google.android.gms.internal.ads.zzehl r3 = r9.f4455a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.b(r0, r3, r5)
            r0 = r12
            com.google.android.gms.internal.ads.zzegb$zzf r0 = (com.google.android.gms.internal.ads.zzegb.zzf) r0
            if (r0 != 0) goto L_0x0043
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = com.google.android.gms.internal.ads.o50.c(r2, r3, r4, r5, r6, r7)
            goto L_0x0018
        L_0x0043:
            com.google.android.gms.internal.ads.s70.b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x004c:
            int r12 = com.google.android.gms.internal.ads.o50.a(r2, r11, r4, r13, r14)
            goto L_0x0018
        L_0x0051:
            r12 = 0
            r2 = r10
        L_0x0053:
            if (r4 >= r13) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.o50.h(r11, r4, r14)
            int r5 = r14.f4632a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L_0x007b
            r8 = 3
            if (r6 == r8) goto L_0x0065
            goto L_0x0090
        L_0x0065:
            if (r0 != 0) goto L_0x0072
            if (r7 != r3) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.o50.m(r11, r4, r14)
            java.lang.Object r2 = r14.f4634c
            com.google.android.gms.internal.ads.zzeer r2 = (com.google.android.gms.internal.ads.zzeer) r2
            goto L_0x0053
        L_0x0072:
            com.google.android.gms.internal.ads.s70.b()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L_0x007b:
            if (r7 != 0) goto L_0x0090
            int r4 = com.google.android.gms.internal.ads.o50.h(r11, r4, r14)
            int r12 = r14.f4632a
            com.google.android.gms.internal.ads.h60<?> r0 = r9.f4458d
            com.google.android.gms.internal.ads.zzefo r5 = r14.f4635d
            com.google.android.gms.internal.ads.zzehl r6 = r9.f4455a
            java.lang.Object r0 = r0.b(r5, r6, r12)
            com.google.android.gms.internal.ads.zzegb$zzf r0 = (com.google.android.gms.internal.ads.zzegb.zzf) r0
            goto L_0x0053
        L_0x0090:
            r6 = 12
            if (r5 == r6) goto L_0x0099
            int r4 = com.google.android.gms.internal.ads.o50.a(r5, r11, r4, r13, r14)
            goto L_0x0053
        L_0x0099:
            if (r2 == 0) goto L_0x00a1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.k(r12, r2)
        L_0x00a1:
            r12 = r4
            goto L_0x0018
        L_0x00a4:
            if (r12 != r13) goto L_0x00a7
            return
        L_0x00a7:
            com.google.android.gms.internal.ads.zzegl r10 = com.google.android.gms.internal.ads.zzegl.h()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l70.e(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.n50):void");
    }

    public final boolean f(T t, T t2) {
        if (!this.f4456b.j(t).equals(this.f4456b.j(t2))) {
            return false;
        }
        if (this.f4457c) {
            return this.f4458d.g(t).equals(this.f4458d.g(t2));
        }
        return true;
    }

    public final T g() {
        return this.f4455a.c().K();
    }

    public final boolean h(T t) {
        return this.f4458d.g(t).c();
    }

    public final int i(T t) {
        int hashCode = this.f4456b.j(t).hashCode();
        return this.f4457c ? (hashCode * 53) + this.f4458d.g(t).hashCode() : hashCode;
    }

    public final void j(T t, t70 t70, zzefo zzefo) throws IOException {
        boolean z;
        r80<?, ?> r80 = this.f4456b;
        h60<?> h60 = this.f4458d;
        Object k = r80.k(t);
        l60<?> h = h60.h(t);
        do {
            try {
                if (t70.X() == Integer.MAX_VALUE) {
                    r80.r(t, k);
                    return;
                }
                int tag = t70.getTag();
                if (tag == 11) {
                    int i = 0;
                    Object obj = null;
                    zzeer zzeer = null;
                    while (t70.X() != Integer.MAX_VALUE) {
                        int tag2 = t70.getTag();
                        if (tag2 == 16) {
                            i = t70.J();
                            obj = h60.b(zzefo, this.f4455a, i);
                        } else if (tag2 == 26) {
                            if (obj == null) {
                                zzeer = t70.F();
                            } else {
                                h60.e(t70, obj, zzefo, h);
                                throw null;
                            }
                        } else if (!t70.e0()) {
                            break;
                        }
                    }
                    if (t70.getTag() == 12) {
                        if (zzeer != null) {
                            if (obj == null) {
                                r80.b(k, i, zzeer);
                            } else {
                                h60.d(zzeer, obj, zzefo, h);
                                throw null;
                            }
                        }
                        z = true;
                        continue;
                    } else {
                        throw zzegl.e();
                    }
                } else if ((tag & 7) == 2) {
                    Object b2 = h60.b(zzefo, this.f4455a, tag >>> 3);
                    if (b2 == null) {
                        z = r80.f(k, t70);
                        continue;
                    } else {
                        h60.e(t70, b2, zzefo, h);
                        throw null;
                    }
                } else {
                    z = t70.e0();
                    continue;
                }
            } finally {
                r80.r(t, k);
            }
        } while (z);
    }
}
