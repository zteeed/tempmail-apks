package com.tempmail.t;

import android.content.Context;
import com.android.billingclient.api.j;
import com.google.firebase.analytics.FirebaseAnalytics;
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
import com.tempmail.l.b;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PremiumMainPresenter */
public class v extends s implements t {
    public final ArrayList<u> g = new ArrayList<>();
    public final ArrayList<r> h = new ArrayList<>();
    FirebaseAnalytics i;

    /* compiled from: PremiumMainPresenter */
    class a extends com.tempmail.l.c<DomainsWrapper> {
        a(Context context) {
            super(context);
        }

        public void c(Throwable th) {
            v.this.k(false);
            v.this.z();
        }

        public void d(Throwable th) {
            m.b(s.f13069f, "onError");
            th.printStackTrace();
            v.this.k(false);
        }

        /* renamed from: f */
        public void onNext(DomainsWrapper domainsWrapper) {
            boolean z = false;
            v.this.k(false);
            m.b(s.f13069f, "getDomainsList success ");
            String str = s.f13069f;
            StringBuilder sb = new StringBuilder();
            sb.append("getDomainsList error  ");
            if (domainsWrapper.getError() == null) {
                z = true;
            }
            sb.append(z);
            m.b(str, sb.toString());
            String str2 = s.f13069f;
            m.b(str2, "getDomainsList str size  " + domainsWrapper.getResult().getDomains().size());
            if (domainsWrapper.getError() == null) {
                List<DomainExpired> domainExpiredArrayList = domainsWrapper.getResult().getDomainExpiredArrayList();
                if (domainExpiredArrayList != null && domainExpiredArrayList.size() > 0) {
                    v.this.s(domainExpiredArrayList);
                } else if (domainsWrapper.getResult().getDomains() == null || domainsWrapper.getResult().getDomains().size() <= 0) {
                    v.this.z();
                } else {
                    v.this.s(v.this.w(domainsWrapper.getResult().getDomains()));
                }
            } else {
                v.this.z();
            }
        }

        public void onComplete() {
            m.b(s.f13069f, "getDomains onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class b extends com.tempmail.l.c<PremiumEmailsWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f13076f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(context);
            this.f13076f = str;
        }

        public void c(Throwable th) {
            v.this.j(false);
            v.this.n();
        }

        public void d(Throwable th) {
            m.b(s.f13069f, "onError");
            th.printStackTrace();
            v.this.m(th);
            v.this.j(false);
        }

        /* renamed from: f */
        public void onNext(PremiumEmailsWrapper premiumEmailsWrapper) {
            m.b(s.f13069f, "onNext");
            if (premiumEmailsWrapper.getResult() != null) {
                v.this.l(this.f13076f, premiumEmailsWrapper.getResult().getMailList());
                v.this.j(false);
                return;
            }
            v.this.B(premiumEmailsWrapper.getError());
        }

        public void onComplete() {
            m.b(s.f13069f, "getInboxList onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class c extends com.tempmail.l.c<ActivationWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f13077f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, j jVar) {
            super(context);
            this.f13077f = jVar;
        }

        public void c(Throwable th) {
            v.this.k(false);
            v vVar = v.this;
            com.tempmail.utils.d.h(vVar.f13074e, vVar.i, "user.activation", com.tempmail.utils.d.c(th), 0);
            v.this.C(this.f13077f);
        }

        public void d(Throwable th) {
            m.b(s.f13069f, "userActivation onError");
            th.printStackTrace();
            v.this.k(false);
            v vVar = v.this;
            com.tempmail.utils.d.h(vVar.f13074e, vVar.i, "user.activation", (String) null, com.tempmail.utils.d.a(th));
        }

        /* renamed from: f */
        public void onNext(ActivationWrapper activationWrapper) {
            m.b(s.f13069f, "userActivation onNext");
            if (activationWrapper.getError() == null) {
                v.this.q(this.f13077f, activationWrapper);
            } else {
                v.this.x(this.f13077f, activationWrapper);
            }
        }

        public void onComplete() {
            v.this.k(false);
            m.b(s.f13069f, "userActivation onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class d extends com.tempmail.l.c<RpcWrapper> {
        d(Context context) {
            super(context);
        }

        public void c(Throwable th) {
            v.this.D(false);
            v.this.k(false);
        }

        public void d(Throwable th) {
            m.b(s.f13069f, "verifyOts onError");
            th.printStackTrace();
            v.this.D(false);
            v.this.k(false);
        }

        /* renamed from: f */
        public void onNext(RpcWrapper rpcWrapper) {
            m.b(s.f13069f, "verifyOts onNext");
            if (rpcWrapper.getError() == null) {
                v.this.D(true);
            } else {
                v.this.D(false);
            }
            v.this.k(false);
        }

        public void onComplete() {
            m.b(s.f13069f, "verifyOts onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class e extends com.tempmail.l.c<SidWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f13079f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, j jVar) {
            super(context);
            this.f13079f = jVar;
        }

        public void c(Throwable th) {
            v.this.k(false);
            v vVar = v.this;
            com.tempmail.utils.d.h(vVar.f13074e, vVar.i, "subscription.update", com.tempmail.utils.d.c(th), 0);
            v.this.C(this.f13079f);
        }

        public void d(Throwable th) {
            m.b(s.f13069f, "subscriptionUpdate onError");
            th.printStackTrace();
            v.this.k(false);
            v vVar = v.this;
            com.tempmail.utils.d.h(vVar.f13074e, vVar.i, "subscription.update", (String) null, com.tempmail.utils.d.a(th));
        }

        /* renamed from: f */
        public void onNext(SidWrapper sidWrapper) {
            m.b(s.f13069f, "subscriptionUpdate onNext");
            if (sidWrapper.getError() == null) {
                v.this.r(this.f13079f, sidWrapper);
            } else {
                v.this.r(this.f13079f, sidWrapper);
            }
        }

        public void onComplete() {
            v.this.k(false);
            m.b(s.f13069f, "subscriptionUpdate onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class f extends com.tempmail.l.c<ActivationWrapper> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f13080f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context, boolean z) {
            super(context);
            this.f13080f = z;
        }

        public void c(Throwable th) {
            v.this.n();
        }

        public void d(Throwable th) {
            m.b(s.f13069f, "onError");
            th.printStackTrace();
            v.this.m(th);
        }

        /* renamed from: f */
        public void onNext(ActivationWrapper activationWrapper) {
            m.b(s.f13069f, "onNext");
            if (activationWrapper.getError() == null) {
                Map<String, List<ExtendedMail>> mailAddresses = activationWrapper.getResult().getMailAddresses();
                v.this.A(this.f13080f, mailAddresses);
                com.tempmail.utils.e.a0(v.this.f13074e, mailAddresses);
                return;
            }
            v.this.B(activationWrapper.getError());
        }

        public void onComplete() {
            m.b(s.f13069f, "getAllInboxList onComplete");
        }
    }

    /* compiled from: PremiumMainPresenter */
    class g extends com.tempmail.l.c<SidWrapper> {
        g(Context context) {
            super(context);
        }

        public void c(Throwable th) {
        }

        public void d(Throwable th) {
            m.b(s.f13069f, "onError");
            th.printStackTrace();
        }

        /* renamed from: f */
        public void onNext(SidWrapper sidWrapper) {
            m.b(s.f13069f, "onNext");
            if (sidWrapper.getError() == null) {
                s.n0(v.this.f13074e, true);
            }
        }

        public void onComplete() {
            m.b(s.f13069f, "pushUpdate onComplete");
        }
    }

    public v(Context context, b.a aVar, u uVar, d.a.y.a aVar2) {
        super(context, aVar, uVar, aVar2);
        this.g.add(uVar);
        this.i = FirebaseAnalytics.getInstance(context);
    }

    public void A(boolean z, Map<String, List<ExtendedMail>> map) {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.c0(z, map);
            }
        }
        Iterator<r> it2 = this.h.iterator();
        while (it2.hasNext()) {
            r next2 = it2.next();
            if (next2 != null) {
                next2.c0(z, map);
            }
        }
    }

    public void B(ApiError apiError) {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.S(apiError);
            }
        }
        Iterator<r> it2 = this.h.iterator();
        while (it2.hasNext()) {
            r next2 = it2.next();
            if (next2 != null) {
                next2.S(apiError);
            }
        }
    }

    public void C(j jVar) {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.w(jVar);
            }
        }
    }

    public void D(boolean z) {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.R(z);
                return;
            }
        }
    }

    public void a() {
        DomainsBody domainsBody = new DomainsBody();
        m.b(s.f13069f, "getPremiumDomains ");
        this.f13073d.b((d.a.y.b) this.f13072c.l(domainsBody).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f13074e)));
    }

    public void b(boolean z) {
        s.n0(this.f13074e, false);
        this.f13073d.b((d.a.y.b) this.f13072c.q(new PushUpdateBody(s.L(this.f13074e), z)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new g(this.f13074e)));
    }

    public void c(String str) {
        String str2 = s.f13069f;
        m.b(str2, "getInboxList " + str);
        j(true);
        this.f13073d.b((d.a.y.b) this.f13072c.g(new EmailBody(s.L(this.f13074e), s.z(this.f13074e), str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this.f13074e, str)));
    }

    public void d(j jVar) {
        String str;
        m.b(s.f13069f, "userActivation purchase");
        k(true);
        if (s.L(this.f13074e) != null) {
            str = s.L(this.f13074e);
        } else {
            str = s.B(this.f13074e) != null ? s.B(this.f13074e) : null;
        }
        if (str == null) {
            o(jVar);
        } else {
            u(str, jVar);
        }
    }

    public void e(String str, String str2) {
        k(true);
        this.f13073d.b((d.a.y.b) com.tempmail.l.b.l(true).o(new VerifyOtsBody(str, str2)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new d(this.f13074e)));
    }

    public void f(boolean z) {
        this.f13073d.b((d.a.y.b) this.f13072c.n(new EmailListBody(s.L(this.f13074e), s.z(this.f13074e))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new f(this.f13074e, z)));
    }

    public void o(j jVar) {
        this.f13073d.b((d.a.y.b) com.tempmail.l.b.l(true).m(new ActivationBody(new ActivationParams((String) null, s.J(this.f13074e), "gp", jVar.g(), jVar.e(), s.x(this.f13074e).booleanValue()))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new c(this.f13074e, jVar)));
    }

    public void p(r rVar) {
        if (!this.h.contains(rVar)) {
            this.h.add(rVar);
        }
    }

    public void q(j jVar, ActivationWrapper activationWrapper) {
        i(com.tempmail.l.b.b(true));
        x(jVar, activationWrapper);
    }

    public void r(j jVar, SidWrapper sidWrapper) {
        i(com.tempmail.l.b.b(true));
        v(jVar, sidWrapper);
    }

    public void s(List<DomainExpired> list) {
        y(list);
    }

    public void t(r rVar) {
        this.h.remove(rVar);
    }

    public void u(String str, j jVar) {
        k(true);
        this.f13073d.b((d.a.y.b) com.tempmail.l.b.l(true).f(new SubscriptionUpdateBody(str, jVar.e(), jVar.g(), s.J(this.f13074e), s.x(this.f13074e).booleanValue())).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new e(this.f13074e, jVar)));
    }

    public void v(j jVar, SidWrapper sidWrapper) {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.G(jVar, sidWrapper);
            }
        }
    }

    public List<DomainExpired> w(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String domainExpired : list) {
            arrayList.add(new DomainExpired(domainExpired, (Long) null));
        }
        return arrayList;
    }

    public void x(j jVar, ActivationWrapper activationWrapper) {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.A(jVar, activationWrapper);
            }
        }
    }

    public void y(List<DomainExpired> list) {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            if (next != null) {
                next.b(list);
            }
        }
    }

    public void z() {
        Iterator<u> it = this.g.iterator();
        while (it.hasNext()) {
            u next = it.next();
            m.b(s.f13069f, "updateDomainLoadedFailed");
            if (next != null) {
                next.W();
            }
        }
    }
}
