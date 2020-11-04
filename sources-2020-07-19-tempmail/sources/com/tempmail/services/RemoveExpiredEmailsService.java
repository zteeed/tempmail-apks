package com.tempmail.services;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.DeleteEmailBody;
import com.tempmail.db.e;
import com.tempmail.j.c;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.s;
import d.a.l;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemoveExpiredEmailsService extends d {
    /* access modifiers changed from: private */
    public static final String g = RemoveExpiredEmailsService.class.getSimpleName();

    class a extends c<SidWrapper> {
        a(Context context) {
            super(context);
        }

        public void c() {
        }

        public void d(Throwable th) {
        }

        /* renamed from: g */
        public void onNext(SidWrapper sidWrapper) {
            RemoveExpiredEmailsService.this.g(sidWrapper.getEmailAddressTable());
        }

        public void onComplete() {
            m.b(RemoveExpiredEmailsService.g, "onComplete");
            RemoveExpiredEmailsService.this.c();
        }
    }

    public class b extends AsyncTask<Void, Void, List<e>> {
        public b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<e> doInBackground(Void... voidArr) {
            List<e> b2 = g.q(RemoveExpiredEmailsService.this.f12518c).b();
            com.tempmail.utils.e.D(b2);
            for (e next : b2) {
                String d2 = RemoveExpiredEmailsService.g;
                m.b(d2, "email sorted " + next.p() + " expired at " + new Date(next.o().longValue()).toString());
            }
            String d3 = RemoveExpiredEmailsService.g;
            m.b(d3, "emailAddressListExpired size before " + b2.size());
            List<e> y = com.tempmail.utils.e.y(RemoveExpiredEmailsService.this, b2);
            for (e next2 : y) {
                String d4 = RemoveExpiredEmailsService.g;
                m.b(d4, "emails to delete " + next2.p() + " expired at " + new Date(next2.o().longValue()).toString());
            }
            String d5 = RemoveExpiredEmailsService.g;
            m.b(d5, "emailAddressListExpired size to delete " + y.size());
            return y;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<e> list) {
            RemoveExpiredEmailsService.this.e(list);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            m.b(RemoveExpiredEmailsService.g, "onPreExecute ");
        }
    }

    public void e(List<e> list) {
        ArrayList arrayList = new ArrayList();
        for (e next : list) {
            String str = g;
            m.b(str, "deleteOverExpiredEmailAddresses " + next.p());
            arrayList.add(com.tempmail.j.b.b(true).j(new DeleteEmailBody(s.L(this), next.p())).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).map(new b(next)));
        }
        this.f12520e.b((d.a.y.b) l.concatDelayError(arrayList).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this)));
    }

    public void g(e eVar) {
        String str = g;
        m.b(str, "removeExpiredFromDb " + eVar.p());
        if (eVar.r().booleanValue()) {
            List<e> z = g.z(this.f12518c);
            z.remove(eVar);
            g.h(this.f12518c, z.get(0));
        }
        g.H(this.f12518c, eVar);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void onCreate() {
        super.onCreate();
        m.b(g, "onCreate");
        b();
        new b().execute(new Void[0]);
    }
}
