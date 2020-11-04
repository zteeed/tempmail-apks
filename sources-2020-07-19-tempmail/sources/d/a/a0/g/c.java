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
    static final FutureTask<Void> g = new FutureTask<>(a.f12616b, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    final Runnable f13804b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Future<?>> f13805c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<Future<?>> f13806d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    final ExecutorService f13807e;

    /* renamed from: f  reason: collision with root package name */
    Thread f13808f;

    c(Runnable runnable, ExecutorService executorService) {
        this.f13804b = runnable;
        this.f13807e = executorService;
    }

    /* renamed from: a */
    public Void call() throws Exception {
        this.f13808f = Thread.currentThread();
        try {
            this.f13804b.run();
            c(this.f13807e.submit(this));
            this.f13808f = null;
        } catch (Throwable th) {
            this.f13808f = null;
            d.a.d0.a.s(th);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void b(Future<?> future) {
        Future future2;
        do {
            future2 = this.f13806d.get();
            if (future2 == g) {
                future.cancel(this.f13808f != Thread.currentThread());
                return;
            }
        } while (!this.f13806d.compareAndSet(future2, future));
    }

    /* access modifiers changed from: package-private */
    public void c(Future<?> future) {
        Future future2;
        do {
            future2 = this.f13805c.get();
            if (future2 == g) {
                future.cancel(this.f13808f != Thread.currentThread());
                return;
            }
        } while (!this.f13805c.compareAndSet(future2, future));
    }

    public void dispose() {
        Future andSet = this.f13806d.getAndSet(g);
        boolean z = true;
        if (!(andSet == null || andSet == g)) {
            andSet.cancel(this.f13808f != Thread.currentThread());
        }
        Future andSet2 = this.f13805c.getAndSet(g);
        if (andSet2 != null && andSet2 != g) {
            if (this.f13808f == Thread.currentThread()) {
                z = false;
            }
            andSet2.cancel(z);
        }
    }
}
