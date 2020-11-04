package com.google.zxing.w;

import com.google.zxing.WriterException;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.q;
import com.google.zxing.t.b;
import java.util.Map;

/* compiled from: UPCAWriter */
public final class u implements q {

    /* renamed from: a  reason: collision with root package name */
    private final j f11957a = new j();

    public b a(String str, a aVar, int i, int i2, Map<f, ?> map) throws WriterException {
        if (aVar == a.UPC_A) {
            return this.f11957a.a("0".concat(String.valueOf(str)), a.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
