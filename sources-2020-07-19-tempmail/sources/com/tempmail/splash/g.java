package com.tempmail.splash;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.TrueFalseWrapper;
import com.tempmail.j.b;
import com.tempmail.j.e;
import com.tempmail.utils.f;
import com.tempmail.utils.m;
import com.tempmail.utils.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.HttpException;

/* compiled from: FreeSplashPresenter */
public class g implements f {

    /* renamed from: e  reason: collision with root package name */
    public static final String f12526e = "g";

    /* renamed from: a  reason: collision with root package name */
    private final b.a f12527a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f12528b;

    /* renamed from: c  reason: collision with root package name */
    d.a.y.a f12529c;

    /* renamed from: d  reason: collision with root package name */
    Context f12530d;

    /* compiled from: FreeSplashPresenter */
    class a extends e<List<String>> {
        a(Context context) {
            super(context);
        }

        public void c() {
            g.this.f12528b.H();
        }

        public void d(Throwable th) {
            m.b(g.f12526e, "onError");
            th.printStackTrace();
            g.this.f12528b.H();
        }

        /* renamed from: f */
        public void onNext(List<String> list) {
            m.b(g.f12526e, "onNext");
            g.this.f12528b.c(com.tempmail.utils.e.r(list));
        }

        public void onComplete() {
            m.b(g.f12526e, "getDomains onComplete");
        }
    }

    /* compiled from: FreeSplashPresenter */
    class b extends e<List<ExtendedMail>> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
            g.this.f12528b.H();
        }

        public void d(Throwable th) {
            m.b(g.f12526e, "onError");
            th.printStackTrace();
            if (th instanceof HttpException) {
                g.this.f12528b.b0(((HttpException) th).response());
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(this.g, new ArrayList());
            g.this.f12528b.h(hashMap);
        }

        /* renamed from: f */
        public void onNext(List<ExtendedMail> list) {
            m.b(g.f12526e, "onNext");
            HashMap hashMap = new HashMap();
            hashMap.put(this.g, list);
            g.this.f12528b.h(hashMap);
        }

        public void onComplete() {
            m.b(g.f12526e, "getInboxList onComplete");
        }
    }

    /* compiled from: FreeSplashPresenter */
    class c extends e<TrueFalseWrapper> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
            g.this.f12528b.L(this.g);
        }

        public void d(Throwable th) {
            m.b(g.f12526e, "onError");
            th.printStackTrace();
            g.this.f12528b.D(this.g);
        }

        /* renamed from: f */
        public void onNext(TrueFalseWrapper trueFalseWrapper) {
            m.b(g.f12526e, "onNext");
            if (trueFalseWrapper == null || !trueFalseWrapper.isResult()) {
                g.this.f12528b.D(this.g);
            } else {
                g.this.f12528b.L(this.g);
            }
        }

        public void onComplete() {
            m.b(g.f12526e, "validateDomain onComplete");
        }
    }

    public g(Context context, b.a aVar, i iVar, d.a.y.a aVar2) {
        Preconditions.l(aVar, "restApiClient cannot be null");
        this.f12527a = aVar;
        Preconditions.l(iVar, "splashView cannot be null!");
        this.f12528b = iVar;
        Preconditions.l(aVar2, "disposable cannot be null!");
        this.f12529c = aVar2;
        Preconditions.l(context, "mainActivity cannot be null!");
        this.f12530d = context;
    }

    public void a() {
        this.f12529c.b((d.a.y.b) this.f12527a.a().subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this.f12530d)));
    }

    public void b(String str) {
        String str2 = f12526e;
        m.b(str2, "validateDomain " + str);
        if (str.contains("@")) {
            str = str.substring(1);
        }
        this.f12529c.b((d.a.y.b) this.f12527a.b(f.h(str.getBytes(), true)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new c(this.f12530d, str)));
    }

    public void c(String str) {
        this.f12529c.b((d.a.y.b) this.f12527a.d(w.j(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this.f12530d, str)));
    }
}
