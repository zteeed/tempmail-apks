package d.a.a0.e.d;

import d.a.a0.a.c;
import d.a.l;
import d.a.s;
import d.a.t;
import d.a.z.f;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableRefCount */
public final class o2<T> extends l<T> {

    /* renamed from: b  reason: collision with root package name */
    final d.a.b0.a<T> f13346b;

    /* renamed from: c  reason: collision with root package name */
    final int f13347c;

    /* renamed from: d  reason: collision with root package name */
    final long f13348d;

    /* renamed from: e  reason: collision with root package name */
    final TimeUnit f13349e;

    /* renamed from: f  reason: collision with root package name */
    final t f13350f;
    a g;

    /* compiled from: ObservableRefCount */
    static final class a extends AtomicReference<d.a.y.b> implements Runnable, f<d.a.y.b> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: b  reason: collision with root package name */
        final o2<?> f13351b;

        /* renamed from: c  reason: collision with root package name */
        d.a.y.b f13352c;

        /* renamed from: d  reason: collision with root package name */
        long f13353d;

        /* renamed from: e  reason: collision with root package name */
        boolean f13354e;

        /* renamed from: f  reason: collision with root package name */
        boolean f13355f;

        a(o2<?> o2Var) {
            this.f13351b = o2Var;
        }

        /* renamed from: b */
        public void a(d.a.y.b bVar) throws Exception {
            c.h(this, bVar);
            synchronized (this.f13351b) {
                if (this.f13355f) {
                    ((d.a.a0.a.f) this.f13351b.f13346b).b(bVar);
                }
            }
        }

        public void run() {
            this.f13351b.h(this);
        }
    }

    /* compiled from: ObservableRefCount */
    static final class b<T> extends AtomicBoolean implements s<T>, d.a.y.b {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: b  reason: collision with root package name */
        final s<? super T> f13356b;

        /* renamed from: c  reason: collision with root package name */
        final o2<T> f13357c;

        /* renamed from: d  reason: collision with root package name */
        final a f13358d;

        /* renamed from: e  reason: collision with root package name */
        d.a.y.b f13359e;

        b(s<? super T> sVar, o2<T> o2Var, a aVar) {
            this.f13356b = sVar;
            this.f13357c = o2Var;
            this.f13358d = aVar;
        }

        public void dispose() {
            this.f13359e.dispose();
            if (compareAndSet(false, true)) {
                this.f13357c.d(this.f13358d);
            }
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f13357c.g(this.f13358d);
                this.f13356b.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f13357c.g(this.f13358d);
                this.f13356b.onError(th);
                return;
            }
            d.a.d0.a.s(th);
        }

        public void onNext(T t) {
            this.f13356b.onNext(t);
        }

        public void onSubscribe(d.a.y.b bVar) {
            if (c.p(this.f13359e, bVar)) {
                this.f13359e = bVar;
                this.f13356b.onSubscribe(this);
            }
        }
    }

    public o2(d.a.b0.a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, (t) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(d.a.a0.e.d.o2.a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            d.a.a0.e.d.o2$a r0 = r5.g     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003f
            d.a.a0.e.d.o2$a r0 = r5.g     // Catch:{ all -> 0x0041 }
            if (r0 == r6) goto L_0x000a
            goto L_0x003f
        L_0x000a:
            long r0 = r6.f13353d     // Catch:{ all -> 0x0041 }
            r2 = 1
            long r0 = r0 - r2
            r6.f13353d = r0     // Catch:{ all -> 0x0041 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            boolean r0 = r6.f13354e     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x001c
            goto L_0x003d
        L_0x001c:
            long r0 = r5.f13348d     // Catch:{ all -> 0x0041 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            r5.h(r6)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0027:
            d.a.a0.a.g r0 = new d.a.a0.a.g     // Catch:{ all -> 0x0041 }
            r0.<init>()     // Catch:{ all -> 0x0041 }
            r6.f13352c = r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            d.a.t r1 = r5.f13350f
            long r2 = r5.f13348d
            java.util.concurrent.TimeUnit r4 = r5.f13349e
            d.a.y.b r6 = r1.d(r6, r2, r4)
            r0.b(r6)
            return
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.e.d.o2.d(d.a.a0.e.d.o2$a):void");
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        d.a.y.b bVar = aVar.f13352c;
        if (bVar != null) {
            bVar.dispose();
            aVar.f13352c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar) {
        d.a.b0.a<T> aVar2 = this.f13346b;
        if (aVar2 instanceof d.a.y.b) {
            ((d.a.y.b) aVar2).dispose();
        } else if (aVar2 instanceof d.a.a0.a.f) {
            ((d.a.a0.a.f) aVar2).b((d.a.y.b) aVar.get());
        }
    }

    /* access modifiers changed from: package-private */
    public void g(a aVar) {
        synchronized (this) {
            if (this.f13346b instanceof h2) {
                if (this.g != null && this.g == aVar) {
                    this.g = null;
                    e(aVar);
                }
                long j = aVar.f13353d - 1;
                aVar.f13353d = j;
                if (j == 0) {
                    f(aVar);
                }
            } else if (this.g != null && this.g == aVar) {
                e(aVar);
                long j2 = aVar.f13353d - 1;
                aVar.f13353d = j2;
                if (j2 == 0) {
                    this.g = null;
                    f(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(a aVar) {
        synchronized (this) {
            if (aVar.f13353d == 0 && aVar == this.g) {
                this.g = null;
                d.a.y.b bVar = (d.a.y.b) aVar.get();
                c.f(aVar);
                if (this.f13346b instanceof d.a.y.b) {
                    ((d.a.y.b) this.f13346b).dispose();
                } else if (this.f13346b instanceof d.a.a0.a.f) {
                    if (bVar == null) {
                        aVar.f13355f = true;
                    } else {
                        ((d.a.a0.a.f) this.f13346b).b(bVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.g;
            if (aVar == null) {
                aVar = new a(this);
                this.g = aVar;
            }
            long j = aVar.f13353d;
            if (j == 0 && aVar.f13352c != null) {
                aVar.f13352c.dispose();
            }
            long j2 = j + 1;
            aVar.f13353d = j2;
            z = true;
            if (aVar.f13354e || j2 != ((long) this.f13347c)) {
                z = false;
            } else {
                aVar.f13354e = true;
            }
        }
        this.f13346b.subscribe(new b(sVar, this, aVar));
        if (z) {
            this.f13346b.d(aVar);
        }
    }

    public o2(d.a.b0.a<T> aVar, int i, long j, TimeUnit timeUnit, t tVar) {
        this.f13346b = aVar;
        this.f13347c = i;
        this.f13348d = j;
        this.f13349e = timeUnit;
        this.f13350f = tVar;
    }
}
