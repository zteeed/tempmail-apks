package com.tempmail.n;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: AppBarMainBinding */
public abstract class i extends ViewDataBinding {
    public final AppBarLayout q;
    public final k r;
    public final Toolbar s;
    public final s1 t;

    protected i(Object obj, View view, int i, AppBarLayout appBarLayout, k kVar, Toolbar toolbar, s1 s1Var) {
        super(obj, view, i);
        this.q = appBarLayout;
        this.r = kVar;
        w(kVar);
        this.s = toolbar;
        this.t = s1Var;
        w(s1Var);
    }
}
