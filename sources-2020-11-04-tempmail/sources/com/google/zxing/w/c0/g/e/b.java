package com.google.zxing.w.c0.g.e;

import com.google.zxing.t.a;

/* compiled from: AI01320xDecoder */
final class b extends f {
    b(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public void h(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }

    /* access modifiers changed from: protected */
    public int i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
