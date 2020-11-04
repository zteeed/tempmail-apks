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
    final z f14570a;

    /* renamed from: b  reason: collision with root package name */
    final u f14571b;

    /* renamed from: c  reason: collision with root package name */
    final SocketFactory f14572c;

    /* renamed from: d  reason: collision with root package name */
    final g f14573d;

    /* renamed from: e  reason: collision with root package name */
    final List<e0> f14574e;

    /* renamed from: f  reason: collision with root package name */
    final List<p> f14575f;
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
        this.f14570a = aVar.c();
        if (uVar != null) {
            this.f14571b = uVar;
            if (socketFactory != null) {
                this.f14572c = socketFactory;
                if (gVar != null) {
                    this.f14573d = gVar;
                    if (list != null) {
                        this.f14574e = e.m0.e.s(list);
                        if (list2 != null) {
                            this.f14575f = e.m0.e.s(list2);
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
        return this.f14575f;
    }

    public u c() {
        return this.f14571b;
    }

    /* access modifiers changed from: package-private */
    public boolean d(e eVar) {
        return this.f14571b.equals(eVar.f14571b) && this.f14573d.equals(eVar.f14573d) && this.f14574e.equals(eVar.f14574e) && this.f14575f.equals(eVar.f14575f) && this.g.equals(eVar.g) && Objects.equals(this.h, eVar.h) && Objects.equals(this.i, eVar.i) && Objects.equals(this.j, eVar.j) && Objects.equals(this.k, eVar.k) && l().z() == eVar.l().z();
    }

    @Nullable
    public HostnameVerifier e() {
        return this.j;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f14570a.equals(eVar.f14570a) && d(eVar);
        }
    }

    public List<e0> f() {
        return this.f14574e;
    }

    @Nullable
    public Proxy g() {
        return this.h;
    }

    public g h() {
        return this.f14573d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f14570a.hashCode()) * 31) + this.f14571b.hashCode()) * 31) + this.f14573d.hashCode()) * 31) + this.f14574e.hashCode()) * 31) + this.f14575f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.k);
    }

    public ProxySelector i() {
        return this.g;
    }

    public SocketFactory j() {
        return this.f14572c;
    }

    @Nullable
    public SSLSocketFactory k() {
        return this.i;
    }

    public z l() {
        return this.f14570a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f14570a.m());
        sb.append(":");
        sb.append(this.f14570a.z());
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
