package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class q implements b0.d {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f2347a;

    private q(SQLiteDatabase sQLiteDatabase) {
        this.f2347a = sQLiteDatabase;
    }

    public static b0.d b(SQLiteDatabase sQLiteDatabase) {
        return new q(sQLiteDatabase);
    }

    public Object a() {
        return this.f2347a.beginTransaction();
    }
}
