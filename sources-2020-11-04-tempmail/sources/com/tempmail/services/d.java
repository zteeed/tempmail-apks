package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.Service;
import android.database.sqlite.SQLiteDatabase;
import com.tempmail.db.DaoMaster;
import com.tempmail.db.DaoSession;
import com.tempmail.db.DbOpenHelper;
import com.tempmail.utils.m;
import com.tempmail.utils.y.b;
import d.a.y.a;

@SuppressLint({"NewApi"})
/* compiled from: BaseService */
public abstract class d extends Service {

    /* renamed from: f  reason: collision with root package name */
    private static final String f13020f = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public DaoMaster f13021b;

    /* renamed from: c  reason: collision with root package name */
    public DaoSession f13022c;

    /* renamed from: d  reason: collision with root package name */
    public SQLiteDatabase f13023d;

    /* renamed from: e  reason: collision with root package name */
    a f13024e = new a();

    public void a() {
        DaoSession daoSession = this.f13022c;
        if (daoSession != null) {
            daoSession.clear();
        }
        SQLiteDatabase sQLiteDatabase = this.f13023d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.f13021b = null;
    }

    public void b() {
        SQLiteDatabase writableDatabase = new DbOpenHelper(this, b.f13137b).getWritableDatabase();
        this.f13023d = writableDatabase;
        DaoMaster daoMaster = new DaoMaster(writableDatabase);
        this.f13021b = daoMaster;
        this.f13022c = daoMaster.newSession();
    }

    public void c() {
        stopForeground(true);
        stopSelf();
    }

    public void onDestroy() {
        super.onDestroy();
        a();
        this.f13024e.d();
        m.b(f13020f, "onDestroy");
    }
}
