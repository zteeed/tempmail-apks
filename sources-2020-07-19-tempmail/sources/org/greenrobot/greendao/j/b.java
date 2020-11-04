package org.greenrobot.greendao.j;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.greendao.j.a;

/* compiled from: AbstractQueryData */
abstract class b<T, Q extends a<T>> {

    /* renamed from: a  reason: collision with root package name */
    final String f14549a;

    /* renamed from: b  reason: collision with root package name */
    final org.greenrobot.greendao.a<T, ?> f14550b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f14551c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Long, WeakReference<Q>> f14552d = new HashMap();

    b(org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        this.f14550b = aVar;
        this.f14549a = str;
        this.f14551c = strArr;
    }

    /* access modifiers changed from: protected */
    public abstract Q a();

    /* access modifiers changed from: package-private */
    public Q b() {
        Q q;
        long id = Thread.currentThread().getId();
        synchronized (this.f14552d) {
            WeakReference weakReference = this.f14552d.get(Long.valueOf(id));
            q = weakReference != null ? (a) weakReference.get() : null;
            if (q == null) {
                d();
                q = a();
                this.f14552d.put(Long.valueOf(id), new WeakReference(q));
            } else {
                System.arraycopy(this.f14551c, 0, q.f14547d, 0, this.f14551c.length);
            }
        }
        return q;
    }

    /* access modifiers changed from: package-private */
    public Q c(Q q) {
        if (Thread.currentThread() != q.f14548e) {
            return b();
        }
        String[] strArr = this.f14551c;
        System.arraycopy(strArr, 0, q.f14547d, 0, strArr.length);
        return q;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        synchronized (this.f14552d) {
            Iterator<Map.Entry<Long, WeakReference<Q>>> it = this.f14552d.entrySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next().getValue()).get() == null) {
                    it.remove();
                }
            }
        }
    }
}
