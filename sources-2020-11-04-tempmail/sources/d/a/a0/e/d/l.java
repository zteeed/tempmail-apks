package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.a0.a.d;
import d.a.q;
import d.a.s;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableBuffer */
public final class l<T, U extends Collection<? super T>> extends a<T, U> {

    /* renamed from: c  reason: collision with root package name */
    final int f13743c;

    /* renamed from: d  reason: collision with root package name */
    final int f13744d;

    /* renamed from: e  reason: collision with root package name */
    final Callable<U> f13745e;

    /* compiled from: ObservableBuffer */
    static final class a<T, U extends Collection<? super T>> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13746b;

        /* renamed from: c  reason: collision with root package name */
        final int f13747c;

        /* renamed from: d  reason: collision with root package name */
        final Callable<U> f13748d;

        /* renamed from: e  reason: collision with root package name */
        U f13749e;

        /* renamed from: f  reason: collision with root package name */
        int f13750f;
        d.a.y.b g;

        a(s<? super U> sVar, int i, Callable<U> callable) {
            this.f13746b = sVar;
            this.f13747c = i;
            this.f13748d = callable;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            try {
                U call = this.f13748d.call();
                d.a.a0.b.b.e(call, "Empty buffer supplied");
                this.f13749e = (Collection) call;
                return true;
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13749e = null;
                d.a.y.b bVar = this.g;
                if (bVar == null) {
                    d.m(th, this.f13746b);
                    return false;
                }
                bVar.dispose();
                this.f13746b.onError(th);
                return false;
            }
        }

        public void dispose() {
            this.g.dispose();
        }

        public void onComplete() {
            U u = this.f13749e;
            if (u != null) {
                this.f13749e = null;
                if (!u.isEmpty()) {
                    this.f13746b.onNext(u);
                }
                this.f13746b.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f13749e = null;
            this.f13746b.onError(th);
        }

        public void onNext(T t) {
            U u = this.f13749e;
            if (u != null) {
                u.add(t);
                int i = this.f13750f + 1;
                this.f13750f = i;
                if (i >= this.f13747c) {
                    this.f13746b.onNext(u);
                    this.f13750f = 0;
                    a();
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.g, bVar)) {
                this.g = bVar;
                this.f13746b.onSubscribe(this);
            }
        }
    }

    /* compiled from: ObservableBuffer */
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -8223395059921494546L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13751b;

        /* renamed from: c  reason: collision with root package name */
        final int f13752c;

        /* renamed from: d  reason: collision with root package name */
        final int f13753d;

        /* renamed from: e  reason: collision with root package name */
        final Callable<U> f13754e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f13755f;
        final ArrayDeque<U> g = new ArrayDeque<>();
        long h;

        b(s<? super U> sVar, int i, int i2, Callable<U> callable) {
            this.f13751b = sVar;
            this.f13752c = i;
            this.f13753d = i2;
            this.f13754e = callable;
        }

        public void dispose() {
            this.f13755f.dispose();
        }

        public void onComplete() {
            while (!this.g.isEmpty()) {
                this.f13751b.onNext(this.g.poll());
            }
            this.f13751b.onComplete();
        }

        public void onError(Throwable th) {
            this.g.clear();
            this.f13751b.onError(th);
        }

        public void onNext(T t) {
            long j = this.h;
            this.h = 1 + j;
            if (j % ((long) this.f13753d) == 0) {
                try {
                    U call = this.f13754e.call();
                    d.a.a0.b.b.e(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.g.offer((Collection) call);
                } catch (Throwable th) {
                    this.g.clear();
                    this.f13755f.dispose();
                    this.f13751b.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.g.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.f13752c <= collection.size()) {
                    it.remove();
                    this.f13751b.onNext(collection);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13755f, bVar)) {
                this.f13755f = bVar;
                this.f13751b.onSubscribe(this);
            }
        }
    }

    public l(q<T> qVar, int i, int i2, Callable<U> callable) {
        super(qVar);
        this.f13743c = i;
        this.f13744d = i2;
        this.f13745e = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super U> sVar) {
        int i = this.f13744d;
        int i2 = this.f13743c;
        if (i == i2) {
            a aVar = new a(sVar, i2, this.f13745e);
            if (aVar.a()) {
                this.f13338b.subscribe(aVar);
                return;
            }
            return;
        }
        this.f13338b.subscribe(new b(sVar, this.f13743c, this.f13744d, this.f13745e));
    }
}
