package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;

/* compiled from: NavigationMenu */
public class f extends h {
    public f(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        j jVar = (j) a(i, i2, i3, charSequence);
        h hVar = new h(w(), this, jVar);
        jVar.x(hVar);
        return hVar;
    }
}
