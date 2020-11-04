package com.google.zxing.u.e;

/* compiled from: TextEncoder */
final class m extends c {
    m() {
    }

    /* access modifiers changed from: package-private */
    public int c(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append(3);
            return 1;
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
            return 1;
        } else if (c2 >= 'a' && c2 <= 'z') {
            sb.append((char) ((c2 - 'a') + 14));
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
        } else if (c2 == '`') {
            sb.append(2);
            sb.append((char) (c2 - '`'));
            return 2;
        } else if (c2 >= 'A' && c2 <= 'Z') {
            sb.append(2);
            sb.append((char) ((c2 - 'A') + 1));
            return 2;
        } else if (c2 < '{' || c2 > 127) {
            sb.append("\u0001\u001e");
            return c((char) (c2 - 128), sb) + 2;
        } else {
            sb.append(2);
            sb.append((char) ((c2 - '{') + 27));
            return 2;
        }
    }

    public int e() {
        return 2;
    }
}
