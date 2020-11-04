package org.greenrobot.greendao.g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: StandardDatabase */
public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f15083a;

    public f(SQLiteDatabase sQLiteDatabase) {
        this.f15083a = sQLiteDatabase;
    }

    public void a() {
        this.f15083a.beginTransaction();
    }

    public void b(String str) throws SQLException {
        this.f15083a.execSQL(str);
    }

    public c c(String str) {
        return new g(this.f15083a.compileStatement(str));
    }

    public Object d() {
        return this.f15083a;
    }

    public void e() {
        this.f15083a.setTransactionSuccessful();
    }

    public Cursor f(String str, String[] strArr) {
        return this.f15083a.rawQuery(str, strArr);
    }

    public void g(String str, Object[] objArr) throws SQLException {
        this.f15083a.execSQL(str, objArr);
    }

    public boolean h() {
        return this.f15083a.isDbLockedByCurrentThread();
    }

    public void i() {
        this.f15083a.endTransaction();
    }
}
