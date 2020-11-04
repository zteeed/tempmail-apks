package d.a.c0;

import d.a.a0.a.c;
import d.a.a0.j.a;
import d.a.a0.j.m;
import d.a.s;
import d.a.y.b;

/* compiled from: SerializedObserver */
public final class e<T> implements s<T>, b {

    /* renamed from: b  reason: collision with root package name */
    final s<? super T> f14500b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f14501c;

    /* renamed from: d  reason: collision with root package name */
    b f14502d;

    /* renamed from: e  reason: collision with root package name */
    boolean f14503e;

    /* renamed from: f  reason: collision with root package name */
    a<Object> f14504f;
    volatile boolean g;

    public e(s<? super T> sVar) {
        this(sVar, false);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f14504f;
                if (aVar == null) {
                    this.f14503e = false;
                    return;
                }
                this.f14504f = null;
            }
        } while (!aVar.a(this.f14500b));
    }

    public void dispose() {
        this.f14502d.dispose();
    }

    public void onComplete() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    if (this.f14503e) {
                        a<Object> aVar = this.f14504f;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.f14504f = aVar;
                        }
                        aVar.b(m.h());
                        return;
                    }
                    this.g = true;
                    this.f14503e = true;
                    this.f14500b.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        d.a.d0.a.s(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f14500b.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.g
            if (r0 == 0) goto L_0x0008
            d.a.d0.a.s(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.g     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f14503e     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.g = r1     // Catch:{ all -> 0x0044 }
            d.a.a0.j.a<java.lang.Object> r0 = r2.f14504f     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            d.a.a0.j.a r0 = new d.a.a0.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f14504f = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = d.a.a0.j.m.m(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f14501c     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.b(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.d(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.g = r1     // Catch:{ all -> 0x0044 }
            r2.f14503e = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            d.a.d0.a.s(r3)
            return
        L_0x003e:
            d.a.s<? super T> r0 = r2.f14500b
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.c0.e.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.g) {
            if (t == null) {
                this.f14502d.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.g) {
                    if (this.f14503e) {
                        a<Object> aVar = this.f14504f;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.f14504f = aVar;
                        }
                        m.r(t);
                        aVar.b(t);
                        return;
                    }
                    this.f14503e = true;
                    this.f14500b.onNext(t);
                    a();
                }
            }
        }
    }

    public void onSubscribe(b bVar) {
        if (c.p(this.f14502d, bVar)) {
            this.f14502d = bVar;
            this.f14500b.onSubscribe(this);
        }
    }

    public e(s<? super T> sVar, boolean z) {
        this.f14500b = sVar;
        this.f14501c = z;
    }
}
