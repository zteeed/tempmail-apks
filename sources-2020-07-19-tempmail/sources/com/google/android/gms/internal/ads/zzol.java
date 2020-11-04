package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzol implements zzok {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8940a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f8941b;

    /* renamed from: c  reason: collision with root package name */
    private int f8942c;

    /* renamed from: d  reason: collision with root package name */
    private int f8943d;

    public zzol(byte[] bArr) {
        zzpb.d(bArr);
        zzpb.a(bArr.length > 0);
        this.f8940a = bArr;
    }

    public final long a(zzop zzop) throws IOException {
        this.f8941b = zzop.f8950a;
        long j = zzop.f8953d;
        this.f8942c = (int) j;
        long j2 = zzop.f8954e;
        if (j2 == -1) {
            j2 = ((long) this.f8940a.length) - j;
        }
        int i = (int) j2;
        this.f8943d = i;
        if (i > 0 && this.f8942c + i <= this.f8940a.length) {
            return (long) i;
        }
        int i2 = this.f8942c;
        long j3 = zzop.f8954e;
        int length = this.f8940a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    public final void close() throws IOException {
        this.f8941b = null;
    }

    public final Uri e0() {
        return this.f8941b;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f8943d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f8940a, this.f8942c, bArr, i, min);
        this.f8942c += min;
        this.f8943d -= min;
        return min;
    }
}
