package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbu extends zzekh {
    private Date k;
    private Date l;
    private long m;
    private long n;
    private double o = 1.0d;
    private float p = 1.0f;
    private zzekr q = zzekr.j;
    private long r;

    public zzbu() {
        super("mvhd");
    }

    public final void e(ByteBuffer byteBuffer) {
        g(byteBuffer);
        if (f() == 1) {
            this.k = zzeko.a(zzbq.d(byteBuffer));
            this.l = zzeko.a(zzbq.d(byteBuffer));
            this.m = zzbq.b(byteBuffer);
            this.n = zzbq.d(byteBuffer);
        } else {
            this.k = zzeko.a(zzbq.b(byteBuffer));
            this.l = zzeko.a(zzbq.b(byteBuffer));
            this.m = zzbq.b(byteBuffer);
            this.n = zzbq.b(byteBuffer);
        }
        this.o = zzbq.e(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.p = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        zzbq.c(byteBuffer);
        zzbq.b(byteBuffer);
        zzbq.b(byteBuffer);
        this.q = zzekr.a(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.r = zzbq.b(byteBuffer);
    }

    public final long h() {
        return this.n;
    }

    public final long i() {
        return this.m;
    }

    public final String toString() {
        return "MovieHeaderBox[" + "creationTime=" + this.k + ";" + "modificationTime=" + this.l + ";" + "timescale=" + this.m + ";" + "duration=" + this.n + ";" + "rate=" + this.o + ";" + "volume=" + this.p + ";" + "matrix=" + this.q + ";" + "nextTrackId=" + this.r + "]";
    }
}
