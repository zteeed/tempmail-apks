package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentRewardedAdDialogBindingImpl */
public class p0 extends o0 {
    private static final ViewDataBinding.d F;
    private static final SparseIntArray G;
    private long E;

    static {
        ViewDataBinding.d dVar = new ViewDataBinding.d(14);
        F = dVar;
        dVar.a(0, new String[]{"dialog_ad_layout"}, new int[]{1}, new int[]{R.layout.dialog_ad_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.progressBar, 2);
        G.put(R.id.line, 3);
        G.put(R.id.constraintContent, 4);
        G.put(R.id.tvTitle, 5);
        G.put(R.id.tvMessage, 6);
        G.put(R.id.llButtonsHorizontal, 7);
        G.put(R.id.tvNo, 8);
        G.put(R.id.tvYes, 9);
        G.put(R.id.llButtonsVertical, 10);
        G.put(R.id.tvRemoveAds, 11);
        G.put(R.id.tvNoVertical, 12);
        G.put(R.id.tvYesVertical, 13);
    }

    public p0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 14, F, G));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.E = 0;
        }
        ViewDataBinding.i(this.s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r6.s.o() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean o() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.E     // Catch:{ all -> 0x0018 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            return r4
        L_0x000c:
            monitor-exit(r6)     // Catch:{ all -> 0x0018 }
            com.tempmail.m.k r0 = r6.s
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
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.m.p0.o():boolean");
    }

    public void p() {
        synchronized (this) {
            this.E = 2;
        }
        this.s.p();
        v();
    }

    private p0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 1, objArr[4], objArr[0], objArr[1], objArr[3], objArr[7], objArr[10], objArr[2], objArr[6], objArr[8], objArr[12], objArr[11], objArr[5], objArr[9], objArr[13]);
        this.E = -1;
        this.r.setTag((Object) null);
        x(view);
        p();
    }
}
