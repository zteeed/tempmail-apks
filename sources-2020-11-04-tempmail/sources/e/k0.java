package e;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* compiled from: Route */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    final e f14640a;

    /* renamed from: b  reason: collision with root package name */
    final Proxy f14641b;

    /* renamed from: c  reason: collision with root package name */
    final InetSocketAddress f14642c;

    public k0(e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (eVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f14640a = eVar;
            this.f14641b = proxy;
            this.f14642c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public e a() {
        return this.f14640a;
    }

    public Proxy b() {
        return this.f14641b;
    }

    public boolean c() {
        return this.f14640a.i != null && this.f14641b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.f14642c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return k0Var.f14640a.equals(this.f14640a) && k0Var.f14641b.equals(this.f14641b) && k0Var.f14642c.equals(this.f14642c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f14640a.hashCode()) * 31) + this.f14641b.hashCode()) * 31) + this.f14642c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f14642c + "}";
    }
}
