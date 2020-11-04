package b.c.a.b.i;

import dagger.a.b;
import dagger.a.d;
import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory */
public final class j implements b<Executor> {

    /* renamed from: a  reason: collision with root package name */
    private static final j f2151a = new j();

    public static j a() {
        return f2151a;
    }

    public static Executor b() {
        Executor a2 = i.a();
        d.c(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
