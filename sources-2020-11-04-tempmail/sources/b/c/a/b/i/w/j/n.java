package b.c.a.b.i.w.j;

import android.database.Cursor;
import b.c.a.b.i.m;
import b.c.a.b.i.w.j.b0;
import java.util.List;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class n implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f2342a;

    /* renamed from: b  reason: collision with root package name */
    private final List f2343b;

    /* renamed from: c  reason: collision with root package name */
    private final m f2344c;

    private n(b0 b0Var, List list, m mVar) {
        this.f2342a = b0Var;
        this.f2343b = list;
        this.f2344c = mVar;
    }

    public static b0.b a(b0 b0Var, List list, m mVar) {
        return new n(b0Var, list, mVar);
    }

    public Object apply(Object obj) {
        return b0.D(this.f2342a, this.f2343b, this.f2344c, (Cursor) obj);
    }
}
