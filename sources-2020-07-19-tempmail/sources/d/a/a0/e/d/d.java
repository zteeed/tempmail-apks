package d.a.a0.e.d;

import d.a.a0.j.j;
import d.a.a0.j.m;
import d.a.c0.b;
import d.a.q;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: BlockingObservableMostRecent */
public final class d<T> implements Iterable<T> {

    /* renamed from: b  reason: collision with root package name */
    final q<T> f12883b;

    /* renamed from: c  reason: collision with root package name */
    final T f12884c;

    /* compiled from: BlockingObservableMostRecent */
    static final class a<T> extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        volatile Object f12885c;

        /* renamed from: d.a.a0.e.d.d$a$a  reason: collision with other inner class name */
        /* compiled from: BlockingObservableMostRecent */
        final class C0137a implements Iterator<T> {

            /* renamed from: b  reason: collision with root package name */
            private Object f12886b;

            C0137a() {
            }

            public boolean hasNext() {
                Object obj = a.this.f12885c;
                this.f12886b = obj;
                return !m.p(obj);
            }

            public T next() {
                Object obj = null;
                try {
                    if (this.f12886b == null) {
                        obj = a.this.f12885c;
                    }
                    if (m.p(this.f12886b)) {
                        throw new NoSuchElementException();
                    } else if (!m.q(this.f12886b)) {
                        T t = this.f12886b;
                        m.o(t);
                        this.f12886b = obj;
                        return t;
                    } else {
                        throw j.d(m.n(this.f12886b));
                    }
                } finally {
                    this.f12886b = obj;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t) {
            m.r(t);
            this.f12885c = t;
        }

        public a<T>.a b() {
            return new C0137a();
        }

        public void onComplete() {
            this.f12885c = m.h();
        }

        public void onError(Throwable th) {
            this.f12885c = m.m(th);
        }

        public void onNext(T t) {
            m.r(t);
            this.f12885c = t;
        }
    }

    public d(q<T> qVar, T t) {
        this.f12883b = qVar;
        this.f12884c = t;
    }

    public Iterator<T> iterator() {
        a aVar = new a(this.f12884c);
        this.f12883b.subscribe(aVar);
        return aVar.b();
    }
}
