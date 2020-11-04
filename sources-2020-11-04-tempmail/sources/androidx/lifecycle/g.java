package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle */
public abstract class g {

    /* compiled from: Lifecycle */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* compiled from: Lifecycle */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean f(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public g() {
        new AtomicReference();
    }

    public abstract void a(j jVar);

    public abstract b b();

    public abstract void c(j jVar);
}
