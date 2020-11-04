package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzol implements zzok {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f9123a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f9124b;

    /* renamed from: c  reason: collision with root package name */
    private int f9125c;

    /* renamed from: d  reason: collision with root package name */
    private int f9126d;

    public zzol(byte[] bArr) {
        zzpb.d(bArr);
        zzpb.a(bArr.length > 0);
        this.f9123a = bArr;
    }

    public final long a(zzop zzop) throws IOException {
        this.f9124b = zzop.f9133a;
        long j = zzop.f9136d;
        this.f9125c = (int) j;
        long j2 = zzop.f9137e;
        if (j2 == -1) {
            j2 = ((long) this.f9123a.length) - j;
        }
        int i = (int) j2;
        this.f9126d = i;
        if (i > 0 && this.f9125c + i <= this.f9123a.length) {
            return (long) i;
        }
        int i2 = this.f9125c;
        long j3 = zzop.f9137e;
        int length = this.f9123a.length;
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
        this.f9124b = null;
    }

    public final Uri k0() {
        return this.f9124b;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f9126d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f9123a, this.f9125c, bArr, i, min);
        this.f9125c += min;
        this.f9126d -= min;
        return min;
    }
}
