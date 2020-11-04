package d.a.a0.e.d;

import d.a.a0.j.e;
import d.a.a0.j.j;
import d.a.k;
import d.a.l;
import d.a.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BlockingObservableLatest */
public final class c<T> implements Iterable<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<T> f12841b;

    /* compiled from: BlockingObservableLatest */
    static final class a<T> extends d.a.c0.c<k<T>> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        k<T> f12842c;

        /* renamed from: d  reason: collision with root package name */
        final Semaphore f12843d = new Semaphore(0);

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<k<T>> f12844e = new AtomicReference<>();

        a() {
        }

        /* renamed from: c */
        public void onNext(k<T> kVar) {
            if (this.f12844e.getAndSet(kVar) == null) {
                this.f12843d.release();
            }
        }

        public boolean hasNext() {
            k<T> kVar = this.f12842c;
            if (kVar == null || !kVar.g()) {
                if (this.f12842c == null) {
                    try {
                        e.b();
                        this.f12843d.acquire();
                        k<T> andSet = this.f12844e.getAndSet((Object) null);
                        this.f12842c = andSet;
                        if (andSet.g()) {
                            throw j.d(andSet.d());
                        }
                    } catch (InterruptedException e2) {
                        dispose();
                        this.f12842c = k.b(e2);
                        throw j.d(e2);
                    }
                }
                return this.f12842c.h();
            }
            throw j.d(this.f12842c.d());
        }

        public T next() {
            if (hasNext()) {
                T e2 = this.f12842c.e();
                this.f12842c = null;
                return e2;
            }
            throw new NoSuchElementException();
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            d.a.d0.a.s(th);
        }

        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public c(q<T> qVar) {
        this.f12841b = qVar;
    }

    public Iterator<T> iterator() {
        a aVar = new a();
        l.wrap(this.f12841b).materialize().subscribe(aVar);
        return aVar;
    }
}
