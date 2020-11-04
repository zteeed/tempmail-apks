package com.google.zxing.w.c0.g.e;

import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: AI013x0xDecoder */
abstract class f extends i {
    f(a aVar) {
        super(aVar);
    }

    public String d() throws NotFoundException {
        if (c().n() == 60) {
            StringBuilder sb = new StringBuilder();
            f(sb, 5);
            j(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.a();
    }
}
