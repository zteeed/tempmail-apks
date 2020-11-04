package e.m0.j;

import e.e0;
import e.m0.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* compiled from: Jdk8WithJettyBootPlatform */
class d extends f {

    /* renamed from: c  reason: collision with root package name */
    private final Method f14735c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f14736d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f14737e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f14738f;
    private final Class<?> g;

    /* compiled from: Jdk8WithJettyBootPlatform */
    private static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f14739a;

        /* renamed from: b  reason: collision with root package name */
        boolean f14740b;

        /* renamed from: c  reason: collision with root package name */
        String f14741c;

        a(List<String> list) {
            this.f14739a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.f14668b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f14740b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f14739a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f14739a.contains(str)) {
                            this.f14741c = str;
                            return str;
                        }
                    }
                    String str2 = this.f14739a.get(0);
                    this.f14741c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f14741c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f14735c = method;
        this.f14736d = method2;
        this.f14737e = method3;
        this.f14738f = cls;
        this.g = cls2;
    }

    public static f r() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new d(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.f14737e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<e0> list) {
        List<String> b2 = f.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f14738f, this.g}, new a(b2));
            this.f14735c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Nullable
    public String l(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f14736d.invoke((Object) null, new Object[]{sSLSocket}));
            if (!aVar.f14740b && aVar.f14741c == null) {
                f.j().p(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f14740b) {
                return null;
            } else {
                return aVar.f14741c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
