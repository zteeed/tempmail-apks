package com.google.zxing.u.e;

/* compiled from: Base256Encoder */
final class b implements g {
    b() {
    }

    private static char c(char c2, int i) {
        int i2 = c2 + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.i()) {
                break;
            }
            sb.append(hVar.c());
            hVar.f12401f++;
            if (j.n(hVar.d(), hVar.f12401f, b()) != b()) {
                hVar.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a2 = hVar.a() + length + 1;
        hVar.q(a2);
        boolean z = hVar.g().a() - a2 > 0;
        if (hVar.i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.r(c(sb.charAt(i), hVar.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
