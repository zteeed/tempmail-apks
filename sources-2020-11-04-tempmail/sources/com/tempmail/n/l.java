package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ContentMainBindingImpl */
public class l extends k {
    private static final ViewDataBinding.d w = null;
    private static final SparseIntArray x;
    private long v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        x = sparseIntArray;
        sparseIntArray.put(R.id.container, 1);
        x.put(R.id.frameAd, 2);
        x.put(R.id.placeSnackBar, 3);
        x.put(R.id.bottom_navigation, 4);
    }

    public l(e eVar, View view) {
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

    private l(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[4], objArr[1], objArr[0], objArr[2], objArr[3]);
        this.v = -1;
        this.s.setTag((Object) null);
        x(view);
        p();
    }
}
