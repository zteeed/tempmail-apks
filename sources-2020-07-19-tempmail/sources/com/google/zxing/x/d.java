package com.google.zxing.x;

import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.q;
import com.google.zxing.t.b;
import com.google.zxing.x.g.c;
import com.google.zxing.x.g.e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer */
public final class d implements q {
    private static b b(byte[][] bArr, int i) {
        int i2 = i * 2;
        b bVar = new b(bArr[0].length + i2, bArr.length + i2);
        bVar.c();
        int j = (bVar.j() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    bVar.p(i4 + i, j);
                }
            }
            i3++;
            j--;
        }
        return bVar;
    }

    private static b c(e eVar, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        eVar.e(str, i);
        byte[][] b2 = eVar.f().b(1, 4);
        if ((i3 > i2) != (b2[0].length < b2.length)) {
            b2 = d(b2);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / b2[0].length;
        int length2 = i3 / b2.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return b(b2, i4);
        }
        byte[][] b3 = eVar.f().b(length, length << 2);
        if (z) {
            b3 = d(b3);
        }
        return b(b3, i4);
    }

    private static byte[][] d(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            int length2 = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length2] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        int i3;
        int i4;
        if (aVar == a.PDF_417) {
            e eVar = new e();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                if (map.containsKey(f.PDF417_COMPACT)) {
                    eVar.h(Boolean.valueOf(map.get(f.PDF417_COMPACT).toString()).booleanValue());
                }
                if (map.containsKey(f.PDF417_COMPACTION)) {
                    eVar.i(c.valueOf(map.get(f.PDF417_COMPACTION).toString()));
                }
                if (map.containsKey(f.PDF417_DIMENSIONS)) {
                    com.google.zxing.x.g.d dVar = (com.google.zxing.x.g.d) map.get(f.PDF417_DIMENSIONS);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                if (map.containsKey(f.MARGIN)) {
                    i5 = Integer.parseInt(map.get(f.MARGIN).toString());
                }
                if (map.containsKey(f.ERROR_CORRECTION)) {
                    i6 = Integer.parseInt(map.get(f.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(f.CHARACTER_SET)) {
                    eVar.k(Charset.forName(map.get(f.CHARACTER_SET).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return c(eVar, str, i4, i, i2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
