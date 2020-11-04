package com.google.zxing.w;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.a;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.m;
import java.util.Map;

/* compiled from: UPCAReader */
public final class t extends y {
    private final y i = new i();

    private static m t(m mVar) throws FormatException {
        String f2 = mVar.f();
        if (f2.charAt(0) == '0') {
            m mVar2 = new m(f2.substring(1), (byte[]) null, mVar.e(), a.UPC_A);
            if (mVar.d() != null) {
                mVar2.g(mVar.d());
            }
            return mVar2;
        }
        throw FormatException.a();
    }

    public m b(c cVar, Map<d, ?> map) throws NotFoundException, FormatException {
        return t(this.i.b(cVar, map));
    }

    public m c(c cVar) throws NotFoundException, FormatException {
        return t(this.i.c(cVar));
    }

    public m d(int i2, com.google.zxing.t.a aVar, Map<d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return t(this.i.d(i2, aVar, map));
    }

    /* access modifiers changed from: protected */
    public int m(com.google.zxing.t.a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.i.m(aVar, iArr, sb);
    }

    public m n(int i2, com.google.zxing.t.a aVar, int[] iArr, Map<d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return t(this.i.n(i2, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    public a r() {
        return a.UPC_A;
    }
}
