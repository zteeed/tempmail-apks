package com.google.zxing.w.c0.g.e;

import com.google.zxing.t.a;

/* compiled from: AI01weightDecoder */
abstract class i extends h {
    i(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    public abstract int i(int i);

    /* access modifiers changed from: package-private */
    public final void j(StringBuilder sb, int i, int i2) {
        int f2 = b().f(i, i2);
        h(sb, f2);
        int i3 = i(f2);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
