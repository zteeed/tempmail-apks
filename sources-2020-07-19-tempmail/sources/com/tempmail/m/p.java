package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: DialogRewardedVideoBindingImpl */
public class p extends o {
    private static final SparseIntArray A;
    private static final ViewDataBinding.d z = null;
    private final ConstraintLayout x;
    private long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.constraintContent, 1);
        A.put(R.id.tvTitle, 2);
        A.put(R.id.tvMessage, 3);
        A.put(R.id.btnCancel, 4);
        A.put(R.id.btnWatchVideo, 5);
        A.put(R.id.frameAd, 6);
        A.put(R.id.tvAdTitle, 7);
    }

    public p(e eVar, View view) {
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

    private p(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[4], objArr[5], objArr[1], objArr[6], objArr[7], objArr[3], objArr[2]);
        this.y = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.x = constraintLayout;
        constraintLayout.setTag((Object) null);
        x(view);
        p();
    }
}
