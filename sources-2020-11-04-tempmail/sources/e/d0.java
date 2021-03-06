package e;

import e.i0;
import e.j;
import e.m0.e;
import e.m0.g.d;
import e.m0.j.f;
import e.m0.l.c;
import e.v;
import e.y;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.connection.g;

/* compiled from: OkHttpClient */
public class d0 implements Cloneable, j.a {
    static final List<e0> D = e.t(e0.HTTP_2, e0.HTTP_1_1);
    static final List<p> E = e.t(p.g, p.h);
    final int A;
    final int B;
    final int C;

    /* renamed from: b  reason: collision with root package name */
    final s f14559b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    final Proxy f14560c;

    /* renamed from: d  reason: collision with root package name */
    final List<e0> f14561d;

    /* renamed from: e  reason: collision with root package name */
    final List<p> f14562e;

    /* renamed from: f  reason: collision with root package name */
    final List<a0> f14563f;
    final List<a0> g;
    final v.b h;
    final ProxySelector i;
    final r j;
    @Nullable
    final h k;
    @Nullable
    final d l;
    final SocketFactory m;
    final SSLSocketFactory n;
    final c o;
    final HostnameVerifier p;
    final l q;
    final g r;
    final g s;
    final o t;
    final u u;
    final boolean v;
    final boolean w;
    final boolean x;
    final int y;
    final int z;

    /* compiled from: OkHttpClient */
    class a extends e.m0.c {
        a() {
        }

        public void a(y.a aVar, String str) {
            aVar.c(str);
        }

        public void b(y.a aVar, String str, String str2) {
            aVar.d(str, str2);
        }

        public void c(p pVar, SSLSocket sSLSocket, boolean z) {
            pVar.a(sSLSocket, z);
        }

        public int d(i0.a aVar) {
            return aVar.f14629c;
        }

        public boolean e(e eVar, e eVar2) {
            return eVar.d(eVar2);
        }

        @Nullable
        public okhttp3.internal.connection.d f(i0 i0Var) {
            return i0Var.n;
        }

        public void g(i0.a aVar, okhttp3.internal.connection.d dVar) {
            aVar.k(dVar);
        }

        public g h(o oVar) {
            return oVar.f14749a;
        }
    }

    static {
        e.m0.c.f14665a = new a();
    }

    public d0() {
        this(new b());
    }

    private static SSLSocketFactory y(X509TrustManager x509TrustManager) {
        try {
            SSLContext k2 = f.j().k();
            k2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return k2.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public List<e0> C() {
        return this.f14561d;
    }

    @Nullable
    public Proxy D() {
        return this.f14560c;
    }

    public g E() {
        return this.r;
    }

    public ProxySelector F() {
        return this.i;
    }

    public int H() {
        return this.A;
    }

    public boolean I() {
        return this.x;
    }

    public SocketFactory L() {
        return this.m;
    }

    public SSLSocketFactory M() {
        return this.n;
    }

    public int P() {
        return this.B;
    }

    public j b(g0 g0Var) {
        return f0.e(this, g0Var, false);
    }

    public g c() {
        return this.s;
    }

    public int d() {
        return this.y;
    }

    public l e() {
        return this.q;
    }

    public int f() {
        return this.z;
    }

    public o g() {
        return this.t;
    }

    public List<p> i() {
        return this.f14562e;
    }

    public r j() {
        return this.j;
    }

    public s k() {
        return this.f14559b;
    }

    public u l() {
        return this.u;
    }

    public v.b n() {
        return this.h;
    }

    public boolean o() {
        return this.w;
    }

    public boolean p() {
        return this.v;
    }

    public HostnameVerifier r() {
        return this.p;
    }

    public List<a0> s() {
        return this.f14563f;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public d t() {
        h hVar = this.k;
        return hVar != null ? hVar.f14601b : this.l;
    }

    public List<a0> w() {
        return this.g;
    }

    public b x() {
        return new b(this);
    }

    public int z() {
        return this.C;
    }

    d0(b bVar) {
        boolean z2;
        this.f14559b = bVar.f14564a;
        this.f14560c = bVar.f14565b;
        this.f14561d = bVar.f14566c;
        this.f14562e = bVar.f14567d;
        this.f14563f = e.s(bVar.f14568e);
        this.g = e.s(bVar.f14569f);
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        Iterator<p> it = this.f14562e.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                p next = it.next();
                if (z2 || next.d()) {
                    z2 = true;
                }
            }
        }
        if (bVar.m != null || !z2) {
            this.n = bVar.m;
            this.o = bVar.n;
        } else {
            X509TrustManager C2 = e.C();
            this.n = y(C2);
            this.o = c.b(C2);
        }
        if (this.n != null) {
            f.j().f(this.n);
        }
        this.p = bVar.o;
        this.q = bVar.p.f(this.o);
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.s;
        this.u = bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z;
        this.B = bVar.A;
        this.C = bVar.B;
        if (this.f14563f.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f14563f);
        } else if (this.g.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.g);
        }
    }

    /* compiled from: OkHttpClient */
    public static final class b {
        int A;
        int B;

        /* renamed from: a  reason: collision with root package name */
        s f14564a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        Proxy f14565b;

        /* renamed from: c  reason: collision with root package name */
        List<e0> f14566c;

        /* renamed from: d  reason: collision with root package name */
        List<p> f14567d;

        /* renamed from: e  reason: collision with root package name */
        final List<a0> f14568e;

        /* renamed from: f  reason: collision with root package name */
        final List<a0> f14569f;
        v.b g;
        ProxySelector h;
        r i;
        @Nullable
        h j;
        @Nullable
        d k;
        SocketFactory l;
        @Nullable
        SSLSocketFactory m;
        @Nullable
        c n;
        HostnameVerifier o;
        l p;
        g q;
        g r;
        o s;
        u t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public b() {
            this.f14568e = new ArrayList();
            this.f14569f = new ArrayList();
            this.f14564a = new s();
            this.f14566c = d0.D;
            this.f14567d = d0.E;
            this.g = v.k(v.f14774a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.h = proxySelector;
            if (proxySelector == null) {
                this.h = new e.m0.k.a();
            }
            this.i = r.f14766a;
            this.l = SocketFactory.getDefault();
            this.o = e.m0.l.d.f14748a;
            this.p = l.f14643c;
            g gVar = g.f14589a;
            this.q = gVar;
            this.r = gVar;
            this.s = new o();
            this.t = u.f14773a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public b a(a0 a0Var) {
            if (a0Var != null) {
                this.f14568e.add(a0Var);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public d0 b() {
            return new d0(this);
        }

        public b c(long j2, TimeUnit timeUnit) {
            this.x = e.d("timeout", j2, timeUnit);
            return this;
        }

        public b d(long j2, TimeUnit timeUnit) {
            this.y = e.d("timeout", j2, timeUnit);
            return this;
        }

        public b e(long j2, TimeUnit timeUnit) {
            this.z = e.d("timeout", j2, timeUnit);
            return this;
        }

        public b f(long j2, TimeUnit timeUnit) {
            this.A = e.d("timeout", j2, timeUnit);
            return this;
        }

        b(d0 d0Var) {
            this.f14568e = new ArrayList();
            this.f14569f = new ArrayList();
            this.f14564a = d0Var.f14559b;
            this.f14565b = d0Var.f14560c;
            this.f14566c = d0Var.f14561d;
            this.f14567d = d0Var.f14562e;
            this.f14568e.addAll(d0Var.f14563f);
            this.f14569f.addAll(d0Var.g);
            this.g = d0Var.h;
            this.h = d0Var.i;
            this.i = d0Var.j;
            this.k = d0Var.l;
            this.j = d0Var.k;
            this.l = d0Var.m;
            this.m = d0Var.n;
            this.n = d0Var.o;
            this.o = d0Var.p;
            this.p = d0Var.q;
            this.q = d0Var.r;
            this.r = d0Var.s;
            this.s = d0Var.t;
            this.t = d0Var.u;
            this.u = d0Var.v;
            this.v = d0Var.w;
            this.w = d0Var.x;
            this.x = d0Var.y;
            this.y = d0Var.z;
            this.z = d0Var.A;
            this.A = d0Var.B;
            this.B = d0Var.C;
        }
    }
}
