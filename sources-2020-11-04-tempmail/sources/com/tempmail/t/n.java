package com.tempmail.t;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.firebase.remoteconfig.f;
import com.tempmail.R;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.db.DomainTable;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.db.PurchaseTable;
import com.tempmail.lifecycles.InAppUpdateLifecycle;
import com.tempmail.o.s;
import com.tempmail.o.t;
import com.tempmail.o.u;
import com.tempmail.q.i;
import com.tempmail.r.l;
import com.tempmail.services.CheckNewEmailService;
import com.tempmail.splash.SplashActivity;
import com.tempmail.utils.g;
import com.tempmail.utils.r;
import com.tempmail.utils.x;
import com.tempmail.utils.z.h;
import com.tempmail.utils.z.j;
import com.tempmail.utils.z.m;
import com.tempmail.utils.z.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

@SuppressLint({"Registered"})
/* compiled from: BaseMainActivity */
public abstract class n extends o implements h, j, m, u, com.tempmail.utils.z.c, o {
    public static final String n0 = n.class.getSimpleName();
    public EmailAddressTable V;
    public InterstitialAd W;
    boolean X = false;
    com.tempmail.q.h Y;
    f Z;
    List<String> a0;
    t b0;
    boolean c0 = false;
    RewardedAd d0;
    RewardedAd e0;
    public AdView f0;
    b.c.a.e.a.a.b g0;
    boolean h0 = false;
    InAppUpdateLifecycle i0;
    private String j0;
    /* access modifiers changed from: private */
    public CheckNewEmailService k0;
    private Runnable l0;
    private ServiceConnection m0 = new a();

    /* compiled from: BaseMainActivity */
    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            CheckNewEmailService unused = n.this.k0 = ((CheckNewEmailService.c) iBinder).a();
            n.this.k0.d(n.this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            CheckNewEmailService unused = n.this.k0 = null;
        }
    }

    /* compiled from: BaseMainActivity */
    class b extends AdListener {
        b() {
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String str = n.n0;
            com.tempmail.utils.m.b(str, "banner onAdFailedToLoad " + i);
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            com.tempmail.utils.m.b(n.n0, "banner onAdLoaded");
            n.this.g2();
        }
    }

    /* compiled from: BaseMainActivity */
    class c extends AdListener {
        c() {
        }

        public void onAdClosed() {
            com.tempmail.utils.m.b(n.n0, "interstitial onAdClosed");
            n.this.W.loadAd(new AdRequest.Builder().build());
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
            String str = n.n0;
            com.tempmail.utils.m.b(str, "interstitial onAdFailedToLoad " + i);
            n.this.n2();
        }

        public void onAdLoaded() {
            super.onAdLoaded();
            String str = n.n0;
            com.tempmail.utils.m.b(str, "interstitial onAdLoaded " + n.this.c0);
            n nVar = n.this;
            if (nVar.c0) {
                nVar.F0();
                if (com.tempmail.utils.b.j(nVar)) {
                    n nVar2 = n.this;
                    nVar2.F0();
                    com.tempmail.utils.b.q(nVar2, n.this.W);
                }
            }
            n.this.c0 = false;
        }
    }

    /* compiled from: BaseMainActivity */
    class d implements com.tempmail.utils.z.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f13063a;

        d(s sVar) {
            this.f13063a = sVar;
        }

        public void a(int i) {
            n.this.startActivity(new Intent(n.this, SplashActivity.class));
            this.f13063a.n2();
        }

        public void b(int i) {
        }
    }

    /* compiled from: BaseMainActivity */
    class e implements com.tempmail.utils.z.f {
        e() {
        }

        public void a(int i) {
            if (n.this.K1() instanceof com.tempmail.p.c) {
                ((com.tempmail.p.c) n.this.K1()).y2();
            }
        }

        public void b(int i) {
        }
    }

    private void F1() {
        this.B.removeCallbacks(this.l0);
    }

    private void G1(int i) {
        com.tempmail.utils.s.e0(this, i);
        com.tempmail.utils.s.p0(this, 0);
        com.tempmail.utils.s.c0(this, true);
        com.tempmail.utils.s.X(this, false);
        F0();
        com.tempmail.utils.s.Z(this, 0);
    }

    private void R1() {
        F0();
        InterstitialAd c2 = com.tempmail.utils.b.c(this);
        this.W = c2;
        c2.setAdListener(new c());
    }

    static /* synthetic */ void T1(InitializationStatus initializationStatus) {
        String str = n0;
        com.tempmail.utils.m.b(str, "Initialization status " + initializationStatus.toString());
    }

    /* access modifiers changed from: private */
    public void n2() {
        Handler handler = this.B;
        d dVar = new d(this);
        this.l0 = dVar;
        handler.postDelayed(dVar, 20000);
    }

    private void q2() {
        int A = com.tempmail.utils.s.A(this);
        String str = n0;
        com.tempmail.utils.m.b(str, "oldVersionCode " + A + " versionCode " + 118);
        if (118 > A) {
            G1(118);
        }
    }

    public void H1() {
        List<PurchaseTable> A = g.A(this.y);
        if (A.size() > 0) {
            y1(A);
        }
        if (g.w(this.y).isEmpty()) {
            l lVar = this.F;
            if (lVar instanceof t) {
                ((t) lVar).a();
            }
        }
    }

    public void I1() {
        com.tempmail.utils.m.b(n0, "checkIfNeedReviewDialog");
        int h = (int) this.Z.h(getString(R.string.remote_config_rating_flow_limit));
        String str = n0;
        com.tempmail.utils.m.b(str, "need show review dialog " + com.tempmail.utils.s.w(this));
        if (com.tempmail.utils.s.v(this) && com.tempmail.utils.s.w(this) && h != 0) {
            t z2 = t.z2();
            this.b0 = z2;
            try {
                z2.x2(k0(), t.class.getSimpleName());
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void J(int i) {
        String str = n0;
        com.tempmail.utils.m.c(str, "onEmailsCountChange " + i);
        i2(i);
    }

    public void J1(String str) {
        String[] split = str.split("@");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = "@" + split[1];
            com.tempmail.utils.m.b(n0, "name " + str2);
            com.tempmail.utils.m.b(n0, "domain " + str3);
            boolean g = r.g(G0(), new EmailAddressTable(str, str2, str3, Boolean.TRUE));
            com.tempmail.utils.m.b(n0, "isGenerated " + g);
            if (g) {
                v(g.s(this.y));
                U();
            }
        }
    }

    public Fragment K1() {
        return k0().Y(R.id.container);
    }

    @SuppressLint({"CommitTransaction"})
    public void L(Fragment fragment, boolean z) {
        try {
            String str = n0;
            com.tempmail.utils.m.b(str, "navigateToFragment " + fragment.toString());
            q j = k0().j();
            j.o(R.id.container, fragment);
            if (z) {
                j.f(fragment.getClass().getSimpleName());
            }
            j.s(4097);
            j.h();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        Y1(fragment);
    }

    public String L1(Intent intent) {
        com.tempmail.utils.m.b(n0, "getDeepLinkOts ");
        if (intent == null) {
            return null;
        }
        com.tempmail.utils.m.b(n0, "intent!=null ");
        String stringExtra = intent.getStringExtra("extra_deep_link_ots");
        String str = n0;
        StringBuilder sb = new StringBuilder();
        sb.append("deepLinkOts null ");
        sb.append(stringExtra == null);
        com.tempmail.utils.m.b(str, sb.toString());
        return stringExtra;
    }

    public boolean M1() {
        if (com.tempmail.utils.e.P(this)) {
            return this.Z.d(getString(R.string.remote_config_show_trial_at_first_launch));
        }
        return false;
    }

    public boolean N() {
        return this.X;
    }

    public int N1() {
        if (com.tempmail.utils.e.P(this)) {
            return (int) this.Z.h(getString(R.string.remote_config_show_trial_at_launch));
        }
        return 0;
    }

    public void O1() {
        try {
            if (this.Y != null) {
                this.Y.n2();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void P1() {
        com.tempmail.utils.m.b(n0, "initAd ");
        MobileAds.initialize((Context) this, (OnInitializationCompleteListener) c.f13049a);
    }

    public void Q(boolean z) {
        com.tempmail.o.j R2 = com.tempmail.o.j.R2(this, getString(R.string.message_you_sure), (String) null, z);
        R2.N2(new e());
        try {
            R2.x2(k0(), com.tempmail.o.j.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void Q1(int i) {
        try {
            com.tempmail.utils.m.b(n0, "Load main ad");
            String str = n0;
            com.tempmail.utils.m.b(str, "width ad container " + i);
            F0();
            AdView b2 = com.tempmail.utils.b.b(this, com.tempmail.utils.b.e(this, i));
            this.f0 = b2;
            b2.setAdListener(new b());
            com.tempmail.utils.b.l(this.f0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean S1(boolean z, int i) {
        int H = com.tempmail.utils.s.H(this);
        String str = n0;
        com.tempmail.utils.m.b(str, "premiumAdPeriod=" + i);
        if (!z || H != 1) {
            boolean z2 = false;
            if (!(i == -1 || i == 0)) {
                if (H % i == 0) {
                    z2 = true;
                }
                com.tempmail.utils.s.l0(this, H + 1);
            }
            return z2;
        }
        com.tempmail.utils.s.l0(this, H + 1);
        return true;
    }

    public String T() {
        return this.j0;
    }

    public void T0() {
        p pVar = new p(this, com.tempmail.l.b.f(this), this, this.w);
        this.M = pVar;
        this.F = pVar;
    }

    public void U() {
        String str = n0;
        com.tempmail.utils.m.b(str, "startEmailTime " + new Date(com.tempmail.utils.e.p()));
        r.a(this, this.V, Calendar.getInstance().getTimeInMillis(), com.tempmail.utils.e.p());
        g.J(G0(), this.V);
    }

    public void U0() {
        v vVar = new v(this, com.tempmail.l.b.f(this), this, this.w);
        this.M = vVar;
        this.F = vVar;
    }

    public /* synthetic */ void U1(Void voidR) {
        com.tempmail.utils.m.b(n0, "showUpdateDialogEvent ");
        F0();
        l2(com.tempmail.utils.s.Q(this));
    }

    public void V0() {
        if (com.tempmail.utils.e.P(this)) {
            T0();
        } else {
            U0();
        }
    }

    public /* synthetic */ void V1(Void voidR) {
        com.tempmail.utils.m.b(n0, "completeUpdateEvent ");
        a2(this.g0);
    }

    public void W() {
        O1();
        u1(getString(R.string.message_activation_error_title), 2);
    }

    public /* synthetic */ void W1(CompoundButton compoundButton, boolean z) {
        String str = n0;
        com.tempmail.utils.m.b(str, "setOnCheckedChangeListener " + z);
        F0();
        com.tempmail.utils.s.W(this, z);
        if (z) {
            androidx.appcompat.app.g.z(2);
        } else {
            androidx.appcompat.app.g.z(1);
        }
        recreate();
    }

    public /* synthetic */ void X1() {
        this.W.loadAd(new AdRequest.Builder().build());
    }

    public void Y1(Fragment fragment) {
    }

    public RewardedAd Z() {
        return this.e0;
    }

    public boolean Z1(Intent intent, boolean z) {
        if (intent == null) {
            return false;
        }
        com.tempmail.utils.m.b(n0, "intent!=null");
        if (intent.getExtras() == null) {
            return false;
        }
        com.tempmail.utils.m.b(n0, "bundle!=null");
        String string = intent.getExtras().getString("url");
        if (TextUtils.isEmpty(string) || !x.v(string)) {
            return false;
        }
        com.tempmail.utils.m.b(n0, "url not empty");
        x.A(this, string);
        if (!z) {
            return true;
        }
        finish();
        return true;
    }

    public void a(boolean z) {
        String str = n0;
        com.tempmail.utils.m.b(str, "showLoadingMain " + z);
        if (K1() instanceof com.tempmail.r.n) {
            return;
        }
        if (z) {
            M0();
        } else {
            E0();
        }
    }

    public abstract void a2(b.c.a.e.a.a.b bVar);

    public void b(List<DomainExpired> list) {
        r.c(this.y, list);
        this.F.c(g.s(this.y).getFullEmailAddress());
        O1();
        F0();
        String F = com.tempmail.utils.s.F(this);
        String str = n0;
        com.tempmail.utils.m.b(str, "processSuccessfulDomainsLoaded ots " + F);
        if (F == null) {
            s1((com.tempmail.utils.z.f) null);
        } else {
            F0();
            ((t) this.F).e(com.tempmail.utils.s.L(this), F);
        }
        if (K1() instanceof i) {
            onBackPressed();
        } else if (K1() instanceof com.tempmail.p.c) {
            ((com.tempmail.p.c) K1()).K2();
        }
        f2();
    }

    public com.tempmail.o.m b0(Fragment fragment) {
        int i;
        List<EmailAddressTable> y = g.y(G0());
        if (com.tempmail.utils.e.S()) {
            i = y.size();
        } else {
            ArrayList arrayList = new ArrayList();
            for (EmailAddressTable next : y) {
                if (!next.isExpired()) {
                    arrayList.add(next);
                }
            }
            i = arrayList.size();
        }
        String str = n0;
        com.tempmail.utils.m.b(str, "active size " + i);
        if (i < com.tempmail.utils.i.a(this)) {
            return h2(fragment);
        }
        N0(com.tempmail.utils.i.b(this));
        return null;
    }

    public void b2() {
        s z2 = s.z2((String) null, getString(R.string.premium_trial_expired_now_on_free));
        z2.B2(4, new d(z2));
        z2.t2(false);
        z2.x2(k0(), s.class.getSimpleName());
    }

    public void c2(Intent intent) {
        com.tempmail.utils.m.b(n0, "processDeepLinkEmail ");
        if (com.tempmail.utils.e.P(this) && intent != null) {
            com.tempmail.utils.m.b(n0, "intent!=null ");
            String stringExtra = intent.getStringExtra("extra_deep_link_email");
            String str = n0;
            StringBuilder sb = new StringBuilder();
            sb.append("deepLinkEmail null");
            sb.append(stringExtra == null);
            com.tempmail.utils.m.b(str, sb.toString());
            if (stringExtra != null) {
                String str2 = n0;
                com.tempmail.utils.m.b(str2, "deepLinkEmail " + stringExtra);
                J1(stringExtra);
            }
        }
    }

    public void e2(String str) {
        com.tempmail.utils.m.b(n0, "processDeepLinkOts ");
        String str2 = n0;
        com.tempmail.utils.m.b(str2, "processDeepLinkOts " + str);
        if (com.tempmail.utils.e.P(this)) {
            L(i.H2(str), true);
        } else {
            ((t) this.F).e(com.tempmail.utils.s.L(this), str);
        }
    }

    public abstract void f2();

    public abstract void g2();

    public com.tempmail.o.m h2(Fragment fragment) {
        com.tempmail.utils.m.b(n0, "showCreateEmailDialog");
        List<DomainTable> v = g.v(G0());
        if (v.size() == 0) {
            F0();
            Toast.makeText(this, R.string.message_no_domains, 1).show();
            return null;
        }
        Collections.shuffle(v);
        com.tempmail.o.m G2 = com.tempmail.o.m.G2(v);
        G2.f2(fragment, 2);
        G2.x2(k0(), com.tempmail.o.m.class.getSimpleName());
        return G2;
    }

    public abstract void i2(int i);

    public EmailAddressTable j() {
        return this.V;
    }

    public void j2() {
        try {
            if (!com.tempmail.utils.s.y(this)) {
                com.tempmail.q.h I2 = com.tempmail.q.h.I2();
                this.Y = I2;
                I2.x2(k0(), com.tempmail.q.h.class.getSimpleName());
                return;
            }
            L(i.I2(true), true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void k2() {
        try {
            com.tempmail.o.q.A2(true).x2(k0(), com.tempmail.o.q.class.getSimpleName());
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void l2(int i) {
        u B2 = u.B2();
        if (i > 5) {
            B2.t2(false);
        }
        B2.x2(k0(), u.class.getSimpleName());
    }

    public void m2() {
        String L1;
        if (com.tempmail.utils.e.S() && (L1 = L1(getIntent())) != null) {
            e2(L1);
        } else if (S1(M1(), N1())) {
            com.tempmail.utils.m.b(n0, "isShowPremiumAd");
            j2();
        } else {
            o2();
        }
    }

    public void o2() {
        if (this.b0 == null) {
            I1();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.h0) {
            F0();
            Toast.makeText(this, "onActivity Result " + i + " result code " + i2, 0).show();
        }
        if (i == com.tempmail.utils.y.c.f13142a.intValue() && i2 == -1) {
            L(i.G2(), true);
        } else if (i == com.tempmail.utils.y.c.f13144c.intValue()) {
            this.i0.p(i2);
        }
    }

    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.C(8388611)) {
            drawerLayout.d(8388611);
            return;
        }
        try {
            int d02 = k0().d0();
            String str = n0;
            com.tempmail.utils.m.b(str, "count " + d02);
            if (d02 < 1) {
                finish();
            } else {
                k0().F0();
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onCheckEmails(com.tempmail.u.e.b bVar) {
        com.tempmail.utils.m.b(n0, "onNeedCheckEmails");
        CheckNewEmailService checkNewEmailService = this.k0;
        if (checkNewEmailService != null) {
            checkNewEmailService.f();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str = n0;
        com.tempmail.utils.m.b(str, "onCreate " + hashCode());
        boolean Z1 = Z1(getIntent(), true);
        super.onCreate(bundle);
        if (!Z1) {
            EmailAddressTable s = g.s(this.y);
            this.V = s;
            if (s == null && com.tempmail.utils.e.P(this)) {
                p2();
            }
            this.j0 = this.V.getFullEmailAddress();
            k0().e(new m(this));
            bindService(new Intent(this, CheckNewEmailService.class), this.m0, 1);
            StringBuilder sb = new StringBuilder();
            sb.append("base main activity ");
            sb.append(this.L == null);
            com.tempmail.utils.m.b("BillingLifecycle", sb.toString());
            com.tempmail.utils.e.O(this, 60);
            H1();
            q2();
            P1();
            this.Z = f.f();
            F0();
            this.g0 = b.c.a.e.a.a.c.a(this);
            int h = (int) this.Z.h(getString(R.string.remote_config_ir_interstitial_main_screen));
            if (com.tempmail.utils.b.j(this) && h != 0) {
                this.c0 = true;
                R1();
            }
            F0();
            if (com.tempmail.utils.b.k(this)) {
                F0();
                this.d0 = com.tempmail.utils.b.m(this);
                F0();
                this.e0 = com.tempmail.utils.b.m(this);
            }
            InAppUpdateLifecycle inAppUpdateLifecycle = new InAppUpdateLifecycle(this);
            this.i0 = inAppUpdateLifecycle;
            inAppUpdateLifecycle.f12918a.f(this, new b(this));
            this.i0.f12919b.f(this, new e(this));
            c().a(this.i0);
            F0();
            com.tempmail.utils.s.V(this, true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem findItem = menu.findItem(R.id.navPremium);
        if (com.tempmail.utils.e.P(this)) {
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        com.tempmail.utils.m.b(n0, "onDestroy ");
        com.tempmail.utils.e.O(this, 600);
        E0();
        CheckNewEmailService checkNewEmailService = this.k0;
        if (checkNewEmailService != null) {
            checkNewEmailService.j(this);
            unbindService(this.m0);
        }
        F1();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.tempmail.utils.m.b(n0, "onNewIntent");
        Z1(intent, false);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onNewMail(com.tempmail.u.e.a aVar) {
        com.tempmail.utils.m.b(n0, "onNewMail");
        i2(com.tempmail.utils.e.q(this, this.y));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str = n0;
        com.tempmail.utils.m.b(str, "onOptionsItemSelected " + menuItem.getItemId());
        if (menuItem.getItemId() == R.id.navPremium) {
            com.tempmail.utils.d.j(this.A, getString(R.string.analytics_navbar_crown));
            L(i.G2(), true);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        } else {
            com.tempmail.utils.m.b(n0, "home clicked");
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onPremiumExpired(com.tempmail.u.e.c cVar) {
        com.tempmail.utils.m.b(n0, "premiumExpired");
        b2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        com.tempmail.utils.m.b(n0, "onResume");
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

    public void p2() {
        List<String> w = g.w(this.y);
        this.a0 = w;
        if (w.size() == 0) {
            finish();
            Toast.makeText(this, R.string.message_no_domains, 1).show();
            return;
        }
        com.tempmail.utils.e.f(this, this.y, this.a0);
        this.V = g.s(this.y);
    }

    public RewardedAd q() {
        return this.d0;
    }

    public void r() {
        RewardedAd rewardedAd = this.d0;
        if (rewardedAd == null || !rewardedAd.isLoaded()) {
            F0();
            this.d0 = com.tempmail.utils.b.m(this);
        }
        RewardedAd rewardedAd2 = this.e0;
        if (rewardedAd2 == null || !rewardedAd2.isLoaded()) {
            F0();
            this.e0 = com.tempmail.utils.b.m(this);
        }
    }

    public void setDarkModeSwitch(View view) {
        F0();
        Boolean S = com.tempmail.utils.s.S(this);
        String str = n0;
        com.tempmail.utils.m.b(str, "user darkMode  " + S);
        if (S == null) {
            F0();
            S = Boolean.valueOf(com.tempmail.utils.e.x(this));
            String str2 = n0;
            com.tempmail.utils.m.b(str2, "system darkMode  " + S);
        }
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.switchAction);
        switchCompat.setChecked(S.booleanValue());
        switchCompat.setOnCheckedChangeListener(new a(this));
    }

    public void v(EmailAddressTable emailAddressTable) {
        String str = n0;
        com.tempmail.utils.m.b(str, "onNewMainMailbox " + emailAddressTable.getFullEmailAddress());
        this.V = emailAddressTable;
        this.j0 = emailAddressTable.getFullEmailAddress();
        q1(0);
        this.F.c(this.V.getFullEmailAddress());
    }
}
