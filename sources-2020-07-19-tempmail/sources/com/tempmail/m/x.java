package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentChangeEmailBindingImpl */
public class x extends w {
    private static final ViewDataBinding.d C = null;
    private static final SparseIntArray D;
    private long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.guidelineLeftVertical, 1);
        D.put(R.id.guidelineRightVertical, 2);
        D.put(R.id.tvTitle, 3);
        D.put(R.id.tvTip, 4);
        D.put(R.id.edtLogin, 5);
        D.put(R.id.tvChooseDomains, 6);
        D.put(R.id.rvDomains, 7);
        D.put(R.id.elvMain, 8);
        D.put(R.id.btnSave, 9);
        D.put(R.id.groupDomainsTablet, 10);
    }

    public x(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 11, C, D));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.B = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.B = 1;
        }
        v();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private x(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[9], objArr[0], objArr[5], objArr[8], objArr[10], objArr[1], objArr[2], objArr[7], objArr[6], objArr[4], objArr[3]);
        this.B = -1;
        this.r.setTag((Object) null);
        x(view);
        p();
    }
}
