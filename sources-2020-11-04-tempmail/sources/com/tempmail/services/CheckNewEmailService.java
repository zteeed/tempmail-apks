package com.tempmail.services;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.tempmail.api.models.answers.ActivationWrapper;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.requests.EmailListBody;
import com.tempmail.l.d;
import com.tempmail.utils.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import com.tempmail.utils.x;
import com.tempmail.utils.z.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheckNewEmailService extends d {
    public static final String k = CheckNewEmailService.class.getSimpleName();
    private final IBinder g = new c();
    Handler h = new Handler();
    Runnable i;
    List<h> j = new ArrayList();

    class a extends com.tempmail.l.c<ActivationWrapper> {
        a(Context context) {
            super(context);
        }

        public void c(Throwable th) {
        }

        public void d(Throwable th) {
            m.b(CheckNewEmailService.k, "onError");
        }

        /* renamed from: f */
        public void onNext(ActivationWrapper activationWrapper) {
            m.b(CheckNewEmailService.k, "onNext");
            if (activationWrapper.getError() == null) {
                Map<String, List<ExtendedMail>> mailAddresses = activationWrapper.getResult().getMailAddresses();
                CheckNewEmailService checkNewEmailService = CheckNewEmailService.this;
                e.l(checkNewEmailService, checkNewEmailService.f13022c, mailAddresses, false);
                CheckNewEmailService checkNewEmailService2 = CheckNewEmailService.this;
                checkNewEmailService2.i(e.q(checkNewEmailService2, checkNewEmailService2.f13022c));
                e.a0(CheckNewEmailService.this, mailAddresses);
            }
        }

        public void onComplete() {
            m.b(CheckNewEmailService.k, "getDomains onComplete");
        }
    }

    class b extends d<List<ExtendedMail>> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f12994e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(context);
            this.f12994e = str;
        }

        public void c(Throwable th) {
        }

        public void d(Throwable th) {
            m.b(CheckNewEmailService.k, "onError");
        }

        /* renamed from: e */
        public void onNext(List<ExtendedMail> list) {
            m.b(CheckNewEmailService.k, "onNext");
            CheckNewEmailService checkNewEmailService = CheckNewEmailService.this;
            checkNewEmailService.i(e.q(checkNewEmailService, checkNewEmailService.f13022c));
            CheckNewEmailService checkNewEmailService2 = CheckNewEmailService.this;
            r.b(checkNewEmailService2, checkNewEmailService2.f13022c, this.f12994e, list);
        }

        public void onComplete() {
            m.b(CheckNewEmailService.k, "getInboxList onComplete");
        }
    }

    public class c extends Binder {
        public c() {
        }

        public CheckNewEmailService a() {
            return CheckNewEmailService.this;
        }
    }

    public void d(h hVar) {
        this.j.add(hVar);
    }

    public void e() {
        this.f13024e.b((d.a.y.b) com.tempmail.l.b.a(this).n(new EmailListBody(s.L(this), s.z(this))).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this)));
    }

    public void f() {
        if (!e.P(this)) {
            e();
        } else if (g.s(this.f13022c) != null) {
            g(g.s(this.f13022c).getFullEmailAddress());
        } else {
            m.b(k, "email address null");
        }
    }

    public void g(String str) {
        this.f13024e.b((d.a.y.b) com.tempmail.l.b.a(this).e(x.k(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this, str)));
    }

    public /* synthetic */ void h() {
        m.b(k, "fire periodic");
        f();
        k();
    }

    public void i(int i2) {
        for (h J : this.j) {
            J.J(i2);
        }
    }

    public void j(h hVar) {
        this.j.remove(hVar);
    }

    public void k() {
        l();
        Handler handler = this.h;
        a aVar = new a(this);
        this.i = aVar;
        handler.postDelayed(aVar, 30000);
    }

    public void l() {
        this.h.removeCallbacks(this.i);
    }

    public IBinder onBind(Intent intent) {
        m.b(k, "onBind");
        return this.g;
    }

    public void onCreate() {
        super.onCreate();
        m.b(k, "onCreate");
        b();
        k();
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        m.b(k, "onStartCommand");
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        m.b(k, "onUnbind");
        l();
        return super.onUnbind(intent);
    }
}
