package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentSecondOnBoardingTwoBindingImpl */
public class z0 extends y0 {
    private static final ViewDataBinding.d v = null;
    private static final SparseIntArray w;
    private final ConstraintLayout t;
    private long u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        w = sparseIntArray;
        sparseIntArray.put(R.id.ivOnBoardingPicture, 1);
        w.put(R.id.tvTitle, 2);
        w.put(R.id.tvMessage, 3);
    }

    public z0(e eVar, View view) {
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

    private z0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[3], objArr[2]);
        this.u = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.t = constraintLayout;
        constraintLayout.setTag((Object) null);
        x(view);
        p();
    }
}
