package com.tempmail.splash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.tasks.Task;
import com.google.firebase.e.a;
import com.google.firebase.e.b;
import com.google.firebase.remoteconfig.f;
import com.google.firebase.remoteconfig.g;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.onboarding.SecondOnBoardingActivity;
import com.tempmail.services.DownloadUpdateFileService;
import com.tempmail.t.o;
import com.tempmail.utils.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import com.tempmail.utils.w;
import com.tempmail.utils.x;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import retrofit2.Response;

public class SplashActivity extends o implements i {
    private static final String g0 = SplashActivity.class.getSimpleName();
    f V;
    boolean W = false;
    boolean X = false;
    boolean Y;
    boolean Z = true;
    Handler a0 = new Handler(Looper.getMainLooper());
    Runnable b0;
    boolean c0 = false;
    String d0 = null;
    String e0;
    private h f0;

    private void E1() {
        m.b(g0, "fetchRemoteSettings");
        Q1();
        this.V.c(7200).b(this, new b(this));
    }

    public void C(String str) {
        String str2 = g0;
        m.b(str2, "onDomainInvalid " + str);
        g.G(this.y, e.d0(str));
        EmailAddressTable m = e.m(g.w(this.y), (String) null);
        m.setIsDefault(Boolean.TRUE);
        if (e.Q()) {
            r.a(this, m, Calendar.getInstance().getTimeInMillis(), e.p());
        }
        g.c(this.y, m);
        D1();
    }

    public void C1() {
        this.a0.removeCallbacks(this.b0);
    }

    public void D1() {
        if (e.P(this)) {
            ((f) this.f0).c(g.s(this.y).getFullEmailAddress());
        } else {
            ((j) this.f0).d();
        }
    }

    public void E() {
        m.b(g0, "onNetworkError");
        if (g.y(this.y).isEmpty()) {
            m.b(g0, "onNetworkError finish");
            Toast.makeText(this, R.string.message_check_network_connection, 1).show();
            finish();
            return;
        }
        this.X = true;
        this.Y = true;
        P1();
    }

    public void F1() {
        s.q0(this, true);
        this.W = true;
        P1();
    }

    public void G1() {
        this.Z = false;
        Task<b> a2 = a.b().a(getIntent());
        a2.g(this, new e(this));
        a2.e(this, new c(this));
    }

    public void H1() {
        if (x.s(this)) {
            Intent intent = new Intent(this, DownloadUpdateFileService.class);
            intent.putExtra(DownloadUpdateFileService.f13003c, getString(R.string.download_version_link) + getString(R.string.download_version_file_name));
            try {
                startService(intent);
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void I1() {
        this.V = f.f();
        g.b bVar = new g.b();
        bVar.e(3600);
        this.V.p(bVar.d());
        try {
            this.V.q(R.xml.remote_config_defaults);
        } catch (VerifyError e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ void J1(Task task) {
        if (task.r()) {
            m.b(g0, "Fetch Succeeded");
            this.V.b().c(new a(this));
            return;
        }
        H1();
        F1();
        m.b(g0, "Fetch Failed");
    }

    public void K(String str) {
        String str2 = g0;
        m.b(str2, "onDomainValid " + str);
        D1();
    }

    public /* synthetic */ void K1(b bVar) {
        m.b("Dynamic_links", "onSuccess ");
        if (bVar != null) {
            m.b("Dynamic_links", "pendingDynamicLinkData != null) ");
            m.b("Dynamic_links", "MinimumAppVersion " + bVar.b());
            Uri a2 = bVar.a();
            if (a2 != null) {
                m.b("Dynamic_links", "deepLink path " + a2.getPath() + " str " + a2.toString());
                if (e.P(this)) {
                    String s = e.s(a2);
                    if (x.w(s)) {
                        this.d0 = s;
                    }
                    m.b("Dynamic_links", "deeplink email " + this.d0);
                }
                this.e0 = e.F(a2);
                m.b("Dynamic_links", "deeplink ots " + this.e0);
                if (x.h(this) < bVar.b()) {
                    m.b("Dynamic_links", "need to update ");
                    this.Z = false;
                    Toast.makeText(this, R.string.message_dynamic_link_update, 1).show();
                    startActivity(bVar.c(this));
                    finish();
                    return;
                }
            }
        }
        this.Z = true;
        P1();
    }

    public /* synthetic */ void L1(Exception exc) {
        m.f("Dynamic_links", "getDynamicLink:onFailure" + exc.getLocalizedMessage());
        this.Z = true;
        P1();
    }

    public /* synthetic */ void M1(Task task) {
        int h = (int) this.V.h(getString(R.string.remote_config_expire_soon_notification));
        F1();
        String str = g0;
        m.b(str, "expireSoonTime onComplete " + h);
        double e2 = this.V.e(getString(R.string.remote_config_stable_version));
        if (e2 != 0.0d) {
            s.k0(this, (float) e2);
        }
        String str2 = g0;
        m.b(str2, "playMarketVersion " + e2);
        String i = this.V.i(getString(R.string.remote_config_remove_ads));
        String str3 = g0;
        m.b(str3, "removeAdPolitics " + i);
    }

    public /* synthetic */ void N1() {
        m.b(g0, "cancel firebase task");
        O1();
    }

    public void O1() {
        m.b(g0, " processFailedToLoadServices ");
        this.G = true;
        this.Z = true;
        H1();
        F1();
    }

    public void P1() {
        String str = g0;
        m.b(str, "isApiLoaded " + this.X + " isFirebaseRemoteConfigLoaded " + this.W + " isDynamicLinkLoaded " + this.Z + " isAdRemovedProcessed " + this.G);
        if (this.X && this.W && this.Z && this.G) {
            S1(this.Y);
        }
    }

    public void Q1() {
        C1();
        Handler handler = this.a0;
        d dVar = new d(this);
        this.b0 = dVar;
        handler.postDelayed(dVar, 12000);
    }

    public void R1(boolean z) {
        if (!this.c0) {
            this.c0 = true;
            w.b(this, z, this.d0, this.e0);
        }
    }

    public void S1(boolean z) {
        m.b("Dynamic_links", "startNextAction");
        long h = this.V.h(getString(R.string.remote_config_onboarding_slides_scenario));
        if (!s.r(this) && h != 0) {
            F0();
            if (e.P(this)) {
                boolean z2 = e.Q() || Locale.getDefault().getLanguage().equals(getString(R.string.default_language));
                String str = g0;
                m.b(str, "isNotTmEnglish " + z2);
                if (z2) {
                    T1(z, h);
                    return;
                } else {
                    R1(z);
                    return;
                }
            }
        }
        R1(z);
    }

    public void T0() {
        this.f0 = new g(this, com.tempmail.l.b.a(this), this, this.w);
    }

    public void T1(boolean z, long j) {
        Class<SecondOnBoardingActivity> cls;
        if (!this.c0) {
            this.c0 = true;
            if (e.S()) {
                cls = SecondOnBoardingActivity.class;
            } else if (j == 1) {
                F0();
                cls = e.o(this, ".onboarding.OnBoardingActivity");
            } else {
                cls = SecondOnBoardingActivity.class;
            }
            Intent intent = new Intent(this, cls);
            intent.addFlags(268468224);
            intent.putExtra("extra_failed_to_load", z);
            String str = this.d0;
            if (str != null) {
                intent.putExtra("extra_deep_link_email", str);
            }
            startActivity(intent);
            finish();
        }
    }

    public void U0() {
        this.f0 = new k(this, com.tempmail.l.b.f(this), this, this.w);
    }

    public void V0() {
        if (e.P(this)) {
            T0();
        } else {
            U0();
        }
    }

    public void a(boolean z) {
    }

    public void a0(Response response) {
        if (response != null) {
            String str = g0;
            m.b(str, " onInboxHttpError " + response.message() + " body " + response.body());
        } else {
            m.b(g0, " onInboxHttpError ");
        }
        this.X = true;
        P1();
    }

    public void b(List<DomainExpired> list) {
        if (list == null || list.size() == 0) {
            Toast.makeText(this, R.string.message_no_domains, 1).show();
            finish();
            return;
        }
        boolean f2 = e.f(this, this.y, e.J(list));
        String str = g0;
        m.b(str, "isDomainsValid " + f2);
        r.c(this.y, list);
        if (!f2) {
            ((f) this.f0).b(com.tempmail.utils.g.s(this.y).getDomain());
        } else {
            D1();
        }
    }

    public void f1() {
        super.f1();
        m.b(g0, "onAdRemoved");
        P1();
    }

    public void g(Map<String, List<ExtendedMail>> map) {
        m.b(g0, "onInboxLoaded ");
        e.l(this, this.y, map, false);
        this.X = true;
        P1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splash);
        m.b("BillingLifecycle", "splash on create");
        G1();
        I1();
        E1();
        V0();
        this.f0.a();
        if (e.R()) {
            m.b(g0, x.i(this));
        }
        String str = g0;
        m.b(str, " sid " + s.L(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m.b("BillingLifecycle", "Splash onDestroy ");
        E0();
        C1();
    }

    public void p(ApiError apiError) {
        if (apiError != null) {
            String str = g0;
            m.b(str, "onInboxFailedToLoad " + apiError.getMessage() + " " + apiError.getCode());
        } else {
            m.b(g0, "onInboxFailedToLoad ");
        }
        e.Z(this, apiError, getString(R.string.analytics_screen_name_splash), "get.messages");
        if (apiError.getCode() != null && e.i(apiError.getCode())) {
            V0();
            this.f0.a();
        }
    }

    public void q1(int i) {
    }
}
