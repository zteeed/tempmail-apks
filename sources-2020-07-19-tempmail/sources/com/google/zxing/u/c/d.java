package com.google.zxing.u.c;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.a;
import com.google.zxing.common.reedsolomon.c;
import com.google.zxing.t.b;
import com.google.zxing.t.e;

/* compiled from: Decoder */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f11827a = new c(a.m);

    private void a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f11827a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public e b(b bVar) throws FormatException, ChecksumException {
        a aVar = new a(bVar);
        b[] b2 = b.b(aVar.c(), aVar.b());
        int i = 0;
        for (b c2 : b2) {
            i += c2.c();
        }
        byte[] bArr = new byte[i];
        int length = b2.length;
        for (int i2 = 0; i2 < length; i2++) {
            b bVar2 = b2[i2];
            byte[] a2 = bVar2.a();
            int c3 = bVar2.c();
            a(a2, c3);
            for (int i3 = 0; i3 < c3; i3++) {
                bArr[(i3 * length) + i2] = a2[i3];
            }
        }
        return c.a(bArr);
    }
}
