package com.tempmail.splash;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.TrueFalseWrapper;
import com.tempmail.l.b;
import com.tempmail.l.d;
import com.tempmail.utils.e;
import com.tempmail.utils.f;
import com.tempmail.utils.m;
import com.tempmail.utils.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.HttpException;

/* compiled from: FreeSplashPresenter */
public class g implements f {

    /* renamed from: e  reason: collision with root package name */
    public static final String f13030e = "g";

    /* renamed from: a  reason: collision with root package name */
    private final b.a f13031a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f13032b;

    /* renamed from: c  reason: collision with root package name */
    d.a.y.a f13033c;

    /* renamed from: d  reason: collision with root package name */
    Context f13034d;

    /* compiled from: FreeSplashPresenter */
    class a extends d<List<String>> {
        a(Context context) {
            super(context);
        }

        public void c(Throwable th) {
            g.this.f13032b.E();
        }

        public void d(Throwable th) {
            m.b(g.f13030e, "onError");
            th.printStackTrace();
            g.this.f13032b.E();
        }

        /* renamed from: e */
        public void onNext(List<String> list) {
            m.b(g.f13030e, "onNext");
            g.this.f13032b.b(e.r(list));
        }

        public void onComplete() {
            m.b(g.f13030e, "getDomains onComplete");
        }
    }

    /* compiled from: FreeSplashPresenter */
    class b extends d<List<ExtendedMail>> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f13036e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(context);
            this.f13036e = str;
        }

        public void c(Throwable th) {
            g.this.f13032b.E();
        }

        public void d(Throwable th) {
            m.b(g.f13030e, "onError");
            th.printStackTrace();
            if (th instanceof HttpException) {
                g.this.f13032b.a0(((HttpException) th).response());
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(this.f13036e, new ArrayList());
            g.this.f13032b.g(hashMap);
        }

        /* renamed from: e */
        public void onNext(List<ExtendedMail> list) {
            m.b(g.f13030e, "onNext");
            HashMap hashMap = new HashMap();
            hashMap.put(this.f13036e, list);
            g.this.f13032b.g(hashMap);
        }

        public void onComplete() {
            m.b(g.f13030e, "getInboxList onComplete");
        }
    }

    /* compiled from: FreeSplashPresenter */
    class c extends d<TrueFalseWrapper> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f13038e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, String str) {
            super(context);
            this.f13038e = str;
        }

        public void c(Throwable th) {
            g.this.f13032b.K(this.f13038e);
        }

        public void d(Throwable th) {
            m.b(g.f13030e, "onError");
            th.printStackTrace();
            g.this.f13032b.C(this.f13038e);
        }

        /* renamed from: e */
        public void onNext(TrueFalseWrapper trueFalseWrapper) {
            m.b(g.f13030e, "onNext");
            if (trueFalseWrapper == null || !trueFalseWrapper.isResult()) {
                g.this.f13032b.C(this.f13038e);
            } else {
                g.this.f13032b.K(this.f13038e);
            }
        }

        public void onComplete() {
            m.b(g.f13030e, "validateDomain onComplete");
        }
    }

    public g(Context context, b.a aVar, i iVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "restApiClient cannot be null");
        this.f13031a = aVar;
        Preconditions.l(iVar, "splashView cannot be null!");
        this.f13032b = iVar;
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f13033c = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f13034d = context;
        FirebaseAnalytics.getInstance(context);
    }

    public void a() {
        this.f13033c.b((d.a.y.b) this.f13031a.a().subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f13034d)));
    }

    public void b(String str) {
        String str2 = f13030e;
        m.b(str2, "validateDomain " + str);
        if (str.contains("@")) {
            str = str.substring(1);
        }
        this.f13033c.b((d.a.y.b) this.f13031a.b(f.h(str.getBytes(), true)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new c(this.f13034d, str)));
    }

    public void c(String str) {
        this.f13033c.b((d.a.y.b) this.f13031a.e(x.k(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this.f13034d, str)));
    }
}
