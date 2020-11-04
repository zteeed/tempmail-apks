package e;

import e.z;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: Address */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    final z f14007a;

    /* renamed from: b  reason: collision with root package name */
    final u f14008b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f14009c;

    /* renamed from: d  reason: collision with root package name */
    final g f14010d;

    /* renamed from: e  reason: collision with root package name */
    final List<e0> f14011e;

    /* renamed from: f  reason: collision with root package name */
    final List<p> f14012f;
    final ProxySelector g;
    @Nullable
    final Proxy h;
    @Nullable
    final SSLSocketFactory i;
    @Nullable
    final HostnameVerifier j;
    @Nullable
    final l k;

    public e(String str, int i2, u uVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable l lVar, g gVar, @Nullable Proxy proxy, List<e0> list, List<p> list2, ProxySelector proxySelector) {
        z.a aVar = new z.a();
        aVar.s(sSLSocketFactory != null ? "https" : "http");
        aVar.g(str);
        aVar.n(i2);
        this.f14007a = aVar.c();
        if (uVar != null) {
            this.f14008b = uVar;
            if (socketFactory != null) {
                this.f14009c = socketFactory;
                if (gVar != null) {
                    this.f14010d = gVar;
                    if (list != null) {
                        this.f14011e = e.m0.e.s(list);
                        if (list2 != null) {
                            this.f14012f = e.m0.e.s(list2);
                            if (proxySelector != null) {
                                this.g = proxySelector;
                                this.h = proxy;
                                this.i = sSLSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = lVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    @Nullable
    public l a() {
        return this.k;
    }

    public List<p> b() {
        return this.f14012f;
    }

    public u c() {
        return this.f14008b;
    }

    /* access modifiers changed from: package-private */
    public boolean d(e eVar) {
        return this.f14008b.equals(eVar.f14008b) && this.f14010d.equals(eVar.f14010d) && this.f14011e.equals(eVar.f14011e) && this.f14012f.equals(eVar.f14012f) && this.g.equals(eVar.g) && Objects.equals(this.h, eVar.h) && Objects.equals(this.i, eVar.i) && Objects.equals(this.j, eVar.j) && Objects.equals(this.k, eVar.k) && l().z() == eVar.l().z();
    }

    @Nullable
    public HostnameVerifier e() {
        return this.j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f14007a.equals(eVar.f14007a) && d(eVar);
        }
    }

    public List<e0> f() {
        return this.f14011e;
    }

    @Nullable
    public Proxy g() {
        return this.h;
    }

    public g h() {
        return this.f14010d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f14007a.hashCode()) * 31) + this.f14008b.hashCode()) * 31) + this.f14010d.hashCode()) * 31) + this.f14011e.hashCode()) * 31) + this.f14012f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.k);
    }

    public ProxySelector i() {
        return this.g;
    }

    public SocketFactory j() {
        return this.f14009c;
    }

    @Nullable
    public SSLSocketFactory k() {
        return this.i;
    }

    public z l() {
        return this.f14007a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f14007a.m());
        sb.append(":");
        sb.append(this.f14007a.z());
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }
}
