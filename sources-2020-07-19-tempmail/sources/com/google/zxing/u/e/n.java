package com.google.zxing.u.e;

/* compiled from: X12Encoder */
final class n extends c {
    n() {
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c2 = hVar.c();
            hVar.f11852f++;
            c(c2, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f11852f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    public int c(char c2, StringBuilder sb) {
        if (c2 == 13) {
            sb.append(0);
        } else if (c2 == ' ') {
            sb.append(3);
        } else if (c2 == '*') {
            sb.append(1);
        } else if (c2 == '>') {
            sb.append(2);
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
        } else if (c2 < 'A' || c2 > 'Z') {
            j.e(c2);
            throw null;
        } else {
            sb.append((char) ((c2 - 'A') + 14));
        }
        return 1;
    }

    public int e() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar, StringBuilder sb) {
        hVar.p();
        int a2 = hVar.g().a() - hVar.a();
        hVar.f11852f -= sb.length();
        if (hVar.f() > 1 || a2 > 1 || hVar.f() != a2) {
            hVar.r(254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
