package b.c.a.b.i.w.j;

import dagger.a.b;
import dagger.a.d;

/* compiled from: EventStoreModule_DbNameFactory */
public final class f implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    private static final f f2225a = new f();

    public static f a() {
        return f2225a;
    }

    public static String b() {
        String a2 = e.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
