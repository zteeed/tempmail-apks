package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.database.sqlite.SQLiteDatabase;
import com.tempmail.db.b;
import com.tempmail.db.d;
import com.tempmail.utils.m;
import d.a.y.a;

@SuppressLint({"NewApi"})
/* compiled from: BaseJobService */
public abstract class c extends JobService {
    private static final String g = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public b f12511b;

    /* renamed from: c  reason: collision with root package name */
    public com.tempmail.db.c f12512c;

    /* renamed from: d  reason: collision with root package name */
    public SQLiteDatabase f12513d;

    /* renamed from: e  reason: collision with root package name */
    a f12514e = new a();

    /* renamed from: f  reason: collision with root package name */
    JobParameters f12515f;

    public void a() {
        com.tempmail.db.c cVar = this.f12512c;
        if (cVar != null) {
            cVar.d();
        }
        SQLiteDatabase sQLiteDatabase = this.f12513d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.f12511b = null;
    }

    public void b() {
        jobFinished(this.f12515f, true);
    }

    public void c() {
        SQLiteDatabase writableDatabase = new d(this, com.tempmail.utils.y.b.f12595b).getWritableDatabase();
        this.f12513d = writableDatabase;
        b bVar = new b(writableDatabase);
        this.f12511b = bVar;
        this.f12512c = bVar.c();
    }

    public void onDestroy() {
        super.onDestroy();
        a();
        this.f12514e.d();
        m.b(g, "onDestroy");
    }
}
