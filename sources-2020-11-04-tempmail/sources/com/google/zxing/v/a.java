package com.google.zxing.v;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.d;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.t.b;
import com.google.zxing.t.e;
import com.google.zxing.v.b.c;
import java.util.Map;

/* compiled from: MaxiCodeReader */
public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final o[] f12416b = new o[0];

    /* renamed from: a  reason: collision with root package name */
    private final c f12417a = new c();

    private static b d(b bVar) throws NotFoundException {
        int[] i = bVar.i();
        if (i != null) {
            int i2 = i[0];
            int i3 = i[1];
            int i4 = i[2];
            int i5 = i[3];
            b bVar2 = new b(30, 33);
            for (int i6 = 0; i6 < 33; i6++) {
                int i7 = (((i6 * i5) + (i5 / 2)) / 33) + i3;
                for (int i8 = 0; i8 < 30; i8++) {
                    if (bVar.f(((((i8 * i4) + (i4 / 2)) + (((i6 & 1) * i4) / 2)) / 30) + i2, i7)) {
                        bVar2.p(i8, i6);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.a();
    }

    public void a() {
    }

    public m b(com.google.zxing.c cVar, Map<d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        if (map == null || !map.containsKey(d.PURE_BARCODE)) {
            throw NotFoundException.a();
        }
        e b2 = this.f12417a.b(d(cVar.a()), map);
        m mVar = new m(b2.h(), b2.e(), f12416b, com.google.zxing.a.MAXICODE);
        String b3 = b2.b();
        if (b3 != null) {
            mVar.h(n.ERROR_CORRECTION_LEVEL, b3);
        }
        return mVar;
    }

    public m c(com.google.zxing.c cVar) throws NotFoundException, ChecksumException, FormatException {
        return b(cVar, (Map<d, ?>) null);
    }
}
