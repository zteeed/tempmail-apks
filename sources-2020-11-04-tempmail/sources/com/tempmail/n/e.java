package com.tempmail.n;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;

/* compiled from: ActivitySecondOnBoardingBinding */
public abstract class e extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final Button q;
    public final Group r;
    public final Guideline s;
    public final Guideline t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final ViewPager z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected e(Object obj, View view, int i, Button button, Group group, Guideline guideline, Guideline guideline2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ViewPager viewPager, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.q = button;
        this.r = group;
        this.s = guideline;
        this.t = guideline2;
        this.u = imageView;
        this.v = imageView2;
        this.w = imageView3;
        this.x = imageView4;
        this.y = imageView5;
        this.z = viewPager;
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
    }
}
