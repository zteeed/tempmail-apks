package com.tempmail.utils;

/* compiled from: Base64 */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f12571a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f12572b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    public static byte[] a(byte[] bArr, int i, int i2, byte[] bArr2) throws Base64DecoderException {
        int i3 = i2;
        byte[] bArr3 = bArr2;
        byte[] bArr4 = new byte[(((i3 * 3) / 4) + 2)];
        byte[] bArr5 = new byte[4];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i7 = i4 + i;
            byte b2 = (byte) (bArr[i7] & Byte.MAX_VALUE);
            byte b3 = bArr3[b2];
            if (b3 >= -5) {
                if (b3 >= -1) {
                    if (b2 == 61) {
                        int i8 = i3 - i4;
                        byte b4 = (byte) (bArr[(i3 - 1) + i] & Byte.MAX_VALUE);
                        if (i5 == 0 || i5 == 1) {
                            throw new Base64DecoderException("invalid padding byte '=' at byte offset " + i4);
                        } else if ((i5 == 3 && i8 > 2) || (i5 == 4 && i8 > 1)) {
                            throw new Base64DecoderException("padding byte '=' falsely signals end of encoded value at offset " + i4);
                        } else if (b4 != 61 && b4 != 10) {
                            throw new Base64DecoderException("encoded value has invalid trailing byte");
                        }
                    } else {
                        int i9 = i5 + 1;
                        bArr5[i5] = b2;
                        if (i9 == 4) {
                            i6 += b(bArr5, 0, bArr4, i6, bArr3);
                            i5 = 0;
                        } else {
                            i5 = i9;
                        }
                    }
                }
                i4++;
            } else {
                throw new Base64DecoderException("Bad Base64 input character at " + i4 + ": " + bArr[i7] + "(decimal)");
            }
        }
        if (i5 != 0) {
            if (i5 != 1) {
                bArr5[i5] = 61;
                i6 += b(bArr5, 0, bArr4, i6, bArr3);
            } else {
                throw new Base64DecoderException("single trailing character at offset " + (i3 - 1));
            }
        }
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr4, 0, bArr6, 0, i6);
        return bArr6;
    }

    private static int b(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        int i3 = i + 2;
        if (bArr[i3] == 61) {
            bArr2[i2] = (byte) ((((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        int i4 = i + 3;
        if (bArr[i4] == 61) {
            int i5 = (bArr3[bArr[i + 1]] << 24) >>> 12;
            int i6 = ((bArr3[bArr[i3]] << 24) >>> 18) | i5 | ((bArr3[bArr[i]] << 24) >>> 6);
            bArr2[i2] = (byte) (i6 >>> 16);
            bArr2[i2 + 1] = (byte) (i6 >>> 8);
            return 2;
        }
        int i7 = (bArr3[bArr[i + 1]] << 24) >>> 12;
        int i8 = ((bArr3[bArr[i4]] << 24) >>> 24) | i7 | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i3]] << 24) >>> 18);
        bArr2[i2] = (byte) (i8 >> 16);
        bArr2[i2 + 1] = (byte) (i8 >> 8);
        bArr2[i2 + 2] = (byte) i8;
        return 3;
    }

    public static byte[] c(String str) throws Base64DecoderException {
        byte[] bytes = str.getBytes();
        return d(bytes, 0, bytes.length);
    }

    public static byte[] d(byte[] bArr, int i, int i2) throws Base64DecoderException {
        return a(bArr, i, i2, f12572b);
    }

    public static String e(byte[] bArr, int i, int i2, byte[] bArr2, boolean z) {
        byte[] f2 = f(bArr, i, i2, bArr2, Integer.MAX_VALUE);
        int length = f2.length;
        while (!z && length > 0 && f2[length - 1] == 61) {
            length--;
        }
        return new String(f2, 0, length);
    }

    public static byte[] f(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = ((i2 + 2) / 3) * 4;
        byte[] bArr3 = new byte[(i4 + (i4 / i3))];
        int i5 = i2 - 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5) {
            int i9 = ((bArr[i6 + i] << 24) >>> 8) | ((bArr[(i6 + 1) + i] << 24) >>> 16) | ((bArr[(i6 + 2) + i] << 24) >>> 24);
            bArr3[i7] = bArr2[i9 >>> 18];
            int i10 = i7 + 1;
            bArr3[i10] = bArr2[(i9 >>> 12) & 63];
            bArr3[i7 + 2] = bArr2[(i9 >>> 6) & 63];
            bArr3[i7 + 3] = bArr2[i9 & 63];
            i8 += 4;
            if (i8 == i3) {
                bArr3[i7 + 4] = 10;
                i7 = i10;
                i8 = 0;
            }
            i6 += 3;
            i7 += 4;
        }
        if (i6 < i2) {
            g(bArr, i6 + i, i2 - i6, bArr3, i7, bArr2);
            if (i8 + 4 == i3) {
                bArr3[i7 + 4] = 10;
            }
        }
        return bArr3;
    }

    private static byte[] g(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4 = 0;
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0);
        if (i2 > 2) {
            i4 = (bArr[i + 2] << 24) >>> 24;
        }
        int i6 = i5 | i4;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i6 >>> 18];
            bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = bArr3[i6 >>> 18];
            bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = bArr3[i6 >>> 18];
            bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
            bArr2[i3 + 3] = bArr3[i6 & 63];
            return bArr2;
        }
    }

    public static String h(byte[] bArr, boolean z) {
        return e(bArr, 0, bArr.length, f12571a, z);
    }
}
