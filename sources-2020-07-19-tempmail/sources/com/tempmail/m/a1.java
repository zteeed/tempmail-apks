package com.tempmail.m;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.tempmail.utils.SwipeRevealLayout;

/* compiled from: ItemEmailAddressExpiredBinding */
public abstract class a1 extends ViewDataBinding {
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final ConstraintLayout t;
    public final SwipeRevealLayout u;
    public final TextView v;
    public final TextView w;
    public final LinearLayout x;

    protected a1(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, SwipeRevealLayout swipeRevealLayout, TextView textView, TextView textView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.q = imageView;
        this.r = imageView2;
        this.s = imageView3;
        this.t = constraintLayout;
        this.u = swipeRevealLayout;
        this.v = textView;
        this.w = textView2;
        this.x = linearLayout;
    }
}
