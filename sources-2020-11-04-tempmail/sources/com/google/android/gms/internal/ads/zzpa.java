package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzpa {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f9150a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f9151b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f9152c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int a(zzpj zzpj) {
        int a2 = zzpj.a(5);
        return a2 == 31 ? zzpj.a(6) + 32 : a2;
    }

    private static int b(zzpj zzpj) {
        int a2 = zzpj.a(4);
        if (a2 == 15) {
            return zzpj.a(24);
        }
        zzpb.a(a2 < 13);
        return f9151b[a2];
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f9150a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f9150a.length, i2);
        return bArr3;
    }

    public static Pair<Integer, Integer> d(byte[] bArr) {
        zzpj zzpj = new zzpj(bArr);
        int a2 = a(zzpj);
        int b2 = b(zzpj);
        int a3 = zzpj.a(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(zzpj);
            if (a(zzpj) == 22) {
                a3 = zzpj.a(4);
            }
        }
        int i = f9152c[a3];
        zzpb.a(i != -1);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }
}
