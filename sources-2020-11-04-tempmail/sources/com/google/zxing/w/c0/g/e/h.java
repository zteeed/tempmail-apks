package com.google.zxing.w.c0.g.e;

import com.google.zxing.t.a;

/* compiled from: AI01decoder */
abstract class h extends j {
    h(a aVar) {
        super(aVar);
    }

    private static void e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        g(sb, i, length);
    }

    /* access modifiers changed from: package-private */
    public final void g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f2 = b().f((i3 * 10) + i, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
        }
        e(sb, i2);
    }
}
