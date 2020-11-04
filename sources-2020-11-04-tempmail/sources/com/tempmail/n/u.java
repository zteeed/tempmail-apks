package com.tempmail.n;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentAdDialogBinding */
public abstract class u extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ConstraintLayout q;
    public final ConstraintLayout r;
    public final m s;
    public final View t;
    public final LinearLayout u;
    public final LinearLayout v;
    public final ProgressBar w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected u(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, m mVar, View view2, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.q = constraintLayout;
        this.r = constraintLayout2;
        this.s = mVar;
        w(mVar);
        this.t = view2;
        this.u = linearLayout;
        this.v = linearLayout2;
        this.w = progressBar;
        this.x = textView;
        this.y = textView2;
        this.z = textView3;
        this.A = textView4;
        this.B = textView5;
        this.C = textView6;
    }
}
