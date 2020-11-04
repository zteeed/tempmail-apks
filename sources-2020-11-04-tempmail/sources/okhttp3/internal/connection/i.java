package okhttp3.internal.connection;

import e.e;
import e.j;
import e.k0;
import e.v;
import e.z;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: RouteSelector */
final class i {

    /* renamed from: a  reason: collision with root package name */
    private final e f14850a;

    /* renamed from: b  reason: collision with root package name */
    private final h f14851b;

    /* renamed from: c  reason: collision with root package name */
    private final j f14852c;

    /* renamed from: d  reason: collision with root package name */
    private final v f14853d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f14854e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f14855f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<k0> h = new ArrayList();

    /* compiled from: RouteSelector */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<k0> f14856a;

        /* renamed from: b  reason: collision with root package name */
        private int f14857b = 0;

        a(List<k0> list) {
            this.f14856a = list;
        }

        public List<k0> a() {
            return new ArrayList(this.f14856a);
        }

        public boolean b() {
            return this.f14857b < this.f14856a.size();
        }

        public k0 c() {
            if (b()) {
                List<k0> list = this.f14856a;
                int i = this.f14857b;
                this.f14857b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    i(e eVar, h hVar, j jVar, v vVar) {
        this.f14850a = eVar;
        this.f14851b = hVar;
        this.f14852c = jVar;
        this.f14853d = vVar;
        g(eVar.l(), eVar.g());
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }

    private boolean c() {
        return this.f14855f < this.f14854e.size();
    }

    private Proxy e() throws IOException {
        if (c()) {
            List<Proxy> list = this.f14854e;
            int i = this.f14855f;
            this.f14855f = i + 1;
            Proxy proxy = list.get(i);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f14850a.l().m() + "; exhausted proxy configurations: " + this.f14854e);
    }

    private void f(Proxy proxy) throws IOException {
        String str;
        int i;
        this.g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f14850a.l().m();
            i = this.f14850a.l().z();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i < 1 || i > 65535) {
            throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f14853d.j(this.f14852c, str);
            List<InetAddress> a2 = this.f14850a.c().a(str);
            if (!a2.isEmpty()) {
                this.f14853d.i(this.f14852c, str, a2);
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.g.add(new InetSocketAddress(a2.get(i2), i));
                }
                return;
            }
            throw new UnknownHostException(this.f14850a.c() + " returned no addresses for " + str);
        }
    }

    private void g(z zVar, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f14854e = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f14850a.i().select(zVar.F());
            if (select == null || select.isEmpty()) {
                list = e.m0.e.t(Proxy.NO_PROXY);
            } else {
                list = e.m0.e.s(select);
            }
            this.f14854e = list;
        }
        this.f14855f = 0;
    }

    public boolean b() {
        return c() || !this.h.isEmpty();
    }

    public a d() throws IOException {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e2 = e();
                int size = this.g.size();
                for (int i = 0; i < size; i++) {
                    k0 k0Var = new k0(this.f14850a, e2, this.g.get(i));
                    if (this.f14851b.c(k0Var)) {
                        this.h.add(k0Var);
                    } else {
                        arrayList.add(k0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }
}
