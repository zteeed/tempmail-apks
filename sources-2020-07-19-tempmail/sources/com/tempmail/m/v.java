package com.tempmail.m;

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
public class v extends u {
    private static final ViewDataBinding.d W = null;
    private static final SparseIntArray X;
    private final NestedScrollView U;
    private long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(R.id.constraintMain, 4);
        X.put(R.id.leftGuidLine, 5);
        X.put(R.id.rightGuidLine, 6);
        X.put(R.id.ivClose, 7);
        X.put(R.id.ivLogo, 8);
        X.put(R.id.tvTitle, 9);
        X.put(R.id.tvTrialTip, 10);
        X.put(R.id.tvTrialCharge, 11);
        X.put(R.id.btnSecond, 12);
        X.put(R.id.tvBilled, 13);
        X.put(R.id.tvWhyPremium, 14);
        X.put(R.id.ivCheckOne, 15);
        X.put(R.id.tvReasonOne, 16);
        X.put(R.id.ivCheckTwo, 17);
        X.put(R.id.ivCheckThree, 18);
        X.put(R.id.ivCheckFour, 19);
        X.put(R.id.ivCheckFive, 20);
        X.put(R.id.tvReasonFive, 21);
        X.put(R.id.ivCheckSix, 22);
        X.put(R.id.tvReasonSix, 23);
        X.put(R.id.ivCheckSeven, 24);
        X.put(R.id.tvReasonSeven, 25);
        X.put(R.id.tvTos, 26);
        X.put(R.id.tvRestorePurchase, 27);
        X.put(R.id.rightGuidelineWhyPremium, 28);
        X.put(R.id.leftGuideLineWhyPremium, 29);
        X.put(R.id.centerGuideline, 30);
    }

    public v(e eVar, View view) {
        this(eVar, view, ViewDataBinding.s(eVar, view, 31, W, X));
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
            j = this.V;
            this.V = 0;
        }
        int i4 = ((j & 1) > 0 ? 1 : ((j & 1) == 0 ? 0 : -1));
        if (!(i4 == 0 || i4 == 0)) {
            if (com.tempmail.utils.e.P()) {
                j3 = j | 4 | 16;
                j2 = 64;
            } else {
                j3 = j | 2 | 8;
                j2 = 32;
            }
            j = j3 | j2;
        }
        if ((j & 1) != 0) {
            TextView textView = this.I;
            if (com.tempmail.utils.e.P()) {
                resources = this.I.getResources();
                i = R.string.premium_10mm_why_line_4;
            } else {
                resources = this.I.getResources();
                i = R.string.premium_why_line_4;
            }
            a.b(textView, resources.getString(i));
            TextView textView2 = this.M;
            if (com.tempmail.utils.e.P()) {
                resources2 = this.M.getResources();
                i2 = R.string.premium_10mm_why_line_3;
            } else {
                resources2 = this.M.getResources();
                i2 = R.string.premium_why_line_3;
            }
            a.b(textView2, resources2.getString(i2));
            TextView textView3 = this.N;
            if (com.tempmail.utils.e.P()) {
                resources3 = this.N.getResources();
                i3 = R.string.premium_10mm_why_line_2;
            } else {
                resources3 = this.N.getResources();
                i3 = R.string.premium_why_line_2;
            }
            a.b(textView3, resources3.getString(i3));
        }
    }

    public boolean o() {
        synchronized (this) {
            if (this.V != 0) {
                return true;
            }
            return false;
        }
    }

    public void p() {
        synchronized (this) {
            this.V = 1;
        }
        v();
    }

    private v(e eVar, View view, Object[] objArr) {
        super(eVar, view, 0, objArr[12], objArr[30], objArr[4], objArr[20], objArr[19], objArr[15], objArr[24], objArr[22], objArr[18], objArr[17], objArr[7], objArr[8], objArr[5], objArr[29], objArr[6], objArr[28], objArr[13], objArr[21], objArr[3], objArr[16], objArr[25], objArr[23], objArr[2], objArr[1], objArr[27], objArr[9], objArr[26], objArr[11], objArr[10], objArr[14]);
        this.V = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.U = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        this.I.setTag((Object) null);
        this.M.setTag((Object) null);
        this.N.setTag((Object) null);
        x(view);
        p();
    }
}
