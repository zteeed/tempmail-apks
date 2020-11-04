package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentUpdateAppVersionDialogBindingImpl */
public class h1 extends g1 {
    private static final ViewDataBinding.d x = null;
    private static final SparseIntArray y;
    private long w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        y.put(R.id.tvMessage, 2);
        y.put(R.id.tvPlayStore, 3);
        y.put(R.id.tvDownloadApk, 4);
        y.put(R.id.tvDismiss, 5);
    }

    public h1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 6, x, y));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.w = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.w != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.w = 1;
        }
        v();
    }

    private h1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[0], objArr[5], objArr[4], objArr[2], objArr[3], objArr[1]);
        this.w = -1;
        this.q.setTag((Object) null);
        x(view);
        p();
    }
}
