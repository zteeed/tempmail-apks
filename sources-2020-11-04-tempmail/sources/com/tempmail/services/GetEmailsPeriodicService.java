package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.Context;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.l.d;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.x;
import d.a.y.b;
import java.util.List;

@SuppressLint({"NewApi"})
public class GetEmailsPeriodicService extends c {
    /* access modifiers changed from: private */
    public static final String h = GetEmailsPeriodicService.class.getSimpleName();

    class a extends d<List<ExtendedMail>> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f13004e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(context);
            this.f13004e = str;
        }

        public void c(Throwable th) {
            GetEmailsPeriodicService.this.b();
        }

        public void d(Throwable th) {
            m.b(GetEmailsPeriodicService.h, "onError");
            th.printStackTrace();
            GetEmailsPeriodicService.this.b();
        }

        /* renamed from: e */
        public void onNext(List<ExtendedMail> list) {
            m.b(GetEmailsPeriodicService.h, "onNext");
            GetEmailsPeriodicService getEmailsPeriodicService = GetEmailsPeriodicService.this;
            r.b(getEmailsPeriodicService, getEmailsPeriodicService.f13016c, this.f13004e, list);
        }

        public void onComplete() {
            m.b(GetEmailsPeriodicService.h, "getInboxList onComplete");
            GetEmailsPeriodicService.this.b();
        }
    }

    public void e(String str) {
        this.f13018e.b((b) com.tempmail.l.b.a(this).e(x.k(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this, str)));
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m.b(h, "onStartJob");
        this.f13019f = jobParameters;
        c();
        if (g.s(this.f13016c) == null) {
            return false;
        }
        m.b(h, "not null");
        e(g.s(this.f13016c).getFullEmailAddress());
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        m.b(h, "onStopJob");
        return true;
    }
}
