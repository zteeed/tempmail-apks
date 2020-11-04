package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentEmailAddressBindingImpl */
public class d0 extends c0 {
    private static final ViewDataBinding.d M = null;
    private static final SparseIntArray N;
    private final NestedScrollView K;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.constraintMain, 1);
        N.put(R.id.tvTip, 2);
        N.put(R.id.btnChange, 3);
        N.put(R.id.ivReloadMain, 4);
        N.put(R.id.tvChange, 5);
        N.put(R.id.btnCheckEmail, 6);
        N.put(R.id.ivClouds, 7);
        N.put(R.id.ivFrame, 8);
        N.put(R.id.ivEmail, 9);
        N.put(R.id.animationView, 10);
        N.put(R.id.tvEmail, 11);
        N.put(R.id.ivQrCode, 12);
        N.put(R.id.btnCopy, 13);
        N.put(R.id.ivBntCopy, 14);
        N.put(R.id.tvBntCopy, 15);
        N.put(R.id.btnEdit, 16);
        N.put(R.id.ivBntEdit, 17);
        N.put(R.id.tvBntEdit, 18);
        N.put(R.id.guidelineEmailLeft, 19);
        N.put(R.id.guidelineEmailRight, 20);
    }

    public d0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 21, M, N));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.L = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.L != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.L = 1;
        }
        v();
    }

    private d0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[10], objArr[3], objArr[6], objArr[13], objArr[16], objArr[1], objArr[19], objArr[20], objArr[14], objArr[17], objArr[7], objArr[9], objArr[8], objArr[12], objArr[4], objArr[15], objArr[18], objArr[5], objArr[11], objArr[2]);
        this.L = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.K = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        x(view);
        p();
    }
}
