package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpc {

    /* renamed from: a  reason: collision with root package name */
    private int f8970a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f8971b;

    public zzpc() {
        this(32);
    }

    public final void a(long j) {
        int i = this.f8970a;
        long[] jArr = this.f8971b;
        if (i == jArr.length) {
            this.f8971b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.f8971b;
        int i2 = this.f8970a;
        this.f8970a = i2 + 1;
        jArr2[i2] = j;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.f8970a) {
            return this.f8971b[i];
        }
        int i2 = this.f8970a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int c() {
        return this.f8970a;
    }

    private zzpc(int i) {
        this.f8971b = new long[32];
    }
}
