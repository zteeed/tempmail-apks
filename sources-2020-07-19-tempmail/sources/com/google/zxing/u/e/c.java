package com.google.zxing.u.e;

/* compiled from: C40Encoder */
class c implements g {
    c() {
    }

    private int b(h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f11852f--;
        int c2 = c(hVar.c(), sb2);
        hVar.k();
        return c2;
    }

    private static String d(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    static void g(h hVar, StringBuilder sb) {
        hVar.s(d(sb, 0));
        sb.delete(0, 3);
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c2 = hVar.c();
            hVar.f11852f++;
            int c3 = c(c2, sb);
            int a2 = hVar.a() + ((sb.length() / 3) << 1);
            hVar.q(a2);
            int a3 = hVar.g().a() - a2;
            if (hVar.i()) {
                if (sb.length() % 3 == 0 && j.n(hVar.d(), hVar.f11852f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a3 < 2 || a3 > 2)) {
                    c3 = b(hVar, sb, sb2, c3);
                }
                while (sb.length() % 3 == 1 && ((c3 <= 3 && a3 != 1) || c3 > 3)) {
                    c3 = b(hVar, sb, sb2, c3);
                }
            }
        }
        f(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    public int c(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append(3);
            return 1;
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
            return 1;
        } else if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) ((c2 - 'A') + 14));
            return 1;
        } else if (c2 < ' ') {
            sb.append(0);
            sb.append(c2);
            return 2;
        } else if (c2 >= '!' && c2 <= '/') {
            sb.append(1);
            sb.append((char) (c2 - '!'));
            return 2;
        } else if (c2 >= ':' && c2 <= '@') {
            sb.append(1);
            sb.append((char) ((c2 - ':') + 15));
            return 2;
        } else if (c2 >= '[' && c2 <= '_') {
            sb.append(1);
            sb.append((char) ((c2 - '[') + 22));
            return 2;
        } else if (c2 < '`' || c2 > 127) {
            sb.append("\u0001\u001e");
            return c((char) (c2 - 128), sb) + 2;
        } else {
            sb.append(2);
            sb.append((char) (c2 - '`'));
            return 2;
        }
    }

    public int e() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public void f(h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a2 = hVar.a() + ((sb.length() / 3) << 1);
        hVar.q(a2);
        int a3 = hVar.g().a() - a2;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (hVar.i()) {
                hVar.r(254);
            }
        } else if (a3 == 1 && length == 1) {
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (hVar.i()) {
                hVar.r(254);
            }
            hVar.f11852f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                g(hVar, sb);
            }
            if (a3 > 0 || hVar.i()) {
                hVar.r(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.o(0);
    }
}
