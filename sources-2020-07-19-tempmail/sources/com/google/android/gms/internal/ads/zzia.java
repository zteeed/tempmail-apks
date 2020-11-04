package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzia {

    /* renamed from: a  reason: collision with root package name */
    public static final zzia f8744a = new va0();

    public final boolean a() {
        return g() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((g() - 1) == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(int r3, com.google.android.gms.internal.ads.zzic r4, com.google.android.gms.internal.ads.zzib r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.e(r3, r4, r0)
            r2.c(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.c(r4, r5, r0)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzia.b(int, com.google.android.gms.internal.ads.zzic, com.google.android.gms.internal.ads.zzib, int):int");
    }

    public final zzib c(int i, zzib zzib, boolean z) {
        return d(i, zzib, false, 0);
    }

    public abstract zzib d(int i, zzib zzib, boolean z, long j);

    public abstract zzic e(int i, zzic zzic, boolean z);

    public abstract int f(Object obj);

    public abstract int g();

    public abstract int h();
}
