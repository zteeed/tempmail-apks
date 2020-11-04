package com.tempmail;

import android.view.MenuItem;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* compiled from: lambda */
public final /* synthetic */ class c implements NavigationView.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f12836a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f12837b;

    public /* synthetic */ c(MainActivity mainActivity, DrawerLayout drawerLayout) {
        this.f12836a = mainActivity;
        this.f12837b = drawerLayout;
    }

    public final boolean a(MenuItem menuItem) {
        return this.f12836a.z2(this.f12837b, menuItem);
    }
}
