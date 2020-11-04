package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpc {

    /* renamed from: a  reason: collision with root package name */
    private int f9153a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f9154b;

    public zzpc() {
        this(32);
    }

    public final void a(long j) {
        int i = this.f9153a;
        long[] jArr = this.f9154b;
        if (i == jArr.length) {
            this.f9154b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.f9154b;
        int i2 = this.f9153a;
        this.f9153a = i2 + 1;
        jArr2[i2] = j;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.f9153a) {
            return this.f9154b[i];
        }
        int i2 = this.f9153a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int c() {
        return this.f9153a;
    }

    private zzpc(int i) {
        this.f9154b = new long[32];
    }
}
