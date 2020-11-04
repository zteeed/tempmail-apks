package com.tempmail.t;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.x;
import com.android.billingclient.api.j;
import com.android.billingclient.api.n;
import com.tempmail.ApplicationClass;
import com.tempmail.R;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.billing.BillingClientLifecycle;
import com.tempmail.billing.e;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.db.PurchaseTable;
import com.tempmail.h;
import com.tempmail.l.b;
import com.tempmail.r.l;
import com.tempmail.utils.d;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import com.tempmail.utils.z.f;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

@SuppressLint({"Registered"})
/* compiled from: BillingActivity */
public abstract class o extends h implements u, x {
    public boolean E = false;
    public l F;
    public boolean G = false;
    public boolean H = false;
    public boolean I = true;
    public BillingClientLifecycle J;
    public com.tempmail.w.a K;
    public j L;
    s M;
    public boolean N = false;
    w O;
    public j P;
    public j Q;
    n R;
    com.tempmail.o.o S;
    boolean T = false;
    boolean U = false;

    /* compiled from: BillingActivity */
    class a implements f {
        a() {
        }

        public void a(int i) {
            if (i == 1) {
                o oVar = o.this;
                oVar.B1(oVar.L);
            } else if (i == 2) {
                o.this.z1();
            } else if (i == 3) {
                o.this.A1();
            } else if (i == 5) {
                o oVar2 = o.this;
                oVar2.n1(oVar2.P, oVar2.Q);
            }
        }

        public void b(int i) {
        }
    }

    /* access modifiers changed from: private */
    public void i1(List<j> list) {
        if (list != null) {
            m.b("BillingLifecycle", "registerPurchasesInApp with size: " + list.size());
            this.P = BillingClientLifecycle.o(list);
        }
        this.T = true;
        x1();
    }

    /* access modifiers changed from: private */
    public void k1(Map<String, n> map) {
        for (Map.Entry next : map.entrySet()) {
            Log.d("BillingLifecycle", "Register registerSku: " + ((String) next.getKey()) + ", token: " + next.getValue());
            String str = (String) next.getKey();
            String b2 = ((n) next.getValue()).b();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -890035477:
                    if (str.equals("subscription_monthly")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -763763647:
                    if (str.equals("subscription_six_month")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -650278079:
                    if (str.equals("subscription_annual")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -101441642:
                    if (str.equals("subscription_three_months")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 500204303:
                    if (str.equals("subscription_one_week")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1419671746:
                    if (str.equals("subscription_monthly_trial")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                F0();
                s.i0(this, b2);
            } else if (c2 == 1) {
                F0();
                s.h0(this, b2);
            } else if (c2 == 2) {
                F0();
                s.g0(this, b2);
            } else if (c2 == 3) {
                F0();
                s.u0(this, b2);
            } else if (c2 == 4) {
                F0();
                s.t0(this, b2);
            } else if (c2 == 5) {
                F0();
                s.x0(this, b2);
            }
        }
        h1();
    }

    /* access modifiers changed from: private */
    public void l1(Map<String, n> map) {
        m.b("BillingLifecycle", "registerSkuInApp: " + map.size());
        for (Map.Entry next : map.entrySet()) {
            m.b("BillingLifecycle", "registerSku in app: " + ((String) next.getKey()) + ", token: " + next.getValue());
            this.R = (n) next.getValue();
        }
    }

    private void m1(List<j> list) {
        m.b("BillingLifecycle", "Register purchase with size: " + list.size());
        Iterator<j> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j next = it.next();
            String g = next.g();
            String e2 = next.e();
            m.b("BillingLifecycle", "Register purchase with sku: " + g + ", token: " + e2 + " date " + new Date(next.d()).toString());
            if (e.e(next)) {
                this.Q = next;
            } else if (!next.h()) {
                if (next.g().equals("subscription_monthly_trial")) {
                    F0();
                    s.v0(this, true);
                }
                m.b("BillingLifecycle", "Register purchase isBillingSet: " + this.E);
                if (this.E) {
                    M0();
                    B1(next);
                } else {
                    F0();
                    if (!com.tempmail.utils.e.P(this)) {
                        m.b("BillingLifecycle", "acknowledgePurchase because user is premium ");
                        this.J.l(e2);
                    }
                }
            }
        }
        j E2 = com.tempmail.utils.e.E(list);
        this.L = E2;
        if (E2 != null) {
            m.b("BillingLifecycle", "purchaseToRestore " + this.L.toString());
            m.b("BillingLifecycle", "purchaseToRestore date" + new Date(this.L.d()).toString());
        } else {
            m.b("BillingLifecycle", "purchaseToRestore null");
        }
        this.U = true;
        x1();
    }

    public void A(j jVar, ActivationWrapper activationWrapper) {
        if (activationWrapper.getError() == null) {
            p1(jVar, activationWrapper.getResult().getSid());
            com.tempmail.utils.e.l(this, this.y, activationWrapper.getResult().getMailAddresses(), false);
            ((t) this.F).a();
            v(g.s(this.y));
            U();
            s.Y(this, true);
            return;
        }
        g.H(this.y, jVar.b());
        a(false);
        com.tempmail.utils.e.Z(this, activationWrapper.getError(), getString(R.string.analytics_screen_name_billing), "user.activation");
    }

    public void A1() {
        ((t) this.F).f(true);
    }

    public void B1(j jVar) {
        if (jVar.g().equals("subscription_monthly_trial")) {
            m.b("BillingLifecycle", "save trial purchased");
            s.v0(this, true);
        }
        U0();
        ((t) this.F).d(jVar);
    }

    public l D() {
        return this.F;
    }

    public void G(j jVar, SidWrapper sidWrapper) {
        if (sidWrapper.getError() == null) {
            p1(jVar, sidWrapper.getResult().getSid());
            ((t) this.F).f(true);
            return;
        }
        if (com.tempmail.utils.e.i(sidWrapper.getError().getCode())) {
            g.H(this.y, jVar.b());
        }
        com.tempmail.utils.e.Z(this, sidWrapper.getError(), getString(R.string.analytics_screen_name_billing), "subscription.update");
    }

    public void O(String str, List<ExtendedMail> list) {
        m.b("BillingLifecycle", "onInboxLoaded " + list.size());
        this.N = false;
        int d2 = r.d(this.y, str, list);
        q1(com.tempmail.utils.e.q(this, this.y));
        if (d2 > 0) {
            q.f(getApplicationContext());
            d.e(this, this.A, d2);
        }
    }

    public s P() {
        return this.M;
    }

    public void P0() {
        StringBuilder sb = new StringBuilder();
        sb.append("skuDetailsRemoveAd is  null ");
        sb.append(this.R == null);
        m.b("BillingLifecycle", sb.toString());
        this.I = true;
        if (this.P == null && this.Q == null) {
            this.K.i();
        } else {
            n1(this.P, this.Q);
        }
    }

    public void Q0() {
        j jVar = this.P;
        if (jVar != null) {
            this.J.m(jVar.e(), new k(this));
            return;
        }
        F0();
        Toast.makeText(this, "Purchase is null", 1).show();
    }

    public void R(boolean z) {
        m.b("BillingLifecycle", "showPremiumActivatedComputer");
        s.j0(this, (String) null);
        if (z) {
            t1();
        } else {
            r1();
        }
    }

    public j R0(j jVar, j jVar2) {
        if (jVar != null) {
            return jVar;
        }
        if (jVar2 != null) {
            return jVar2;
        }
        return null;
    }

    public void S(ApiError apiError) {
        m.b("BillingLifecycle", "onInboxAllFailToLoad");
        com.tempmail.utils.e.Z(this, apiError, getString(R.string.analytics_screen_name_billing), "user.activation");
        if (apiError.getCode() != null && com.tempmail.utils.e.i(apiError.getCode())) {
            V0();
        } else if (apiError.getCode() != null) {
            com.tempmail.utils.e.Z(this, apiError, getString(R.string.analytics_screen_name_billing), "get.messages");
        }
    }

    public void S0() {
        this.K = (com.tempmail.w.a) new x(this).a(com.tempmail.w.a.class);
        BillingClientLifecycle f2 = ((ApplicationClass) getApplication()).f();
        this.J = f2;
        f2.f12823a.f(this, new j(this));
        this.J.f12825c.f(this, new i(this));
        this.J.f12824b.f(this, new f(this));
        this.J.f12826d.f(this, new f(this));
        this.J.f12827e.f(this, new h(this));
        this.J.f12828f.f(this, new l(this));
        this.K.f13158d.f(this, new g(this));
        this.J.A();
        this.J.B();
        this.J.D();
    }

    public void T0() {
        m.b("BillingLifecycle", "initiateFreePresenter");
        p pVar = new p(this, b.f(this), this, this.w);
        this.M = pVar;
        this.F = pVar;
    }

    public void U() {
    }

    public void U0() {
        m.b("BillingLifecycle", "initiatePremiumPresenter");
        v vVar = new v(this, b.f(this), this, this.w);
        this.M = vVar;
        this.F = vVar;
    }

    public void V0() {
        m.b("BillingLifecycle", "initiatePresenter");
        if (com.tempmail.utils.e.P(this)) {
            T0();
        } else {
            U0();
        }
    }

    public void W() {
        u1(getString(R.string.message_activation_error_title), 2);
    }

    public void W0() {
    }

    public /* synthetic */ void Z0(com.android.billingclient.api.g gVar, String str) {
        m.d("BillingLifecycle", "Billing response code " + gVar.b() + " message " + gVar.a());
        if (gVar.b() == 0) {
            m.d("BillingLifecycle", "Successfully consumed");
            F0();
            Toast.makeText(this, "Successfully consumed", 1).show();
            F0();
            com.tempmail.utils.b.o(this, false);
            W0();
            this.P = null;
            return;
        }
        F0();
        Toast.makeText(this, "Consume error", 1).show();
    }

    public /* synthetic */ void a1(List list) {
        if (list != null) {
            m.b("BillingLifecycle", "purchaseUpdateEvent");
            m1(list);
        }
    }

    public /* synthetic */ void b1(List list) {
        if (list != null) {
            m.b("BillingLifecycle", "purchases");
            m1(list);
        }
    }

    public void c0(boolean z, Map<String, List<ExtendedMail>> map) {
        m.b("BillingLifecycle", "onInboxAllLoaded");
        com.tempmail.utils.e.l(this, this.y, map, false);
        if (z) {
            v(g.s(this.y));
            U();
            ((t) this.F).a();
        }
    }

    public /* synthetic */ void c1(com.android.billingclient.api.f fVar) {
        m.d("Billing", "billingFlow start ");
        if (fVar != null) {
            m.d("Billing", "billingFlowParams != null ");
            if (!e.d(fVar.d()) && !fVar.d().equals("remove_ad_subscription")) {
                this.E = true;
            }
            m.d("Billing", "isBillingSet " + this.E);
            this.J.t(this, fVar);
        }
    }

    public void d() {
        m.b("BillingLifecycle", "onRemoveAdRequestFailed");
        this.H = false;
        this.G = true;
        F0();
        com.tempmail.utils.b.o(this, false);
        e1();
    }

    public void e1() {
    }

    public void f1() {
        m.b("BillingLifecycle", "onAdRemoved");
    }

    public void h(Throwable th) {
        this.N = false;
        if (!(th instanceof IllegalStateException)) {
            Toast.makeText(this, R.string.error_message_unknown, 1).show();
        }
    }

    public void h1() {
    }

    public void i(j jVar) {
        m.b("BillingLifecycle", "onRemoveAdFinished");
        boolean z = false;
        this.H = false;
        this.G = true;
        F0();
        com.tempmail.utils.b.o(this, true);
        StringBuilder sb = new StringBuilder();
        sb.append("adPurchase==null ");
        if (jVar == null) {
            z = true;
        }
        sb.append(z);
        m.b("BillingLifecycle", sb.toString());
        this.J.l(jVar.e());
        m.b("BillingLifecycle", "after acknowledgePurchase");
        f1();
        m.b("BillingLifecycle", "after onAdRemoved");
    }

    public void n1(j jVar, j jVar2) {
        StringBuilder sb = new StringBuilder();
        sb.append("removeAd, is purchaseInApp null =  ");
        sb.append(jVar == null);
        sb.append(" purchaseSubs null ");
        sb.append(jVar2 == null);
        m.b("BillingLifecycle", sb.toString());
        j R0 = R0(jVar, jVar2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("removeAd, isAdRemoved=  ");
        F0();
        sb2.append(com.tempmail.utils.b.h(this));
        m.b("BillingLifecycle", sb2.toString());
        F0();
        if (com.tempmail.utils.b.h(this)) {
            this.G = true;
        } else if (R0 != null) {
            m.b("BillingLifecycle", "purchase!=null");
            if (!this.H && this.I) {
                m.b("BillingLifecycle", "start request");
                this.H = true;
                this.G = false;
                if (e.e(R0)) {
                    this.O.b(R0);
                } else {
                    this.O.a(R0);
                }
            }
        } else {
            this.G = true;
            F0();
            com.tempmail.utils.b.o(this, false);
        }
    }

    public void o1(j jVar) {
        B1(jVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.O = new y(this, b.l(false), this, this.w);
        V0();
        this.N = getIntent().getBooleanExtra("extra_failed_to_load", false);
        S0();
    }

    public void p1(j jVar, String str) {
        this.J.l(jVar.e());
        g.i(this.y);
        g.H(this.y, jVar.b());
        s.s0(this, str);
        W0();
        invalidateOptionsMenu();
        com.tempmail.utils.e.c(this, s.x(this).booleanValue());
        L0(this, jVar);
    }

    public abstract void q1(int i);

    public void r1() {
        com.tempmail.o.s.z2(getString(R.string.message_title_information), getString(R.string.message_ots_not_activated)).x2(k0(), com.tempmail.o.s.class.getSimpleName());
    }

    public void s1(f fVar) {
        com.tempmail.o.o oVar = this.S;
        if (oVar == null || !oVar.E0() || fVar != null) {
            try {
                com.tempmail.o.o z2 = com.tempmail.o.o.z2();
                this.S = z2;
                if (fVar != null) {
                    z2.B2(fVar);
                    this.S.t2(false);
                }
                this.S.x2(k0(), com.tempmail.o.o.class.getSimpleName());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            m.b("BillingLifecycle", "SubscribedDialog already shown");
        }
    }

    public void t1() {
        try {
            com.tempmail.o.o.A2(getString(R.string.message_success), getString(R.string.message_ots_activated)).x2(k0(), com.tempmail.o.o.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void u1(String str, int i) {
        String str2;
        String str3;
        boolean z = false;
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
                z = true;
            }
            str2 = getString(R.string.message_network_error_message) + "\nError details: \nFailed with " + str3;
        } else {
            str2 = getString(R.string.message_network_error_message);
        }
        String str4 = null;
        if (z) {
            str4 = getString(17039360);
        }
        com.tempmail.o.s A2 = com.tempmail.o.s.A2(getString(R.string.message_try_again), str4, str, str2);
        A2.t2(z);
        A2.B2(i, new a());
        try {
            A2.x2(k0(), com.tempmail.o.s.class.getSimpleName());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void v(EmailAddressTable emailAddressTable) {
    }

    public void v1() {
        m.b("BillingLifecycle", "startPurchaseFlow");
        if (com.tempmail.utils.e.P(this)) {
            w1();
        } else {
            s1((f) null);
        }
    }

    public void w(j jVar) {
        u1(getString(R.string.message_activation_error_title), 1);
    }

    public void w1() {
        StringBuilder sb = new StringBuilder();
        sb.append("startPurchaseRestoreFlow ");
        sb.append(this.L == null);
        m.b("BillingLifecycle", sb.toString());
        j jVar = this.L;
        if (jVar != null) {
            o1(jVar);
        } else {
            N0(getString(R.string.message_not_have_subscription));
        }
    }

    public void x() {
        m.b("BillingLifecycle", "onNetworkErrorInbox");
        this.N = true;
        if (g.y(this.y).size() == 0) {
            u1(getString(R.string.message_activation_error_title), 3);
        }
    }

    public void x1() {
        if (this.T && this.U) {
            n1(this.P, this.Q);
        }
    }

    public void y1(List<PurchaseTable> list) {
        try {
            B1(new j(list.get(0).getOriginalJson(), list.get(0).getSignature()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void z1() {
        ((t) this.F).a();
    }
}
