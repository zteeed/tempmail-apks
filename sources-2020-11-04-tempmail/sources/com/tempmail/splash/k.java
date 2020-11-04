package com.tempmail.splash;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.DomainExpired;
import com.tempmail.api.models.answers.DomainsWrapper;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.requests.DomainsBody;
import com.tempmail.api.models.requests.EmailListBody;
import com.tempmail.l.b;
import com.tempmail.l.c;
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
    public static final String f13040e = "k";

    /* renamed from: a  reason: collision with root package name */
    private final b.a f13041a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f13042b;

    /* renamed from: c  reason: collision with root package name */
    d.a.y.a f13043c;

    /* renamed from: d  reason: collision with root package name */
    Context f13044d;

    /* compiled from: PremiumSplashPresenter */
    class a extends c<DomainsWrapper> {
        a(Context context) {
            super(context);
        }

        public void c(Throwable th) {
            k.this.f13042b.E();
        }

        public void d(Throwable th) {
            m.b(k.f13040e, "onError");
            th.printStackTrace();
            k.this.f13042b.b(new ArrayList());
        }

        /* renamed from: f */
        public void onNext(DomainsWrapper domainsWrapper) {
            m.b(k.f13040e, "onNext");
            if (domainsWrapper.getError() == null) {
                List<DomainExpired> domainExpiredArrayList = domainsWrapper.getResult().getDomainExpiredArrayList();
                if (domainExpiredArrayList != null && domainExpiredArrayList.size() > 0) {
                    k.this.f13042b.b(domainsWrapper.getResult().getDomainExpiredArrayList());
                } else if (domainsWrapper.getResult().getDomains() == null || domainsWrapper.getResult().getDomains().size() <= 0) {
                    k.this.f13042b.b(new ArrayList());
                } else {
                    k.this.f(domainsWrapper.getResult().getDomains());
                }
            } else {
                k.this.f13042b.b(new ArrayList());
            }
        }

        public void onComplete() {
            m.b(k.f13040e, "getDomains onComplete");
        }
    }

    /* compiled from: PremiumSplashPresenter */
    class b extends c<ActivationWrapper> {
        b(Context context) {
            super(context);
        }

        public void c(Throwable th) {
            k.this.f13042b.E();
        }

        public void d(Throwable th) {
            m.b(k.f13040e, "onError");
            th.printStackTrace();
            k.this.f13042b.a0(((HttpException) th).response());
        }

        /* renamed from: f */
        public void onNext(ActivationWrapper activationWrapper) {
            m.b(k.f13040e, "onNext");
            if (activationWrapper.getError() == null) {
                Map<String, List<ExtendedMail>> mailAddresses = activationWrapper.getResult().getMailAddresses();
                k.this.g(mailAddresses);
                e.a0(k.this.f13044d, mailAddresses);
                return;
            }
            k.this.f13042b.p(activationWrapper.getError());
        }

        public void onComplete() {
            m.b(k.f13040e, "getDomains onComplete");
        }
    }

    public k(Context context, b.a aVar, i iVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "restApiClient cannot be null");
        this.f13041a = aVar;
        Preconditions.l(iVar, "splashView cannot be null!");
        this.f13042b = iVar;
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f13043c = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f13044d = context;
    }

    public void a() {
        this.f13043c.b((d.a.y.b) this.f13041a.l(new DomainsBody()).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f13044d)));
    }

    public void d() {
        this.f13043c.b((d.a.y.b) this.f13041a.n(new EmailListBody(s.L(this.f13044d), s.z(this.f13044d))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this.f13044d)));
    }

    public void f(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String domainExpired : list) {
            arrayList.add(new DomainExpired(domainExpired, (Long) null));
        }
        this.f13042b.b(arrayList);
    }

    public void g(Map<String, List<ExtendedMail>> map) {
        this.f13042b.g(map);
    }
}
