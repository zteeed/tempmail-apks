package com.tempmail;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tempmail.n.k;
import com.tempmail.n.t;
import com.tempmail.p.e;
import com.tempmail.q.l;
import com.tempmail.q.n;
import com.tempmail.s.h;
import com.tempmail.u.j;
import com.tempmail.utils.d;
import com.tempmail.utils.g;
import com.tempmail.utils.i;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import com.tempmail.utils.w;
import com.tempmail.utils.z.f;

public class MainActivity extends h implements com.tempmail.utils.z.a {
    public static final String e0 = MainActivity.class.getSimpleName();
    TextView Z;
    View a0;
    BottomNavigationView b0;
    com.tempmail.m.a c0;
    float d0;

    class a extends androidx.appcompat.app.b {
        a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
            super(activity, drawerLayout, toolbar, i, i2);
        }

        public void a(View view) {
            super.a(view);
            MainActivity mainActivity = MainActivity.this;
            d.e(mainActivity.v, mainActivity.getString(R.string.analytics_menu));
        }

        public void b(View view) {
            super.b(view);
        }
    }

    class b implements f {
        b() {
        }

        public void a(int i) {
            MainActivity.this.g2();
            MainActivity.this.M(e.r2(), true);
        }

        public void b(int i) {
            MainActivity.this.g2();
        }
    }

    private void W1() {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.b0.getChildAt(0);
        View inflate = LayoutInflater.from(this).inflate(R.layout.view_notification_badge, bottomNavigationMenuView, false);
        this.a0 = inflate;
        this.Z = (TextView) inflate.findViewById(R.id.tvCount);
        ((BottomNavigationItemView) bottomNavigationMenuView.getChildAt(1)).addView(this.a0);
    }

    public void N1(int i) {
        f1(i);
        if (w1() instanceof n) {
            m.b(e0, "instance of");
            ((n) w1()).Z2();
        } else if (w1() instanceof j) {
            ((j) w1()).C2();
        }
    }

    public void S(boolean z) {
        k N2 = k.N2(this, getString(R.string.message_title_available_on_premium), getString(R.string.message_want_try), z);
        N2.J2(new b());
        try {
            N2.r2(k0(), k.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void X0() {
        super.X0();
        i1(getString(R.string.message_remove_ad_error_title), 5);
    }

    public void X1() {
        startActivityForResult(new Intent(this, ScanActivity.class), 3);
    }

    public void Y(int i) {
        this.b0.setVisibility(i);
    }

    public void Y0() {
        super.Y0();
        e2();
        t.t2(getString(R.string.message_success), getString(R.string.message_ad_removed)).r2(k0(), t.class.getSimpleName());
    }

    public boolean Y1() {
        return false;
    }

    public void Z(int i) {
        this.b0.setSelectedItemId(i);
    }

    public /* synthetic */ boolean Z1(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.email_address) {
            if (!(w1() instanceof com.tempmail.o.d)) {
                M(com.tempmail.o.d.K2(), false);
                if (com.tempmail.utils.b.j(this)) {
                    G0();
                    com.tempmail.utils.b.q(this, this.S);
                }
            }
            m.b(e0, "choose email");
            return true;
        } else if (itemId == R.id.inbox) {
            if (!(w1() instanceof n)) {
                M(n.H2(), false);
            }
            m.b(e0, "choose inbox");
            return true;
        } else if (itemId != R.id.switch_email) {
            return true;
        } else {
            if (com.tempmail.utils.e.O(this)) {
                S(Y1());
            } else if (!(w1() instanceof j)) {
                M(j.s2(), false);
            }
            m.b(e0, "switch email");
            return true;
        }
    }

    public /* synthetic */ void a2(CompoundButton compoundButton, boolean z) {
        s.p0(this, z);
        com.tempmail.utils.e.c(this, z);
        l lVar = this.C;
        if (lVar instanceof com.tempmail.s.n) {
            ((com.tempmail.s.n) lVar).d(z);
        }
        if (z) {
            d.e(this.v, getString(R.string.analytics_menu_notifications_on));
        } else {
            d.e(this.v, getString(R.string.analytics_menu_notifications_off));
        }
    }

    public void b1() {
        if (!com.tempmail.utils.e.O(this)) {
            ((TextView) this.c0.s.getMenu().findItem(R.id.nav_premium).getActionView().findViewById(R.id.tvPremium)).setVisibility(0);
        }
    }

    public /* synthetic */ boolean b2(DrawerLayout drawerLayout, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_about /*2131296515*/:
                d.e(this.v, getString(R.string.analytics_menu_about_us));
                w.y(this, getString(R.string.about_link));
                return true;
            case R.id.nav_feedback /*2131296517*/:
                d.e(this.v, getString(R.string.analytics_menu_feedback));
                w.C(this, getString(R.string.support_email), u());
                return true;
            case R.id.nav_premium /*2131296518*/:
                d.e(this.v, getString(R.string.analytics_menu_upgrade_premium));
                if (com.tempmail.utils.e.O(this)) {
                    M(e.r2(), true);
                } else {
                    F((f) null);
                }
                drawerLayout.h();
                return true;
            case R.id.nav_privacy_policy /*2131296519*/:
                w.y(this, getString(R.string.privacy_link));
                return true;
            case R.id.nav_push /*2131296520*/:
                break;
            case R.id.nav_rate /*2131296521*/:
                d.e(this.v, getString(R.string.analytics_menu_rate_us));
                P1();
                break;
            case R.id.nav_remove_ad /*2131296522*/:
                R0();
                return true;
            case R.id.nav_restore /*2131296523*/:
                d.e(this.v, getString(R.string.analytics_menu_restore));
                drawerLayout.h();
                j1();
                return true;
            case R.id.nav_scan /*2131296524*/:
                if (com.tempmail.utils.e.O(this)) {
                    S(Y1());
                } else {
                    X1();
                }
                drawerLayout.h();
                return true;
            case R.id.nav_tos /*2131296525*/:
                w.y(this, getString(R.string.tos_link));
                return true;
            default:
                return false;
        }
        return true;
    }

    public void c2() {
        BottomNavigationView bottomNavigationView = this.c0.q.r.q;
        this.b0 = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(new d(this));
        W1();
    }

    public void d2() {
        boolean booleanValue = s.w(this).booleanValue();
        SwitchCompat switchCompat = (SwitchCompat) this.c0.s.getMenu().findItem(R.id.nav_push).getActionView().findViewById(R.id.switchAction);
        switchCompat.setChecked(booleanValue);
        switchCompat.setOnCheckedChangeListener(new e(this));
    }

    public void e2() {
        boolean z;
        String str = e0;
        StringBuilder sb = new StringBuilder();
        sb.append("isAdRemoved ");
        G0();
        sb.append(com.tempmail.utils.b.h(this));
        m.b(str, sb.toString());
        G0();
        if (com.tempmail.utils.e.O(this)) {
            G0();
            if (i.d(this)) {
                G0();
                if (!com.tempmail.utils.b.h(this)) {
                    z = true;
                    this.c0.s.getMenu().findItem(R.id.nav_remove_ad).setVisible(z);
                }
            }
        }
        z = false;
        this.c0.s.getMenu().findItem(R.id.nav_remove_ad).setVisible(z);
    }

    public void f1(int i) {
        String str = e0;
        m.b(str, "show count " + i);
        me.leolin.shortcutbadger.b.a(this, i);
        if (i == 0) {
            this.a0.setVisibility(8);
            return;
        }
        this.a0.setVisibility(0);
        this.Z.setText(String.valueOf(i));
    }

    public void f2() {
        B0(this.c0.q.s);
        this.d0 = this.c0.q.t.r.getTextSize();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        a aVar = new a(this, drawerLayout, this.c0.q.s, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(aVar);
        aVar.i();
        this.c0.s.setItemIconTintList((ColorStateList) null);
        d2();
        b1();
        e2();
        if (Build.VERSION.SDK_INT >= 29) {
            setDarkModeSwitch(this.c0.s.getMenu().findItem(R.id.nav_dark_mode).getActionView());
        } else {
            this.c0.s.getMenu().findItem(R.id.nav_dark_mode).setVisible(false);
        }
        this.c0.s.setNavigationItemSelectedListener(new c(this, drawerLayout));
    }

    public void g2() {
        m.b(e0, "showSelectedBottomNavigation");
        int selectedItemId = this.b0.getSelectedItemId();
        if ((w1() instanceof com.tempmail.o.d) && selectedItemId != R.id.email_address) {
            this.b0.setSelectedItemId(R.id.email_address);
        } else if ((w1() instanceof n) && selectedItemId != R.id.inbox) {
            this.b0.setSelectedItemId(R.id.inbox);
        } else if ((w1() instanceof j) && selectedItemId != R.id.switch_email) {
            this.b0.setSelectedItemId(R.id.switch_email);
        }
    }

    public void m() {
        m.b(e0, "setActionBarTitle");
        androidx.appcompat.app.a v0 = v0();
        Fragment e2 = k0().e(R.id.container);
        if (v0 != null) {
            if (e2 instanceof n) {
                m.b(e0, "instance of MailsListFragment");
                v0.w(R.string.inbox_view_title);
                this.c0.q.t.r.setTextSize(0, getResources().getDimension(R.dimen.inbox_title_text_size));
                this.c0.q.t.q.setText(g.t(this.t).p());
                this.c0.q.t.q.setVisibility(0);
            } else if (e2 instanceof j) {
                v0.w(R.string.switch_address_title);
                this.c0.q.t.r.setTextSize(0, this.d0);
                this.c0.q.t.q.setVisibility(8);
            } else {
                this.c0.q.t.r.setTextSize(0, this.d0);
                this.c0.q.t.q.setVisibility(8);
                v0.w(R.string.app_name);
            }
            String str = e0;
            m.b(str, "set title " + v0.k());
            this.c0.q.t.r.setText(v0.k());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 3 && i2 == -1 && (stringExtra = intent.getStringExtra("extra_deep_link_ots")) != null) {
            String str = e0;
            m.b(str, "Scanned: " + stringExtra);
            ((com.tempmail.s.n) this.C).e(s.L(this), stringExtra);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str = e0;
        m.b(str, "onCreate " + hashCode());
        super.onCreate(bundle);
        this.c0 = (com.tempmail.m.a) androidx.databinding.f.f(this, R.layout.activity_main);
        this.G = false;
        f2();
        c2();
        this.c0.t.setText(u.b(this, R.string.menu_app_version, w.f(this), w.g(this)));
        f1(com.tempmail.utils.e.q(this, this.t));
        M(com.tempmail.o.d.K2(), false);
        K1(getIntent());
        R1();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        g2();
    }

    public String u() {
        Menu menu = this.b0.getMenu();
        String str = null;
        for (int i = 0; i < this.b0.getMenu().size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isChecked()) {
                str = (String) item.getTitle();
            }
        }
        return str;
    }

    public View z() {
        return this.c0.q.r.r;
    }
}
