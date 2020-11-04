package e.m0.j;

import e.d0;
import e.e0;
import e.m0.e;
import e.m0.l.a;
import e.m0.l.b;
import e.m0.l.c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okio.Buffer;

/* compiled from: Platform */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final f f14181a = i();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f14182b = Logger.getLogger(d0.class.getName());

    public static List<String> b(List<e0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e0 e0Var = list.get(i);
            if (e0Var != e0.HTTP_1_0) {
                arrayList.add(e0Var.toString());
            }
        }
        return arrayList;
    }

    static byte[] e(List<e0> list) {
        Buffer buffer = new Buffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e0 e0Var = list.get(i);
            if (e0Var != e0.HTTP_1_0) {
                buffer.writeByte(e0Var.toString().length());
                buffer.writeUtf8(e0Var.toString());
            }
        }
        return buffer.readByteArray();
    }

    private static f i() {
        c r;
        f t = a.t();
        if (t != null) {
            return t;
        }
        f t2 = b.t();
        if (t2 != null) {
            return t2;
        }
        if (o() && (r = c.r()) != null) {
            return r;
        }
        e r2 = e.r();
        if (r2 != null) {
            return r2;
        }
        f r3 = d.r();
        if (r3 != null) {
            return r3;
        }
        return new f();
    }

    public static f j() {
        return f14181a;
    }

    public static boolean o() {
        if ("conscrypt".equals(e.q("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(SSLSocket sSLSocket) {
    }

    public c c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public e.m0.l.e d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, @Nullable String str, List<e0> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public SSLContext k() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Nullable
    public String l(SSLSocket sSLSocket) {
        return null;
    }

    @Nullable
    public Object m(String str) {
        if (f14182b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean n(String str) {
        return true;
    }

    public void p(int i, String str, @Nullable Throwable th) {
        f14182b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void q(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        p(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
