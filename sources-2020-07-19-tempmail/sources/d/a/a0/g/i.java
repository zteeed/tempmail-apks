package d.a.a0.g;

import d.a.d0.a;

/* compiled from: ScheduledDirectPeriodicTask */
public final class i extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public i(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f13790c = Thread.currentThread();
        try {
            this.f13789b.run();
            this.f13790c = null;
        } catch (Throwable th) {
            this.f13790c = null;
            lazySet(a.f13787d);
            a.s(th);
        }
    }
}
