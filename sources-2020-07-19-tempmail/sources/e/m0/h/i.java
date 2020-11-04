package e.m0.h;

import e.g0;
import e.z;
import java.net.Proxy;

/* compiled from: RequestLine */
public final class i {
    public static String a(g0 g0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(g0Var.f());
        sb.append(' ');
        if (b(g0Var, type)) {
            sb.append(g0Var.i());
        } else {
            sb.append(c(g0Var.i()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(g0 g0Var, Proxy.Type type) {
        return !g0Var.e() && type == Proxy.Type.HTTP;
    }

    public static String c(z zVar) {
        String h = zVar.h();
        String j = zVar.j();
        if (j == null) {
            return h;
        }
        return h + '?' + j;
    }
}
