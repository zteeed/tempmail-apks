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
    final q<T> f13399b;

    /* compiled from: BlockingObservableLatest */
    static final class a<T> extends d.a.c0.c<k<T>> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        k<T> f13400c;

        /* renamed from: d  reason: collision with root package name */
        final Semaphore f13401d = new Semaphore(0);

        /* renamed from: e  reason: collision with root package name */
        final AtomicReference<k<T>> f13402e = new AtomicReference<>();

        a() {
        }

        /* renamed from: c */
        public void onNext(k<T> kVar) {
            if (this.f13402e.getAndSet(kVar) == null) {
                this.f13401d.release();
            }
        }

        public boolean hasNext() {
            k<T> kVar = this.f13400c;
            if (kVar == null || !kVar.g()) {
                if (this.f13400c == null) {
                    try {
                        e.b();
                        this.f13401d.acquire();
                        k<T> andSet = this.f13402e.getAndSet((Object) null);
                        this.f13400c = andSet;
                        if (andSet.g()) {
                            throw j.d(andSet.d());
                        }
                    } catch (InterruptedException e2) {
                        dispose();
                        this.f13400c = k.b(e2);
                        throw j.d(e2);
                    }
                }
                return this.f13400c.h();
            }
            throw j.d(this.f13400c.d());
        }

        public T next() {
            if (hasNext()) {
                T e2 = this.f13400c.e();
                this.f13400c = null;
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
        this.f13399b = qVar;
    }

    public Iterator<T> iterator() {
        a aVar = new a();
        l.wrap(this.f13399b).materialize().subscribe(aVar);
        return aVar;
    }
}
