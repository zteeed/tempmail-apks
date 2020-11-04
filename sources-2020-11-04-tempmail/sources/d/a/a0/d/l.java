package d.a.a0.d;

import d.a.a0.a.c;
import d.a.a0.j.e;
import d.a.a0.j.j;
import d.a.d0.a;
import d.a.s;
import d.a.y.b;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FutureObserver */
public final class l<T> extends CountDownLatch implements s<T>, Future<T>, b {

    /* renamed from: b  reason: collision with root package name */
    T f13236b;

    /* renamed from: c  reason: collision with root package name */
    Throwable f13237c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<b> f13238d = new AtomicReference<>();

    public l() {
        super(1);
    }

    public boolean cancel(boolean z) {
        b bVar;
        c cVar;
        do {
            bVar = this.f13238d.get();
            if (bVar == this || bVar == (cVar = c.DISPOSED)) {
                return false;
            }
        } while (!this.f13238d.compareAndSet(bVar, cVar));
        if (bVar != null) {
            bVar.dispose();
        }
        countDown();
        return true;
    }

    public void dispose() {
    }

    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            e.b();
            await();
        }
        if (!isCancelled()) {
            Throwable th = this.f13237c;
            if (th == null) {
                return this.f13236b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public boolean isCancelled() {
        return c.g(this.f13238d.get());
    }

    public boolean isDone() {
        return getCount() == 0;
    }

    public void onComplete() {
        b bVar;
        if (this.f13236b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f13238d.get();
            if (bVar == this || bVar == c.DISPOSED) {
                return;
            }
        } while (!this.f13238d.compareAndSet(bVar, this));
        countDown();
    }

    public void onError(Throwable th) {
        b bVar;
        if (this.f13237c == null) {
            this.f13237c = th;
            do {
                bVar = this.f13238d.get();
                if (bVar == this || bVar == c.DISPOSED) {
                    a.s(th);
                    return;
                }
            } while (!this.f13238d.compareAndSet(bVar, this));
            countDown();
            return;
        }
        a.s(th);
    }

    public void onNext(T t) {
        if (this.f13236b != null) {
            this.f13238d.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f13236b = t;
    }

    public void onSubscribe(b bVar) {
        c.n(this.f13238d, bVar);
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            e.b();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(j.c(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f13237c;
            if (th == null) {
                return this.f13236b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
