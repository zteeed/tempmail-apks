package com.tempmail;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.AdView;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.tempmail.q.i;
import com.tempmail.r.l;
import com.tempmail.t.n;
import com.tempmail.t.t;
import com.tempmail.utils.d;
import com.tempmail.utils.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import com.tempmail.utils.u;
import com.tempmail.utils.x;
import com.tempmail.utils.z.f;
import com.tempmail.v.j;

public class MainActivity extends n implements com.tempmail.utils.z.a {
    public static final String t0 = MainActivity.class.getSimpleName();
    TextView o0;
    View p0;
    BottomNavigationView q0;
    com.tempmail.n.a r0;
    float s0;

    class a extends androidx.appcompat.app.b {
        a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
            super(activity, drawerLayout, toolbar, i, i2);
        }

        public void a(View view) {
            super.a(view);
            MainActivity mainActivity = MainActivity.this;
            d.j(mainActivity.A, mainActivity.getString(R.string.analytics_menu));
        }

        public void b(View view) {
            super.b(view);
        }
    }

    class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12816a;

        b(String str) {
            this.f12816a = str;
        }

        public void a(int i) {
            MainActivity.this.G2();
            MainActivity.this.L(i.H2(this.f12816a), true);
        }

        public void b(int i) {
            MainActivity.this.G2();
        }
    }

    private void r2() {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.q0.getChildAt(0);
        View inflate = LayoutInflater.from(this).inflate(R.layout.view_notification_badge, bottomNavigationMenuView, false);
        this.p0 = inflate;
        this.o0 = (TextView) inflate.findViewById(R.id.tvCount);
        ((BottomNavigationItemView) bottomNavigationMenuView.getChildAt(1)).addView(this.p0);
    }

    public void A2() {
        BottomNavigationView bottomNavigationView = this.r0.q.r.q;
        this.q0 = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(new e(this));
        r2();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2() {
        /*
            r3 = this;
            java.lang.String r0 = t0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "isAdRemoved "
            r1.append(r2)
            r3.F0()
            boolean r2 = com.tempmail.utils.b.h(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tempmail.utils.m.b(r0, r1)
            boolean r0 = com.tempmail.utils.e.R()
            if (r0 == 0) goto L_0x002e
            r3.F0()
            boolean r0 = com.tempmail.utils.b.h(r3)
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            com.tempmail.n.a r1 = r3.r0
            com.google.android.material.navigation.NavigationView r1 = r1.s
            android.view.Menu r1 = r1.getMenu()
            r2 = 2131296530(0x7f090112, float:1.821098E38)
            android.view.MenuItem r1 = r1.findItem(r2)
            r1.setVisible(r0)
            com.android.billingclient.api.j r0 = r3.P
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "Consume remove ads (Delete purchase)"
            r1.setTitle(r0)
            goto L_0x0050
        L_0x004b:
            java.lang.String r0 = "Remove ad subscription is active"
            r1.setTitle(r0)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tempmail.MainActivity.B2():void");
    }

    public void C2() {
        boolean booleanValue = s.x(this).booleanValue();
        SwitchCompat switchCompat = (SwitchCompat) this.r0.s.getMenu().findItem(R.id.nav_push).getActionView().findViewById(R.id.switchAction);
        switchCompat.setChecked(booleanValue);
        switchCompat.setOnCheckedChangeListener(new f(this));
    }

    public void D2() {
        boolean z;
        String str = t0;
        StringBuilder sb = new StringBuilder();
        sb.append("isAdRemoved ");
        F0();
        sb.append(com.tempmail.utils.b.h(this));
        m.b(str, sb.toString());
        F0();
        if (e.P(this)) {
            F0();
            if (com.tempmail.utils.i.e(this)) {
                F0();
                if (!com.tempmail.utils.b.h(this)) {
                    z = true;
                    this.r0.s.getMenu().findItem(R.id.nav_remove_ad).setVisible(z);
                }
            }
        }
        z = false;
        this.r0.s.getMenu().findItem(R.id.nav_remove_ad).setVisible(z);
    }

    public void E2() {
        A0(this.r0.q.s);
        this.s0 = this.r0.q.t.r.getTextSize();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        a aVar = new a(this, drawerLayout, this.r0.q.s, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.a(aVar);
        aVar.i();
        this.r0.s.setItemIconTintList((ColorStateList) null);
        C2();
        F2();
        D2();
        B2();
        if (Build.VERSION.SDK_INT >= 29) {
            setDarkModeSwitch(this.r0.s.getMenu().findItem(R.id.nav_dark_mode).getActionView());
        } else {
            this.r0.s.getMenu().findItem(R.id.nav_dark_mode).setVisible(false);
        }
        this.r0.s.setNavigationItemSelectedListener(new c(this, drawerLayout));
    }

    public void F2() {
        if (!e.P(this)) {
            ((TextView) this.r0.s.getMenu().findItem(R.id.nav_premium).getActionView().findViewById(R.id.tvPremium)).setVisibility(0);
        }
    }

    public void G2() {
        m.b(t0, "showSelectedBottomNavigation");
        int selectedItemId = this.q0.getSelectedItemId();
        if ((K1() instanceof com.tempmail.p.e) && selectedItemId != R.id.email_address) {
            this.q0.setSelectedItemId(R.id.email_address);
        } else if ((K1() instanceof com.tempmail.r.n) && selectedItemId != R.id.inbox) {
            this.q0.setSelectedItemId(R.id.inbox);
        } else if ((K1() instanceof j) && selectedItemId != R.id.switch_email) {
            this.q0.setSelectedItemId(R.id.switch_email);
        }
    }

    public void W0() {
        F2();
        B2();
        D2();
    }

    public void X(int i) {
        this.q0.setVisibility(i);
    }

    public void Y(int i) {
        this.q0.setSelectedItemId(i);
    }

    public void a2(b.c.a.e.a.a.b bVar) {
        m.b(t0, "popupSnackbarForCompleteUpdate ");
        Snackbar w = Snackbar.w(this.r0.q.r.u, R.string.message_app_update_downloaded, -2);
        w.y(R.string.message_restart, new d(bVar));
        w.A(getResources().getColor(R.color.colorPrimary));
        w.s();
    }

    public void e1() {
        super.e1();
        u1(getString(R.string.message_remove_ad_error_title), 5);
    }

    public void f1() {
        super.f1();
        m.b(t0, "onAdRemoved");
        D2();
        B2();
        if (K1() instanceof com.tempmail.r.n) {
            ((com.tempmail.r.n) K1()).S2();
        }
        f2();
        com.tempmail.o.s.z2(getString(R.string.message_success), getString(R.string.message_ad_removed)).x2(k0(), com.tempmail.o.s.class.getSimpleName());
    }

    public void f2() {
        try {
            if (!isFinishing()) {
                runOnUiThread(new g(this));
            }
        } catch (Exception unused) {
        }
    }

    public void g2() {
        String str = t0;
        m.b(str, "showBanner " + (K1() instanceof com.tempmail.p.e));
        if (K1() instanceof com.tempmail.p.e) {
            s2(this.f0, this.r0.q.r.t);
            this.r0.q.r.t.setVisibility(0);
            return;
        }
        this.r0.q.r.t.setVisibility(8);
    }

    public void i2(int i) {
        q1(i);
        if (K1() instanceof com.tempmail.r.n) {
            m.b(t0, "instance of");
            ((com.tempmail.r.n) K1()).g3();
        } else if (K1() instanceof j) {
            ((j) K1()).L2();
        }
    }

    public void k(boolean z) {
        this.r0.q.r.t.setVisibility(z ? 0 : 8);
        if (z) {
            s2(this.f0, this.r0.q.r.t);
        }
    }

    public void l() {
        m.b(t0, "setActionBarTitle");
        androidx.appcompat.app.a u0 = u0();
        Fragment Y = k0().Y(R.id.container);
        if (u0 != null) {
            if (Y instanceof com.tempmail.r.n) {
                m.b(t0, "instance of MailsListFragment");
                u0.w(R.string.inbox_view_title);
                this.r0.q.t.r.setTextSize(0, getResources().getDimension(R.dimen.inbox_title_text_size));
                this.r0.q.t.q.setText(g.s(this.y).getFullEmailAddress());
                this.r0.q.t.q.setVisibility(0);
            } else if (Y instanceof j) {
                u0.w(R.string.switch_address_title);
                this.r0.q.t.r.setTextSize(0, this.s0);
                this.r0.q.t.q.setVisibility(8);
            } else {
                this.r0.q.t.r.setTextSize(0, this.s0);
                this.r0.q.t.q.setVisibility(8);
                u0.w(R.string.app_name);
            }
            String str = t0;
            m.b(str, "set title " + u0.k());
            this.r0.q.t.r.setText(u0.k());
        }
    }

    public void o(boolean z, String str) {
        com.tempmail.o.j R2 = com.tempmail.o.j.R2(this, getString(R.string.message_title_available_on_premium), getString(R.string.message_want_try), z);
        R2.N2(new b(str));
        try {
            R2.x2(k0(), com.tempmail.o.j.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3 && i2 == -1) {
            String stringExtra = intent.getStringExtra("extra_deep_link_ots");
            if (e.P(this)) {
                o(u2(), stringExtra);
            } else if (stringExtra != null) {
                String str = t0;
                m.b(str, "Scanned: " + stringExtra);
                ((t) this.F).e(s.L(this), stringExtra);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        m.b("BillingLifecycle", "MainActivity onCreate " + hashCode());
        super.onCreate(bundle);
        this.r0 = (com.tempmail.n.a) androidx.databinding.f.f(this, R.layout.activity_main);
        this.I = false;
        E2();
        A2();
        this.r0.t.setText(u.b(this, R.string.menu_app_version, x.f(this), x.g(this)));
        q1(e.q(this, this.y));
        L(com.tempmail.p.e.X2(), false);
        c2(getIntent());
        m2();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        String str = t0;
        StringBuilder sb = new StringBuilder();
        sb.append("device height ");
        F0();
        sb.append(x.B(this, (float) i));
        m.b(str, sb.toString());
        String str2 = t0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("device width dp ");
        F0();
        sb2.append(x.B(this, (float) i2));
        m.b(str2, sb2.toString());
        F0();
        if (com.tempmail.utils.b.i(this)) {
            Q1(x.j(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        G2();
    }

    public void q1(int i) {
        String str = t0;
        m.b(str, "show count " + i);
        me.leolin.shortcutbadger.b.a(this, i);
        if (i == 0) {
            this.p0.setVisibility(8);
            return;
        }
        this.p0.setVisibility(0);
        this.o0.setText(String.valueOf(i));
    }

    public void s2(AdView adView, LinearLayout linearLayout) {
        if (adView != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            String str = t0;
            StringBuilder sb = new StringBuilder();
            sb.append("adView.getParent()== null ");
            sb.append(adView.getParent() == null);
            m.b(str, sb.toString());
            if (adView.getParent() != null || linearLayout.getChildCount() >= 1) {
                m.b(t0, "main child >1");
                return;
            }
            m.b(t0, "main addView");
            linearLayout.addView(adView, 0, layoutParams);
        }
    }

    public String t() {
        Menu menu = this.q0.getMenu();
        String str = null;
        for (int i = 0; i < this.q0.getMenu().size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isChecked()) {
                str = (String) item.getTitle();
            }
        }
        return str;
    }

    public void t2() {
        startActivityForResult(new Intent(this, ScanActivity.class), 3);
    }

    public boolean u2() {
        return false;
    }

    public /* synthetic */ void w2() {
        try {
            m.b(t0, "remove view");
            this.r0.q.r.t.removeViewAt(0);
            this.f0 = null;
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ boolean x2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.email_address) {
            if (!(K1() instanceof com.tempmail.p.e)) {
                L(com.tempmail.p.e.X2(), false);
                if (com.tempmail.utils.b.j(this)) {
                    F0();
                    com.tempmail.utils.b.q(this, this.W);
                }
            }
            m.b(t0, "choose email");
            return true;
        } else if (itemId == R.id.inbox) {
            if (!(K1() instanceof com.tempmail.r.n)) {
                L(com.tempmail.r.n.O2(), false);
            }
            m.b(t0, "choose inbox");
            return true;
        } else if (itemId != R.id.switch_email) {
            return true;
        } else {
            if (e.P(this)) {
                o(u2(), (String) null);
            } else if (!(K1() instanceof j)) {
                L(j.A2(), false);
            }
            m.b(t0, "switch email");
            return true;
        }
    }

    public View y() {
        return this.r0.q.r.r;
    }

    public /* synthetic */ void y2(CompoundButton compoundButton, boolean z) {
        s.r0(this, z);
        e.c(this, z);
        l lVar = this.F;
        if (lVar instanceof t) {
            ((t) lVar).b(z);
        }
        if (z) {
            d.j(this.A, getString(R.string.analytics_menu_notifications_on));
        } else {
            d.j(this.A, getString(R.string.analytics_menu_notifications_off));
        }
    }

    public /* synthetic */ boolean z2(DrawerLayout drawerLayout, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_about /*2131296529*/:
                d.j(this.A, getString(R.string.analytics_menu_about_us));
                x.A(this, getString(R.string.about_link));
                return true;
            case R.id.nav_consume_remove_ad /*2131296530*/:
                Q0();
                return true;
            case R.id.nav_feedback /*2131296532*/:
                d.j(this.A, getString(R.string.analytics_menu_feedback));
                x.E(this, getString(R.string.support_email), t());
                return true;
            case R.id.nav_premium /*2131296533*/:
                d.j(this.A, getString(R.string.analytics_menu_upgrade_premium));
                if (e.P(this)) {
                    L(i.G2(), true);
                } else {
                    s1((f) null);
                }
                drawerLayout.h();
                return true;
            case R.id.nav_privacy_policy /*2131296534*/:
                x.A(this, getString(R.string.privacy_link));
                return true;
            case R.id.nav_push /*2131296535*/:
                break;
            case R.id.nav_rate /*2131296536*/:
                d.j(this.A, getString(R.string.analytics_menu_rate_us));
                k2();
                break;
            case R.id.nav_remove_ad /*2131296537*/:
                P0();
                drawerLayout.h();
                return true;
            case R.id.nav_restore /*2131296538*/:
                d.j(this.A, getString(R.string.analytics_menu_restore));
                drawerLayout.h();
                this.E = true;
                v1();
                return true;
            case R.id.nav_scan /*2131296539*/:
                t2();
                drawerLayout.h();
                return true;
            case R.id.nav_tos /*2131296540*/:
                x.A(this, getString(R.string.tos_link));
                return true;
            default:
                return false;
        }
        return true;
    }
}
