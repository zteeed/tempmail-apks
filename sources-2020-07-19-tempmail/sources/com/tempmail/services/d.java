package com.tempmail.services;

import android.annotation.SuppressLint;
import android.app.Service;
import android.database.sqlite.SQLiteDatabase;
import com.tempmail.db.b;
import com.tempmail.db.c;
import com.tempmail.utils.m;
import d.a.y.a;

@SuppressLint({"NewApi"})
/* compiled from: BaseService */
public abstract class d extends Service {

    /* renamed from: f  reason: collision with root package name */
    private static final String f12516f = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public b f12517b;

    /* renamed from: c  reason: collision with root package name */
    public c f12518c;

    /* renamed from: d  reason: collision with root package name */
    public SQLiteDatabase f12519d;

    /* renamed from: e  reason: collision with root package name */
    a f12520e = new a();

    public void a() {
        c cVar = this.f12518c;
        if (cVar != null) {
            cVar.d();
        }
        SQLiteDatabase sQLiteDatabase = this.f12519d;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
        this.f12517b = null;
    }

    public void b() {
        SQLiteDatabase writableDatabase = new com.tempmail.db.d(this, com.tempmail.utils.y.b.f12595b).getWritableDatabase();
        this.f12519d = writableDatabase;
        b bVar = new b(writableDatabase);
        this.f12517b = bVar;
        this.f12518c = bVar.c();
    }

    public void c() {
        stopForeground(true);
        stopSelf();
    }

    public void onDestroy() {
        super.onDestroy();
        a();
        this.f12520e.d();
        m.b(f12516f, "onDestroy");
    }
}
