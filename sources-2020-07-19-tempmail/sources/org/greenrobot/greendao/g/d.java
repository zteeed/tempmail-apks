package org.greenrobot.greendao.g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: StandardDatabase */
public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f14514a;

    public d(SQLiteDatabase sQLiteDatabase) {
        this.f14514a = sQLiteDatabase;
    }

    public void a() {
        this.f14514a.beginTransaction();
    }

    public void b(String str) throws SQLException {
        this.f14514a.execSQL(str);
    }

    public c c(String str) {
        return new e(this.f14514a.compileStatement(str));
    }

    public Object d() {
        return this.f14514a;
    }

    public void e() {
        this.f14514a.setTransactionSuccessful();
    }

    public Cursor f(String str, String[] strArr) {
        return this.f14514a.rawQuery(str, strArr);
    }

    public void g(String str, Object[] objArr) throws SQLException {
        this.f14514a.execSQL(str, objArr);
    }

    public boolean h() {
        return this.f14514a.isDbLockedByCurrentThread();
    }

    public void i() {
        this.f14514a.endTransaction();
    }
}
