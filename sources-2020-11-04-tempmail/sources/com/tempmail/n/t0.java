package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentSecondOnBoardingFourBindingImpl */
public class t0 extends s0 {
    private static final ViewDataBinding.d w = null;
    private static final SparseIntArray x;
    private final ConstraintLayout u;
    private long v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x = sparseIntArray;
        sparseIntArray.put(R.id.ivOnBoardingPicture, 1);
        x.put(R.id.tvTitle, 2);
        x.put(R.id.tvMessage, 3);
        x.put(R.id.ivClose, 4);
    }

    public t0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 5, w, x));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.v = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.v != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.v = 1;
        }
        v();
    }

    private t0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[4], objArr[1], objArr[3], objArr[2]);
        this.v = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.u = constraintLayout;
        constraintLayout.setTag((Object) null);
        x(view);
        p();
    }
}
