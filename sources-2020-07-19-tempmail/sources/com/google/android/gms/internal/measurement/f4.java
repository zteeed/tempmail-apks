package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
abstract class f4<T, B> {
    f4() {
    }

    /* access modifiers changed from: package-private */
    public abstract B a();

    /* access modifiers changed from: package-private */
    public abstract T b(B b2);

    /* access modifiers changed from: package-private */
    public abstract void c(B b2, int i, int i2);

    /* access modifiers changed from: package-private */
    public abstract void d(B b2, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void e(B b2, int i, zzeg zzeg);

    /* access modifiers changed from: package-private */
    public abstract void f(B b2, int i, T t);

    /* access modifiers changed from: package-private */
    public abstract void g(T t, w4 w4Var) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void h(Object obj, T t);

    /* access modifiers changed from: package-private */
    public abstract boolean i(m3 m3Var);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(B r7, com.google.android.gms.internal.measurement.m3 r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r8.b()
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
            int r8 = r8.x()
            r6.c(r7, r1, r8)
            return r2
        L_0x0021:
            com.google.android.gms.internal.measurement.zzfz r7 = com.google.android.gms.internal.measurement.zzfw.f()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.a()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.a()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.j(r0, r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.b()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.b(r0)
            r6.f(r7, r1, r8)
            return r2
        L_0x004c:
            com.google.android.gms.internal.measurement.zzfw r7 = com.google.android.gms.internal.measurement.zzfw.e()
            throw r7
        L_0x0051:
            com.google.android.gms.internal.measurement.zzeg r8 = r8.f()
            r6.e(r7, r1, r8)
            return r2
        L_0x0059:
            long r3 = r8.r()
            r6.l(r7, r1, r3)
            return r2
        L_0x0061:
            long r3 = r8.l()
            r6.d(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.f4.j(java.lang.Object, com.google.android.gms.internal.measurement.m3):boolean");
    }

    /* access modifiers changed from: package-private */
    public abstract T k(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void l(B b2, int i, long j);

    /* access modifiers changed from: package-private */
    public abstract void m(T t, w4 w4Var) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract void n(Object obj, B b2);

    /* access modifiers changed from: package-private */
    public abstract B o(Object obj);

    /* access modifiers changed from: package-private */
    public abstract T p(T t, T t2);

    /* access modifiers changed from: package-private */
    public abstract void q(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int r(T t);

    /* access modifiers changed from: package-private */
    public abstract int s(T t);
}
