package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentHelpImproveDialogNewBindingImpl */
public class d0 extends c0 {
    private static final ViewDataBinding.d x = null;
    private static final SparseIntArray y;
    private long w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        y.put(R.id.tvSubTitle, 2);
        y.put(R.id.llButtonsHorizontal, 3);
        y.put(R.id.tvNo, 4);
        y.put(R.id.tvYes, 5);
    }

    public d0(e eVar, View view) {
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

    private d0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[0], objArr[3], objArr[4], objArr[2], objArr[1], objArr[5]);
        this.w = -1;
        this.q.setTag((Object) null);
        x(view);
        p();
    }
}
