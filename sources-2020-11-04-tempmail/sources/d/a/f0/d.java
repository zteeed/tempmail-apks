package d.a.f0;

import d.a.a0.c.f;
import d.a.a0.d.b;
import d.a.a0.f.c;
import d.a.l;
import d.a.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UnicastSubject */
public final class d<T> extends c<T> {

    /* renamed from: b  reason: collision with root package name */
    final c<T> f14533b;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<s<? super T>> f14534c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<Runnable> f14535d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f14536e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f14537f;
    volatile boolean g;
    Throwable h;
    final AtomicBoolean i;
    final b<T> j;
    boolean k;

    /* compiled from: UnicastSubject */
    final class a extends b<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        a() {
        }

        public void clear() {
            d.this.f14533b.clear();
        }

        public void dispose() {
            if (!d.this.f14537f) {
                d.this.f14537f = true;
                d.this.h();
                d.this.f14534c.lazySet((Object) null);
                if (d.this.j.getAndIncrement() == 0) {
                    d.this.f14534c.lazySet((Object) null);
                    d dVar = d.this;
                    if (!dVar.k) {
                        dVar.f14533b.clear();
                    }
                }
            }
        }

        public int g(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            d.this.k = true;
            return 2;
        }

        public boolean isEmpty() {
            return d.this.f14533b.isEmpty();
        }

        public T poll() throws Exception {
            return d.this.f14533b.poll();
        }
    }

    d(int i2, boolean z) {
        d.a.a0.b.b.f(i2, "capacityHint");
        this.f14533b = new c<>(i2);
        this.f14535d = new AtomicReference<>();
        this.f14536e = z;
        this.f14534c = new AtomicReference<>();
        this.i = new AtomicBoolean();
        this.j = new a();
    }

    public static <T> d<T> e() {
        return new d<>(l.bufferSize(), true);
    }

    public static <T> d<T> f(int i2) {
        return new d<>(i2, true);
    }

    public static <T> d<T> g(int i2, Runnable runnable) {
        return new d<>(i2, runnable, true);
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Runnable runnable = this.f14535d.get();
        if (runnable != null && this.f14535d.compareAndSet(runnable, (Object) null)) {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (this.j.getAndIncrement() == 0) {
            s sVar = this.f14534c.get();
            int i2 = 1;
            while (sVar == null) {
                i2 = this.j.addAndGet(-i2);
                if (i2 != 0) {
                    sVar = this.f14534c.get();
                } else {
                    return;
                }
            }
            if (this.k) {
                j(sVar);
            } else {
                k(sVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(s<? super T> sVar) {
        c<T> cVar = this.f14533b;
        int i2 = 1;
        boolean z = !this.f14536e;
        while (!this.f14537f) {
            boolean z2 = this.g;
            if (!z || !z2 || !m(cVar, sVar)) {
                sVar.onNext(null);
                if (z2) {
                    l(sVar);
                    return;
                }
                i2 = this.j.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f14534c.lazySet((Object) null);
    }

    /* access modifiers changed from: package-private */
    public void k(s<? super T> sVar) {
        c<T> cVar = this.f14533b;
        boolean z = !this.f14536e;
        boolean z2 = true;
        int i2 = 1;
        while (!this.f14537f) {
            boolean z3 = this.g;
            T poll = this.f14533b.poll();
            boolean z4 = poll == null;
            if (z3) {
                if (z && z2) {
                    if (!m(cVar, sVar)) {
                        z2 = false;
                    } else {
                        return;
                    }
                }
                if (z4) {
                    l(sVar);
                    return;
                }
            }
            if (z4) {
                i2 = this.j.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            } else {
                sVar.onNext(poll);
            }
        }
        this.f14534c.lazySet((Object) null);
        cVar.clear();
    }

    /* access modifiers changed from: package-private */
    public void l(s<? super T> sVar) {
        this.f14534c.lazySet((Object) null);
        Throwable th = this.h;
        if (th != null) {
            sVar.onError(th);
        } else {
            sVar.onComplete();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m(f<T> fVar, s<? super T> sVar) {
        Throwable th = this.h;
        if (th == null) {
            return false;
        }
        this.f14534c.lazySet((Object) null);
        fVar.clear();
        sVar.onError(th);
        return true;
    }

    public void onComplete() {
        if (!this.g && !this.f14537f) {
            this.g = true;
            h();
            i();
        }
    }

    public void onError(Throwable th) {
        d.a.a0.b.b.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.g || this.f14537f) {
            d.a.d0.a.s(th);
            return;
        }
        this.h = th;
        this.g = true;
        h();
        i();
    }

    public void onNext(T t) {
        d.a.a0.b.b.e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.g && !this.f14537f) {
            this.f14533b.offer(t);
            i();
        }
    }

    public void onSubscribe(d.a.y.b bVar) {
        if (this.g || this.f14537f) {
            bVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        if (this.i.get() || !this.i.compareAndSet(false, true)) {
            d.a.a0.a.d.m(new IllegalStateException("Only a single observer allowed."), sVar);
            return;
        }
        sVar.onSubscribe(this.j);
        this.f14534c.lazySet(sVar);
        if (this.f14537f) {
            this.f14534c.lazySet((Object) null);
        } else {
            i();
        }
    }

    d(int i2, Runnable runnable, boolean z) {
        d.a.a0.b.b.f(i2, "capacityHint");
        this.f14533b = new c<>(i2);
        d.a.a0.b.b.e(runnable, "onTerminate");
        this.f14535d = new AtomicReference<>(runnable);
        this.f14536e = z;
        this.f14534c = new AtomicReference<>();
        this.i = new AtomicBoolean();
        this.j = new a();
    }
}
