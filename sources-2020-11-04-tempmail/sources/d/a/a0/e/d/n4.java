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
    final l<? extends T> f13885b;

    /* renamed from: c  reason: collision with root package name */
    final Iterable<U> f13886c;

    /* renamed from: d  reason: collision with root package name */
    final c<? super T, ? super U, ? extends V> f13887d;

    /* compiled from: ObservableZipIterable */
    static final class a<T, U, V> implements s<T>, b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super V> f13888b;

        /* renamed from: c  reason: collision with root package name */
        final Iterator<U> f13889c;

        /* renamed from: d  reason: collision with root package name */
        final c<? super T, ? super U, ? extends V> f13890d;

        /* renamed from: e  reason: collision with root package name */
        b f13891e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13892f;

        a(s<? super V> sVar, Iterator<U> it, c<? super T, ? super U, ? extends V> cVar) {
            this.f13888b = sVar;
            this.f13889c = it;
            this.f13890d = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(Throwable th) {
            this.f13892f = true;
            this.f13891e.dispose();
            this.f13888b.onError(th);
        }

        public void dispose() {
            this.f13891e.dispose();
        }

        public void onComplete() {
            if (!this.f13892f) {
                this.f13892f = true;
                this.f13888b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f13892f) {
                d.a.d0.a.s(th);
                return;
            }
            this.f13892f = true;
            this.f13888b.onError(th);
        }

        public void onNext(T t) {
            if (!this.f13892f) {
                try {
                    U next = this.f13889c.next();
                    d.a.a0.b.b.e(next, "The iterator returned a null value");
                    try {
                        Object a2 = this.f13890d.a(t, next);
                        d.a.a0.b.b.e(a2, "The zipper function returned a null value");
                        this.f13888b.onNext(a2);
                        try {
                            if (!this.f13889c.hasNext()) {
                                this.f13892f = true;
                                this.f13891e.dispose();
                                this.f13888b.onComplete();
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
            if (d.a.a0.a.c.p(this.f13891e, bVar)) {
                this.f13891e = bVar;
                this.f13888b.onSubscribe(this);
            }
        }
    }

    public n4(l<? extends T> lVar, Iterable<U> iterable, c<? super T, ? super U, ? extends V> cVar) {
        this.f13885b = lVar;
        this.f13886c = iterable;
        this.f13887d = cVar;
    }

    public void subscribeActual(s<? super V> sVar) {
        try {
            Iterator<U> it = this.f13886c.iterator();
            d.a.a0.b.b.e(it, "The iterator returned by other is null");
            Iterator it2 = it;
            try {
                if (!it2.hasNext()) {
                    d.h(sVar);
                } else {
                    this.f13885b.subscribe(new a(sVar, it2, this.f13887d));
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
