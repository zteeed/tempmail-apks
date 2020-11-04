package com.tempmail.n;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DialogFragmentDownloadBinding */
public abstract class o extends ViewDataBinding {
    public final LinearLayout q;
    public final RecyclerView r;
    public final TextView s;
    public final TextView t;

    protected o(Object obj, View view, int i, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.q = linearLayout;
        this.r = recyclerView;
        this.s = textView;
        this.t = textView2;
    }
}
