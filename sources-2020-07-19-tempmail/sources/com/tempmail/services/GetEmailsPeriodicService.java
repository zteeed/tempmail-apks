package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.Context;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.j.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.w;
import d.a.y.b;
import java.util.List;

@SuppressLint({"NewApi"})
public class GetEmailsPeriodicService extends c {
    /* access modifiers changed from: private */
    public static final String h = GetEmailsPeriodicService.class.getSimpleName();

    class a extends e<List<ExtendedMail>> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
            GetEmailsPeriodicService.this.b();
        }

        public void d(Throwable th) {
            m.b(GetEmailsPeriodicService.h, "onError");
            th.printStackTrace();
            GetEmailsPeriodicService.this.b();
        }

        /* renamed from: f */
        public void onNext(List<ExtendedMail> list) {
            m.b(GetEmailsPeriodicService.h, "onNext");
            GetEmailsPeriodicService getEmailsPeriodicService = GetEmailsPeriodicService.this;
            r.b(getEmailsPeriodicService, getEmailsPeriodicService.f12512c, this.g, list);
        }

        public void onComplete() {
            m.b(GetEmailsPeriodicService.h, "getInboxList onComplete");
            GetEmailsPeriodicService.this.b();
        }
    }

    public void e(String str) {
        this.f12514e.b((b) com.tempmail.j.b.a(this).d(w.j(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this, str)));
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m.b(h, "onStartJob");
        this.f12515f = jobParameters;
        c();
        if (g.t(this.f12512c) == null) {
            return false;
        }
        m.b(h, "not null");
        e(g.t(this.f12512c).p());
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        m.b(h, "onStopJob");
        return true;
    }
}
