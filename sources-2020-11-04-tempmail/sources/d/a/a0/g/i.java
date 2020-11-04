package d.a.a0.g;

import d.a.d0.a;

/* compiled from: ScheduledDirectPeriodicTask */
public final class i extends a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public i(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f14386c = Thread.currentThread();
        try {
            this.f14385b.run();
            this.f14386c = null;
        } catch (Throwable th) {
            this.f14386c = null;
            lazySet(a.f14383d);
            a.s(th);
        }
    }
}
