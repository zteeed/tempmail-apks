package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.m;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class a0 implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f2304a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2305b;

    private a0(b0 b0Var, m mVar) {
        this.f2304a = b0Var;
        this.f2305b = mVar;
    }

    public static b0.b a(b0 b0Var, m mVar) {
        return new a0(b0Var, mVar);
    }

    public Object apply(Object obj) {
        return b0.v(this.f2304a, this.f2305b, (SQLiteDatabase) obj);
    }
}
