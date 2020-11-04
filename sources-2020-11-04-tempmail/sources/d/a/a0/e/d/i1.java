package d.a.a0.e.d;

import d.a.a0.a.d;
import d.a.q;
import d.a.s;
import d.a.z.n;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableGroupBy */
public final class i1<T, K, V> extends a<T, d.a.b0.b<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    final n<? super T, ? extends K> f13635c;

    /* renamed from: d  reason: collision with root package name */
    final n<? super T, ? extends V> f13636d;

    /* renamed from: e  reason: collision with root package name */
    final int f13637e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f13638f;

    /* compiled from: ObservableGroupBy */
    public static final class a<T, K, V> extends AtomicInteger implements s<T>, d.a.y.b {
        static final Object j = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super d.a.b0.b<K, V>> f13639b;

        /* renamed from: c  reason: collision with root package name */
        final n<? super T, ? extends K> f13640c;

        /* renamed from: d  reason: collision with root package name */
        final n<? super T, ? extends V> f13641d;

        /* renamed from: e  reason: collision with root package name */
        final int f13642e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f13643f;
        final Map<Object, b<K, V>> g;
        d.a.y.b h;
        final AtomicBoolean i = new AtomicBoolean();

        public a(s<? super d.a.b0.b<K, V>> sVar, n<? super T, ? extends K> nVar, n<? super T, ? extends V> nVar2, int i2, boolean z) {
            this.f13639b = sVar;
            this.f13640c = nVar;
            this.f13641d = nVar2;
            this.f13642e = i2;
            this.f13643f = z;
            this.g = new ConcurrentHashMap();
            lazySet(1);
        }

        public void a(K k) {
            if (k == null) {
                k = j;
            }
            this.g.remove(k);
            if (decrementAndGet() == 0) {
                this.h.dispose();
            }
        }

        public void dispose() {
            if (this.i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.h.dispose();
            }
        }

        public void onComplete() {
            ArrayList<b> arrayList = new ArrayList<>(this.g.values());
            this.g.clear();
            for (b onComplete : arrayList) {
                onComplete.onComplete();
            }
            this.f13639b.onComplete();
        }

        public void onError(Throwable th) {
            ArrayList<b> arrayList = new ArrayList<>(this.g.values());
            this.g.clear();
            for (b onError : arrayList) {
                onError.onError(th);
            }
            this.f13639b.onError(th);
        }

        public void onNext(T t) {
            Object obj;
            try {
                Object apply = this.f13640c.apply(t);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = j;
                }
                b bVar = this.g.get(obj);
                if (bVar == null) {
                    if (!this.i.get()) {
                        bVar = b.d(apply, this.f13642e, this, this.f13643f);
                        this.g.put(obj, bVar);
                        getAndIncrement();
                        this.f13639b.onNext(bVar);
                    } else {
                        return;
                    }
                }
                try {
                    Object apply2 = this.f13641d.apply(t);
                    d.a.a0.b.b.e(apply2, "The value supplied is null");
                    bVar.onNext(apply2);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.h.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.h.dispose();
                onError(th2);
            }
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (d.a.a0.a.c.p(this.h, bVar)) {
                this.h = bVar;
                this.f13639b.onSubscribe(this);
            }
        }
    }

    /* compiled from: ObservableGroupBy */
    static final class b<K, T> extends d.a.b0.b<K, T> {

        /* renamed from: c  reason: collision with root package name */
        final c<T, K> f13644c;

        protected b(K k, c<T, K> cVar) {
            super(k);
            this.f13644c = cVar;
        }

        public static <T, K> b<K, T> d(K k, int i, a<?, K, T> aVar, boolean z) {
            return new b<>(k, new c(i, aVar, k, z));
        }

        public void onComplete() {
            this.f13644c.c();
        }

        public void onError(Throwable th) {
            this.f13644c.d(th);
        }

        public void onNext(T t) {
            this.f13644c.e(t);
        }

        /* access modifiers changed from: protected */
        public void subscribeActual(s<? super T> sVar) {
            this.f13644c.subscribe(sVar);
        }
    }

    /* compiled from: ObservableGroupBy */
    static final class c<T, K> extends AtomicInteger implements d.a.y.b, q<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: b  reason: collision with root package name */
        final K f13645b;

        /* renamed from: c  reason: collision with root package name */
        final d.a.a0.f.c<T> f13646c;

        /* renamed from: d  reason: collision with root package name */
        final a<?, K, T> f13647d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f13648e;

        /* renamed from: f  reason: collision with root package name */
        volatile boolean f13649f;
        Throwable g;
        final AtomicBoolean h = new AtomicBoolean();
        final AtomicBoolean i = new AtomicBoolean();
        final AtomicReference<s<? super T>> j = new AtomicReference<>();

        c(int i2, a<?, K, T> aVar, K k, boolean z) {
            this.f13646c = new d.a.a0.f.c<>(i2);
            this.f13647d = aVar;
            this.f13645b = k;
            this.f13648e = z;
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z, boolean z2, s<? super T> sVar, boolean z3) {
            if (this.h.get()) {
                this.f13646c.clear();
                this.f13647d.a(this.f13645b);
                this.j.lazySet((Object) null);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.g;
                    if (th != null) {
                        this.f13646c.clear();
                        this.j.lazySet((Object) null);
                        sVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.j.lazySet((Object) null);
                        sVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.g;
                    this.j.lazySet((Object) null);
                    if (th2 != null) {
                        sVar.onError(th2);
                    } else {
                        sVar.onComplete();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            if (getAndIncrement() == 0) {
                d.a.a0.f.c<T> cVar = this.f13646c;
                boolean z = this.f13648e;
                s sVar = this.j.get();
                int i2 = 1;
                while (true) {
                    if (sVar != null) {
                        while (true) {
                            boolean z2 = this.f13649f;
                            T poll = cVar.poll();
                            boolean z3 = poll == null;
                            if (!a(z2, z3, sVar, z)) {
                                if (z3) {
                                    break;
                                }
                                sVar.onNext(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i2 = addAndGet(-i2);
                    if (i2 != 0) {
                        if (sVar == null) {
                            sVar = this.j.get();
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public void c() {
            this.f13649f = true;
            b();
        }

        public void d(Throwable th) {
            this.g = th;
            this.f13649f = true;
            b();
        }

        public void dispose() {
            if (this.h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.j.lazySet((Object) null);
                this.f13647d.a(this.f13645b);
            }
        }

        public void e(T t) {
            this.f13646c.offer(t);
            b();
        }

        public void subscribe(s<? super T> sVar) {
            if (this.i.compareAndSet(false, true)) {
                sVar.onSubscribe(this);
                this.j.lazySet(sVar);
                if (this.h.get()) {
                    this.j.lazySet((Object) null);
                } else {
                    b();
                }
            } else {
                d.m(new IllegalStateException("Only one Observer allowed!"), sVar);
            }
        }
    }

    public i1(q<T> qVar, n<? super T, ? extends K> nVar, n<? super T, ? extends V> nVar2, int i, boolean z) {
        super(qVar);
        this.f13635c = nVar;
        this.f13636d = nVar2;
        this.f13637e = i;
        this.f13638f = z;
    }

    public void subscribeActual(s<? super d.a.b0.b<K, V>> sVar) {
        this.f13338b.subscribe(new a(sVar, this.f13635c, this.f13636d, this.f13637e, this.f13638f));
    }
}
