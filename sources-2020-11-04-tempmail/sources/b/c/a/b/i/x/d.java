package b.c.a.b.i.x;

import dagger.a.b;

/* compiled from: TimeModule_UptimeClockFactory */
public final class d implements b<a> {

    /* renamed from: a  reason: collision with root package name */
    private static final d f2360a = new d();

    public static d a() {
        return f2360a;
    }

    public static a c() {
        a b2 = b.b();
        dagger.a.d.c(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    /* renamed from: b */
    public a get() {
        return c();
    }
}
