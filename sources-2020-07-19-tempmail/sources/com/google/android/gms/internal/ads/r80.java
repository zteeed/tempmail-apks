package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
abstract class r80<T, B> {
    r80() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(B b2, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void b(B b2, int i, zzeer zzeer);

    /* access modifiers changed from: package-private */
    public abstract void c(B b2, int i, T t);

    /* access modifiers changed from: package-private */
    public abstract void d(T t, j90 j90) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract boolean e(t70 t70);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(B r7, com.google.android.gms.internal.ads.t70 r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.getTag()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.b0()
            r6.o(r7, r1, r8)
            return r2
        L_0x0021:
            com.google.android.gms.internal.ads.zzego r7 = com.google.android.gms.internal.ads.zzegl.f()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.n()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.X()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.f(r0, r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.getTag()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.h(r0)
            r6.c(r7, r1, r8)
            return r2
        L_0x004c:
            com.google.android.gms.internal.ads.zzegl r7 = com.google.android.gms.internal.ads.zzegl.e()
            throw r7
        L_0x0051:
            com.google.android.gms.internal.ads.zzeer r8 = r8.F()
            r6.b(r7, r1, r8)
            return r2
        L_0x0059:
            long r3 = r8.W()
            r6.m(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.M()
            r6.a(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r80.f(java.lang.Object, com.google.android.gms.internal.ads.t70):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract void g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T h(B b2);

    /* access modifiers changed from: package-private */
    public abstract int i(T t);

    /* access modifiers changed from: package-private */
    public abstract T j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract B k(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int l(T t);

    /* access modifiers changed from: package-private */
    public abstract void m(B b2, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract B n();

    /* access modifiers changed from: package-private */
    public abstract void o(B b2, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void p(T t, j90 j90) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void q(Object obj, T t);

    /* access modifiers changed from: package-private */
    public abstract void r(Object obj, B b2);

    /* access modifiers changed from: package-private */
    public abstract T s(T t, T t2);
}
