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
    final q<? extends T> f13365b;

    /* renamed from: c  reason: collision with root package name */
    final int f13366c;

    /* compiled from: BlockingObservableIterable */
    static final class a<T> extends AtomicReference<d.a.y.b> implements s<T>, Iterator<T>, d.a.y.b {
        private static final long serialVersionUID = 6695226475494099826L;

        /* renamed from: b  reason: collision with root package name */
        final c<T> f13367b;

        /* renamed from: c  reason: collision with root package name */
        final Lock f13368c;

        /* renamed from: d  reason: collision with root package name */
        final Condition f13369d;

        /* renamed from: e  reason: collision with root package name */
        volatile boolean f13370e;

        /* renamed from: f  reason: collision with root package name */
        volatile Throwable f13371f;

        a(int i) {
            this.f13367b = new c<>(i);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f13368c = reentrantLock;
            this.f13369d = reentrantLock.newCondition();
        }

        public boolean b() {
            return d.a.a0.a.c.g((d.a.y.b) get());
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f13368c.lock();
            try {
                this.f13369d.signalAll();
            } finally {
                this.f13368c.unlock();
            }
        }

        public void dispose() {
            d.a.a0.a.c.f(this);
            c();
        }

        public boolean hasNext() {
            while (!b()) {
                boolean z = this.f13370e;
                boolean isEmpty = this.f13367b.isEmpty();
                if (z) {
                    Throwable th = this.f13371f;
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
                this.f13368c.lock();
                while (!this.f13370e && this.f13367b.isEmpty() && !b()) {
                    try {
                        this.f13369d.await();
                    } catch (InterruptedException e2) {
                        d.a.a0.a.c.f(this);
                        c();
                        throw j.d(e2);
                    } catch (Throwable th2) {
                        this.f13368c.unlock();
                        throw th2;
                    }
                }
                this.f13368c.unlock();
            }
            Throwable th3 = this.f13371f;
            if (th3 == null) {
                return false;
            }
            throw j.d(th3);
        }

        public T next() {
            if (hasNext()) {
                return this.f13367b.poll();
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
            this.f13370e = true;
            c();
        }

        public void onError(Throwable th) {
            this.f13371f = th;
            this.f13370e = true;
            c();
        }

        public void onNext(T t) {
            this.f13367b.offer(t);
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
        this.f13365b = qVar;
        this.f13366c = i;
    }

    public Iterator<T> iterator() {
        a aVar = new a(this.f13366c);
        this.f13365b.subscribe(aVar);
        return aVar;
    }
}
