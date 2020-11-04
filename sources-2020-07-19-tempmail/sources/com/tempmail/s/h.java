package com.tempmail.s;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.SwitchCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.db.DomainTable;
import com.tempmail.db.e;
import com.tempmail.n.k;
import com.tempmail.n.n;
import com.tempmail.n.r;
import com.tempmail.n.t;
import com.tempmail.n.u;
import com.tempmail.n.v;
import com.tempmail.services.CheckNewEmailService;
import com.tempmail.splash.SplashActivity;
import com.tempmail.utils.i;
import com.tempmail.utils.s;
import com.tempmail.utils.w;
import com.tempmail.utils.z.j;
import com.tempmail.utils.z.m;
import com.tempmail.utils.z.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

@SuppressLint({"Registered"})
/* compiled from: BaseMainActivity */
public abstract class h extends i implements com.tempmail.utils.z.h, j, m, o, com.tempmail.utils.z.c, o {
    public static final String Y = h.class.getSimpleName();
    public e J;
    boolean K = false;
    com.tempmail.p.d L;
    f M;
    List<String> N;
    u O;
    boolean P = false;
    private String Q;
    /* access modifiers changed from: private */
    public CheckNewEmailService R;
    public InterstitialAd S;
    private Handler T = new Handler(Looper.getMainLooper());
    private Runnable U;
    private ServiceConnection V = new a();
    RewardedAd W;
    RewardedAd X;

    /* compiled from: BaseMainActivity */
    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CheckNewEmailService unused = h.this.R = ((CheckNewEmailService.c) iBinder).a();
            h.this.R.d(h.this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            CheckNewEmailService unused = h.this.R = null;
        }
    }

    /* compiled from: BaseMainActivity */
    class b extends AdListener {
        b() {
        }

        public void onAdClosed() {
            com.tempmail.utils.m.b(h.Y, "interstitial onAdClosed");
            h.this.S.loadAd(new AdRequest.Builder().build());
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String str = h.Y;
            com.tempmail.utils.m.b(str, "interstitial onAdFailedToLoad " + i);
            h.this.S1();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            String str = h.Y;
            com.tempmail.utils.m.b(str, "interstitial onAdLoaded " + h.this.P);
            h hVar = h.this;
            if (hVar.P) {
                hVar.G0();
                com.tempmail.utils.b.q(hVar, h.this.S);
            }
            h.this.P = false;
        }
    }

    /* compiled from: BaseMainActivity */
    class c implements com.tempmail.utils.z.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f12490a;

        c(t tVar) {
            this.f12490a = tVar;
        }

        public void a(int i) {
            h.this.startActivity(new Intent(h.this, SplashActivity.class));
            this.f12490a.h2();
        }

        public void b(int i) {
        }
    }

    /* compiled from: BaseMainActivity */
    class d implements com.tempmail.utils.z.f {
        d() {
        }

        public void a(int i) {
            if (h.this.w1() instanceof com.tempmail.o.b) {
                ((com.tempmail.o.b) h.this.w1()).q2();
            }
        }

        public void b(int i) {
        }
    }

    private void B1() {
        G0();
        InterstitialAd c2 = com.tempmail.utils.b.c(this);
        this.S = c2;
        c2.setAdListener(new b());
    }

    static /* synthetic */ void E1(InitializationStatus initializationStatus) {
        String str = Y;
        com.tempmail.utils.m.b(str, "Initialization status " + initializationStatus.toString());
    }

    /* access modifiers changed from: private */
    public void S1() {
        Handler handler = this.T;
        c cVar = new c(this);
        this.U = cVar;
        handler.postDelayed(cVar, 20000);
    }

    private void V1() {
        int z = s.z(this);
        String str = Y;
        com.tempmail.utils.m.b(str, "oldVersionCode " + z + " versionCode " + 103);
        if (103 > z) {
            s1(103);
        }
    }

    private void r1() {
        this.T.removeCallbacks(this.U);
    }

    private void s1(int i) {
        s.c0(this, i);
        s.n0(this, 0);
        s.a0(this, true);
        s.V(this, false);
    }

    public void A1() {
        com.tempmail.utils.m.b(Y, "initAd ");
        MobileAds.initialize((Context) this, (OnInitializationCompleteListener) a.f12479a);
    }

    public boolean C1(boolean z, int i) {
        int G = s.G(this);
        String str = Y;
        com.tempmail.utils.m.b(str, "premiumAdPeriod=" + i);
        if (!z || G != 1) {
            boolean z2 = false;
            if (!(i == -1 || i == 0)) {
                if (G % i == 0) {
                    z2 = true;
                }
                s.j0(this, G + 1);
            }
            return z2;
        }
        s.j0(this, G + 1);
        return true;
    }

    public boolean D1() {
        return Float.valueOf(w.f(this)).floatValue() < s.F(this);
    }

    public /* synthetic */ void F1(CompoundButton compoundButton, boolean z) {
        String str = Y;
        com.tempmail.utils.m.b(str, "setOnCheckedChangeListener " + z);
        G0();
        s.U(this, z);
        if (z) {
            g.z(2);
        } else {
            g.z(1);
        }
        recreate();
    }

    public /* synthetic */ void G1() {
        this.S.loadAd(new AdRequest.Builder().build());
    }

    public void H1(Fragment fragment) {
    }

    public boolean I1(Intent intent, boolean z) {
        if (intent == null) {
            return false;
        }
        com.tempmail.utils.m.b(Y, "intent!=null");
        if (intent.getExtras() == null) {
            return false;
        }
        com.tempmail.utils.m.b(Y, "bundle!=null");
        String string = intent.getExtras().getString("url");
        if (TextUtils.isEmpty(string) || !w.t(string)) {
            return false;
        }
        com.tempmail.utils.m.b(Y, "url not empty");
        w.y(this, string);
        if (!z) {
            return true;
        }
        finish();
        return true;
    }

    public void J1() {
        t t2 = t.t2((String) null, getString(R.string.premium_trial_expired_now_on_free));
        t2.v2(4, new c(t2));
        t2.n2(false);
        t2.r2(k0(), t.class.getSimpleName());
    }

    public void K(int i) {
        String str = Y;
        com.tempmail.utils.m.c(str, "onEmailsCountChange " + i);
        N1(i);
    }

    public void K1(Intent intent) {
        com.tempmail.utils.m.b(Y, "processDeepLinkEmail ");
        if (com.tempmail.utils.e.O(this) && intent != null) {
            com.tempmail.utils.m.b(Y, "intent!=null ");
            String stringExtra = intent.getStringExtra("extra_deep_link_email");
            String str = Y;
            StringBuilder sb = new StringBuilder();
            sb.append("deepLinkEmail null");
            sb.append(stringExtra == null);
            com.tempmail.utils.m.b(str, sb.toString());
            if (stringExtra != null) {
                String str2 = Y;
                com.tempmail.utils.m.b(str2, "deepLinkEmail " + stringExtra);
                v1(stringExtra);
            }
        }
    }

    public void L1(String str) {
        com.tempmail.utils.m.b(Y, "processDeepLinkOts ");
        String str2 = Y;
        com.tempmail.utils.m.b(str2, "processDeepLinkOts " + str);
        if (com.tempmail.utils.e.O(this)) {
            M(com.tempmail.p.e.s2(str), true);
        } else {
            ((n) this.C).e(s.L(this), str);
        }
    }

    @SuppressLint({"CommitTransaction"})
    public void M(Fragment fragment, boolean z) {
        try {
            String str = Y;
            com.tempmail.utils.m.b(str, "navigateToFragment " + fragment.toString());
            androidx.fragment.app.j b2 = k0().b();
            b2.j(R.id.container, fragment);
            if (z) {
                b2.d(fragment.getClass().getSimpleName());
            }
            b2.k(4097);
            b2.f();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        H1(fragment);
    }

    public n M1(Fragment fragment) {
        com.tempmail.utils.m.b(Y, "showCreateEmailDialog");
        List<DomainTable> w = com.tempmail.utils.g.w(H0());
        Collections.shuffle(w);
        n A2 = n.A2(w);
        A2.Z1(fragment, 2);
        A2.r2(k0(), n.class.getSimpleName());
        return A2;
    }

    public abstract void N1(int i);

    public boolean O() {
        return this.K;
    }

    public void O1() {
        try {
            if (!s.x(this)) {
                com.tempmail.p.d x2 = com.tempmail.p.d.x2();
                this.L = x2;
                x2.r2(k0(), com.tempmail.p.d.class.getSimpleName());
                return;
            }
            M(com.tempmail.p.e.t2(true), true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void P1() {
        try {
            r.u2(true).r2(k0(), r.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void Q1(int i) {
        v v2 = v.v2();
        if (i > 5) {
            v2.n2(false);
        }
        v2.r2(k0(), v.class.getSimpleName());
    }

    public void R(boolean z) {
        k N2 = k.N2(this, getString(R.string.message_you_sure), (String) null, z);
        N2.J2(new d());
        try {
            N2.r2(k0(), k.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void R1() {
        String x1;
        if (D1()) {
            com.tempmail.utils.m.b(Y, "isShowUpdateDialog");
            Q1(s.P(this));
        } else if (com.tempmail.utils.e.S() && (x1 = x1(getIntent())) != null) {
            L1(x1);
        } else if (C1(this.M.d(getString(R.string.remote_config_show_trial_at_first_launch)), y1())) {
            com.tempmail.utils.m.b(Y, "isShowPremiumAd");
            O1();
        } else {
            T1();
        }
    }

    public void S0() {
        j jVar = new j(this, com.tempmail.j.b.f(this), this, this.r);
        this.B = jVar;
        this.C = jVar;
    }

    public void T0() {
        p pVar = new p(this, com.tempmail.j.b.f(this), this, this.r);
        this.B = pVar;
        this.C = pVar;
    }

    public void T1() {
        if (this.O == null) {
            u1();
        }
    }

    public void U0() {
        if (com.tempmail.utils.e.O(this)) {
            S0();
        } else {
            T0();
        }
    }

    public void U1() {
        List<String> x = com.tempmail.utils.g.x(this.t);
        this.N = x;
        if (x.size() == 0) {
            finish();
            Toast.makeText(this, R.string.message_no_domains, 1).show();
            return;
        }
        com.tempmail.utils.e.f(this, this.t, this.N);
        this.J = com.tempmail.utils.g.t(this.t);
    }

    public String V() {
        return this.Q;
    }

    public void W() {
        String str = Y;
        com.tempmail.utils.m.b(str, "startEmailTime " + new Date(com.tempmail.utils.e.p()));
        com.tempmail.utils.r.a(this, this.J, Calendar.getInstance().getTimeInMillis(), com.tempmail.utils.e.p());
        com.tempmail.utils.g.L(H0(), this.J);
    }

    public void X() {
        z1();
        i1(getString(R.string.message_activation_error_title), 2);
    }

    public void a(boolean z) {
        String str = Y;
        com.tempmail.utils.m.b(str, "showLoadingMain " + z);
        if (w1() instanceof com.tempmail.q.n) {
            return;
        }
        if (z) {
            O0();
        } else {
            F0();
        }
    }

    public RewardedAd a0() {
        return this.X;
    }

    public void c(List<DomainExpired> list) {
        com.tempmail.utils.r.c(this.t, list);
        this.C.c(com.tempmail.utils.g.t(this.t).p());
        z1();
        if (w1() instanceof com.tempmail.p.e) {
            onBackPressed();
        } else if (w1() instanceof com.tempmail.o.b) {
            ((com.tempmail.o.b) w1()).y2();
        }
    }

    public n c0(Fragment fragment) {
        int i;
        List<e> z = com.tempmail.utils.g.z(H0());
        if (com.tempmail.utils.e.S()) {
            i = z.size();
        } else {
            ArrayList arrayList = new ArrayList();
            for (e next : z) {
                if (!next.v()) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
        }
        String str = Y;
        com.tempmail.utils.m.b(str, "active size " + i);
        if (i < i.a(this)) {
            return M1(fragment);
        }
        P0(i.b(this));
        return null;
    }

    public void c1() {
        try {
            if (w1() instanceof com.tempmail.p.e) {
                ((com.tempmail.p.e) w1()).v2();
            } else if (this.L != null && this.L.k2() != null && this.L.k2().isShowing()) {
                this.L.y2();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void d1(com.android.billingclient.api.e eVar, String str) {
        com.tempmail.utils.g.j(this.t);
        com.tempmail.utils.g.J(this.t, eVar.b());
        s.q0(this, str);
        b1();
        invalidateOptionsMenu();
        com.tempmail.utils.e.c(this, s.w(this).booleanValue());
        N0(this, eVar);
    }

    public e l() {
        return this.J;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == com.tempmail.utils.y.c.f12600a.intValue() && i2 == -1) {
            M(com.tempmail.p.e.r2(), true);
        }
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.C(8388611)) {
            drawerLayout.d(8388611);
            return;
        }
        try {
            int g = k0().g();
            String str = Y;
            com.tempmail.utils.m.b(str, "count " + g);
            if (g < 1) {
                finish();
            } else {
                k0().j();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onCheckEmails(com.tempmail.t.e.b bVar) {
        com.tempmail.utils.m.b(Y, "onNeedCheckEmails");
        CheckNewEmailService checkNewEmailService = this.R;
        if (checkNewEmailService != null) {
            checkNewEmailService.f();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str = Y;
        com.tempmail.utils.m.b(str, "onCreate " + hashCode());
        boolean I1 = I1(getIntent(), true);
        super.onCreate(bundle);
        if (!I1) {
            e t = com.tempmail.utils.g.t(this.t);
            this.J = t;
            if (t == null && com.tempmail.utils.e.O(this)) {
                U1();
            }
            this.Q = this.J.p();
            k0().a(new f(this));
            bindService(new Intent(this, CheckNewEmailService.class), this.V, 1);
            com.tempmail.utils.e.N(this, 60);
            t1();
            V1();
            A1();
            f f2 = f.f();
            this.M = f2;
            int h = (int) f2.h(getString(R.string.remote_config_ir_interstitial_main_screen));
            if (com.tempmail.utils.b.j(this) && h != 0) {
                this.P = true;
                B1();
            }
            G0();
            if (com.tempmail.utils.b.k(this)) {
                G0();
                this.W = com.tempmail.utils.b.m(this);
                G0();
                this.X = com.tempmail.utils.b.m(this);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem findItem = menu.findItem(R.id.navPremium);
        if (com.tempmail.utils.e.O(this)) {
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        com.tempmail.utils.m.b(Y, "onDestroy ");
        com.tempmail.utils.e.N(this, 600);
        F0();
        CheckNewEmailService checkNewEmailService = this.R;
        if (checkNewEmailService != null) {
            checkNewEmailService.j(this);
            unbindService(this.V);
        }
        r1();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.tempmail.utils.m.b(Y, "onNewIntent");
        I1(intent, false);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onNewMail(com.tempmail.t.e.a aVar) {
        com.tempmail.utils.m.b(Y, "onNewMail");
        N1(com.tempmail.utils.e.q(this, this.t));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str = Y;
        com.tempmail.utils.m.b(str, "onOptionsItemSelected " + menuItem.getItemId());
        if (menuItem.getItemId() == R.id.navPremium) {
            com.tempmail.utils.d.e(this.v, getString(R.string.analytics_navbar_crown));
            M(com.tempmail.p.e.r2(), true);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        } else {
            com.tempmail.utils.m.b(Y, "home clicked");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onPremiumExpired(com.tempmail.t.e.c cVar) {
        com.tempmail.utils.m.b(Y, "premiumExpired");
        J1();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        com.tempmail.utils.m.b(Y, "onResume");
        Z0();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void onStart() {
        super.onStart();
        org.greenrobot.eventbus.c.c().o(this);
    }

    public void onStop() {
        super.onStop();
        org.greenrobot.eventbus.c.c().q(this);
    }

    public RewardedAd q() {
        return this.W;
    }

    public void r() {
        RewardedAd rewardedAd = this.W;
        if (rewardedAd == null || !rewardedAd.isLoaded()) {
            G0();
            this.W = com.tempmail.utils.b.m(this);
        }
        RewardedAd rewardedAd2 = this.X;
        if (rewardedAd2 == null || !rewardedAd2.isLoaded()) {
            G0();
            this.X = com.tempmail.utils.b.m(this);
        }
    }

    public void setDarkModeSwitch(View view) {
        G0();
        Boolean R2 = s.R(this);
        String str = Y;
        com.tempmail.utils.m.b(str, "user darkMode  " + R2);
        if (R2 == null) {
            G0();
            R2 = Boolean.valueOf(com.tempmail.utils.e.x(this));
            String str2 = Y;
            com.tempmail.utils.m.b(str2, "system darkMode  " + R2);
        }
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.switchAction);
        switchCompat.setChecked(R2.booleanValue());
        switchCompat.setOnCheckedChangeListener(new b(this));
    }

    public void t1() {
        List<com.tempmail.db.j> B = com.tempmail.utils.g.B(this.t);
        if (B.size() > 0) {
            k1(B);
        }
        if (com.tempmail.utils.g.x(this.t).isEmpty()) {
            com.tempmail.q.l lVar = this.C;
            if (lVar instanceof n) {
                ((n) lVar).a();
            }
        }
    }

    public void u1() {
        com.tempmail.utils.m.b(Y, "checkIfNeedReviewDialog");
        int h = (int) this.M.h(getString(R.string.remote_config_rating_flow_limit));
        String str = Y;
        com.tempmail.utils.m.b(str, "need show review dialog " + s.v(this));
        if (s.u(this) && s.v(this) && h != 0) {
            u t2 = u.t2();
            this.O = t2;
            try {
                t2.r2(k0(), u.class.getSimpleName());
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void v1(String str) {
        String[] split = str.split("@");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = "@" + split[1];
            com.tempmail.utils.m.b(Y, "name " + str2);
            com.tempmail.utils.m.b(Y, "domain " + str3);
            boolean g = com.tempmail.utils.r.g(H0(), new e(str, str2, str3, Boolean.TRUE));
            com.tempmail.utils.m.b(Y, "isGenerated " + g);
            if (g) {
                w(com.tempmail.utils.g.t(this.t));
                W();
            }
        }
    }

    public void w(e eVar) {
        String str = Y;
        com.tempmail.utils.m.b(str, "onNewMainMailbox " + eVar.p());
        this.J = eVar;
        this.Q = eVar.p();
        f1(0);
        this.C.c(this.J.p());
    }

    public Fragment w1() {
        return k0().e(R.id.container);
    }

    public String x1(Intent intent) {
        com.tempmail.utils.m.b(Y, "getDeepLinkOts ");
        if (intent == null) {
            return null;
        }
        com.tempmail.utils.m.b(Y, "intent!=null ");
        String stringExtra = intent.getStringExtra("extra_deep_link_ots");
        String str = Y;
        StringBuilder sb = new StringBuilder();
        sb.append("deepLinkOts null ");
        sb.append(stringExtra == null);
        com.tempmail.utils.m.b(str, sb.toString());
        return stringExtra;
    }

    public int y1() {
        if (com.tempmail.utils.e.O(this)) {
            return (int) this.M.h(getString(R.string.remote_config_show_trial_at_launch));
        }
        return 0;
    }

    public void z1() {
        try {
            if (this.L != null) {
                this.L.h2();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }
}
