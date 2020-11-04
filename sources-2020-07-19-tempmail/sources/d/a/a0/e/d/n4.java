package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.l;
import d.a.s;
import d.a.y.b;
import d.a.z.c;
import java.util.Iterator;

/* compiled from: ObservableZipIterable */
public final class n4<T, U, V> extends l<V> {

    /* renamed from: b  reason: collision with root package name */
    final l<? extends T> f13327b;

    /* renamed from: c  reason: collision with root package name */
    final Iterable<U> f13328c;

    /* renamed from: d  reason: collision with root package name */
    final c<? super T, ? super U, ? extends V> f13329d;

    /* compiled from: ObservableZipIterable */
    static final class a<T, U, V> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super V> f13330b;

        /* renamed from: c  reason: collision with root package name */
        final Iterator<U> f13331c;

        /* renamed from: d  reason: collision with root package name */
        final c<? super T, ? super U, ? extends V> f13332d;

        /* renamed from: e  reason: collision with root package name */
        b f13333e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13334f;

        a(s<? super V> sVar, Iterator<U> it, c<? super T, ? super U, ? extends V> cVar) {
            this.f13330b = sVar;
            this.f13331c = it;
            this.f13332d = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(Throwable th) {
            this.f13334f = true;
            this.f13333e.dispose();
            this.f13330b.onError(th);
        }

        public void dispose() {
            this.f13333e.dispose();
        }

        public void onComplete() {
            if (!this.f13334f) {
                this.f13334f = true;
                this.f13330b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13334f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13334f = true;
            this.f13330b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13334f) {
                try {
                    U next = this.f13331c.next();
                    d.a.a0.b.b.e(next, "The iterator returned a null value");
                    try {
                        Object a2 = this.f13332d.a(t, next);
                        d.a.a0.b.b.e(a2, "The zipper function returned a null value");
                        this.f13330b.onNext(a2);
                        try {
                            if (!this.f13331c.hasNext()) {
                                this.f13334f = true;
                                this.f13333e.dispose();
                                this.f13330b.onComplete();
                            }
                        } catch (Throwable th) {
                            io.reactivex.exceptions.a.b(th);
                            a(th);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.b(th2);
                        a(th2);
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.a.b(th3);
                    a(th3);
                }
            }
        }

        public void onSubscribe(b bVar) {
            if (d.a.a0.a.c.p(this.f13333e, bVar)) {
                this.f13333e = bVar;
                this.f13330b.onSubscribe(this);
            }
        }
    }

    public n4(l<? extends T> lVar, Iterable<U> iterable, c<? super T, ? super U, ? extends V> cVar) {
        this.f13327b = lVar;
        this.f13328c = iterable;
        this.f13329d = cVar;
    }

    public void subscribeActual(s<? super V> sVar) {
        try {
            Iterator<U> it = this.f13328c.iterator();
            d.a.a0.b.b.e(it, "The iterator returned by other is null");
            Iterator it2 = it;
            try {
                if (!it2.hasNext()) {
                    d.h(sVar);
                } else {
                    this.f13327b.subscribe(new a(sVar, it2, this.f13329d));
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                d.m(th, sVar);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            d.m(th2, sVar);
        }
    }
}
