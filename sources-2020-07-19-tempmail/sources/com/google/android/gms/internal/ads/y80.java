package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class y80 {

    /* renamed from: a  reason: collision with root package name */
    private static final z80 f5364a;

    static {
        z80 z80;
        if (!(v80.m() && v80.n()) || l50.a()) {
            z80 = new c90();
        } else {
            z80 = new e90();
        }
        f5364a = z80;
    }

    static int a(CharSequence charSequence) {
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
                                throw new b90(i2, length2);
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

    static int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f5364a.b(charSequence, bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int c(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int e(int i, byte[] bArr, int i2, int i3) {
        return f5364a.a(i, bArr, i2, i3);
    }

    /* access modifiers changed from: private */
    public static int f(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int h(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean j(byte[] bArr, int i, int i2) {
        return f5364a.c(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int k(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return f(b2);
        }
        if (i3 == 1) {
            return c(b2, bArr[i]);
        }
        if (i3 == 2) {
            return h(b2, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    static String l(byte[] bArr, int i, int i2) throws zzegl {
        return f5364a.d(bArr, i, i2);
    }

    public static boolean n(byte[] bArr) {
        return f5364a.c(bArr, 0, bArr.length);
    }
}
