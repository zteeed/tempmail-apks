package b.c.a.b.i.w.j;

import android.database.Cursor;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class u implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private static final u f2253a = new u();

    private u() {
    }

    public static b0.b a() {
        return f2253a;
    }

    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
