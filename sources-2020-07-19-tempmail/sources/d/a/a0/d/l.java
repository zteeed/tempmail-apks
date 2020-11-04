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
    T f12678b;

    /* renamed from: c  reason: collision with root package name */
    Throwable f12679c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<b> f12680d = new AtomicReference<>();

    public l() {
        super(1);
    }

    public boolean cancel(boolean z) {
        b bVar;
        c cVar;
        do {
            bVar = this.f12680d.get();
            if (bVar == this || bVar == (cVar = c.DISPOSED)) {
                return false;
            }
        } while (!this.f12680d.compareAndSet(bVar, cVar));
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
            Throwable th = this.f12679c;
            if (th == null) {
                return this.f12678b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    public boolean isCancelled() {
        return c.g(this.f12680d.get());
    }

    public boolean isDone() {
        return getCount() == 0;
    }

    public void onComplete() {
        b bVar;
        if (this.f12678b == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            bVar = this.f12680d.get();
            if (bVar == this || bVar == c.DISPOSED) {
                return;
            }
        } while (!this.f12680d.compareAndSet(bVar, this));
        countDown();
    }

    public void onError(Throwable th) {
        b bVar;
        if (this.f12679c == null) {
            this.f12679c = th;
            do {
                bVar = this.f12680d.get();
                if (bVar == this || bVar == c.DISPOSED) {
                    a.s(th);
                    return;
                }
            } while (!this.f12680d.compareAndSet(bVar, this));
            countDown();
            return;
        }
        a.s(th);
    }

    public void onNext(T t) {
        if (this.f12678b != null) {
            this.f12680d.get().dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f12678b = t;
    }

    public void onSubscribe(b bVar) {
        c.n(this.f12680d, bVar);
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            e.b();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(j.c(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f12679c;
            if (th == null) {
                return this.f12678b;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
