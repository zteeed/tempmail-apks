package e.m0.h;

import e.e0;
import java.io.IOException;
import java.net.ProtocolException;

/* compiled from: StatusLine */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f14138a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14139b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14140c;

    public k(e0 e0Var, int i, String str) {
        this.f14138a = e0Var;
        this.f14139b = i;
        this.f14140c = str;
    }

    public static k a(String str) throws IOException {
        e0 e0Var;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                e0Var = e0.HTTP_1_0;
            } else if (charAt == 1) {
                e0Var = e0.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            e0Var = e0.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new k(e0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14138a == e0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f14139b);
        if (this.f14140c != null) {
            sb.append(' ');
            sb.append(this.f14140c);
        }
        return sb.toString();
    }
}
