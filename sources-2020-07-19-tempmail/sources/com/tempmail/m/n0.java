package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentRatingDialogNewBindingImpl */
public class n0 extends m0 {
    private static final ViewDataBinding.d y = null;
    private static final SparseIntArray z;
    private long x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(R.id.tvTitle, 1);
        z.put(R.id.tvSubTitle, 2);
        z.put(R.id.ratingBar, 3);
        z.put(R.id.llButtonsHorizontal, 4);
        z.put(R.id.tvNo, 5);
        z.put(R.id.tvYes, 6);
    }

    public n0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 7, y, z));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.x = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.x != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.x = 1;
        }
        v();
    }

    private n0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[0], objArr[4], objArr[3], objArr[5], objArr[2], objArr[1], objArr[6]);
        this.x = -1;
        this.q.setTag((Object) null);
        x(view);
        p();
    }
}
