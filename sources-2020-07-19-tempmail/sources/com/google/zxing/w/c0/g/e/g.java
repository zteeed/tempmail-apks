package com.google.zxing.w.c0.g.e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.t.a;

/* compiled from: AI01AndOtherAIs */
final class g extends h {
    g(a aVar) {
        super(aVar);
    }

    public String d() throws NotFoundException, FormatException {
        StringBuilder sb = new StringBuilder();
        sb.append("(01)");
        int length = sb.length();
        sb.append(b().f(4, 4));
        g(sb, 8, length);
        return b().a(sb, 48);
    }
}
