package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class y implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2357a;

    private y(String str) {
        this.f2357a = str;
    }

    public static b0.b a(String str) {
        return new y(str);
    }

    public Object apply(Object obj) {
        return b0.I(this.f2357a, (SQLiteDatabase) obj);
    }
}
