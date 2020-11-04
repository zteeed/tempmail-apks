package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ItemEmailAddressExpiredBindingImpl */
public class b1 extends a1 {
    private static final SparseIntArray A;
    private static final ViewDataBinding.d z = null;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.view_background, 1);
        A.put(R.id.ivDelete, 2);
        A.put(R.id.llItemMain, 3);
        A.put(R.id.tvEmailAddress, 4);
        A.put(R.id.tvNotActive, 5);
        A.put(R.id.ivEmailExpireState, 6);
        A.put(R.id.ivRestore, 7);
    }

    public b1(e eVar, View view) {
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
    private b1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[2], objArr[6], objArr[7], objArr[3], objArr[0], objArr[4], objArr[5], objArr[1]);
        this.y = -1;
        this.u.setTag((Object) null);
        View view2 = view;
        x(view);
        p();
    }
}
