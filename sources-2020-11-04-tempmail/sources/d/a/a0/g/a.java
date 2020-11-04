package d.a.a0.g;

import d.a.y.b;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AbstractDirectTask */
abstract class a extends AtomicReference<Future<?>> implements b {

    /* renamed from: d  reason: collision with root package name */
    protected static final FutureTask<Void> f14383d = new FutureTask<>(d.a.a0.b.a.f13174b, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    protected static final FutureTask<Void> f14384e = new FutureTask<>(d.a.a0.b.a.f13174b, (Object) null);
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: b  reason: collision with root package name */
    protected final Runnable f14385b;

    /* renamed from: c  reason: collision with root package name */
    protected Thread f14386c;

    a(Runnable runnable) {
        this.f14385b = runnable;
    }

    public final void a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f14383d) {
                if (future2 == f14384e) {
                    future.cancel(this.f14386c != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != f14383d && future != (futureTask = f14384e) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f14386c != Thread.currentThread());
        }
    }
}
