package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.PushUpdateBody;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.l.c;
import com.tempmail.l.d;
import com.tempmail.utils.e;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.r;
import com.tempmail.utils.s;
import com.tempmail.utils.x;
import java.util.List;

@SuppressLint({"NewApi"})
public class NetworkChangeService extends c {
    /* access modifiers changed from: private */
    public static final String h = NetworkChangeService.class.getSimpleName();

    class a extends c<SidWrapper> {
        a(Context context) {
            super(context);
        }

        public void c(Throwable th) {
            m.b(NetworkChangeService.h, "pushUpdate onComplete");
            NetworkChangeService.this.b();
        }

        public void d(Throwable th) {
            m.b(NetworkChangeService.h, "pushUpdate onError");
            th.printStackTrace();
            NetworkChangeService.this.b();
        }

        /* renamed from: f */
        public void onNext(SidWrapper sidWrapper) {
            m.b(NetworkChangeService.h, "pushUpdate onNext");
            if (sidWrapper.getError() == null) {
                s.n0(NetworkChangeService.this, true);
            }
            NetworkChangeService.this.b();
        }

        public void onComplete() {
            m.b(NetworkChangeService.h, "pushUpdate onComplete");
        }
    }

    class b extends d<List<ExtendedMail>> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f13007e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, String str) {
            super(context);
            this.f13007e = str;
        }

        public void c(Throwable th) {
            NetworkChangeService.this.b();
        }

        public void d(Throwable th) {
            m.b(NetworkChangeService.h, "getEmailsList onError");
            th.printStackTrace();
            NetworkChangeService.this.b();
        }

        /* renamed from: e */
        public void onNext(List<ExtendedMail> list) {
            m.b(NetworkChangeService.h, "onNext");
            NetworkChangeService networkChangeService = NetworkChangeService.this;
            r.b(networkChangeService, networkChangeService.f13016c, this.f13007e, list);
        }

        public void onComplete() {
            m.b(NetworkChangeService.h, "getInboxList onComplete");
            NetworkChangeService.this.b();
        }
    }

    public void e(String str) {
        this.f13018e.b((d.a.y.b) com.tempmail.l.b.a(this).e(x.k(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new b(this, str)));
    }

    public void f(boolean z) {
        s.n0(this, false);
        this.f13018e.b((d.a.y.b) com.tempmail.l.b.b(true).q(new PushUpdateBody(s.L(this), z)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this)));
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m.b(h, "onStartJob");
        this.f13019f = jobParameters;
        c();
        String str = h;
        m.b(str, "isFree " + e.P(this));
        if (e.P(this)) {
            EmailAddressTable emailAddressTable = null;
            try {
                emailAddressTable = g.s(this.f13016c);
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
            if (emailAddressTable == null) {
                return false;
            }
            m.b(h, "not null");
            e(emailAddressTable.getFullEmailAddress());
            return true;
        }
        String str2 = h;
        m.b(str2, "push state updated " + s.I(this));
        if (s.I(this).booleanValue()) {
            return false;
        }
        f(s.x(this).booleanValue());
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        m.b(h, "onStopJob");
        return true;
    }
}
