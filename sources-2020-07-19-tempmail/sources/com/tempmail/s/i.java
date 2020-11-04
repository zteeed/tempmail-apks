package com.tempmail.s;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.tempmail.R;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.db.j;
import com.tempmail.f;
import com.tempmail.j.b;
import com.tempmail.k.c;
import com.tempmail.k.d;
import com.tempmail.k.e;
import com.tempmail.n.p;
import com.tempmail.n.t;
import com.tempmail.q.l;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

@SuppressLint({"Registered"})
/* compiled from: BillingActivity */
public abstract class i extends f implements com.tempmail.k.f, o, r {
    private static final String I = i.class.getSimpleName();
    e A;
    m B;
    public l C;
    q D;
    public boolean E = false;
    public boolean F = false;
    public boolean G = true;
    com.android.billingclient.api.e H;
    boolean y = false;
    private d z;

    /* compiled from: BillingActivity */
    class a implements com.tempmail.utils.z.f {
        a() {
        }

        public void a(int i) {
            if (i == 1) {
                i iVar = i.this;
                iVar.k1(g.B(iVar.t));
            } else if (i == 2) {
                i.this.l1();
            } else if (i == 3) {
                i.this.m1();
            } else if (i == 5) {
                i iVar2 = i.this;
                iVar2.d(iVar2.H);
            }
        }

        public void b(int i) {
        }
    }

    public void B(com.android.billingclient.api.e eVar, ActivationWrapper activationWrapper) {
        if (activationWrapper.getError() == null) {
            d1(eVar, activationWrapper.getResult().getSid());
            com.tempmail.utils.e.l(this, this.t, activationWrapper.getResult().getMailAddresses(), false);
            ((n) this.C).a();
            w(g.t(this.t));
            W();
            s.W(this, true);
            return;
        }
        g.J(this.t, eVar.b());
        a(false);
        com.tempmail.utils.e.Z(this, activationWrapper.getError());
    }

    public l E() {
        return this.C;
    }

    public void F(com.tempmail.utils.z.f fVar) {
        try {
            p t2 = p.t2();
            if (fVar != null) {
                t2.v2(fVar);
            }
            t2.r2(k0(), p.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void G() {
        m.b(I, "onBillingSetup Finished");
        this.y = true;
        t(false);
    }

    public void J(com.android.billingclient.api.e eVar, SidWrapper sidWrapper) {
        if (sidWrapper.getError() == null) {
            d1(eVar, sidWrapper.getResult().getSid());
            ((n) this.C).f(true);
            return;
        }
        if (com.tempmail.utils.e.i(sidWrapper.getError().getCode())) {
            g.J(this.t, eVar.b());
        }
        com.tempmail.utils.e.Z(this, sidWrapper.getError());
    }

    public m P() {
        return this.B;
    }

    public void Q(String str, List<ExtendedMail> list) {
        String str2 = I;
        m.b(str2, "onInboxLoaded " + list.size());
        int d2 = r.d(this.t, str, list);
        f1(com.tempmail.utils.e.q(this, this.t));
        if (d2 > 0) {
            q.f(getApplicationContext());
            com.tempmail.utils.d.c(this, this.v, d2);
        }
    }

    public void R0() {
        this.G = true;
        com.android.billingclient.api.e eVar = this.H;
        if (eVar == null) {
            this.A.l("remove_ad_purchase", "inapp");
        } else {
            d(eVar);
        }
    }

    public void S0() {
        j jVar = new j(this, b.f(this), this, this.r);
        this.B = jVar;
        this.C = jVar;
    }

    public void T(boolean z2) {
        m.b(I, "showPremiumActivatedComputer");
        s.h0(this, (String) null);
        if (z2) {
            h1();
        } else {
            g1();
        }
    }

    public void T0() {
        p pVar = new p(this, b.f(this), this, this.r);
        this.B = pVar;
        this.C = pVar;
    }

    public void U(ApiError apiError) {
        com.tempmail.utils.e.Z(this, apiError);
        if (apiError.getCode() != null && com.tempmail.utils.e.i(apiError.getCode())) {
            U0();
        } else if (apiError.getCode() != null) {
            com.tempmail.utils.e.Z(this, apiError);
        }
    }

    public void U0() {
        if (com.tempmail.utils.e.O(this)) {
            S0();
        } else {
            T0();
        }
    }

    public /* synthetic */ void V0(boolean z2, int i, List list) {
        if (z2) {
            F0();
        }
        if (i != 0) {
            String str = I;
            m.f(str, "Unsuccessful query for type: subs. Error code: " + i);
        } else if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.android.billingclient.api.g gVar = (com.android.billingclient.api.g) it.next();
                String str2 = I;
                m.d(str2, "Adding sku: " + gVar);
                String f2 = gVar.f();
                char c2 = 65535;
                switch (f2.hashCode()) {
                    case -890035477:
                        if (f2.equals("subscription_monthly")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -763763647:
                        if (f2.equals("subscription_six_month")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -650278079:
                        if (f2.equals("subscription_annual")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -101441642:
                        if (f2.equals("subscription_three_months")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 500204303:
                        if (f2.equals("subscription_one_week")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1419671746:
                        if (f2.equals("subscription_monthly_trial")) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    s.g0(this, gVar.b());
                } else if (c2 == 1) {
                    s.f0(this, gVar.b());
                } else if (c2 == 2) {
                    s.e0(this, gVar.b());
                } else if (c2 == 3) {
                    s.s0(this, gVar.b());
                } else if (c2 == 4) {
                    s.r0(this, gVar.b());
                } else if (c2 == 5) {
                    s.v0(this, gVar.b());
                }
            }
            n1();
        }
    }

    public void W() {
    }

    public /* synthetic */ void W0(boolean z2, int i, List list) {
        if (z2) {
            F0();
        }
        m.d(I, "Response inapp");
        if (i != 0) {
            String str = I;
            m.f(str, "Unsuccessful query for type: inapp. Error code: " + i);
        } else if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = I;
                m.d(str2, "Adding sku: " + ((com.android.billingclient.api.g) it.next()));
            }
        }
    }

    public void X() {
        i1(getString(R.string.message_activation_error_title), 2);
    }

    public void X0() {
    }

    public void Y0() {
    }

    public void Z0() {
        e eVar = this.A;
        if (eVar != null && eVar.i() == 0) {
            this.A.p();
        }
    }

    public void a1() {
        com.android.billingclient.api.g D2 = s.D(this);
        com.android.billingclient.api.g C2 = s.C(this);
        com.android.billingclient.api.g B2 = s.B(this);
        com.android.billingclient.api.g N = s.N(this);
        com.android.billingclient.api.g M = s.M(this);
        if (s.Q(this) == null && M == null && N == null && B2 == null && C2 == null && D2 == null) {
            Toast.makeText(this, R.string.message_purchase_data_error, 1).show();
            t(true);
            return;
        }
        O0();
        e1();
        v().p();
    }

    public void b(com.android.billingclient.api.e eVar) {
        if (eVar.f().equals("subscription_monthly_trial")) {
            m.b(I, "save trial purchased");
            s.t0(this, true);
        }
        T0();
        ((n) this.C).b(eVar);
    }

    public abstract void b1();

    public abstract void c1();

    public void d(com.android.billingclient.api.e eVar) {
        this.H = eVar;
        String str = I;
        StringBuilder sb = new StringBuilder();
        sb.append("removeAd, isAdRemoved=  ");
        G0();
        sb.append(com.tempmail.utils.b.h(this));
        m.b(str, sb.toString());
        G0();
        if (com.tempmail.utils.b.h(this)) {
            this.E = true;
        } else if (eVar != null) {
            m.b(I, "purchase!=null");
            if (!this.F && this.G) {
                m.b(I, "start request");
                this.F = true;
                this.E = false;
                this.D.d(eVar);
            }
        } else {
            this.E = true;
            G0();
            com.tempmail.utils.b.o(this, false);
        }
    }

    public d d0() {
        return this.z;
    }

    public void d1(com.android.billingclient.api.e eVar, String str) {
        g.j(this.t);
        g.J(this.t, eVar.b());
        s.q0(this, str);
        b1();
        invalidateOptionsMenu();
        com.tempmail.utils.e.c(this, s.w(this).booleanValue());
        N0(this, eVar);
    }

    public void e0(boolean z2, Map<String, List<ExtendedMail>> map) {
        com.tempmail.utils.e.l(this, this.t, map, false);
        if (z2) {
            w(g.t(this.t));
            W();
            ((n) this.C).a();
        }
    }

    public void e1() {
        s.k0(this, true);
    }

    public void f() {
        m.b(I, "onRemoveAdRequestFailed");
        this.F = false;
        this.E = true;
        G0();
        com.tempmail.utils.b.o(this, false);
        X0();
    }

    public abstract void f1(int i);

    public void g1() {
        t.t2(getString(R.string.message_title_information), getString(R.string.message_ots_not_activated)).r2(k0(), t.class.getSimpleName());
    }

    public void h1() {
        try {
            p.u2(getString(R.string.message_success), getString(R.string.message_ots_activated)).r2(k0(), p.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void i() {
        m.b(I, "onRemoveAdFinished");
        this.F = false;
        this.E = true;
        G0();
        com.tempmail.utils.b.o(this, true);
        Y0();
    }

    public void i1(String str, int i) {
        String str2;
        String str3;
        boolean z2 = false;
        if (com.tempmail.utils.e.R()) {
            if (i == 1) {
                str3 = "activation";
            } else if (i == 2) {
                str3 = "get Domains";
            } else if (i == 3) {
                str3 = "get mail box list";
            } else if (i != 5) {
                str3 = "unknown";
            } else {
                str3 = "remove ad";
                z2 = true;
            }
            str2 = getString(R.string.message_network_error_message) + "\nError details: \nFailed with " + str3;
        } else {
            str2 = getString(R.string.message_network_error_message);
        }
        String str4 = null;
        if (z2) {
            str4 = getString(17039360);
        }
        t u2 = t.u2(getString(R.string.message_try_again), str4, str, str2);
        u2.n2(z2);
        u2.v2(i, new a());
        try {
            u2.r2(k0(), t.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void j(Throwable th) {
        if (!(th instanceof IllegalStateException)) {
            Toast.makeText(this, R.string.error_message_unknown, 1).show();
        }
    }

    public void j1() {
        if (!com.tempmail.utils.e.O(this)) {
            F((com.tempmail.utils.z.f) null);
        } else if (this.y && this.z.o()) {
            a1();
        } else if (this.y) {
            P0(getString(R.string.message_not_have_subscription));
        } else {
            P0(getString(R.string.message_purchase_data_error));
            t(true);
        }
    }

    public boolean k() {
        return this.y;
    }

    public void k1(List<j> list) {
        try {
            b(new com.android.billingclient.api.e(list.get(0).b(), list.get(0).c()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void l1() {
        ((n) this.C).a();
    }

    public void m1() {
        ((n) this.C).f(true);
    }

    public void n1() {
        new Handler(Looper.getMainLooper()).post(new g(this));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.D = new s(this, b.k(false), this, this.r);
        U0();
        this.z = new d(this, this);
        this.A = new e(this, this.z.n());
        getIntent().getBooleanExtra("extra_failed_to_load", false);
    }

    public void t(boolean z2) {
        m.b(I, "querySkuDetails");
        if (z2) {
            O0();
        }
        List<String> b2 = c.b();
        List<String> a2 = c.a();
        this.A.q("subs", b2, new d(this, z2));
        this.A.q("inapp", a2, new e(this, z2));
    }

    public e v() {
        return this.A;
    }

    public void w(com.tempmail.db.e eVar) {
    }

    public void x(com.android.billingclient.api.e eVar) {
        com.tempmail.utils.d.a(this.v, "select_content", getString(R.string.analytics_event_type_error), getString(R.string.analytics_premium_payment_failed));
        i1(getString(R.string.message_activation_error_title), 1);
    }

    public void y() {
        if (g.z(this.t).size() == 0) {
            i1(getString(R.string.message_activation_error_title), 3);
        }
    }
}
