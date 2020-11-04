package d.a.y;

import d.a.a0.a.d;
import d.a.a0.b.b;

/* compiled from: Disposables */
public final class c {
    public static b a() {
        return d.INSTANCE;
    }

    public static b b(Runnable runnable) {
        b.e(runnable, "run is null");
        return new e(runnable);
    }
}
