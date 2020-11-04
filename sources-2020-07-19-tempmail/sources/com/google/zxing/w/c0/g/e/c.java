package com.google.zxing.w.c0.g.e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: AI01392xDecoder */
final class c extends h {
    c(a aVar) {
        super(aVar);
    }

    public String d() throws NotFoundException, FormatException {
        if (c().n() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f2 = b().f(48, 2);
            sb.append("(392");
            sb.append(f2);
            sb.append(')');
            sb.append(b().c(50, (String) null).b());
            return sb.toString();
        }
        throw NotFoundException.a();
    }
}
