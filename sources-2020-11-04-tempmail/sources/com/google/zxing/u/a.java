package com.google.zxing.u;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.t.b;
import com.google.zxing.t.e;
import com.google.zxing.t.g;
import com.google.zxing.u.c.d;
import java.util.List;
import java.util.Map;

/* compiled from: DataMatrixReader */
public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final o[] f12358b = new o[0];

    /* renamed from: a  reason: collision with root package name */
    private final d f12359a = new d();

    private static b d(b bVar) throws NotFoundException {
        int[] l = bVar.l();
        int[] g = bVar.g();
        if (l == null || g == null) {
            throw NotFoundException.a();
        }
        int e2 = e(l, bVar);
        int i = l[1];
        int i2 = g[1];
        int i3 = l[0];
        int i4 = ((g[0] - i3) + 1) / e2;
        int i5 = ((i2 - i) + 1) / e2;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.a();
        }
        int i6 = e2 / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        b bVar2 = new b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * e2) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.f((i11 * e2) + i8, i10)) {
                    bVar2.p(i11, i9);
                }
            }
        }
        return bVar2;
    }

    private static int e(int[] iArr, b bVar) throws NotFoundException {
        int n = bVar.n();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < n && bVar.f(i, i2)) {
            i++;
        }
        if (i != n) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    public void a() {
    }

    public m b(c cVar, Map<com.google.zxing.d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        o[] oVarArr;
        e eVar;
        if (map == null || !map.containsKey(com.google.zxing.d.PURE_BARCODE)) {
            g c2 = new com.google.zxing.u.d.a(cVar.a()).c();
            e b2 = this.f12359a.b(c2.a());
            oVarArr = c2.b();
            eVar = b2;
        } else {
            eVar = this.f12359a.b(d(cVar.a()));
            oVarArr = f12358b;
        }
        m mVar = new m(eVar.h(), eVar.e(), oVarArr, com.google.zxing.a.DATA_MATRIX);
        List<byte[]> a2 = eVar.a();
        if (a2 != null) {
            mVar.h(n.BYTE_SEGMENTS, a2);
        }
        String b3 = eVar.b();
        if (b3 != null) {
            mVar.h(n.ERROR_CORRECTION_LEVEL, b3);
        }
        return mVar;
    }

    public m c(c cVar) throws NotFoundException, ChecksumException, FormatException {
        return b(cVar, (Map<com.google.zxing.d, ?>) null);
    }
}
