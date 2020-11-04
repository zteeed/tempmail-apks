package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentEmailAddressBindingImpl */
public class b0 extends a0 {
    private static final ViewDataBinding.d L = null;
    private static final SparseIntArray M;
    private final NestedScrollView J;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.constraintMain, 1);
        M.put(R.id.tvTip, 2);
        M.put(R.id.btnChange, 3);
        M.put(R.id.ivReloadMain, 4);
        M.put(R.id.tvChange, 5);
        M.put(R.id.btnCheckEmail, 6);
        M.put(R.id.ivClouds, 7);
        M.put(R.id.ivEmail, 8);
        M.put(R.id.animationView, 9);
        M.put(R.id.tvEmail, 10);
        M.put(R.id.ivQrCode, 11);
        M.put(R.id.btnCopy, 12);
        M.put(R.id.ivBntCopy, 13);
        M.put(R.id.tvBntCopy, 14);
        M.put(R.id.btnEdit, 15);
        M.put(R.id.ivBntEdit, 16);
        M.put(R.id.tvBntEdit, 17);
        M.put(R.id.guidelineEmailLeft, 18);
        M.put(R.id.guidelineEmailRight, 19);
    }

    public b0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 20, L, M));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.K = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.K = 1;
        }
        v();
    }

    private b0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[9], objArr[3], objArr[6], objArr[12], objArr[15], objArr[1], objArr[18], objArr[19], objArr[13], objArr[16], objArr[7], objArr[8], objArr[11], objArr[4], objArr[14], objArr[17], objArr[5], objArr[10], objArr[2]);
        this.K = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.J = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        x(view);
        p();
    }
}
