package com.google.zxing.u.e;

/* compiled from: EdifactEncoder */
final class f implements g {
    f() {
    }

    private static void b(char c2, StringBuilder sb) {
        if (c2 >= ' ' && c2 <= '?') {
            sb.append(c2);
        } else if (c2 < '@' || c2 > '^') {
            j.e(c2);
            throw null;
        } else {
            sb.append((char) (c2 - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c2 = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c2 = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c2;
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.p();
                    int a2 = hVar.g().a() - hVar.a();
                    int f2 = hVar.f();
                    if (f2 > a2) {
                        hVar.q(hVar.a() + 1);
                        a2 = hVar.g().a() - hVar.a();
                    }
                    if (f2 <= a2 && a2 <= 2) {
                        hVar.o(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String c2 = c(charSequence, 0);
                    if (!(!hVar.i()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.q(hVar.a() + i);
                        if (hVar.g().a() - hVar.a() >= 3) {
                            hVar.q(hVar.a() + c2.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.k();
                        hVar.f12401f -= i;
                    } else {
                        hVar.s(c2);
                    }
                    hVar.o(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.o(0);
        }
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            b(hVar.c(), sb);
            hVar.f12401f++;
            if (sb.length() >= 4) {
                hVar.s(c(sb, 0));
                sb.delete(0, 4);
                if (j.n(hVar.d(), hVar.f12401f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb.append(31);
        e(hVar, sb);
    }

    public int d() {
        return 4;
    }
}
