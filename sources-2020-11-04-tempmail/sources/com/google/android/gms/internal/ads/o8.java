package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class o8 implements zzok {

    /* renamed from: a  reason: collision with root package name */
    private final zzok f4715a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4716b;

    /* renamed from: c  reason: collision with root package name */
    private final zzok f4717c;

    /* renamed from: d  reason: collision with root package name */
    private long f4718d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f4719e;

    o8(zzok zzok, int i, zzok zzok2) {
        this.f4715a = zzok;
        this.f4716b = (long) i;
        this.f4717c = zzok2;
    }

    public final long a(zzop zzop) throws IOException {
        zzop zzop2;
        zzop zzop3 = zzop;
        this.f4719e = zzop3.f9133a;
        long j = zzop3.f9136d;
        long j2 = this.f4716b;
        zzop zzop4 = null;
        if (j >= j2) {
            zzop2 = null;
        } else {
            long j3 = zzop3.f9137e;
            zzop2 = new zzop(zzop3.f9133a, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null);
        }
        long j4 = zzop3.f9137e;
        if (j4 == -1 || zzop3.f9136d + j4 > this.f4716b) {
            long max = Math.max(this.f4716b, zzop3.f9136d);
            long j5 = zzop3.f9137e;
            zzop4 = new zzop(zzop3.f9133a, max, j5 != -1 ? Math.min(j5, (zzop3.f9136d + j5) - this.f4716b) : -1, (String) null);
        }
        long j6 = 0;
        long a2 = zzop2 != null ? this.f4715a.a(zzop2) : 0;
        if (zzop4 != null) {
            j6 = this.f4717c.a(zzop4);
        }
        this.f4718d = zzop3.f9136d;
        if (a2 == -1 || j6 == -1) {
            return -1;
        }
        return a2 + j6;
    }

    public final void close() throws IOException {
        this.f4715a.close();
        this.f4717c.close();
    }

    public final Uri k0() {
        return this.f4719e;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f4718d;
        long j2 = this.f4716b;
        if (j < j2) {
            i3 = this.f4715a.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.f4718d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f4718d < this.f4716b) {
            return i3;
        }
        int read = this.f4717c.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.f4718d += (long) read;
        return i4;
    }
}
