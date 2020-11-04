package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: SpinnerItemGroupBindingImpl */
public class h1 extends g1 {
    private static final ViewDataBinding.d v = null;
    private static final SparseIntArray w;
    private final ConstraintLayout t;
    private long u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w = sparseIntArray;
        sparseIntArray.put(R.id.tvDomain, 1);
        w.put(R.id.ivEmailExpireState, 2);
        w.put(R.id.ivDropdown, 3);
    }

    public h1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 4, v, w));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.u = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.u != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.u = 1;
        }
        v();
    }

    private h1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[3], objArr[2], objArr[1]);
        this.u = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.t = constraintLayout;
        constraintLayout.setTag((Object) null);
        x(view);
        p();
    }
}
