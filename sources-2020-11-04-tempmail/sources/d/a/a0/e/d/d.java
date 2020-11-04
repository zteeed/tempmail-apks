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
    final q<T> f13441b;

    /* renamed from: c  reason: collision with root package name */
    final T f13442c;

    /* compiled from: BlockingObservableMostRecent */
    static final class a<T> extends b<T> {

        /* renamed from: c  reason: collision with root package name */
        volatile Object f13443c;

        /* renamed from: d.a.a0.e.d.d$a$a  reason: collision with other inner class name */
        /* compiled from: BlockingObservableMostRecent */
        final class C0135a implements Iterator<T> {

            /* renamed from: b  reason: collision with root package name */
            private Object f13444b;

            C0135a() {
            }

            public boolean hasNext() {
                Object obj = a.this.f13443c;
                this.f13444b = obj;
                return !m.p(obj);
            }

            public T next() {
                Object obj = null;
                try {
                    if (this.f13444b == null) {
                        obj = a.this.f13443c;
                    }
                    if (m.p(this.f13444b)) {
                        throw new NoSuchElementException();
                    } else if (!m.q(this.f13444b)) {
                        T t = this.f13444b;
                        m.o(t);
                        this.f13444b = obj;
                        return t;
                    } else {
                        throw j.d(m.n(this.f13444b));
                    }
                } finally {
                    this.f13444b = obj;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        a(T t) {
            m.r(t);
            this.f13443c = t;
        }

        public a<T>.a b() {
            return new C0135a();
        }

        public void onComplete() {
            this.f13443c = m.h();
        }

        public void onError(Throwable th) {
            this.f13443c = m.m(th);
        }

        public void onNext(T t) {
            m.r(t);
            this.f13443c = t;
        }
    }

    public d(q<T> qVar, T t) {
        this.f13441b = qVar;
        this.f13442c = t;
    }

    public Iterator<T> iterator() {
        a aVar = new a(this.f13442c);
        this.f13441b.subscribe(aVar);
        return aVar.b();
    }
}
