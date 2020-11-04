package d.a.a0.g;

import java.util.concurrent.Callable;

/* compiled from: ScheduledDirectTask */
public final class j extends a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public j(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: b */
    public Void call() throws Exception {
        this.f13790c = Thread.currentThread();
        try {
            this.f13789b.run();
            return null;
        } finally {
            lazySet(a.f13787d);
            this.f13790c = null;
        }
    }
}
