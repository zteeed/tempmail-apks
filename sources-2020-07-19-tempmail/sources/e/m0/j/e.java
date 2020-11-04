package e.m0.j;

import e.e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: Jdk9Platform */
final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    final Method f14179c;

    /* renamed from: d  reason: collision with root package name */
    final Method f14180d;

    e(Method method, Method method2) {
        this.f14179c = method;
        this.f14180d = method2;
    }

    public static e r() {
        try {
            return new e(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> b2 = f.b(list);
            this.f14179c.invoke(sSLParameters, new Object[]{b2.toArray(new String[b2.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set SSL parameters", e2);
        }
    }

    @Nullable
    public String l(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f14180d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
