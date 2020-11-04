package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzqd {

    /* renamed from: a  reason: collision with root package name */
    private final zd0 f9204a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9205b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9206c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9207d;

    /* renamed from: e  reason: collision with root package name */
    private long f9208e;

    /* renamed from: f  reason: collision with root package name */
    private long f9209f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;

    public zzqd() {
        this(-1.0d);
    }

    private final boolean d(long j2, long j3) {
        return Math.abs((j3 - this.i) - (j2 - this.j)) > 20000000;
    }

    public final void a() {
        if (this.f9205b) {
            this.f9204a.c();
        }
    }

    public final void b() {
        this.h = false;
        if (this.f9205b) {
            this.f9204a.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long c(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.h
            if (r2 == 0) goto L_0x0042
            long r2 = r11.f9208e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r11.k
            r4 = 1
            long r2 = r2 + r4
            r11.k = r2
            long r2 = r11.g
            r11.f9209f = r2
        L_0x0019:
            long r2 = r11.k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r11.j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f9209f
            long r2 = r2 + r4
            boolean r4 = r11.d(r2, r14)
            if (r4 == 0) goto L_0x0033
            r11.h = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r11.i
            long r4 = r4 + r2
            long r6 = r11.j
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r11.d(r0, r14)
            if (r2 == 0) goto L_0x0042
            r11.h = r6
        L_0x0042:
            r4 = r14
            r2 = r0
        L_0x0044:
            boolean r6 = r11.h
            r7 = 0
            if (r6 != 0) goto L_0x0053
            r11.j = r0
            r11.i = r14
            r11.k = r7
            r14 = 1
            r11.h = r14
        L_0x0053:
            r11.f9208e = r12
            r11.g = r2
            com.google.android.gms.internal.ads.zd0 r12 = r11.f9204a
            if (r12 == 0) goto L_0x0086
            long r12 = r12.f5639b
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0062
            goto L_0x0086
        L_0x0062:
            com.google.android.gms.internal.ads.zd0 r12 = r11.f9204a
            long r12 = r12.f5639b
            long r14 = r11.f9206c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0075
            long r14 = r12 - r14
            goto L_0x0079
        L_0x0075:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L_0x0079:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r12 = r14
        L_0x0082:
            long r14 = r11.f9207d
            long r12 = r12 - r14
            return r12
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqd.c(long, long):long");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzqd(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>((double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqd.<init>(android.content.Context):void");
    }

    private zzqd(double d2) {
        boolean z = d2 != -1.0d;
        this.f9205b = z;
        if (z) {
            this.f9204a = zd0.a();
            long j2 = (long) (1.0E9d / d2);
            this.f9206c = j2;
            this.f9207d = (j2 * 80) / 100;
            return;
        }
        this.f9204a = null;
        this.f9206c = -1;
        this.f9207d = -1;
    }
}
