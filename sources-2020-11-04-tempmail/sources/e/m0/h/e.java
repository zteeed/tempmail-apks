package e.m0.h;

import e.i0;
import e.q;
import e.r;
import e.y;
import e.z;
import java.util.List;
import okio.ByteString;

/* compiled from: HttpHeaders */
public final class e {
    static {
        ByteString.encodeUtf8("\"\\");
        ByteString.encodeUtf8("\t ,=");
    }

    public static long a(y yVar) {
        return h(yVar.c("Content-Length"));
    }

    public static long b(i0 i0Var) {
        return a(i0Var.h());
    }

    public static boolean c(i0 i0Var) {
        if (i0Var.q().f().equals("HEAD")) {
            return false;
        }
        int d2 = i0Var.d();
        if (((d2 >= 100 && d2 < 200) || d2 == 204 || d2 == 304) && b(i0Var) == -1 && !"chunked".equalsIgnoreCase(i0Var.f("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int d(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void e(r rVar, z zVar, y yVar) {
        if (rVar != r.f14766a) {
            List<q> f2 = q.f(zVar, yVar);
            if (!f2.isEmpty()) {
                rVar.a(zVar, f2);
            }
        }
    }

    public static int f(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int g(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    private static long h(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
