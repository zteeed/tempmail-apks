package d.a.a0.g;

import d.a.a0.b.a;
import d.a.y.b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: InstantPeriodicTask */
final class c implements Callable<Void>, b {
    static final FutureTask<Void> g = new FutureTask<>(a.f13174b, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    final Runnable f14400b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Future<?>> f14401c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<Future<?>> f14402d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    final ExecutorService f14403e;

    /* renamed from: f  reason: collision with root package name */
    Thread f14404f;

    c(Runnable runnable, ExecutorService executorService) {
        this.f14400b = runnable;
        this.f14403e = executorService;
    }

    /* renamed from: a */
    public Void call() throws Exception {
        this.f14404f = Thread.currentThread();
        try {
            this.f14400b.run();
            c(this.f14403e.submit(this));
            this.f14404f = null;
        } catch (Throwable th) {
            this.f14404f = null;
            d.a.d0.a.s(th);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(Future<?> future) {
        Future future2;
        do {
            future2 = this.f14402d.get();
            if (future2 == g) {
                future.cancel(this.f14404f != Thread.currentThread());
                return;
            }
        } while (!this.f14402d.compareAndSet(future2, future));
    }

    /* access modifiers changed from: package-private */
    public void c(Future<?> future) {
        Future future2;
        do {
            future2 = this.f14401c.get();
            if (future2 == g) {
                future.cancel(this.f14404f != Thread.currentThread());
                return;
            }
        } while (!this.f14401c.compareAndSet(future2, future));
    }

    public void dispose() {
        Future andSet = this.f14402d.getAndSet(g);
        boolean z = true;
        if (!(andSet == null || andSet == g)) {
            andSet.cancel(this.f14404f != Thread.currentThread());
        }
        Future andSet2 = this.f14401c.getAndSet(g);
        if (andSet2 != null && andSet2 != g) {
            if (this.f14404f == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }
}
