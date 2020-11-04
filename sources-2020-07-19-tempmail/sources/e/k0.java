package e;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* compiled from: Route */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    final e f14077a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f14078b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f14079c;

    public k0(e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (eVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f14077a = eVar;
            this.f14078b = proxy;
            this.f14079c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public e a() {
        return this.f14077a;
    }

    public Proxy b() {
        return this.f14078b;
    }

    public boolean c() {
        return this.f14077a.i != null && this.f14078b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f14079c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return k0Var.f14077a.equals(this.f14077a) && k0Var.f14078b.equals(this.f14078b) && k0Var.f14079c.equals(this.f14079c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f14077a.hashCode()) * 31) + this.f14078b.hashCode()) * 31) + this.f14079c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f14079c + "}";
    }
}
