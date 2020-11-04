package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ActivityScanBindingImpl */
public class d extends c {
    private static final ViewDataBinding.d u = null;
    private static final SparseIntArray v;
    private long t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v = sparseIntArray;
        sparseIntArray.put(R.id.tvScanTip, 1);
        v.put(R.id.barcode_scanner, 2);
    }

    public d(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 3, u, v));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.t = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.t != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.t = 1;
        }
        v();
    }

    private d(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[2], objArr[0], objArr[1]);
        this.t = -1;
        this.r.setTag((Object) null);
        x(view);
        p();
    }
}
