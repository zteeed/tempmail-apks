package b.c.a.b.i.w.j;

import dagger.a.b;
import dagger.a.d;

/* compiled from: EventStoreModule_StoreConfigFactory */
public final class h implements b<d> {

    /* renamed from: a  reason: collision with root package name */
    private static final h f2327a = new h();

    public static h a() {
        return f2327a;
    }

    public static d c() {
        d c2 = e.c();
        d.c(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    /* renamed from: b */
    public d get() {
        return c();
    }
}
