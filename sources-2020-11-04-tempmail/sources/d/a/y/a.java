package d.a.y;

import d.a.a0.a.b;
import d.a.a0.j.j;
import d.a.a0.j.o;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* compiled from: CompositeDisposable */
public final class a implements b, b {

    /* renamed from: b  reason: collision with root package name */
    o<b> f14372b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f14373c;

    public boolean a(b bVar) {
        if (!c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    public boolean b(b bVar) {
        d.a.a0.b.b.e(bVar, "disposable is null");
        if (!this.f14373c) {
            synchronized (this) {
                if (!this.f14373c) {
                    o<b> oVar = this.f14372b;
                    if (oVar == null) {
                        oVar = new o<>();
                        this.f14372b = oVar;
                    }
                    oVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(d.a.y.b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "disposables is null"
            d.a.a0.b.b.e(r3, r0)
            boolean r0 = r2.f14373c
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f14373c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            d.a.a0.j.o<d.a.y.b> r0 = r2.f14372b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.e(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.y.a.c(d.a.y.b):boolean");
    }

    public void d() {
        if (!this.f14373c) {
            synchronized (this) {
                if (!this.f14373c) {
                    o<b> oVar = this.f14372b;
                    this.f14372b = null;
                    e(oVar);
                }
            }
        }
    }

    public void dispose() {
        if (!this.f14373c) {
            synchronized (this) {
                if (!this.f14373c) {
                    this.f14373c = true;
                    o<b> oVar = this.f14372b;
                    this.f14372b = null;
                    e(oVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(o<b> oVar) {
        if (oVar != null) {
            ArrayList arrayList = null;
            for (Object obj : oVar.b()) {
                if (obj instanceof b) {
                    try {
                        ((b) obj).dispose();
                    } catch (Throwable th) {
                        io.reactivex.exceptions.a.b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw j.d((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }

    public boolean f() {
        return this.f14373c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g() {
        /*
            r2 = this;
            boolean r0 = r2.f14373c
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.f14373c     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x000d:
            d.a.a0.j.o<d.a.y.b> r0 = r2.f14372b     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            int r1 = r0.g()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.y.a.g():int");
    }
}
