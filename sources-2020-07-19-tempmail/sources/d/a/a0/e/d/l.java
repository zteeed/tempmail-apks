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
    final int f13185c;

    /* renamed from: d  reason: collision with root package name */
    final int f13186d;

    /* renamed from: e  reason: collision with root package name */
    final Callable<U> f13187e;

    /* compiled from: ObservableBuffer */
    static final class a<T, U extends Collection<? super T>> implements s<T>, d.a.y.b {

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13188b;

        /* renamed from: c  reason: collision with root package name */
        final int f13189c;

        /* renamed from: d  reason: collision with root package name */
        final Callable<U> f13190d;

        /* renamed from: e  reason: collision with root package name */
        U f13191e;

        /* renamed from: f  reason: collision with root package name */
        int f13192f;
        d.a.y.b g;

        a(s<? super U> sVar, int i, Callable<U> callable) {
            this.f13188b = sVar;
            this.f13189c = i;
            this.f13190d = callable;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            try {
                U call = this.f13190d.call();
                d.a.a0.b.b.e(call, "Empty buffer supplied");
                this.f13191e = (Collection) call;
                return true;
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f13191e = null;
                d.a.y.b bVar = this.g;
                if (bVar == null) {
                    d.m(th, this.f13188b);
                    return false;
                }
                bVar.dispose();
                this.f13188b.onError(th);
                return false;
            }
        }

        public void dispose() {
            this.g.dispose();
        }

        public void onComplete() {
            U u = this.f13191e;
            if (u != null) {
                this.f13191e = null;
                if (!u.isEmpty()) {
                    this.f13188b.onNext(u);
                }
                this.f13188b.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f13191e = null;
            this.f13188b.onError(th);
        }

        public void onNext(T t) {
            U u = this.f13191e;
            if (u != null) {
                u.add(t);
                int i = this.f13192f + 1;
                this.f13192f = i;
                if (i >= this.f13189c) {
                    this.f13188b.onNext(u);
                    this.f13192f = 0;
                    a();
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.g, bVar)) {
                this.g = bVar;
                this.f13188b.onSubscribe(this);
            }
        }
    }

    /* compiled from: ObservableBuffer */
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -8223395059921494546L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super U> f13193b;

        /* renamed from: c  reason: collision with root package name */
        final int f13194c;

        /* renamed from: d  reason: collision with root package name */
        final int f13195d;

        /* renamed from: e  reason: collision with root package name */
        final Callable<U> f13196e;

        /* renamed from: f  reason: collision with root package name */
        d.a.y.b f13197f;
        final ArrayDeque<U> g = new ArrayDeque<>();
        long h;

        b(s<? super U> sVar, int i, int i2, Callable<U> callable) {
            this.f13193b = sVar;
            this.f13194c = i;
            this.f13195d = i2;
            this.f13196e = callable;
        }

        public void dispose() {
            this.f13197f.dispose();
        }

        public void onComplete() {
            while (!this.g.isEmpty()) {
                this.f13193b.onNext(this.g.poll());
            }
            this.f13193b.onComplete();
        }

        public void onError(Throwable th) {
            this.g.clear();
            this.f13193b.onError(th);
        }

        public void onNext(T t) {
            long j = this.h;
            this.h = 1 + j;
            if (j % ((long) this.f13195d) == 0) {
                try {
                    U call = this.f13196e.call();
                    d.a.a0.b.b.e(call, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.g.offer((Collection) call);
                } catch (Throwable th) {
                    this.g.clear();
                    this.f13197f.dispose();
                    this.f13193b.onError(th);
                    return;
                }
            }
            Iterator<U> it = this.g.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                collection.add(t);
                if (this.f13194c <= collection.size()) {
                    it.remove();
                    this.f13193b.onNext(collection);
                }
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13197f, bVar)) {
                this.f13197f = bVar;
                this.f13193b.onSubscribe(this);
            }
        }
    }

    public l(q<T> qVar, int i, int i2, Callable<U> callable) {
        super(qVar);
        this.f13185c = i;
        this.f13186d = i2;
        this.f13187e = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super U> sVar) {
        int i = this.f13186d;
        int i2 = this.f13185c;
        if (i == i2) {
            a aVar = new a(sVar, i2, this.f13187e);
            if (aVar.a()) {
                this.f12780b.subscribe(aVar);
                return;
            }
            return;
        }
        this.f12780b.subscribe(new b(sVar, this.f13185c, this.f13186d, this.f13187e));
    }
}
