package com.google.zxing.y;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.t.b;
import com.google.zxing.t.g;
import com.google.zxing.y.c.e;
import com.google.zxing.y.c.i;
import java.util.List;
import java.util.Map;

/* compiled from: QRCodeReader */
public class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final o[] f12054b = new o[0];

    /* renamed from: a  reason: collision with root package name */
    private final e f12055a = new e();

    private static b d(b bVar) throws NotFoundException {
        int[] l = bVar.l();
        int[] g = bVar.g();
        if (l == null || g == null) {
            throw NotFoundException.a();
        }
        float e2 = e(l, bVar);
        int i = l[1];
        int i2 = g[1];
        int i3 = l[0];
        int i4 = g[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < bVar.n()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / e2);
            int round2 = Math.round(((float) (i5 + 1)) / e2);
            if (round <= 0 || round2 <= 0) {
                throw NotFoundException.a();
            } else if (round2 == round) {
                int i6 = (int) (e2 / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * e2)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw NotFoundException.a();
                    }
                }
                int i10 = (((int) (((float) (round2 - 1)) * e2)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw NotFoundException.a();
                    }
                }
                b bVar2 = new b(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (((float) i11) * e2)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (bVar.f(((int) (((float) i13) * e2)) + i8, i12)) {
                            bVar2.p(i13, i11);
                        }
                    }
                }
                return bVar2;
            } else {
                throw NotFoundException.a();
            }
        } else {
            throw NotFoundException.a();
        }
    }

    private static float e(int[] iArr, b bVar) throws NotFoundException {
        int j = bVar.j();
        int n = bVar.n();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < n && i2 < j) {
            if (z != bVar.f(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != n && i2 != j) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw NotFoundException.a();
    }

    public void a() {
    }

    public final m b(c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        o[] oVarArr;
        com.google.zxing.t.e eVar;
        if (map == null || !map.containsKey(d.PURE_BARCODE)) {
            g e2 = new com.google.zxing.y.d.c(cVar.a()).e(map);
            com.google.zxing.t.e b2 = this.f12055a.b(e2.a(), map);
            oVarArr = e2.b();
            eVar = b2;
        } else {
            eVar = this.f12055a.b(d(cVar.a()), map);
            oVarArr = f12054b;
        }
        if (eVar.d() instanceof i) {
            ((i) eVar.d()).a(oVarArr);
        }
        m mVar = new m(eVar.h(), eVar.e(), oVarArr, com.google.zxing.a.QR_CODE);
        List<byte[]> a2 = eVar.a();
        if (a2 != null) {
            mVar.h(n.BYTE_SEGMENTS, a2);
        }
        String b3 = eVar.b();
        if (b3 != null) {
            mVar.h(n.ERROR_CORRECTION_LEVEL, b3);
        }
        if (eVar.i()) {
            mVar.h(n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.g()));
            mVar.h(n.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.f()));
        }
        return mVar;
    }

    public m c(c cVar) throws NotFoundException, ChecksumException, FormatException {
        return b(cVar, (Map<d, ?>) null);
    }
}
