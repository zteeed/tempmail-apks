package com.tempmail.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import org.greenrobot.greendao.g.d;

/* compiled from: DaoMaster */
public class b extends org.greenrobot.greendao.b {

    /* compiled from: DaoMaster */
    public static abstract class a extends org.greenrobot.greendao.g.b {
        public a(Context context, String str) {
            super(context, str, 18);
        }

        public void a(org.greenrobot.greendao.g.a aVar) {
            Log.i("greenDAO", "Creating tables for schema version 18");
            b.b(aVar, false);
        }
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this((org.greenrobot.greendao.g.a) new d(sQLiteDatabase));
    }

    public static void b(org.greenrobot.greendao.g.a aVar, boolean z) {
        EmailAddressTableDao.P(aVar, z);
        EmailTableDao.Q(aVar, z);
        MailTextOnlyTableDao.P(aVar, z);
        MailTextTableDao.P(aVar, z);
        MailHtmlTableDao.P(aVar, z);
        AttachmentInfoTableDao.P(aVar, z);
        DomainTableDao.O(aVar, z);
        PurchaseTableDao.O(aVar, z);
    }

    public c c() {
        return new c(this.f14505a, org.greenrobot.greendao.h.d.Session, this.f14506b);
    }

    public b(org.greenrobot.greendao.g.a aVar) {
        super(aVar, 18);
        a(EmailAddressTableDao.class);
        a(EmailTableDao.class);
        a(MailTextOnlyTableDao.class);
        a(MailTextTableDao.class);
        a(MailHtmlTableDao.class);
        a(AttachmentInfoTableDao.class);
        a(DomainTableDao.class);
        a(PurchaseTableDao.class);
    }
}
