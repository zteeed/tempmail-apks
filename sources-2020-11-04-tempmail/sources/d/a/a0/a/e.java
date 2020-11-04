package d.a.a0.a;

import d.a.a0.j.j;
import d.a.y.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ListCompositeDisposable */
public final class e implements b, b {

    /* renamed from: b  reason: collision with root package name */
    List<b> f13171b;

    /* renamed from: c  reason: collision with root package name */
    volatile boolean f13172c;

    public boolean a(b bVar) {
        if (!c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    public boolean b(b bVar) {
        d.a.a0.b.b.e(bVar, "d is null");
        if (!this.f13172c) {
            synchronized (this) {
                if (!this.f13172c) {
                    List list = this.f13171b;
                    if (list == null) {
                        list = new LinkedList();
                        this.f13171b = list;
                    }
                    list.add(bVar);
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
            java.lang.String r0 = "Disposable item is null"
            d.a.a0.b.b.e(r3, r0)
            boolean r0 = r2.f13172c
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f13172c     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<d.a.y.b> r0 = r2.f13171b     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: d.a.a0.a.e.c(d.a.y.b):boolean");
    }

    /* access modifiers changed from: package-private */
    public void d(List<b> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (b dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    a.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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

    public void dispose() {
        if (!this.f13172c) {
            synchronized (this) {
                if (!this.f13172c) {
                    this.f13172c = true;
                    List<b> list = this.f13171b;
                    this.f13171b = null;
                    d(list);
                }
            }
        }
    }
}
