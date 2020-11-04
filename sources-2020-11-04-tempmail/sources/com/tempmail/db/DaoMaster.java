package com.tempmail.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import org.greenrobot.greendao.b;
import org.greenrobot.greendao.g.a;
import org.greenrobot.greendao.g.f;
import org.greenrobot.greendao.h.d;

public class DaoMaster extends b {
    public static final int SCHEMA_VERSION = 18;

    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String str) {
            super(context, str);
        }

        public void onUpgrade(a aVar, int i, int i2) {
            Log.i("greenDAO", "Upgrading schema from version " + i + " to " + i2 + " by dropping all tables");
            DaoMaster.dropAllTables(aVar, true);
            onCreate(aVar);
        }

        public DevOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory);
        }
    }

    public static abstract class OpenHelper extends org.greenrobot.greendao.g.b {
        public OpenHelper(Context context, String str) {
            super(context, str, 18);
        }

        public void onCreate(a aVar) {
            Log.i("greenDAO", "Creating tables for schema version 18");
            DaoMaster.createAllTables(aVar, false);
        }

        public OpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
            super(context, str, cursorFactory, 18);
        }
    }

    public DaoMaster(SQLiteDatabase sQLiteDatabase) {
        this((a) new f(sQLiteDatabase));
    }

    public static void createAllTables(a aVar, boolean z) {
        EmailAddressTableDao.createTable(aVar, z);
        EmailTableDao.createTable(aVar, z);
        MailTextOnlyTableDao.createTable(aVar, z);
        MailTextTableDao.createTable(aVar, z);
        MailHtmlTableDao.createTable(aVar, z);
        AttachmentInfoTableDao.createTable(aVar, z);
        DomainTableDao.createTable(aVar, z);
        PurchaseTableDao.createTable(aVar, z);
    }

    public static void dropAllTables(a aVar, boolean z) {
        EmailAddressTableDao.dropTable(aVar, z);
        EmailTableDao.dropTable(aVar, z);
        MailTextOnlyTableDao.dropTable(aVar, z);
        MailTextTableDao.dropTable(aVar, z);
        MailHtmlTableDao.dropTable(aVar, z);
        AttachmentInfoTableDao.dropTable(aVar, z);
        DomainTableDao.dropTable(aVar, z);
        PurchaseTableDao.dropTable(aVar, z);
    }

    public static DaoSession newDevSession(Context context, String str) {
        return new DaoMaster(new DevOpenHelper(context, str).getWritableDb()).newSession();
    }

    public DaoMaster(a aVar) {
        super(aVar, 18);
        registerDaoClass(EmailAddressTableDao.class);
        registerDaoClass(EmailTableDao.class);
        registerDaoClass(MailTextOnlyTableDao.class);
        registerDaoClass(MailTextTableDao.class);
        registerDaoClass(MailHtmlTableDao.class);
        registerDaoClass(AttachmentInfoTableDao.class);
        registerDaoClass(DomainTableDao.class);
        registerDaoClass(PurchaseTableDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(this.db, d.Session, this.daoConfigMap);
    }

    public DaoSession newSession(d dVar) {
        return new DaoSession(this.db, dVar, this.daoConfigMap);
    }
}
