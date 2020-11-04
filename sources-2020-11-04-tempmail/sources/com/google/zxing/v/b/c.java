package com.google.zxing.v.b;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.a;
import com.google.zxing.d;
import com.google.zxing.t.b;
import com.google.zxing.t.e;
import java.util.Map;

/* compiled from: Decoder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.zxing.common.reedsolomon.c f12421a = new com.google.zxing.common.reedsolomon.c(a.o);

    private void a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f12421a.a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    public e b(b bVar, Map<d, ?> map) throws FormatException, ChecksumException {
        byte[] bArr;
        byte[] a2 = new a(bVar).a();
        a(a2, 0, 10, 10, 0);
        byte b2 = a2[0] & 15;
        if (b2 == 2 || b2 == 3 || b2 == 4) {
            byte[] bArr2 = a2;
            a(bArr2, 20, 84, 40, 1);
            a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (b2 == 5) {
            byte[] bArr3 = a2;
            a(bArr3, 20, 68, 56, 1);
            a(bArr3, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.a();
        }
        System.arraycopy(a2, 0, bArr, 0, 10);
        System.arraycopy(a2, 20, bArr, 10, bArr.length - 10);
        return b.a(bArr, b2);
    }
}
