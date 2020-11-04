package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ContentMainBindingImpl */
public class j extends i {
    private static final ViewDataBinding.d u = null;
    private static final SparseIntArray v;
    private long t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v = sparseIntArray;
        sparseIntArray.put(R.id.bottom_navigation, 1);
        v.put(R.id.container, 2);
    }

    public j(e eVar, View view) {
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

    private j(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[2], objArr[0]);
        this.t = -1;
        this.s.setTag((Object) null);
        x(view);
        p();
    }
}
