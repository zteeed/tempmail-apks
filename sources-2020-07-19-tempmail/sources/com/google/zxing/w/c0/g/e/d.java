package com.google.zxing.w.c0.g.e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: AI01393xDecoder */
final class d extends h {
    d(a aVar) {
        super(aVar);
    }

    public String d() throws NotFoundException, FormatException {
        if (c().n() >= 48) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            int f2 = b().f(48, 2);
            sb.append("(393");
            sb.append(f2);
            sb.append(')');
            int f3 = b().f(50, 10);
            if (f3 / 100 == 0) {
                sb.append('0');
            }
            if (f3 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f3);
            sb.append(b().c(60, (String) null).b());
            return sb.toString();
        }
        throw NotFoundException.a();
    }
}
