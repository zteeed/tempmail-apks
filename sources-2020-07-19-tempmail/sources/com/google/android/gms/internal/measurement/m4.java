package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
final class m4 {

    /* renamed from: a  reason: collision with root package name */
    private static final o4 f9458a;

    static {
        o4 o4Var;
        if (!(k4.m() && k4.r()) || f1.b()) {
            o4Var = new n4();
        } else {
            o4Var = new p4();
        }
        f9458a = o4Var;
    }

    static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new q4(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int e(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f9458a.b(charSequence, bArr, i, i2);
    }

    public static boolean f(byte[] bArr) {
        return f9458a.d(bArr, 0, bArr.length);
    }

    public static boolean g(byte[] bArr, int i, int i2) {
        return f9458a.d(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int h(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int i(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    public static int j(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static String k(byte[] bArr, int i, int i2) throws zzfw {
        return f9458a.c(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int m(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return h(b2);
        }
        if (i3 == 1) {
            return i(b2, bArr[i]);
        }
        if (i3 == 2) {
            return j(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
