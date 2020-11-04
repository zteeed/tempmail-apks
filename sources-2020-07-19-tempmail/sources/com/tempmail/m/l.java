package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: DialogAdLayoutBindingImpl */
public class l extends k {
    private static final ViewDataBinding.d t = null;
    private static final SparseIntArray u;
    private long s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u = sparseIntArray;
        sparseIntArray.put(R.id.tvAdTitle, 1);
    }

    public l(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 2, t, u));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.s = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.s != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.s = 1;
        }
        v();
    }

    private l(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[0], objArr[1]);
        this.s = -1;
        this.q.setTag((Object) null);
        x(view);
        p();
    }
}
