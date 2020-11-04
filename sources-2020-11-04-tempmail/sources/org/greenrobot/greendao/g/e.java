package org.greenrobot.greendao.g;

import net.sqlcipher.database.SQLiteStatement;

/* compiled from: EncryptedDatabaseStatement */
public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteStatement f15082a;

    public e(SQLiteStatement sQLiteStatement) {
        this.f15082a = sQLiteStatement;
    }

    public long a() {
        return this.f15082a.simpleQueryForLong();
    }

    public void b(int i, String str) {
        this.f15082a.bindString(i, str);
    }

    public void c(int i, double d2) {
        this.f15082a.bindDouble(i, d2);
    }

    public void close() {
        this.f15082a.close();
    }

    public void d(int i, long j) {
        this.f15082a.bindLong(i, j);
    }

    public void e() {
        this.f15082a.clearBindings();
    }

    public void execute() {
        this.f15082a.execute();
    }

    public Object f() {
        return this.f15082a;
    }

    public long g() {
        return this.f15082a.executeInsert();
    }
}
