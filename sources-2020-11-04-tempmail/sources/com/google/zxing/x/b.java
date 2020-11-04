package com.google.zxing.x;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.l;
import com.google.zxing.m;
import com.google.zxing.n;
import com.google.zxing.o;
import com.google.zxing.t.e;
import com.google.zxing.x.e.j;
import com.google.zxing.x.f.a;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PDF417Reader */
public final class b implements l {
    private static m[] d(c cVar, Map<d, ?> map, boolean z) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        com.google.zxing.x.f.b b2 = a.b(cVar, map, z);
        for (o[] next : b2.b()) {
            e i = j.i(b2.a(), next[4], next[5], next[6], next[7], g(next), e(next));
            m mVar = new m(i.h(), i.e(), next, com.google.zxing.a.PDF_417);
            mVar.h(n.ERROR_CORRECTION_LEVEL, i.b());
            c cVar2 = (c) i.d();
            if (cVar2 != null) {
                mVar.h(n.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(mVar);
        }
        return (m[]) arrayList.toArray(new m[arrayList.size()]);
    }

    private static int e(o[] oVarArr) {
        return Math.max(Math.max(f(oVarArr[0], oVarArr[4]), (f(oVarArr[6], oVarArr[2]) * 17) / 18), Math.max(f(oVarArr[1], oVarArr[5]), (f(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    private static int f(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return 0;
        }
        return (int) Math.abs(oVar.c() - oVar2.c());
    }

    private static int g(o[] oVarArr) {
        return Math.min(Math.min(h(oVarArr[0], oVarArr[4]), (h(oVarArr[6], oVarArr[2]) * 17) / 18), Math.min(h(oVarArr[1], oVarArr[5]), (h(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    private static int h(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(oVar.c() - oVar2.c());
    }

    public void a() {
    }

    public m b(c cVar, Map<d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        m[] d2 = d(cVar, map, false);
        if (d2 != null && d2.length != 0 && d2[0] != null) {
            return d2[0];
        }
        throw NotFoundException.a();
    }

    public m c(c cVar) throws NotFoundException, FormatException, ChecksumException {
        return b(cVar, (Map<d, ?>) null);
    }
}
