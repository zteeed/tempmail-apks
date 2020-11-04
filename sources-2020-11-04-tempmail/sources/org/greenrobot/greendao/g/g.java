package org.greenrobot.greendao.g;

import android.database.sqlite.SQLiteStatement;

/* compiled from: StandardDatabaseStatement */
public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteStatement f15084a;

    public g(SQLiteStatement sQLiteStatement) {
        this.f15084a = sQLiteStatement;
    }

    public long a() {
        return this.f15084a.simpleQueryForLong();
    }

    public void b(int i, String str) {
        this.f15084a.bindString(i, str);
    }

    public void c(int i, double d2) {
        this.f15084a.bindDouble(i, d2);
    }

    public void close() {
        this.f15084a.close();
    }

    public void d(int i, long j) {
        this.f15084a.bindLong(i, j);
    }

    public void e() {
        this.f15084a.clearBindings();
    }

    public void execute() {
        this.f15084a.execute();
    }

    public Object f() {
        return this.f15084a;
    }

    public long g() {
        return this.f15084a.executeInsert();
    }
}
