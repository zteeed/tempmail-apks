package com.tempmail.m;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* compiled from: ActivityMainBinding */
public abstract class a extends ViewDataBinding {
    public final g q;
    public final DrawerLayout r;
    public final NavigationView s;
    public final TextView t;

    protected a(Object obj, View view, int i, g gVar, DrawerLayout drawerLayout, NavigationView navigationView, TextView textView) {
        super(obj, view, i);
        this.q = gVar;
        w(gVar);
        this.r = drawerLayout;
        this.s = navigationView;
        this.t = textView;
    }
}
