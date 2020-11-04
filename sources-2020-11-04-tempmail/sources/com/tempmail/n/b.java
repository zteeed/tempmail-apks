package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ActivityMainBindingImpl */
public class b extends a {
    private static final ViewDataBinding.d v;
    private static final SparseIntArray w;
    private long u;

    static {
        ViewDataBinding.d dVar = new ViewDataBinding.d(4);
        v = dVar;
        dVar.a(0, new String[]{"app_bar_main"}, new int[]{1}, new int[]{R.layout.app_bar_main});
        SparseIntArray sparseIntArray = new SparseIntArray();
        w = sparseIntArray;
        sparseIntArray.put(R.id.nav_view, 2);
        w.put(R.id.tvAppVersion, 3);
    }

    public b(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 4, v, w));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.u = 0;
        }
        ViewDataBinding.i(this.q);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.q.o() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.u     // Catch:{ all -> 0x0018 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            com.tempmail.n.i r0 = r6.q
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.n.b.o():boolean");
    }

    public void p() {
        synchronized (this) {
            this.u = 2;
        }
        this.q.p();
        v();
    }

    private b(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, objArr[1], objArr[0], objArr[2], objArr[3]);
        this.u = -1;
        this.r.setTag((Object) null);
        x(view);
        p();
    }
}
