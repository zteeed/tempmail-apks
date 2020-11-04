package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzfr {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f9823a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9824b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9824b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f9824b;
        zzes.c(bArr2, 0, bArr2.length, false);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static Object e(Object obj, Object obj2) {
        return ((zzgw) obj).c().N((zzgw) obj2).m();
    }

    static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean g(zzgw zzgw) {
        if (!(zzgw instanceof zzdy)) {
            return false;
        }
        zzdy zzdy = (zzdy) zzgw;
        return false;
    }

    public static boolean h(byte[] bArr) {
        return m4.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f9823a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
