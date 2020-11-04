package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.w.j.h0;

/* compiled from: SchemaManager */
final /* synthetic */ class f0 implements h0.a {

    /* renamed from: a  reason: collision with root package name */
    private static final f0 f2226a = new f0();

    private f0() {
    }

    public static h0.a b() {
        return f2226a;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
