package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.database.sqlite.SQLiteDatabase;
import com.tempmail.db.DaoMaster;
import com.tempmail.db.DaoSession;
import com.tempmail.db.DbOpenHelper;
import com.tempmail.utils.m;
import com.tempmail.utils.y.b;
import d.a.y.a;

@SuppressLint({"NewApi"})
/* compiled from: BaseJobService */
public abstract class c extends JobService {
    private static final String g = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public DaoMaster f13015b;

    /* renamed from: c  reason: collision with root package name */
    public DaoSession f13016c;

    /* renamed from: d  reason: collision with root package name */
    public SQLiteDatabase f13017d;

    /* renamed from: e  reason: collision with root package name */
    a f13018e = new a();

    /* renamed from: f  reason: collision with root package name */
    JobParameters f13019f;

    public void a() {
        m.b(g, "closeDb");
        DaoSession daoSession = this.f13016c;
        if (daoSession != null) {
            daoSession.clear();
        }
        SQLiteDatabase sQLiteDatabase = this.f13017d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.f13015b = null;
    }

    public void b() {
        jobFinished(this.f13019f, true);
    }

    public void c() {
        m.b(g, "initDb");
        SQLiteDatabase writableDatabase = new DbOpenHelper(this, b.f13137b).getWritableDatabase();
        this.f13017d = writableDatabase;
        DaoMaster daoMaster = new DaoMaster(writableDatabase);
        this.f13015b = daoMaster;
        this.f13016c = daoMaster.newSession();
    }

    public void onDestroy() {
        super.onDestroy();
        a();
        this.f13018e.d();
        m.b(g, "onDestroy");
    }
}
