package org.greenrobot.greendao.g;

import android.database.sqlite.SQLiteStatement;

/* compiled from: StandardDatabaseStatement */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteStatement f14515a;

    public e(SQLiteStatement sQLiteStatement) {
        this.f14515a = sQLiteStatement;
    }

    public void a(int i, String str) {
        this.f14515a.bindString(i, str);
    }

    public void b(int i, double d2) {
        this.f14515a.bindDouble(i, d2);
    }

    public void c(int i, long j) {
        this.f14515a.bindLong(i, j);
    }

    public void close() {
        this.f14515a.close();
    }

    public void d() {
        this.f14515a.clearBindings();
    }

    public Object e() {
        return this.f14515a;
    }

    public void execute() {
        this.f14515a.execute();
    }

    public long f() {
        return this.f14515a.executeInsert();
    }
}
