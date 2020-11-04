package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.Context;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.PushUpdateBody;
import com.tempmail.j.c;
import com.tempmail.j.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import com.tempmail.utils.w;
import java.util.List;

@SuppressLint({"NewApi"})
public class NetworkChangeService extends c {
    /* access modifiers changed from: private */
    public static final String h = NetworkChangeService.class.getSimpleName();

    class a extends c<SidWrapper> {
        a(Context context) {
            super(context);
        }

        public void c() {
            m.b(NetworkChangeService.h, "pushUpdate onComplete");
            NetworkChangeService.this.b();
        }

        public void d(Throwable th) {
            m.b(NetworkChangeService.h, "pushUpdate onError");
            th.printStackTrace();
            NetworkChangeService.this.b();
        }

        /* renamed from: g */
        public void onNext(SidWrapper sidWrapper) {
            m.b(NetworkChangeService.h, "pushUpdate onNext");
            if (sidWrapper.getError() == null) {
                s.l0(NetworkChangeService.this, true);
            }
            NetworkChangeService.this.b();
        }

        public void onComplete() {
            m.b(NetworkChangeService.h, "pushUpdate onComplete");
        }
    }

    class b extends e<List<ExtendedMail>> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
            NetworkChangeService.this.b();
        }

        public void d(Throwable th) {
            m.b(NetworkChangeService.h, "getEmailsList onError");
            th.printStackTrace();
            NetworkChangeService.this.b();
        }

        /* renamed from: f */
        public void onNext(List<ExtendedMail> list) {
            m.b(NetworkChangeService.h, "onNext");
            NetworkChangeService networkChangeService = NetworkChangeService.this;
            r.b(networkChangeService, networkChangeService.f12512c, this.g, list);
        }

        public void onComplete() {
            m.b(NetworkChangeService.h, "getInboxList onComplete");
            NetworkChangeService.this.b();
        }
    }

    public void e(String str) {
        this.f12514e.b((d.a.y.b) com.tempmail.j.b.a(this).d(w.j(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this, str)));
    }

    public void f(boolean z) {
        s.l0(this, false);
        this.f12514e.b((d.a.y.b) com.tempmail.j.b.b(true).p(new PushUpdateBody(s.L(this), z)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this)));
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m.b(h, "onStartJob");
        this.f12515f = jobParameters;
        c();
        String str = h;
        m.b(str, "isFree " + com.tempmail.utils.e.O(this));
        if (!com.tempmail.utils.e.O(this)) {
            String str2 = h;
            m.b(str2, "push state updated " + s.I(this));
            if (s.I(this).booleanValue()) {
                return false;
            }
            f(s.w(this).booleanValue());
            return true;
        } else if (g.t(this.f12512c) == null) {
            return false;
        } else {
            m.b(h, "not null");
            e(g.t(this.f12512c).p());
            return true;
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        m.b(h, "onStopJob");
        return true;
    }
}
