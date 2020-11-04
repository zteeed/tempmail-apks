package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
abstract class y40 implements zzedp {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f5350c = j(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a  reason: collision with root package name */
    int[] f5351a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5352b;

    y40(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f5351a = j(bArr);
            this.f5352b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private static int b(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private static void d(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = b(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = b(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = b(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = b(iArr[i2] ^ iArr[i3], 7);
    }

    static void e(int[] iArr, int[] iArr2) {
        int[] iArr3 = f5350c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, f5350c.length, 8);
    }

    static void h(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            d(iArr2, 0, 4, 8, 12);
            d(iArr2, 1, 5, 9, 13);
            d(iArr2, 2, 6, 10, 14);
            d(iArr2, 3, 7, 11, 15);
            d(iArr2, 0, 5, 10, 15);
            d(iArr2, 1, 6, 11, 12);
            d(iArr2, 2, 7, 8, 13);
            d(iArr2, 3, 4, 9, 14);
        }
    }

    private static int[] j(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - g()) {
            ByteBuffer allocate = ByteBuffer.allocate(g() + bArr.length);
            c(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: package-private */
    public final void c(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - g() >= bArr.length) {
            byte[] c2 = zzedu.c(g());
            byteBuffer.put(c2);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer i3 = i(c2, this.f5352b + i2);
                if (i2 == i - 1) {
                    zzecp.a(byteBuffer, wrap, i3, remaining % 64);
                } else {
                    zzecp.a(byteBuffer, wrap, i3, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: package-private */
    public abstract int[] f(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    public abstract int g();

    /* access modifiers changed from: package-private */
    public final ByteBuffer i(byte[] bArr, int i) {
        int[] f2 = f(j(bArr), i);
        int[] iArr = (int[]) f2.clone();
        h(iArr);
        for (int i2 = 0; i2 < f2.length; i2++) {
            f2[i2] = f2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(f2, 0, 16);
        return order;
    }
}
