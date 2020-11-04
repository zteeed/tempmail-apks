package com.tempmail.m;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* compiled from: ContentMainBinding */
public abstract class i extends ViewDataBinding {
    public final BottomNavigationView q;
    public final FrameLayout r;
    public final RelativeLayout s;

    protected i(Object obj, View view, int i, BottomNavigationView bottomNavigationView, FrameLayout frameLayout, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.q = bottomNavigationView;
        this.r = frameLayout;
        this.s = relativeLayout;
    }
}
