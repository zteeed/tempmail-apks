package e.m0.j;

import android.os.Build;
import android.util.Log;
import e.e0;
import e.m0.l.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: AndroidPlatform */
class b extends f {

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f14724c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f14725d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f14726e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f14727f;
    private final Method g;
    private final C0161b h = C0161b.b();

    /* compiled from: AndroidPlatform */
    static final class a extends e.m0.l.c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f14728a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f14729b;

        a(Object obj, Method method) {
            this.f14728a = obj;
            this.f14729b = method;
        }

        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f14729b.invoke(this.f14728a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: e.m0.j.b$b  reason: collision with other inner class name */
    /* compiled from: AndroidPlatform */
    static final class C0161b {

        /* renamed from: a  reason: collision with root package name */
        private final Method f14730a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f14731b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f14732c;

        C0161b(Method method, Method method2, Method method3) {
            this.f14730a = method;
            this.f14731b = method2;
            this.f14732c = method3;
        }

        static C0161b b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C0161b(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        public Object a(String str) {
            Method method = this.f14730a;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.f14731b.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f14732c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidPlatform */
    static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final X509TrustManager f14733a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f14734b;

        c(X509TrustManager x509TrustManager, Method method) {
            this.f14734b = method;
            this.f14733a = x509TrustManager;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f14734b.invoke(this.f14733a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f14733a.equals(cVar.f14733a) || !this.f14734b.equals(cVar.f14734b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f14733a.hashCode() + (this.f14734b.hashCode() * 31);
        }
    }

    b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f14724c = cls2;
        this.f14725d = method;
        this.f14726e = method2;
        this.f14727f = method3;
        this.g = method4;
    }

    private boolean r(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.n(str);
        }
    }

    private boolean s(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return r(str, cls, obj);
        }
    }

    @Nullable
    public static f t() {
        if (u() == 0) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    Method declaredMethod = cls2.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
                    Method method = cls2.getMethod("setHostname", new Class[]{String.class});
                    return new b(cls, cls2, declaredMethod, method, cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    static int u() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    public e.m0.l.c c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    public e d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        if (this.f14724c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f14725d.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                    this.f14726e.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new AssertionError(e2);
                }
            }
            this.g.invoke(sSLSocket, new Object[]{f.e(list)});
        }
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (e.m0.e.z(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e3);
            }
            throw e3;
        }
    }

    public SSLContext k() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Nullable
    public String l(SSLSocket sSLSocket) {
        if (!this.f14724c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f14727f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Nullable
    public Object m(String str) {
        return this.h.a(str);
    }

    public boolean n(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return s(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.n(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw new AssertionError("unable to determine cleartext support", e2);
        }
    }

    public void p(int i, String str, @Nullable Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    public void q(String str, Object obj) {
        if (!this.h.c(obj)) {
            p(5, str, (Throwable) null);
        }
    }
}
