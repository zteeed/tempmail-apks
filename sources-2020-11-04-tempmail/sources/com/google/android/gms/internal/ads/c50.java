package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class c50 {
    private static void a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long d2 = d(bArr3, 0, 0) & 67108863;
            int i = 3;
            long d3 = d(bArr3, 3, 2) & 67108611;
            long d4 = d(bArr3, 6, 4) & 67092735;
            long d5 = d(bArr3, 9, 6) & 66076671;
            long d6 = d(bArr3, 12, 8) & 1048575;
            long j = d3 * 5;
            long j2 = d4 * 5;
            long j3 = d5 * 5;
            long j4 = d6 * 5;
            int i2 = 17;
            byte[] bArr5 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i3 = 0;
            while (i3 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i3);
                System.arraycopy(bArr4, i3, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i2, (byte) 0);
                }
                long d7 = j9 + d(bArr5, 0, 0);
                long d8 = j5 + d(bArr5, i, 2);
                long d9 = j6 + d(bArr5, 6, 4);
                long d10 = j7 + d(bArr5, 9, 6);
                long d11 = j8 + (d(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j10 = (d7 * d2) + (d8 * j4) + (d9 * j3) + (d10 * j2) + (d11 * j);
                long j11 = (d7 * d3) + (d8 * d2) + (d9 * j4) + (d10 * j3) + (d11 * j2) + (j10 >> 26);
                long j12 = (d7 * d4) + (d8 * d3) + (d9 * d2) + (d10 * j4) + (d11 * j3) + (j11 >> 26);
                long j13 = (d7 * d5) + (d8 * d4) + (d9 * d3) + (d10 * d2) + (d11 * j4) + (j12 >> 26);
                long j14 = (d7 * d6) + (d8 * d5) + (d9 * d4) + (d10 * d3) + (d11 * d2) + (j13 >> 26);
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j5 = (j11 & 67108863) + (j15 >> 26);
                i3 += 16;
                j6 = j12 & 67108863;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                i2 = 17;
                i = 3;
                j9 = j15 & 67108863;
            }
            long j16 = j6 + (j5 >> 26);
            long j17 = j16 & 67108863;
            long j18 = j7 + (j16 >> 26);
            long j19 = j18 & 67108863;
            long j20 = j8 + (j18 >> 26);
            long j21 = j20 & 67108863;
            long j22 = j9 + ((j20 >> 26) * 5);
            long j23 = j22 & 67108863;
            long j24 = (j5 & 67108863) + (j22 >> 26);
            long j25 = j23 + 5;
            long j26 = j25 & 67108863;
            long j27 = (j25 >> 26) + j24;
            long j28 = j17 + (j27 >> 26);
            long j29 = j19 + (j28 >> 26);
            long j30 = (j21 + (j29 >> 26)) - 67108864;
            long j31 = j30 >> 63;
            long j32 = ~j31;
            long j33 = (j23 & j31) | (j26 & j32);
            long j34 = (j24 & j31) | (j27 & 67108863 & j32);
            long j35 = (j17 & j31) | (j28 & 67108863 & j32);
            long j36 = (j19 & j31) | (j29 & 67108863 & j32);
            long j37 = ((j30 & j32) | (j21 & j31)) << 8;
            long c2 = (((j34 << 26) | j33) & 4294967295L) + c(bArr3, 16);
            long j38 = c2 & 4294967295L;
            long c3 = (((j34 >> 6) | (j35 << 20)) & 4294967295L) + c(bArr3, 20) + (c2 >> 32);
            long c4 = (((j35 >> 12) | (j36 << 14)) & 4294967295L) + c(bArr3, 24) + (c3 >> 32);
            byte[] bArr6 = new byte[16];
            a(bArr6, j38, 0);
            a(bArr6, c3 & 4294967295L, 4);
            a(bArr6, c4 & 4294967295L, 8);
            a(bArr6, (((j37 | (j36 >> 18)) & 4294967295L) + c(bArr3, 28) + (c4 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    private static long c(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    private static long d(byte[] bArr, int i, int i2) {
        return (c(bArr, i) >> i2) & 67108863;
    }
}
