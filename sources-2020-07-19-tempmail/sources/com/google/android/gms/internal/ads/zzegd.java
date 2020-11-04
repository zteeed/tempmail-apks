package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzegd {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f8575a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8576b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8576b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f8576b;
        zzefc.d(bArr2, 0, bArr2.length, false);
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int c2 = c(length, bArr, 0, length);
        if (c2 == 0) {
            return 1;
        }
        return c2;
    }

    static int c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int e(boolean z) {
        return z ? 1231 : 1237;
    }

    static Object f(Object obj, Object obj2) {
        return ((zzehl) obj).b().v((zzehl) obj2).K();
    }

    public static int g(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static boolean h(zzehl zzehl) {
        if (!(zzehl instanceof zzeej)) {
            return false;
        }
        zzeej zzeej = (zzeej) zzehl;
        return false;
    }

    public static boolean i(byte[] bArr) {
        return y80.n(bArr);
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f8575a);
    }
}
