package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class m implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f2341a;

    private m(long j) {
        this.f2341a = j;
    }

    public static b0.b a(long j) {
        return new m(j);
    }

    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f2341a)}));
    }
}
