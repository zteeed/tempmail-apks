package com.tempmail.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tempmail.db.b;
import com.tempmail.utils.m;
import com.tempmail.utils.n;
import org.greenrobot.greendao.g.a;

/* compiled from: DbOpenHelper */
public class d extends b.a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f12289b = d.class.getSimpleName();

    public d(Context context, String str) {
        super(context, str);
    }

    public void d(a aVar, int i, int i2) {
        super.d(aVar, i, i2);
        String str = f12289b;
        m.b(str, "onUpgrade " + i + " newVersion " + i2);
        if (i2 > i) {
            n.n(new org.greenrobot.greendao.g.d((SQLiteDatabase) aVar.d()), EmailAddressTableDao.class);
            n.o(new org.greenrobot.greendao.g.d((SQLiteDatabase) aVar.d()), DomainTableDao.class, EmailTableDao.class, MailHtmlTableDao.class, MailTextOnlyTableDao.class, MailTextTableDao.class);
        }
    }
}
