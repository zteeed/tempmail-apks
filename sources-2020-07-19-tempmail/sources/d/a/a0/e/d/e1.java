package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.a0.b.b;
import d.a.a0.d.c;
import d.a.l;
import d.a.s;
import java.util.Iterator;

/* compiled from: ObservableFromIterable */
public final class e1<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final Iterable<? extends T> f12924b;

    /* compiled from: ObservableFromIterable */
    static final class a<T> extends c<T> {

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f12925b;

        /* renamed from: c  reason: collision with root package name */
        final Iterator<? extends T> f12926c;

        /* renamed from: d  reason: collision with root package name */
        volatile boolean f12927d;

        /* renamed from: e  reason: collision with root package name */
        boolean f12928e;

        /* renamed from: f  reason: collision with root package name */
        boolean f12929f;
        boolean g;

        a(s<? super T> sVar, Iterator<? extends T> it) {
            this.f12925b = sVar;
            this.f12926c = it;
        }

        public boolean a() {
            return this.f12927d;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            while (!a()) {
                try {
                    Object next = this.f12926c.next();
                    b.e(next, "The iterator returned a null value");
                    this.f12925b.onNext(next);
                    if (!a()) {
                        try {
                            if (!this.f12926c.hasNext()) {
                                if (!a()) {
                                    this.f12925b.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            io.reactivex.exceptions.a.b(th);
                            this.f12925b.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    this.f12925b.onError(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.f12929f = true;
        }

        public void dispose() {
            this.f12927d = true;
        }

        public int g(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f12928e = true;
            return 1;
        }

        public boolean isEmpty() {
            return this.f12929f;
        }

        public T poll() {
            if (this.f12929f) {
                return null;
            }
            if (!this.g) {
                this.g = true;
            } else if (!this.f12926c.hasNext()) {
                this.f12929f = true;
                return null;
            }
            T next = this.f12926c.next();
            b.e(next, "The iterator returned a null value");
            return next;
        }
    }

    public e1(Iterable<? extends T> iterable) {
        this.f12924b = iterable;
    }

    public void subscribeActual(s<? super T> sVar) {
        try {
            Iterator<? extends T> it = this.f12924b.iterator();
            try {
                if (!it.hasNext()) {
                    d.h(sVar);
                    return;
                }
                a aVar = new a(sVar, it);
                sVar.onSubscribe(aVar);
                if (!aVar.f12928e) {
                    aVar.b();
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
