package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class a90 {
    /* access modifiers changed from: private */
    public static void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) throws zzegl {
        if (l(b3) || (((b2 << 28) + (b3 + 112)) >> 30) != 0 || l(b4) || l(b5)) {
            throw zzegl.i();
        }
        byte b6 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i] = (char) ((b6 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b6 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    public static void b(byte b2, byte b3, byte b4, char[] cArr, int i) throws zzegl {
        if (l(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || l(b4)))) {
            throw zzegl.i();
        }
        cArr[i] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    /* access modifiers changed from: private */
    public static void c(byte b2, byte b3, char[] cArr, int i) throws zzegl {
        if (b2 < -62 || l(b3)) {
            throw zzegl.i();
        }
        cArr[i] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    public static void d(byte b2, char[] cArr, int i) {
        cArr[i] = (char) b2;
    }

    /* access modifiers changed from: private */
    public static boolean i(byte b2) {
        return b2 >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean j(byte b2) {
        return b2 < -32;
    }

    /* access modifiers changed from: private */
    public static boolean k(byte b2) {
        return b2 < -16;
    }

    private static boolean l(byte b2) {
        return b2 > -65;
    }
}
