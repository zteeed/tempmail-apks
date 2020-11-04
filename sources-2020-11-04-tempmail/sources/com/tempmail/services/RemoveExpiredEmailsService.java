package com.tempmail.services;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import com.tempmail.api.models.answers.SidWrapper;
import com.tempmail.api.models.requests.DeleteEmailBody;
import com.tempmail.db.EmailAddressTable;
import com.tempmail.l.c;
import com.tempmail.utils.e;
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

        public void c(Throwable th) {
        }

        public void d(Throwable th) {
        }

        /* renamed from: f */
        public void onNext(SidWrapper sidWrapper) {
            RemoveExpiredEmailsService.this.g(sidWrapper.getEmailAddressTable());
        }

        public void onComplete() {
            m.b(RemoveExpiredEmailsService.g, "onComplete");
            RemoveExpiredEmailsService.this.c();
        }
    }

    public class b extends AsyncTask<Void, Void, List<EmailAddressTable>> {
        public b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public List<EmailAddressTable> doInBackground(Void... voidArr) {
            List<EmailAddressTable> b2 = g.p(RemoveExpiredEmailsService.this.f13022c).b();
            e.D(b2);
            for (EmailAddressTable next : b2) {
                String d2 = RemoveExpiredEmailsService.g;
                m.b(d2, "email sorted " + next.getFullEmailAddress() + " expired at " + new Date(next.getEndTime().longValue()).toString());
            }
            String d3 = RemoveExpiredEmailsService.g;
            m.b(d3, "emailAddressListExpired size before " + b2.size());
            List<EmailAddressTable> y = e.y(RemoveExpiredEmailsService.this, b2);
            for (EmailAddressTable next2 : y) {
                String d4 = RemoveExpiredEmailsService.g;
                m.b(d4, "emails to delete " + next2.getFullEmailAddress() + " expired at " + new Date(next2.getEndTime().longValue()).toString());
            }
            String d5 = RemoveExpiredEmailsService.g;
            m.b(d5, "emailAddressListExpired size to delete " + y.size());
            return y;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(List<EmailAddressTable> list) {
            RemoveExpiredEmailsService.this.e(list);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            m.b(RemoveExpiredEmailsService.g, "onPreExecute ");
        }
    }

    public void e(List<EmailAddressTable> list) {
        ArrayList arrayList = new ArrayList();
        for (EmailAddressTable next : list) {
            String str = g;
            m.b(str, "deleteOverExpiredEmailAddresses " + next.getFullEmailAddress());
            arrayList.add(com.tempmail.l.b.b(true).j(new DeleteEmailBody(s.L(this), next.getFullEmailAddress())).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).map(new b(next)));
        }
        this.f13024e.b((d.a.y.b) l.concatDelayError(arrayList).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this)));
    }

    public void g(EmailAddressTable emailAddressTable) {
        String str = g;
        m.b(str, "removeExpiredFromDb " + emailAddressTable.getFullEmailAddress());
        if (emailAddressTable.getIsDefault().booleanValue()) {
            List<EmailAddressTable> y = g.y(this.f13022c);
            y.remove(emailAddressTable);
            g.g(this.f13022c, y.get(0));
        }
        g.F(this.f13022c, emailAddressTable);
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
