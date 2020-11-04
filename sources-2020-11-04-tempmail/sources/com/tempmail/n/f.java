package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ActivitySecondOnBoardingBindingImpl */
public class f extends e {
    private static final ViewDataBinding.d H = null;
    private static final SparseIntArray I;
    private final NestedScrollView F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.pager, 1);
        I.put(R.id.tvSkip, 2);
        I.put(R.id.ivSkip, 3);
        I.put(R.id.ivDotOne, 4);
        I.put(R.id.ivDotTwo, 5);
        I.put(R.id.guidelineCenter, 6);
        I.put(R.id.ivDotThree, 7);
        I.put(R.id.ivDotFour, 8);
        I.put(R.id.tvCancel, 9);
        I.put(R.id.tvPremiumTip, 10);
        I.put(R.id.btnNext, 11);
        I.put(R.id.tvTos, 12);
        I.put(R.id.tvRestorePurchase, 13);
        I.put(R.id.guideline, 14);
        I.put(R.id.groupDots, 15);
    }

    public f(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 16, H, I));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.G = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.G != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.G = 1;
        }
        v();
    }

    private f(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[11], objArr[15], objArr[14], objArr[6], objArr[8], objArr[4], objArr[7], objArr[5], objArr[3], objArr[1], objArr[9], objArr[10], objArr[13], objArr[2], objArr[12]);
        this.G = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.F = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        x(view);
        p();
    }
}
