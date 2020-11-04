package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzie {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8757a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8758b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8759c = {2, 1, 2, 3, 3, 4, 4, 5};

    public static zzhq a(zzpi zzpi, String str, String str2, zzjl zzjl) {
        int i = f8758b[(zzpi.g() & 192) >> 6];
        int g = zzpi.g();
        int i2 = f8759c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return zzhq.f(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, zzjl, 0, str2);
    }

    public static zzhq b(zzpi zzpi, String str, String str2, zzjl zzjl) {
        zzpi zzpi2 = zzpi;
        zzpi.m(2);
        int i = f8758b[(zzpi.g() & 192) >> 6];
        int g = zzpi.g();
        int i2 = f8759c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return zzhq.f(str, "audio/eac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, zzjl, 0, str2);
    }

    public static int c() {
        return 1536;
    }

    public static int d(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f8757a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }
}
