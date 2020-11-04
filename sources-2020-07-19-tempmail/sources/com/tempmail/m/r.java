package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: DownloadItemBindingImpl */
public class r extends q {
    private static final ViewDataBinding.d x = null;
    private static final SparseIntArray y;
    private final ConstraintLayout v;
    private long w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(R.id.tvAttachmentName, 1);
        y.put(R.id.btnAction, 2);
        y.put(R.id.btn_download_again, 3);
        y.put(R.id.guidelineLeft, 4);
        y.put(R.id.guidelineRight, 5);
    }

    public r(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 6, x, y));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.w = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.w != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.w = 1;
        }
        v();
    }

    private r(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[2], objArr[3], objArr[4], objArr[5], objArr[1]);
        this.w = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.v = constraintLayout;
        constraintLayout.setTag((Object) null);
        x(view);
        p();
    }
}
