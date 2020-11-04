package okhttp3.internal.connection;

import e.k0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RouteDatabase */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Set<k0> f14849a = new LinkedHashSet();

    h() {
    }

    public synchronized void a(k0 k0Var) {
        this.f14849a.remove(k0Var);
    }

    public synchronized void b(k0 k0Var) {
        this.f14849a.add(k0Var);
    }

    public synchronized boolean c(k0 k0Var) {
        return this.f14849a.contains(k0Var);
    }
}
