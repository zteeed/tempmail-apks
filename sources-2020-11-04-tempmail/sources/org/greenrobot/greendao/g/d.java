package org.greenrobot.greendao.g;

import android.database.Cursor;
import android.database.SQLException;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: EncryptedDatabase */
public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f15081a;

    public d(SQLiteDatabase sQLiteDatabase) {
        this.f15081a = sQLiteDatabase;
    }

    public void a() {
        this.f15081a.beginTransaction();
    }

    public void b(String str) throws SQLException {
        this.f15081a.execSQL(str);
    }

    public c c(String str) {
        return new e(this.f15081a.compileStatement(str));
    }

    public Object d() {
        return this.f15081a;
    }

    public void e() {
        this.f15081a.setTransactionSuccessful();
    }

    public Cursor f(String str, String[] strArr) {
        return this.f15081a.rawQuery(str, strArr);
    }

    public void g(String str, Object[] objArr) throws SQLException {
        this.f15081a.execSQL(str, objArr);
    }

    public boolean h() {
        return this.f15081a.isDbLockedByCurrentThread();
    }

    public void i() {
        this.f15081a.endTransaction();
    }
}
