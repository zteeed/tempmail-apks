package b.c.a.b.i.w.j;

import android.database.Cursor;
import b.c.a.b.i.w.j.b0;
import java.util.Map;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class p implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map f2248a;

    private p(Map map) {
        this.f2248a = map;
    }

    public static b0.b a(Map map) {
        return new p(map);
    }

    public Object apply(Object obj) {
        return b0.E(this.f2248a, (Cursor) obj);
    }
}
