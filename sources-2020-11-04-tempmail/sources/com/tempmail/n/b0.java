package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentDialogPremiumBindingImpl */
public class b0 extends a0 {
    private static final SparseIntArray A;
    private static final ViewDataBinding.d z = null;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.constraintContent, 1);
        A.put(R.id.tvTitle, 2);
        A.put(R.id.tvMessage, 3);
        A.put(R.id.llButtonsHorizontal, 4);
        A.put(R.id.tvYes, 5);
        A.put(R.id.ivPremium, 6);
        A.put(R.id.viewCenter, 7);
    }

    public b0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 8, z, A));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.y = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.y != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.y = 1;
        }
        v();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[0], objArr[6], objArr[4], objArr[3], objArr[2], objArr[5], objArr[7]);
        this.y = -1;
        this.r.setTag((Object) null);
        View view2 = view;
        x(view);
        p();
    }
}
