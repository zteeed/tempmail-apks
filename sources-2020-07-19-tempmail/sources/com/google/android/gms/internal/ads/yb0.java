package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class yb0 {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f5376d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5377a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f5378b;

    /* renamed from: c  reason: collision with root package name */
    private int f5379c;

    public static long c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f5376d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int d(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f5376d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    public final void a() {
        this.f5378b = 0;
        this.f5379c = 0;
    }

    public final long b(zzjw zzjw, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f5378b == 0) {
            if (!zzjw.g(this.f5377a, 0, 1, z)) {
                return -1;
            }
            int d2 = d(this.f5377a[0] & 255);
            this.f5379c = d2;
            if (d2 != -1) {
                this.f5378b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f5379c;
        if (i2 > i) {
            this.f5378b = 0;
            return -2;
        }
        if (i2 != 1) {
            zzjw.b(this.f5377a, 1, i2 - 1);
        }
        this.f5378b = 0;
        return c(this.f5377a, this.f5379c, z2);
    }

    public final int e() {
        return this.f5379c;
    }
}
