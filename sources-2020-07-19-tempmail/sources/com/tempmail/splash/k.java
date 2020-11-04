package com.tempmail.splash;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.DomainsWrapper;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.requests.DomainsBody;
import com.tempmail.api.models.requests.EmailListBody;
import com.tempmail.j.b;
import com.tempmail.j.c;
import com.tempmail.utils.e;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import retrofit2.HttpException;

/* compiled from: PremiumSplashPresenter */
public class k implements j {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12531e = "k";

    /* renamed from: a  reason: collision with root package name */
    private final b.a f12532a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f12533b;

    /* renamed from: c  reason: collision with root package name */
    d.a.y.a f12534c;

    /* renamed from: d  reason: collision with root package name */
    Context f12535d;

    /* compiled from: PremiumSplashPresenter */
    class a extends c<DomainsWrapper> {
        a(Context context) {
            super(context);
        }

        public void c() {
            k.this.f12533b.H();
        }

        public void d(Throwable th) {
            m.b(k.f12531e, "onError");
            th.printStackTrace();
            k.this.f12533b.c(new ArrayList());
        }

        /* renamed from: g */
        public void onNext(DomainsWrapper domainsWrapper) {
            m.b(k.f12531e, "onNext");
            if (domainsWrapper.getError() == null) {
                List<DomainExpired> domainExpiredArrayList = domainsWrapper.getResult().getDomainExpiredArrayList();
                if (domainExpiredArrayList != null && domainExpiredArrayList.size() > 0) {
                    k.this.f12533b.c(domainsWrapper.getResult().getDomainExpiredArrayList());
                } else if (domainsWrapper.getResult().getDomains() == null || domainsWrapper.getResult().getDomains().size() <= 0) {
                    k.this.f12533b.c(new ArrayList());
                } else {
                    k.this.f(domainsWrapper.getResult().getDomains());
                }
            } else {
                k.this.f12533b.c(new ArrayList());
            }
        }

        public void onComplete() {
            m.b(k.f12531e, "getDomains onComplete");
        }
    }

    /* compiled from: PremiumSplashPresenter */
    class b extends c<ActivationWrapper> {
        b(Context context) {
            super(context);
        }

        public void c() {
            k.this.f12533b.H();
        }

        public void d(Throwable th) {
            m.b(k.f12531e, "onError");
            th.printStackTrace();
            k.this.f12533b.b0(((HttpException) th).response());
        }

        /* renamed from: g */
        public void onNext(ActivationWrapper activationWrapper) {
            m.b(k.f12531e, "onNext");
            if (activationWrapper.getError() == null) {
                Map<String, List<ExtendedMail>> mailAddresses = activationWrapper.getResult().getMailAddresses();
                k.this.g(mailAddresses);
                e.a0(k.this.f12535d, mailAddresses);
                return;
            }
            k.this.f12533b.p(activationWrapper.getError());
        }

        public void onComplete() {
            m.b(k.f12531e, "getDomains onComplete");
        }
    }

    public k(Context context, b.a aVar, i iVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "restApiClient cannot be null");
        this.f12532a = aVar;
        Preconditions.l(iVar, "splashView cannot be null!");
        this.f12533b = iVar;
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f12534c = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f12535d = context;
    }

    public void a() {
        this.f12534c.b((d.a.y.b) this.f12532a.k(new DomainsBody()).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12535d)));
    }

    public void d() {
        this.f12534c.b((d.a.y.b) this.f12532a.m(new EmailListBody(s.L(this.f12535d), s.y(this.f12535d))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this.f12535d)));
    }

    public void f(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String domainExpired : list) {
            arrayList.add(new DomainExpired(domainExpired, (Long) null));
        }
        this.f12533b.c(arrayList);
    }

    public void g(Map<String, List<ExtendedMail>> map) {
        this.f12533b.h(map);
    }
}
