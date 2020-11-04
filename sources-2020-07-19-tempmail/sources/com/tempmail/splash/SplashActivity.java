package com.tempmail.splash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.tasks.Task;
import com.google.firebase.e.a;
import com.google.firebase.remoteconfig.f;
import com.google.firebase.remoteconfig.g;
import com.tempmail.R;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.j.b;
import com.tempmail.s.i;
import com.tempmail.services.DownloadUpdateFileService;
import com.tempmail.utils.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import com.tempmail.utils.w;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import retrofit2.Response;

public class SplashActivity extends i implements i {
    private static final String U = SplashActivity.class.getSimpleName();
    f J;
    boolean K = false;
    boolean L = false;
    boolean M;
    boolean N = true;
    Handler O = new Handler(Looper.getMainLooper());
    Runnable P;
    boolean Q = false;
    private h R;
    String S = null;
    String T;

    private void q1() {
        m.b(U, "fetchRemoteSettings");
        C1();
        this.J.c(7200).b(this, new b(this));
    }

    public void A1() {
        this.E = true;
        this.N = true;
        t1();
        r1();
    }

    public void B1() {
        String str = U;
        m.b(str, "isApiLoaded " + this.L + " isFirebaseRemoteConfigLoaded " + this.K + " isDynamicLinkLoaded " + this.N + " isAdRemovedProcessed " + this.E);
        if (this.L && this.K && this.N && this.E) {
            E1(this.M);
        }
    }

    public void C1() {
        o1();
        Handler handler = this.O;
        d dVar = new d(this);
        this.P = dVar;
        handler.postDelayed(dVar, 12000);
    }

    public void D(String str) {
        String str2 = U;
        m.b(str2, "onDomainInvalid " + str);
        g.I(this.t, e.d0(str));
        com.tempmail.db.e m = e.m(g.x(this.t), (String) null);
        m.G(Boolean.TRUE);
        if (e.P()) {
            r.a(this, m, Calendar.getInstance().getTimeInMillis(), e.p());
        }
        g.c(this.t, m);
        p1();
    }

    public void D1(boolean z) {
        if (!this.Q) {
            this.Q = true;
            Intent intent = new Intent(this, e.o(this, ".MainActivity"));
            intent.addFlags(268468224);
            intent.putExtra("extra_failed_to_load", z);
            m.b("Dynamic_links", "deepLinkEmail " + this.S);
            String str = this.S;
            if (str != null) {
                intent.putExtra("extra_deep_link_email", str);
            }
            if (this.T != null && e.S()) {
                intent.putExtra("extra_deep_link_ots", this.T);
            }
            startActivity(intent);
            finish();
        }
    }

    public void E1(boolean z) {
        m.b("Dynamic_links", "startNextAction");
        if (!e.P()) {
            D1(z);
        } else if (s.r(this)) {
            D1(z);
        } else {
            F1(z);
        }
    }

    public void F1(boolean z) {
        if (!this.Q) {
            this.Q = true;
            Intent intent = new Intent(this, e.o(this, ".onboarding.OnBoardingActivity"));
            intent.addFlags(268468224);
            intent.putExtra("extra_failed_to_load", z);
            String str = this.S;
            if (str != null) {
                intent.putExtra("extra_deep_link_email", str);
            }
            startActivity(intent);
            finish();
        }
    }

    public void H() {
        m.b(U, "onNetworkError");
        if (g.z(this.t).isEmpty()) {
            m.b(U, "onNetworkError finish");
            Toast.makeText(this, R.string.message_check_network_connection, 1).show();
            finish();
            return;
        }
        this.L = true;
        this.M = true;
        B1();
    }

    public void L(String str) {
        String str2 = U;
        m.b(str2, "onDomainValid " + str);
        p1();
    }

    public void S0() {
        this.R = new g(this, b.a(this), this, this.r);
    }

    public void T0() {
        this.R = new k(this, b.f(this), this, this.r);
    }

    public void U0() {
        if (e.O(this)) {
            S0();
        } else {
            T0();
        }
    }

    public void Y0() {
        super.Y0();
        m.b(U, "onAdRemoved");
        B1();
    }

    public void a(boolean z) {
    }

    public void b0(Response response) {
        this.L = true;
        B1();
    }

    public void b1() {
    }

    public void c(List<DomainExpired> list) {
        if (list == null || list.size() == 0) {
            Toast.makeText(this, R.string.message_no_domains, 1).show();
            finish();
            return;
        }
        boolean f2 = e.f(this, this.t, e.I(list));
        String str = U;
        m.b(str, "isDomainsValid " + f2);
        r.c(this.t, list);
        if (!f2) {
            ((f) this.R).b(g.t(this.t).k());
        } else {
            p1();
        }
    }

    public void c1() {
    }

    public void f1(int i) {
    }

    public void h(Map<String, List<ExtendedMail>> map) {
        e.l(this, this.t, map, false);
        this.L = true;
        B1();
    }

    public void o1() {
        this.O.removeCallbacks(this.P);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_splash);
        s1();
        u1();
        q1();
        U0();
        this.R.a();
        if (e.R()) {
            m.b(U, w.i(this));
        }
        String str = U;
        m.b(str, " sid " + s.L(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m.b(U, "onDestroy ");
        F0();
        o1();
    }

    public void p(ApiError apiError) {
        e.Z(this, apiError);
        if (apiError.getCode() != null && e.i(apiError.getCode())) {
            U0();
            this.R.a();
        }
    }

    public void p1() {
        if (e.O(this)) {
            ((f) this.R).c(g.t(this.t).p());
        } else {
            ((j) this.R).d();
        }
    }

    public void r1() {
        s.o0(this, true);
        this.K = true;
        B1();
    }

    public void s1() {
        this.N = false;
        Task<com.google.firebase.e.b> a2 = a.b().a(getIntent());
        a2.g(this, new e(this));
        a2.e(this, new c(this));
    }

    public void t1() {
        if (w.q(this)) {
            Intent intent = new Intent(this, DownloadUpdateFileService.class);
            intent.putExtra(DownloadUpdateFileService.f12507c, getString(R.string.download_version_link) + getString(R.string.download_version_file_name));
            try {
                startService(intent);
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void u1() {
        this.J = f.f();
        g.b bVar = new g.b();
        bVar.e(3600);
        this.J.p(bVar.d());
        try {
            this.J.q(R.xml.remote_config_defaults);
        } catch (VerifyError e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ void v1(Task task) {
        if (task.r()) {
            m.b(U, "Fetch Succeeded");
            this.J.b().c(new a(this));
            return;
        }
        t1();
        r1();
        m.b(U, "Fetch Failed");
    }

    public /* synthetic */ void w1(com.google.firebase.e.b bVar) {
        m.b("Dynamic_links", "onSuccess ");
        if (bVar != null) {
            m.b("Dynamic_links", "pendingDynamicLinkData != null) ");
            m.b("Dynamic_links", "MinimumAppVersion " + bVar.b());
            Uri a2 = bVar.a();
            if (a2 != null) {
                m.b("Dynamic_links", "deepLink path " + a2.getPath() + " str " + a2.toString());
                if (e.O(this)) {
                    String s = e.s(a2);
                    if (w.u(s)) {
                        this.S = s;
                    }
                    m.b("Dynamic_links", "deeplink email " + this.S);
                }
                this.T = e.E(a2);
                m.b("Dynamic_links", "deeplink ots " + this.T);
                if (w.h(this) < bVar.b()) {
                    m.b("Dynamic_links", "need to update ");
                    this.N = false;
                    Toast.makeText(this, R.string.message_dynamic_link_update, 1).show();
                    startActivity(bVar.c(this));
                    finish();
                    return;
                }
            }
        }
        this.N = true;
        B1();
    }

    public /* synthetic */ void x1(Exception exc) {
        m.f("Dynamic_links", "getDynamicLink:onFailure" + exc.getLocalizedMessage());
        this.N = true;
        B1();
    }

    public /* synthetic */ void y1(Task task) {
        int h = (int) this.J.h(getString(R.string.remote_config_expire_soon_notification));
        r1();
        String str = U;
        m.b(str, "expireSoonTime onComplete " + h);
        double e2 = this.J.e(getString(R.string.remote_config_stable_version));
        if (e2 != 0.0d) {
            s.i0(this, (float) e2);
        }
        String str2 = U;
        m.b(str2, "playMarketVersion " + e2);
    }

    public /* synthetic */ void z1() {
        m.b(U, "cancel firebase task");
        A1();
    }
}
