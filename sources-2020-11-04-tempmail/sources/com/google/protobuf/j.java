package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f12144a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f12145b;

    /* compiled from: Internal */
    public interface a {
    }

    /* compiled from: Internal */
    public interface b<E> extends List<E>, RandomAccess {
        boolean R();

        void o();

        b<E> t(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12145b = bArr;
        ByteBuffer.wrap(bArr);
        e.d(f12145b);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static int c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
