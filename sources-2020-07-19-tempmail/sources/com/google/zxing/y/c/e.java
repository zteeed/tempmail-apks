package com.google.zxing.y.c;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.a;
import com.google.zxing.common.reedsolomon.c;
import com.google.zxing.d;
import com.google.zxing.t.b;
import java.util.Map;

/* compiled from: Decoder */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final c f12069a = new c(a.l);

    private void a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f12069a.a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.a();
        }
    }

    private com.google.zxing.t.e c(a aVar, Map<d, ?> map) throws FormatException, ChecksumException {
        j e2 = aVar.e();
        f d2 = aVar.d().d();
        b[] b2 = b.b(aVar.c(), e2, d2);
        int i = 0;
        for (b c2 : b2) {
            i += c2.c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (b bVar : b2) {
            byte[] a2 = bVar.a();
            int c3 = bVar.c();
            a(a2, c3);
            int i3 = 0;
            while (i3 < c3) {
                bArr[i2] = a2[i3];
                i3++;
                i2++;
            }
        }
        return d.a(bArr, e2, d2, map);
    }

    public com.google.zxing.t.e b(b bVar, Map<d, ?> map) throws FormatException, ChecksumException {
        ChecksumException e2;
        a aVar = new a(bVar);
        FormatException formatException = null;
        try {
            return c(aVar, map);
        } catch (FormatException e3) {
            FormatException formatException2 = e3;
            e2 = null;
            formatException = formatException2;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                com.google.zxing.t.e c2 = c(aVar, map);
                c2.m(new i(true));
                return c2;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e2;
            }
        } catch (ChecksumException e4) {
            e2 = e4;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            com.google.zxing.t.e c22 = c(aVar, map);
            c22.m(new i(true));
            return c22;
        }
    }
}
