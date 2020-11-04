package com.google.zxing.u.e;

/* compiled from: ASCIIEncoder */
final class a implements g {
    a() {
    }

    private static char b(char c2, char c3) {
        if (j.f(c2) && j.f(c3)) {
            return (char) (((c2 - '0') * 10) + (c3 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c2 + c3);
    }

    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f11852f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f11852f), hVar.d().charAt(hVar.f11852f + 1)));
            hVar.f11852f += 2;
            return;
        }
        char c2 = hVar.c();
        int n = j.n(hVar.d(), hVar.f11852f, c());
        if (n != c()) {
            if (n == 1) {
                hVar.r(230);
                hVar.o(1);
            } else if (n == 2) {
                hVar.r(239);
                hVar.o(2);
            } else if (n == 3) {
                hVar.r(238);
                hVar.o(3);
            } else if (n == 4) {
                hVar.r(240);
                hVar.o(4);
            } else if (n == 5) {
                hVar.r(231);
                hVar.o(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n)));
            }
        } else if (j.g(c2)) {
            hVar.r(235);
            hVar.r((char) ((c2 - 128) + 1));
            hVar.f11852f++;
        } else {
            hVar.r((char) (c2 + 1));
            hVar.f11852f++;
        }
    }

    public int c() {
        return 0;
    }
}
