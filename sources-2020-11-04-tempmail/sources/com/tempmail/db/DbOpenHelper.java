package com.tempmail.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.tempmail.db.DaoMaster;
import com.tempmail.utils.m;
import com.tempmail.utils.n;
import org.greenrobot.greendao.g.a;
import org.greenrobot.greendao.g.f;

public class DbOpenHelper extends DaoMaster.OpenHelper {
    private static final String TAG = DbOpenHelper.class.getSimpleName();

    public DbOpenHelper(Context context, String str) {
        super(context, str);
    }

    public void onUpgrade(a aVar, int i, int i2) {
        super.onUpgrade(aVar, i, i2);
        String str = TAG;
        m.b(str, "onUpgrade " + i + " newVersion " + i2);
        if (i2 > i) {
            n.g(new f((SQLiteDatabase) aVar.d()), EmailAddressTableDao.class);
            n.h(new f((SQLiteDatabase) aVar.d()), DomainTableDao.class, EmailTableDao.class, MailHtmlTableDao.class, MailTextOnlyTableDao.class, MailTextTableDao.class);
        }
    }
}
