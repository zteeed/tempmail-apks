package com.tempmail.n;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ToolbarContentBindingImpl */
public class t1 extends s1 {
    private static final ViewDataBinding.d u = null;
    private static final SparseIntArray v;
    private final ConstraintLayout s;
    private long t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v = sparseIntArray;
        sparseIntArray.put(R.id.tvEmailAddress, 1);
        v.put(R.id.tvTitle, 2);
    }

    public t1(e eVar, View view) {
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

    private t1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[1], objArr[2]);
        this.t = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.s = constraintLayout;
        constraintLayout.setTag((Object) null);
        x(view);
        p();
    }
}
