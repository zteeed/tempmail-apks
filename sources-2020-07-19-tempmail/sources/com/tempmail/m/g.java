package com.tempmail.m;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarMainBinding */
public abstract class g extends ViewDataBinding {
    public final AppBarLayout q;
    public final i r;
    public final Toolbar s;
    public final i1 t;

    protected g(Object obj, View view, int i, AppBarLayout appBarLayout, i iVar, Toolbar toolbar, i1 i1Var) {
        super(obj, view, i);
        this.q = appBarLayout;
        this.r = iVar;
        w(iVar);
        this.s = toolbar;
        this.t = i1Var;
        w(i1Var);
    }
}
