package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbq {
    public static int a(byte b2) {
        return b2 < 0 ? b2 + 256 : b2;
    }

    public static long b(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int c(ByteBuffer byteBuffer) {
        return (a(byteBuffer.get()) << 8) + 0 + a(byteBuffer.get());
    }

    public static long d(ByteBuffer byteBuffer) {
        long b2 = (b(byteBuffer) << 32) + 0;
        if (b2 >= 0) {
            return b2 + b(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) ((((0 | ((bArr[0] << 24) & -16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 65536.0d;
    }

    public static double f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) ((((0 | ((bArr[0] << 24) & -16777216)) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static String g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
