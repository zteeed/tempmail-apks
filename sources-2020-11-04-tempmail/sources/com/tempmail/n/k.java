package com.tempmail.n;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* compiled from: ContentMainBinding */
public abstract class k extends ViewDataBinding {
    public final BottomNavigationView q;
    public final FrameLayout r;
    public final RelativeLayout s;
    public final LinearLayout t;
    public final CoordinatorLayout u;

    protected k(Object obj, View view, int i, BottomNavigationView bottomNavigationView, FrameLayout frameLayout, RelativeLayout relativeLayout, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout) {
        super(obj, view, i);
        this.q = bottomNavigationView;
        this.r = frameLayout;
        this.s = relativeLayout;
        this.t = linearLayout;
        this.u = coordinatorLayout;
    }
}
