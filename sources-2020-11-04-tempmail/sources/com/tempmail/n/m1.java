package com.tempmail.n;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.tempmail.utils.SwipeRevealLayout;

/* compiled from: ItemMailBinding */
public abstract class m1 extends ViewDataBinding {
    public final LinearLayout A;
    public final LottieAnimationView q;
    public final ConstraintLayout r;
    public final ImageView s;
    public final ImageView t;
    public final ImageView u;
    public final ConstraintLayout v;
    public final SwipeRevealLayout w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    protected m1(Object obj, View view, int i, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, SwipeRevealLayout swipeRevealLayout, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout) {
        super(obj, view, i);
        this.q = lottieAnimationView;
        this.r = constraintLayout;
        this.s = imageView;
        this.t = imageView2;
        this.u = imageView3;
        this.v = constraintLayout2;
        this.w = swipeRevealLayout;
        this.x = textView;
        this.y = textView2;
        this.z = textView3;
        this.A = linearLayout;
    }
}
