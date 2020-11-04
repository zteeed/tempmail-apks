package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentInboxBindingImpl */
public class f0 extends e0 {
    private static final ViewDataBinding.d N = null;
    private static final SparseIntArray O;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.constraintMain, 1);
        O.put(R.id.noData, 2);
        O.put(R.id.guidelineLeftNoData, 3);
        O.put(R.id.guidelineRightNoData, 4);
        O.put(R.id.frameAd, 5);
        O.put(R.id.tvAdTitle, 6);
        O.put(R.id.tvNoData, 7);
        O.put(R.id.tvRefreshHint, 8);
        O.put(R.id.llRefreshNoData, 9);
        O.put(R.id.tvRefreshNoData, 10);
        O.put(R.id.noInternetConnection, 11);
        O.put(R.id.tvNoInternetConnection, 12);
        O.put(R.id.tryLater, 13);
        O.put(R.id.llRefresh, 14);
        O.put(R.id.tvRefresh, 15);
        O.put(R.id.rvMails, 16);
        O.put(R.id.progressBar, 17);
        O.put(R.id.leftGuideline, 18);
        O.put(R.id.rightGuideline, 19);
        O.put(R.id.topGuideline, 20);
        O.put(R.id.bottomGuideline, 21);
    }

    public f0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 22, N, O));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.M = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.M != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.M = 1;
        }
        v();
    }

    private f0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[21], objArr[1], objArr[5], objArr[3], objArr[4], objArr[18], objArr[14], objArr[9], objArr[2], objArr[11], objArr[17], objArr[19], objArr[16], objArr[0], objArr[20], objArr[13], objArr[6], objArr[7], objArr[12], objArr[15], objArr[8], objArr[10]);
        this.M = -1;
        this.D.setTag((Object) null);
        x(view);
        p();
    }
}
