package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class md0 {

    /* renamed from: a  reason: collision with root package name */
    private int f4565a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private int[] f4566b = new int[1000];

    /* renamed from: c  reason: collision with root package name */
    private long[] f4567c = new long[1000];

    /* renamed from: d  reason: collision with root package name */
    private int[] f4568d = new int[1000];

    /* renamed from: e  reason: collision with root package name */
    private int[] f4569e = new int[1000];

    /* renamed from: f  reason: collision with root package name */
    private long[] f4570f = new long[1000];
    private zzkh[] g = new zzkh[1000];
    private zzhq[] h = new zzhq[1000];
    private int i;
    private int j;
    private int k;
    private int l;
    private long m = Long.MIN_VALUE;
    private long n = Long.MIN_VALUE;
    private boolean o = true;
    private boolean p = true;
    private zzhq q;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(com.google.android.gms.internal.ads.zzhs r5, com.google.android.gms.internal.ads.zzjm r6, boolean r7, boolean r8, com.google.android.gms.internal.ads.zzhq r9, com.google.android.gms.internal.ads.zzng r10) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.j()     // Catch:{ all -> 0x00a4 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x0024
            if (r8 == 0) goto L_0x0012
            r5 = 4
            r6.b(r5)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r3
        L_0x0012:
            com.google.android.gms.internal.ads.zzhq r6 = r4.q     // Catch:{ all -> 0x00a4 }
            if (r6 == 0) goto L_0x0022
            if (r7 != 0) goto L_0x001c
            com.google.android.gms.internal.ads.zzhq r6 = r4.q     // Catch:{ all -> 0x00a4 }
            if (r6 == r9) goto L_0x0022
        L_0x001c:
            com.google.android.gms.internal.ads.zzhq r6 = r4.q     // Catch:{ all -> 0x00a4 }
            r5.f8920a = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r1
        L_0x0022:
            monitor-exit(r4)
            return r2
        L_0x0024:
            if (r7 != 0) goto L_0x009a
            com.google.android.gms.internal.ads.zzhq[] r7 = r4.h     // Catch:{ all -> 0x00a4 }
            int r8 = r4.k     // Catch:{ all -> 0x00a4 }
            r7 = r7[r8]     // Catch:{ all -> 0x00a4 }
            if (r7 == r9) goto L_0x002f
            goto L_0x009a
        L_0x002f:
            java.nio.ByteBuffer r5 = r6.f8979c     // Catch:{ all -> 0x00a4 }
            r7 = 0
            r8 = 1
            if (r5 != 0) goto L_0x0037
            r5 = 1
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x003c
            monitor-exit(r4)
            return r2
        L_0x003c:
            long[] r5 = r4.f4570f     // Catch:{ all -> 0x00a4 }
            int r9 = r4.k     // Catch:{ all -> 0x00a4 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r6.f8980d = r0     // Catch:{ all -> 0x00a4 }
            int[] r5 = r4.f4569e     // Catch:{ all -> 0x00a4 }
            int r9 = r4.k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r6.b(r5)     // Catch:{ all -> 0x00a4 }
            int[] r5 = r4.f4568d     // Catch:{ all -> 0x00a4 }
            int r9 = r4.k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f9077a = r5     // Catch:{ all -> 0x00a4 }
            long[] r5 = r4.f4567c     // Catch:{ all -> 0x00a4 }
            int r9 = r4.k     // Catch:{ all -> 0x00a4 }
            r0 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f9078b = r0     // Catch:{ all -> 0x00a4 }
            com.google.android.gms.internal.ads.zzkh[] r5 = r4.g     // Catch:{ all -> 0x00a4 }
            int r9 = r4.k     // Catch:{ all -> 0x00a4 }
            r5 = r5[r9]     // Catch:{ all -> 0x00a4 }
            r10.f9080d = r5     // Catch:{ all -> 0x00a4 }
            long r0 = r4.m     // Catch:{ all -> 0x00a4 }
            long r5 = r6.f8980d     // Catch:{ all -> 0x00a4 }
            long r5 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00a4 }
            r4.m = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.i     // Catch:{ all -> 0x00a4 }
            int r5 = r5 - r8
            r4.i = r5     // Catch:{ all -> 0x00a4 }
            int r5 = r4.k     // Catch:{ all -> 0x00a4 }
            int r5 = r5 + r8
            r4.k = r5     // Catch:{ all -> 0x00a4 }
            int r6 = r4.j     // Catch:{ all -> 0x00a4 }
            int r6 = r6 + r8
            r4.j = r6     // Catch:{ all -> 0x00a4 }
            int r6 = r4.f4565a     // Catch:{ all -> 0x00a4 }
            if (r5 != r6) goto L_0x0084
            r4.k = r7     // Catch:{ all -> 0x00a4 }
        L_0x0084:
            int r5 = r4.i     // Catch:{ all -> 0x00a4 }
            if (r5 <= 0) goto L_0x008f
            long[] r5 = r4.f4567c     // Catch:{ all -> 0x00a4 }
            int r6 = r4.k     // Catch:{ all -> 0x00a4 }
            r6 = r5[r6]     // Catch:{ all -> 0x00a4 }
            goto L_0x0096
        L_0x008f:
            long r5 = r10.f9078b     // Catch:{ all -> 0x00a4 }
            int r7 = r10.f9077a     // Catch:{ all -> 0x00a4 }
            long r7 = (long) r7     // Catch:{ all -> 0x00a4 }
            long r6 = r5 + r7
        L_0x0096:
            r10.f9079c = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r3
        L_0x009a:
            com.google.android.gms.internal.ads.zzhq[] r6 = r4.h     // Catch:{ all -> 0x00a4 }
            int r7 = r4.k     // Catch:{ all -> 0x00a4 }
            r6 = r6[r7]     // Catch:{ all -> 0x00a4 }
            r5.f8920a = r6     // Catch:{ all -> 0x00a4 }
            monitor-exit(r4)
            return r1
        L_0x00a4:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.md0.a(com.google.android.gms.internal.ads.zzhs, com.google.android.gms.internal.ads.zzjm, boolean, boolean, com.google.android.gms.internal.ads.zzhq, com.google.android.gms.internal.ads.zzng):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(long r6, int r8, long r9, int r11, com.google.android.gms.internal.ads.zzkh r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.o     // Catch:{ all -> 0x00e7 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.o = r1     // Catch:{ all -> 0x00e7 }
        L_0x000e:
            boolean r0 = r5.p     // Catch:{ all -> 0x00e7 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.gms.internal.ads.zzpb.e(r0)     // Catch:{ all -> 0x00e7 }
            r5.d(r6)     // Catch:{ all -> 0x00e7 }
            long[] r0 = r5.f4570f     // Catch:{ all -> 0x00e7 }
            int r3 = r5.l     // Catch:{ all -> 0x00e7 }
            r0[r3] = r6     // Catch:{ all -> 0x00e7 }
            long[] r6 = r5.f4567c     // Catch:{ all -> 0x00e7 }
            int r7 = r5.l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r9     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.f4568d     // Catch:{ all -> 0x00e7 }
            int r7 = r5.l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r11     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.f4569e     // Catch:{ all -> 0x00e7 }
            int r7 = r5.l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r8     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkh[] r6 = r5.g     // Catch:{ all -> 0x00e7 }
            int r7 = r5.l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r12     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzhq[] r6 = r5.h     // Catch:{ all -> 0x00e7 }
            int r7 = r5.l     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzhq r8 = r5.q     // Catch:{ all -> 0x00e7 }
            r6[r7] = r8     // Catch:{ all -> 0x00e7 }
            int[] r6 = r5.f4566b     // Catch:{ all -> 0x00e7 }
            int r7 = r5.l     // Catch:{ all -> 0x00e7 }
            r6[r7] = r1     // Catch:{ all -> 0x00e7 }
            int r6 = r5.i     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + r2
            r5.i = r6     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f4565a     // Catch:{ all -> 0x00e7 }
            if (r6 != r7) goto L_0x00da
            int r6 = r5.f4565a     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + 1000
            int[] r7 = new int[r6]     // Catch:{ all -> 0x00e7 }
            long[] r8 = new long[r6]     // Catch:{ all -> 0x00e7 }
            long[] r9 = new long[r6]     // Catch:{ all -> 0x00e7 }
            int[] r10 = new int[r6]     // Catch:{ all -> 0x00e7 }
            int[] r11 = new int[r6]     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkh[] r12 = new com.google.android.gms.internal.ads.zzkh[r6]     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzhq[] r0 = new com.google.android.gms.internal.ads.zzhq[r6]     // Catch:{ all -> 0x00e7 }
            int r2 = r5.f4565a     // Catch:{ all -> 0x00e7 }
            int r3 = r5.k     // Catch:{ all -> 0x00e7 }
            int r2 = r2 - r3
            long[] r3 = r5.f4567c     // Catch:{ all -> 0x00e7 }
            int r4 = r5.k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2)     // Catch:{ all -> 0x00e7 }
            long[] r3 = r5.f4570f     // Catch:{ all -> 0x00e7 }
            int r4 = r5.k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.f4569e     // Catch:{ all -> 0x00e7 }
            int r4 = r5.k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.f4568d     // Catch:{ all -> 0x00e7 }
            int r4 = r5.k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkh[] r3 = r5.g     // Catch:{ all -> 0x00e7 }
            int r4 = r5.k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzhq[] r3 = r5.h     // Catch:{ all -> 0x00e7 }
            int r4 = r5.k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2)     // Catch:{ all -> 0x00e7 }
            int[] r3 = r5.f4566b     // Catch:{ all -> 0x00e7 }
            int r4 = r5.k     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2)     // Catch:{ all -> 0x00e7 }
            int r3 = r5.k     // Catch:{ all -> 0x00e7 }
            long[] r4 = r5.f4567c     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3)     // Catch:{ all -> 0x00e7 }
            long[] r4 = r5.f4570f     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.f4569e     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.f4568d     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzkh[] r4 = r5.g     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.internal.ads.zzhq[] r4 = r5.h     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3)     // Catch:{ all -> 0x00e7 }
            int[] r4 = r5.f4566b     // Catch:{ all -> 0x00e7 }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3)     // Catch:{ all -> 0x00e7 }
            r5.f4567c = r8     // Catch:{ all -> 0x00e7 }
            r5.f4570f = r9     // Catch:{ all -> 0x00e7 }
            r5.f4569e = r10     // Catch:{ all -> 0x00e7 }
            r5.f4568d = r11     // Catch:{ all -> 0x00e7 }
            r5.g = r12     // Catch:{ all -> 0x00e7 }
            r5.h = r0     // Catch:{ all -> 0x00e7 }
            r5.f4566b = r7     // Catch:{ all -> 0x00e7 }
            r5.k = r1     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f4565a     // Catch:{ all -> 0x00e7 }
            r5.l = r7     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f4565a     // Catch:{ all -> 0x00e7 }
            r5.i = r7     // Catch:{ all -> 0x00e7 }
            r5.f4565a = r6     // Catch:{ all -> 0x00e7 }
            monitor-exit(r5)
            return
        L_0x00da:
            int r6 = r5.l     // Catch:{ all -> 0x00e7 }
            int r6 = r6 + r2
            r5.l = r6     // Catch:{ all -> 0x00e7 }
            int r7 = r5.f4565a     // Catch:{ all -> 0x00e7 }
            if (r6 != r7) goto L_0x00e5
            r5.l = r1     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r5)
            return
        L_0x00e7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.md0.b(long, int, long, int, com.google.android.gms.internal.ads.zzkh):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long c(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.j()     // Catch:{ all -> 0x005e }
            r1 = -1
            if (r0 == 0) goto L_0x005c
            long[] r0 = r8.f4570f     // Catch:{ all -> 0x005e }
            int r3 = r8.k     // Catch:{ all -> 0x005e }
            r3 = r0[r3]     // Catch:{ all -> 0x005e }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            goto L_0x005c
        L_0x0014:
            long r3 = r8.n     // Catch:{ all -> 0x005e }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001e
            if (r11 != 0) goto L_0x001e
            monitor-exit(r8)
            return r1
        L_0x001e:
            r11 = 0
            int r0 = r8.k     // Catch:{ all -> 0x005e }
            r3 = -1
            r4 = -1
        L_0x0023:
            int r5 = r8.l     // Catch:{ all -> 0x005e }
            if (r0 == r5) goto L_0x0040
            long[] r5 = r8.f4570f     // Catch:{ all -> 0x005e }
            r6 = r5[r0]     // Catch:{ all -> 0x005e }
            int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0040
            int[] r5 = r8.f4569e     // Catch:{ all -> 0x005e }
            r5 = r5[r0]     // Catch:{ all -> 0x005e }
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0038
            r4 = r11
        L_0x0038:
            int r0 = r0 + 1
            int r5 = r8.f4565a     // Catch:{ all -> 0x005e }
            int r0 = r0 % r5
            int r11 = r11 + 1
            goto L_0x0023
        L_0x0040:
            if (r4 != r3) goto L_0x0044
            monitor-exit(r8)
            return r1
        L_0x0044:
            int r9 = r8.k     // Catch:{ all -> 0x005e }
            int r9 = r9 + r4
            int r10 = r8.f4565a     // Catch:{ all -> 0x005e }
            int r9 = r9 % r10
            r8.k = r9     // Catch:{ all -> 0x005e }
            int r10 = r8.j     // Catch:{ all -> 0x005e }
            int r10 = r10 + r4
            r8.j = r10     // Catch:{ all -> 0x005e }
            int r10 = r8.i     // Catch:{ all -> 0x005e }
            int r10 = r10 - r4
            r8.i = r10     // Catch:{ all -> 0x005e }
            long[] r10 = r8.f4567c     // Catch:{ all -> 0x005e }
            r9 = r10[r9]     // Catch:{ all -> 0x005e }
            monitor-exit(r8)
            return r9
        L_0x005c:
            monitor-exit(r8)
            return r1
        L_0x005e:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.md0.c(long, boolean):long");
    }

    public final synchronized void d(long j2) {
        this.n = Math.max(this.n, j2);
    }

    public final synchronized boolean e(zzhq zzhq) {
        if (zzhq == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (zzpo.g(zzhq, this.q)) {
            return false;
        }
        this.q = zzhq;
        return true;
    }

    public final synchronized long f() {
        return Math.max(this.m, this.n);
    }

    public final void g() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.i = 0;
        this.o = true;
    }

    public final void h() {
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final int i() {
        return this.j + this.i;
    }

    public final synchronized boolean j() {
        return this.i != 0;
    }

    public final synchronized zzhq k() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final synchronized long l() {
        if (!j()) {
            return -1;
        }
        int i2 = ((this.k + this.i) - 1) % this.f4565a;
        this.k = (this.k + this.i) % this.f4565a;
        this.j += this.i;
        this.i = 0;
        return this.f4567c[i2] + ((long) this.f4568d[i2]);
    }
}
