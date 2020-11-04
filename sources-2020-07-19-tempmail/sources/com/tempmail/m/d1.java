package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: ItemMailBindingImpl */
public class d1 extends c1 {
    private static final ViewDataBinding.d C = null;
    private static final SparseIntArray D;
    private long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.view_background, 1);
        D.put(R.id.ivDelete, 2);
        D.put(R.id.llItemMain, 3);
        D.put(R.id.animationView, 4);
        D.put(R.id.constraintMail, 5);
        D.put(R.id.ivPoint, 6);
        D.put(R.id.tvSubject, 7);
        D.put(R.id.tvText, 8);
        D.put(R.id.tvTime, 9);
        D.put(R.id.ivAttachment, 10);
    }

    public d1(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 11, C, D));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.B = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.B = 1;
        }
        v();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d1(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[4], objArr[5], objArr[10], objArr[2], objArr[6], objArr[3], objArr[0], objArr[7], objArr[8], objArr[9], objArr[1]);
        this.B = -1;
        this.w.setTag((Object) null);
        x(view);
        p();
    }
}
