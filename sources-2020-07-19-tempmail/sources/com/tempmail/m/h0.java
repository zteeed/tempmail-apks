package com.tempmail.m;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import com.tempmail.R;

/* compiled from: FragmentMailBindingImpl */
public class h0 extends g0 {
    private static final ViewDataBinding.d O = null;
    private static final SparseIntArray P;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.guidelineLeftVertical, 1);
        P.put(R.id.guidelineRightVertical, 2);
        P.put(R.id.tvUserInitials, 3);
        P.put(R.id.tvFromName, 4);
        P.put(R.id.tvFromEmail, 5);
        P.put(R.id.line, 6);
        P.put(R.id.tvDateTitle, 7);
        P.put(R.id.tvDate, 8);
        P.put(R.id.line1, 9);
        P.put(R.id.tvSubjectTitle, 10);
        P.put(R.id.tvSubject, 11);
        P.put(R.id.line2, 12);
        P.put(R.id.webView, 13);
        P.put(R.id.progressBar, 14);
        P.put(R.id.constraintAttachments, 15);
        P.put(R.id.ivAttachment, 16);
        P.put(R.id.tvAttachment, 17);
        P.put(R.id.ivDropdown, 18);
        P.put(R.id.line3, 19);
        P.put(R.id.tvClose, 20);
        P.put(R.id.ivDelete, 21);
        P.put(R.id.tvDownload, 22);
    }

    public h0(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 23, O, P));
    }

    /* access modifiers changed from: protected */
    public void g() {
        synchronized (this) {
            this.N = 0;
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.N != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.N = 1;
        }
        v();
    }

    private h0(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[15], objArr[0], objArr[1], objArr[2], objArr[16], objArr[21], objArr[18], objArr[6], objArr[9], objArr[12], objArr[19], objArr[14], objArr[17], objArr[20], objArr[8], objArr[7], objArr[22], objArr[5], objArr[4], objArr[11], objArr[10], objArr[3], objArr[13]);
        this.N = -1;
        this.r.setTag((Object) null);
        x(view);
        p();
    }
}
