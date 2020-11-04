package com.tempmail.n;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.h.a;
import com.tempmail.R;

/* compiled from: FragmentAdPremiumBindingImpl */
public class x extends w {
    private static final ViewDataBinding.d U = null;
    private static final SparseIntArray V;
    private final NestedScrollView S;
    private long T;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        V = sparseIntArray;
        sparseIntArray.put(R.id.constraintMain, 4);
        V.put(R.id.leftGuideLine, 5);
        V.put(R.id.rightGuideLine, 6);
        V.put(R.id.ivClose, 7);
        V.put(R.id.ivLogo, 8);
        V.put(R.id.tvTitle, 9);
        V.put(R.id.tvTrialTip, 10);
        V.put(R.id.btnSecond, 11);
        V.put(R.id.tvWhyPremium, 12);
        V.put(R.id.ivCheckOne, 13);
        V.put(R.id.tvReasonOne, 14);
        V.put(R.id.ivCheckTwo, 15);
        V.put(R.id.ivCheckThree, 16);
        V.put(R.id.ivCheckFour, 17);
        V.put(R.id.ivCheckFive, 18);
        V.put(R.id.tvReasonFive, 19);
        V.put(R.id.ivCheckSix, 20);
        V.put(R.id.tvReasonSix, 21);
        V.put(R.id.ivCheckSeven, 22);
        V.put(R.id.tvReasonSeven, 23);
        V.put(R.id.tvTos, 24);
        V.put(R.id.bottomLine, 25);
        V.put(R.id.tvRestorePurchase, 26);
        V.put(R.id.rightGuidelineWhyPremium, 27);
        V.put(R.id.leftGuideLineWhyPremium, 28);
    }

    public x(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 29, U, V));
    }

    /* access modifiers changed from: protected */
    public void g() {
        long j;
        int i;
        Resources resources;
        int i2;
        Resources resources2;
        int i3;
        Resources resources3;
        long j2;
        long j3;
        synchronized (this) {
            j = this.T;
            this.T = 0;
        }
        int i4 = ((j & 1) > 0 ? 1 : ((j & 1) == 0 ? 0 : -1));
        if (!(i4 == 0 || i4 == 0)) {
            if (com.tempmail.utils.e.Q()) {
                j3 = j | 4 | 16;
                j2 = 64;
            } else {
                j3 = j | 2 | 8;
                j2 = 32;
            }
            j = j3 | j2;
        }
        if ((j & 1) != 0) {
            TextView textView = this.H;
            if (com.tempmail.utils.e.Q()) {
                resources = this.H.getResources();
                i = R.string.premium_10mm_why_line_4;
            } else {
                resources = this.H.getResources();
                i = R.string.premium_why_line_4;
            }
            a.b(textView, resources.getString(i));
            TextView textView2 = this.L;
            if (com.tempmail.utils.e.Q()) {
                resources2 = this.L.getResources();
                i2 = R.string.premium_10mm_why_line_3;
            } else {
                resources2 = this.L.getResources();
                i2 = R.string.premium_why_line_3;
            }
            a.b(textView2, resources2.getString(i2));
            TextView textView3 = this.M;
            if (com.tempmail.utils.e.Q()) {
                resources3 = this.M.getResources();
                i3 = R.string.premium_10mm_why_line_2;
            } else {
                resources3 = this.M.getResources();
                i3 = R.string.premium_why_line_2;
            }
            a.b(textView3, resources3.getString(i3));
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.T != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.T = 1;
        }
        v();
    }

    private x(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[25], objArr[11], objArr[4], objArr[18], objArr[17], objArr[13], objArr[22], objArr[20], objArr[16], objArr[15], objArr[7], objArr[8], objArr[5], objArr[28], objArr[6], objArr[27], objArr[19], objArr[3], objArr[14], objArr[23], objArr[21], objArr[2], objArr[1], objArr[26], objArr[9], objArr[24], objArr[10], objArr[12]);
        this.T = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.S = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        this.H.setTag((Object) null);
        this.L.setTag((Object) null);
        this.M.setTag((Object) null);
        x(view);
        p();
    }
}
