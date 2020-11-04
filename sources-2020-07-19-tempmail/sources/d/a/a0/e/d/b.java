package d.a.a0.e.d;

import d.a.a0.f.c;
import d.a.a0.j.e;
import d.a.a0.j.j;
import d.a.q;
import d.a.s;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: BlockingObservableIterable */
public final class b<T> implements Iterable<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<? extends T> f12807b;

    /* renamed from: c  reason: collision with root package name */
    final int f12808c;

    /* compiled from: BlockingObservableIterable */
    static final class a<T> extends AtomicReference<d.a.y.b> implements s<T>, Iterator<T>, d.a.y.b {
        private static final long serialVersionUID = 6695226475494099826L;

        /* renamed from: b  reason: collision with root package name */
        final c<T> f12809b;

        /* renamed from: c  reason: collision with root package name */
        final Lock f12810c;

        /* renamed from: d  reason: collision with root package name */
        final Condition f12811d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f12812e;

        /* renamed from: f  reason: collision with root package name */
        volatile Throwable f12813f;

        a(int i) {
            this.f12809b = new c<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f12810c = reentrantLock;
            this.f12811d = reentrantLock.newCondition();
        }

        public boolean b() {
            return d.a.a0.a.c.g((d.a.y.b) get());
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f12810c.lock();
            try {
                this.f12811d.signalAll();
            } finally {
                this.f12810c.unlock();
            }
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
            c();
        }

        public boolean hasNext() {
            while (!b()) {
                boolean z = this.f12812e;
                boolean isEmpty = this.f12809b.isEmpty();
                if (z) {
                    Throwable th = this.f12813f;
                    if (th != null) {
                        throw j.d(th);
                    } else if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                e.b();
                this.f12810c.lock();
                while (!this.f12812e && this.f12809b.isEmpty() && !b()) {
                    try {
                        this.f12811d.await();
                    } catch (InterruptedException e2) {
                        d.a.a0.a.c.f(this);
                        c();
                        throw j.d(e2);
                    } catch (Throwable th2) {
                        this.f12810c.unlock();
                        throw th2;
                    }
                }
                this.f12810c.unlock();
            }
            Throwable th3 = this.f12813f;
            if (th3 == null) {
                return false;
            }
            throw j.d(th3);
        }

        public T next() {
            if (hasNext()) {
                return this.f12809b.poll();
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
            this.f12812e = true;
            c();
        }

        public void onError(Throwable th) {
            this.f12813f = th;
            this.f12812e = true;
            c();
        }

        public void onNext(T t) {
            this.f12809b.offer(t);
            c();
        }

        public void onSubscribe(d.a.y.b bVar) {
            d.a.a0.a.c.n(this, bVar);
        }

        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public b(q<? extends T> qVar, int i) {
        this.f12807b = qVar;
        this.f12808c = i;
    }

    public Iterator<T> iterator() {
        a aVar = new a(this.f12808c);
        this.f12807b.subscribe(aVar);
        return aVar;
    }
}
