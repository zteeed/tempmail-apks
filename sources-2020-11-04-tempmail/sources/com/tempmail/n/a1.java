package com.tempmail.n;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: FragmentSwitchEmailBinding */
public abstract class a1 extends ViewDataBinding {
    public final RecyclerView q;
    public final RecyclerView r;
    public final SwipeRefreshLayout s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;

    protected a1(Object obj, View view, int i, RecyclerView recyclerView, RecyclerView recyclerView2, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.q = recyclerView;
        this.r = recyclerView2;
        this.s = swipeRefreshLayout;
        this.t = textView;
        this.u = textView2;
        this.v = textView3;
        this.w = textView4;
    }
}
