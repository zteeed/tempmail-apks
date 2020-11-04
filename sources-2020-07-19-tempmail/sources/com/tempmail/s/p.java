package com.tempmail.s;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.R;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.ApiError;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.DomainsWrapper;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.PremiumEmailsWrapper;
import com.tempmail.api.models.answers.RpcWrapper;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.ActivationBody;
import com.tempmail.api.models.requests.ActivationParams;
import com.tempmail.api.models.requests.DomainsBody;
import com.tempmail.api.models.requests.EmailBody;
import com.tempmail.api.models.requests.EmailListBody;
import com.tempmail.api.models.requests.PushUpdateBody;
import com.tempmail.api.models.requests.SubscriptionUpdateBody;
import com.tempmail.api.models.requests.VerifyOtsBody;
import com.tempmail.j.b;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PremiumMainPresenter */
public class p extends m implements n {
    public final ArrayList<o> g = new ArrayList<>();
    public final ArrayList<l> h = new ArrayList<>();
    FirebaseAnalytics i;

    /* compiled from: PremiumMainPresenter */
    class a extends com.tempmail.j.c<DomainsWrapper> {
        a(Context context) {
            super(context);
        }

        public void c() {
            p.this.k(false);
            p.this.A();
        }

        public void d(Throwable th) {
            m.b(m.f12494f, "onError");
            th.printStackTrace();
            p.this.k(false);
        }

        /* renamed from: g */
        public void onNext(DomainsWrapper domainsWrapper) {
            boolean z = false;
            p.this.k(false);
            m.b(m.f12494f, "getDomainsList success ");
            String str = m.f12494f;
            StringBuilder sb = new StringBuilder();
            sb.append("getDomainsList error  ");
            if (domainsWrapper.getError() == null) {
                z = true;
            }
            sb.append(String.valueOf(z));
            m.b(str, sb.toString());
            String str2 = m.f12494f;
            m.b(str2, "getDomainsList str size  " + domainsWrapper.getResult().getDomains().size());
            if (domainsWrapper.getError() == null) {
                List<DomainExpired> domainExpiredArrayList = domainsWrapper.getResult().getDomainExpiredArrayList();
                if (domainExpiredArrayList != null && domainExpiredArrayList.size() > 0) {
                    p.this.t(domainExpiredArrayList);
                } else if (domainsWrapper.getResult().getDomains() == null || domainsWrapper.getResult().getDomains().size() <= 0) {
                    p.this.A();
                } else {
                    p.this.t(p.this.x(domainsWrapper.getResult().getDomains()));
                }
            } else {
                p.this.A();
            }
        }

        public void onComplete() {
            m.b(m.f12494f, "getDomains onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class b extends com.tempmail.j.c<PremiumEmailsWrapper> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
            p.this.j(false);
            p.this.n();
        }

        public void d(Throwable th) {
            m.b(m.f12494f, "onError");
            th.printStackTrace();
            p.this.m(th);
            p.this.j(false);
        }

        /* renamed from: g */
        public void onNext(PremiumEmailsWrapper premiumEmailsWrapper) {
            m.b(m.f12494f, "onNext");
            if (premiumEmailsWrapper.getResult() != null) {
                p.this.l(this.g, premiumEmailsWrapper.getResult().getMailList());
                p.this.j(false);
                return;
            }
            p.this.C(premiumEmailsWrapper.getError());
        }

        public void onComplete() {
            m.b(m.f12494f, "getInboxList onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class c extends com.tempmail.j.c<ActivationWrapper> {
        final /* synthetic */ com.android.billingclient.api.e g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, com.android.billingclient.api.e eVar) {
            super(context);
            this.g = eVar;
        }

        public void c() {
            p.this.k(false);
            p.this.D(this.g);
        }

        public void d(Throwable th) {
            m.b(m.f12494f, "userActivation onError");
            th.printStackTrace();
            p.this.k(false);
            p pVar = p.this;
            pVar.q("select_content", pVar.f12499e.getString(R.string.analytics_event_type_error), p.this.f12499e.getString(R.string.analytics_premium_payment_failed));
        }

        /* renamed from: g */
        public void onNext(ActivationWrapper activationWrapper) {
            m.b(m.f12494f, "userActivation onNext");
            if (activationWrapper.getError() == null) {
                p.this.r(this.g, activationWrapper);
            } else {
                p.this.y(this.g, activationWrapper);
            }
        }

        public void onComplete() {
            p.this.k(false);
            m.b(m.f12494f, "userActivation onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class d extends com.tempmail.j.c<RpcWrapper> {
        d(Context context) {
            super(context);
        }

        public void c() {
            p.this.E(false);
            p.this.k(false);
        }

        public void d(Throwable th) {
            m.b(m.f12494f, "verifyOts onError");
            th.printStackTrace();
            p.this.E(false);
            p.this.k(false);
        }

        /* renamed from: g */
        public void onNext(RpcWrapper rpcWrapper) {
            m.b(m.f12494f, "verifyOts onNext");
            if (rpcWrapper.getError() == null) {
                p.this.E(true);
            } else {
                p.this.E(false);
            }
            p.this.k(false);
        }

        public void onComplete() {
            m.b(m.f12494f, "verifyOts onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class e extends com.tempmail.j.c<SidWrapper> {
        final /* synthetic */ com.android.billingclient.api.e g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, com.android.billingclient.api.e eVar) {
            super(context);
            this.g = eVar;
        }

        public void c() {
            p.this.k(false);
            p.this.D(this.g);
        }

        public void d(Throwable th) {
            m.b(m.f12494f, "subscriptionUpdate onError");
            th.printStackTrace();
            p.this.k(false);
            p pVar = p.this;
            pVar.q("select_content", pVar.f12499e.getString(R.string.analytics_event_type_error), p.this.f12499e.getString(R.string.analytics_premium_payment_failed));
        }

        /* renamed from: g */
        public void onNext(SidWrapper sidWrapper) {
            m.b(m.f12494f, "subscriptionUpdate onNext");
            if (sidWrapper.getError() == null) {
                p.this.s(this.g, sidWrapper);
            } else {
                p.this.s(this.g, sidWrapper);
            }
        }

        public void onComplete() {
            p.this.k(false);
            m.b(m.f12494f, "subscriptionUpdate onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class f extends com.tempmail.j.c<ActivationWrapper> {
        final /* synthetic */ boolean g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context, boolean z) {
            super(context);
            this.g = z;
        }

        public void c() {
            p.this.n();
        }

        public void d(Throwable th) {
            m.b(m.f12494f, "onError");
            th.printStackTrace();
            p.this.m(th);
        }

        /* renamed from: g */
        public void onNext(ActivationWrapper activationWrapper) {
            m.b(m.f12494f, "onNext");
            if (activationWrapper.getError() == null) {
                Map<String, List<ExtendedMail>> mailAddresses = activationWrapper.getResult().getMailAddresses();
                p.this.B(this.g, mailAddresses);
                com.tempmail.utils.e.a0(p.this.f12499e, mailAddresses);
                return;
            }
            p.this.C(activationWrapper.getError());
        }

        public void onComplete() {
            m.b(m.f12494f, "getAllInboxList onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class g extends com.tempmail.j.c<SidWrapper> {
        g(Context context) {
            super(context);
        }

        public void c() {
        }

        public void d(Throwable th) {
            m.b(m.f12494f, "onError");
            th.printStackTrace();
        }

        /* renamed from: g */
        public void onNext(SidWrapper sidWrapper) {
            m.b(m.f12494f, "onNext");
            if (sidWrapper.getError() == null) {
                s.l0(p.this.f12499e, true);
            }
        }

        public void onComplete() {
            m.b(m.f12494f, "pushUpdate onComplete");
        }
    }

    public p(Context context, b.a aVar, o oVar, d.a.y.a aVar2) {
        super(context, aVar, oVar, aVar2);
        this.g.add(oVar);
        this.i = FirebaseAnalytics.getInstance(context);
    }

    public void A() {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            m.b(m.f12494f, "updateDomainLoadedFailed");
            if (next != null) {
                next.X();
            }
        }
    }

    public void B(boolean z, Map<String, List<ExtendedMail>> map) {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.e0(z, map);
            }
        }
        Iterator<l> it2 = this.h.iterator();
        while (it2.hasNext()) {
            l next2 = it2.next();
            if (next2 != null) {
                next2.e0(z, map);
            }
        }
    }

    public void C(ApiError apiError) {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.U(apiError);
            }
        }
        Iterator<l> it2 = this.h.iterator();
        while (it2.hasNext()) {
            l next2 = it2.next();
            if (next2 != null) {
                next2.U(apiError);
            }
        }
    }

    public void D(com.android.billingclient.api.e eVar) {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.x(eVar);
            }
        }
    }

    public void E(boolean z) {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.T(z);
                return;
            }
        }
    }

    public void F() {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.F((com.tempmail.utils.z.f) null);
                return;
            }
        }
    }

    public void a() {
        DomainsBody domainsBody = new DomainsBody();
        m.b(m.f12494f, "getPremiumDomains ");
        this.f12498d.b((d.a.y.b) this.f12497c.k(domainsBody).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12499e)));
    }

    public void b(com.android.billingclient.api.e eVar) {
        String str;
        m.b(m.f12494f, "userActivation purchase");
        k(true);
        if (s.L(this.f12499e) != null) {
            str = s.L(this.f12499e);
        } else {
            str = s.A(this.f12499e) != null ? s.A(this.f12499e) : null;
        }
        if (str == null) {
            o(eVar);
        } else {
            v(str, eVar);
        }
    }

    public void c(String str) {
        String str2 = m.f12494f;
        m.b(str2, "getInboxList " + str);
        j(true);
        this.f12498d.b((d.a.y.b) this.f12497c.g(new EmailBody(s.L(this.f12499e), s.y(this.f12499e), str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this.f12499e, str)));
    }

    public void d(boolean z) {
        s.l0(this.f12499e, false);
        this.f12498d.b((d.a.y.b) this.f12497c.p(new PushUpdateBody(s.L(this.f12499e), z)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new g(this.f12499e)));
    }

    public void e(String str, String str2) {
        k(true);
        this.f12498d.b((d.a.y.b) com.tempmail.j.b.k(true).n(new VerifyOtsBody(str, str2)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new d(this.f12499e)));
    }

    public void f(boolean z) {
        this.f12498d.b((d.a.y.b) this.f12497c.m(new EmailListBody(s.L(this.f12499e), s.y(this.f12499e))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new f(this.f12499e, z)));
    }

    public void o(com.android.billingclient.api.e eVar) {
        this.f12498d.b((d.a.y.b) com.tempmail.j.b.k(true).l(new ActivationBody(new ActivationParams((String) null, s.J(this.f12499e), "gp", eVar.f(), eVar.d(), s.w(this.f12499e).booleanValue()))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new c(this.f12499e, eVar)));
    }

    public void p(l lVar) {
        if (!this.h.contains(lVar)) {
            this.h.add(lVar);
        }
    }

    public void q(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(str2, str3);
        this.i.a(str, bundle);
    }

    public void r(com.android.billingclient.api.e eVar, ActivationWrapper activationWrapper) {
        i(com.tempmail.j.b.b(true));
        y(eVar, activationWrapper);
    }

    public void s(com.android.billingclient.api.e eVar, SidWrapper sidWrapper) {
        i(com.tempmail.j.b.b(true));
        w(eVar, sidWrapper);
    }

    public void t(List<DomainExpired> list) {
        z(list);
        String E = s.E(this.f12499e);
        String str = m.f12494f;
        m.b(str, "processSuccessfulDomainsLoaded ots " + E);
        if (E == null) {
            F();
        } else {
            e(s.L(this.f12499e), E);
        }
    }

    public void u(l lVar) {
        this.h.remove(lVar);
    }

    public void v(String str, com.android.billingclient.api.e eVar) {
        k(true);
        this.f12498d.b((d.a.y.b) com.tempmail.j.b.k(true).f(new SubscriptionUpdateBody(str, eVar.d(), eVar.f(), s.J(this.f12499e), s.w(this.f12499e).booleanValue())).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new e(this.f12499e, eVar)));
    }

    public void w(com.android.billingclient.api.e eVar, SidWrapper sidWrapper) {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.J(eVar, sidWrapper);
            }
        }
    }

    public List<DomainExpired> x(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String domainExpired : list) {
            arrayList.add(new DomainExpired(domainExpired, (Long) null));
        }
        return arrayList;
    }

    public void y(com.android.billingclient.api.e eVar, ActivationWrapper activationWrapper) {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.B(eVar, activationWrapper);
            }
        }
    }

    public void z(List<DomainExpired> list) {
        Iterator<o> it = this.g.iterator();
        while (it.hasNext()) {
            o next = it.next();
            if (next != null) {
                next.c(list);
            }
        }
    }
}
