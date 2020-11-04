package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: AppBarMainBindingImpl */
public class h extends g {
    private static final ViewDataBinding.d w;
    private static final SparseIntArray x;
    private final CoordinatorLayout u;
    private long v;

    static {
        ViewDataBinding.d dVar = new ViewDataBinding.d(5);
        w = dVar;
        dVar.a(0, new String[]{"content_main"}, new int[]{3}, new int[]{R.layout.content_main});
        w.a(1, new String[]{"toolbar_content"}, new int[]{2}, new int[]{R.layout.toolbar_content});
        SparseIntArray sparseIntArray = new SparseIntArray();
        x = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 4);
    }

    public h(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 5, w, x));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.v = 0;
        }
        ViewDataBinding.i(this.t);
        ViewDataBinding.i(this.r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r6.r.o() == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.t.o() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.v     // Catch:{ all -> 0x0021 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            com.tempmail.m.i1 r0 = r6.t
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0016
            return r4
        L_0x0016:
            com.tempmail.m.i r0 = r6.r
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x001f
            return r4
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.m.h.o():boolean");
    }

    public void p() {
        synchronized (this) {
            this.v = 4;
        }
        this.t.p();
        this.r.p();
        v();
    }

    private h(e eVar, View view, Object[] objArr) {
        super(eVar, view, 2, objArr[4], objArr[3], objArr[1], objArr[2]);
        this.v = -1;
        CoordinatorLayout coordinatorLayout = objArr[0];
        this.u = coordinatorLayout;
        coordinatorLayout.setTag((Object) null);
        this.s.setTag((Object) null);
        x(view);
        p();
    }
}
