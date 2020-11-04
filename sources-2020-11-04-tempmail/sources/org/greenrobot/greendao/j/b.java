package org.greenrobot.greendao.j;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.greendao.j.a;

/* compiled from: AbstractQueryData */
abstract class b<T, Q extends a<T>> {

    /* renamed from: a  reason: collision with root package name */
    final String f15118a;

    /* renamed from: b  reason: collision with root package name */
    final org.greenrobot.greendao.a<T, ?> f15119b;

    /* renamed from: c  reason: collision with root package name */
    final String[] f15120c;

    /* renamed from: d  reason: collision with root package name */
    final Map<Long, WeakReference<Q>> f15121d = new HashMap();

    b(org.greenrobot.greendao.a<T, ?> aVar, String str, String[] strArr) {
        this.f15119b = aVar;
        this.f15118a = str;
        this.f15120c = strArr;
    }

    /* access modifiers changed from: protected */
    public abstract Q a();

    /* access modifiers changed from: package-private */
    public Q b() {
        Q q;
        long id = Thread.currentThread().getId();
        synchronized (this.f15121d) {
            WeakReference weakReference = this.f15121d.get(Long.valueOf(id));
            q = weakReference != null ? (a) weakReference.get() : null;
            if (q == null) {
                d();
                q = a();
                this.f15121d.put(Long.valueOf(id), new WeakReference(q));
            } else {
                System.arraycopy(this.f15120c, 0, q.f15116d, 0, this.f15120c.length);
            }
        }
        return q;
    }

    /* access modifiers changed from: package-private */
    public Q c(Q q) {
        if (Thread.currentThread() != q.f15117e) {
            return b();
        }
        String[] strArr = this.f15120c;
        System.arraycopy(strArr, 0, q.f15116d, 0, strArr.length);
        return q;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        synchronized (this.f15121d) {
            Iterator<Map.Entry<Long, WeakReference<Q>>> it = this.f15121d.entrySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next().getValue()).get() == null) {
                    it.remove();
                }
            }
        }
    }
}
