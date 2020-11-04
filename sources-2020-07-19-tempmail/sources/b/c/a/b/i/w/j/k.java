package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.m;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class k implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f2240a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2241b;

    private k(b0 b0Var, m mVar) {
        this.f2240a = b0Var;
        this.f2241b = mVar;
    }

    public static b0.b a(b0 b0Var, m mVar) {
        return new k(b0Var, mVar);
    }

    public Object apply(Object obj) {
        return b0.B(this.f2240a, this.f2241b, (SQLiteDatabase) obj);
    }
}
