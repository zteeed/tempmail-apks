package b.c.a.b.i.x;

import dagger.a.b;
import dagger.a.d;

/* compiled from: TimeModule_EventClockFactory */
public final class c implements b<a> {

    /* renamed from: a  reason: collision with root package name */
    private static final c f2261a = new c();

    public static c a() {
        return f2261a;
    }

    public static a b() {
        a a2 = b.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public a get() {
        return b();
    }
}
