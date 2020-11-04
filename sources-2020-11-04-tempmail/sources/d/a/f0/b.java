package d.a.f0;

import d.a.a0.j.a;
import d.a.a0.j.m;
import d.a.s;

/* compiled from: SerializedSubject */
final class b<T> extends c<T> implements a.C0156a<Object> {

    /* renamed from: b  reason: collision with root package name */
    final c<T> f14529b;

    /* renamed from: c  reason: collision with root package name */
    boolean f14530c;

    /* renamed from: d  reason: collision with root package name */
    a<Object> f14531d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f14532e;

    b(c<T> cVar) {
        this.f14529b = cVar;
    }

    public boolean a(Object obj) {
        return m.g(obj, this.f14529b);
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f14531d;
                if (aVar == null) {
                    this.f14530c = false;
                    return;
                }
                this.f14531d = null;
            }
            aVar.c(this);
        }
        while (true) {
        }
    }

    public void onComplete() {
        if (!this.f14532e) {
            synchronized (this) {
                if (!this.f14532e) {
                    this.f14532e = true;
                    if (this.f14530c) {
                        a<Object> aVar = this.f14531d;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.f14531d = aVar;
                        }
                        aVar.b(m.h());
                        return;
                    }
                    this.f14530c = true;
                    this.f14529b.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        d.a.d0.a.s(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f14529b.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f14532e
            if (r0 == 0) goto L_0x0008
            d.a.d0.a.s(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f14532e     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            r2.f14532e = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f14530c     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002a
            d.a.a0.j.a<java.lang.Object> r0 = r2.f14531d     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0021
            d.a.a0.j.a r0 = new d.a.a0.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f14531d = r0     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.lang.Object r3 = d.a.a0.j.m.m(r3)     // Catch:{ all -> 0x003b }
            r0.d(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002a:
            r0 = 0
            r2.f14530c = r1     // Catch:{ all -> 0x003b }
            r1 = 0
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            d.a.d0.a.s(r3)
            return
        L_0x0035:
            d.a.f0.c<T> r0 = r2.f14529b
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.f0.b.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f14532e) {
            synchronized (this) {
                if (!this.f14532e) {
                    if (this.f14530c) {
                        a<Object> aVar = this.f14531d;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.f14531d = aVar;
                        }
                        m.r(t);
                        aVar.b(t);
                        return;
                    }
                    this.f14530c = true;
                    this.f14529b.onNext(t);
                    e();
                }
            }
        }
    }

    public void onSubscribe(d.a.y.b bVar) {
        boolean z = true;
        if (!this.f14532e) {
            synchronized (this) {
                if (!this.f14532e) {
                    if (this.f14530c) {
                        a<Object> aVar = this.f14531d;
                        if (aVar == null) {
                            aVar = new a<>(4);
                            this.f14531d = aVar;
                        }
                        aVar.b(m.k(bVar));
                        return;
                    }
                    this.f14530c = true;
                    z = false;
                }
            }
        }
        if (z) {
            bVar.dispose();
            return;
        }
        this.f14529b.onSubscribe(bVar);
        e();
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(s<? super T> sVar) {
        this.f14529b.subscribe(sVar);
    }
}
