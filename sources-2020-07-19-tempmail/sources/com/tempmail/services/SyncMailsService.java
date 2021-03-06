package com.tempmail.services;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.api.models.answers.ExtendedMail;
import com.tempmail.db.b;
import com.tempmail.db.c;
import com.tempmail.j.e;
import com.tempmail.utils.d;
import com.tempmail.utils.g;
import com.tempmail.utils.m;
import com.tempmail.utils.q;
import com.tempmail.utils.r;
import com.tempmail.utils.w;
import java.util.List;

public class SyncMailsService extends GcmTaskService {
    /* access modifiers changed from: private */
    public static final String n = SyncMailsService.class.getSimpleName();
    public b i;
    public c j;
    public SQLiteDatabase k;
    d.a.y.a l = new d.a.y.a();
    FirebaseAnalytics m;

    class a extends e<List<ExtendedMail>> {
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str) {
            super(context);
            this.g = str;
        }

        public void c() {
        }

        public void d(Throwable th) {
            m.b(SyncMailsService.n, "onError");
            th.printStackTrace();
        }

        /* renamed from: f */
        public void onNext(List<ExtendedMail> list) {
            m.b(SyncMailsService.n, "onNext");
            int d2 = r.d(SyncMailsService.this.j, this.g, list);
            if (d2 > 0) {
                q.f(SyncMailsService.this.getApplicationContext());
                SyncMailsService syncMailsService = SyncMailsService.this;
                d.c(syncMailsService, syncMailsService.m, d2);
            }
        }

        public void onComplete() {
            m.b(SyncMailsService.n, "getInboxList onComplete");
        }
    }

    private void p() {
        SQLiteDatabase writableDatabase = new com.tempmail.db.d(this, com.tempmail.utils.y.b.f12595b).getWritableDatabase();
        this.k = writableDatabase;
        b bVar = new b(writableDatabase);
        this.i = bVar;
        this.j = bVar.c();
    }

    public void a() {
        super.a();
        com.tempmail.utils.e.N(this, 600);
    }

    public int b(TaskParams taskParams) {
        m.b(n, "onRunTask");
        String a2 = taskParams.a();
        if (((a2.hashCode() == -2042623614 && a2.equals("periodic_email_sync")) ? (char) 0 : 65535) != 0) {
            return 2;
        }
        m.b(n, "periodic_email_sync");
        p();
        this.m = FirebaseAnalytics.getInstance(this);
        if (g.t(this.j) != null) {
            o(g.t(this.j).p());
        } else {
            m.b(n, "email address null");
        }
        try {
            Thread.sleep(15000);
            return 1;
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    public void n() {
        c cVar = this.j;
        if (cVar != null) {
            cVar.d();
        }
        SQLiteDatabase sQLiteDatabase = this.k;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.i = null;
    }

    public void o(String str) {
        this.l.b((d.a.y.b) com.tempmail.j.b.a(this).d(w.j(str)).subscribeOn(d.a.e0.a.b()).observeOn(d.a.x.b.a.a()).subscribeWith(new a(this, str)));
    }

    public void onDestroy() {
        super.onDestroy();
        n();
        this.l.d();
        m.b(n, "onDestroy");
    }
}
