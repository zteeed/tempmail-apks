package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.h;
import b.c.a.b.i.m;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class w implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f2255a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2256b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2257c;

    private w(b0 b0Var, m mVar, h hVar) {
        this.f2255a = b0Var;
        this.f2256b = mVar;
        this.f2257c = hVar;
    }

    public static b0.b a(b0 b0Var, m mVar, h hVar) {
        return new w(b0Var, mVar, hVar);
    }

    public Object apply(Object obj) {
        return b0.G(this.f2255a, this.f2256b, this.f2257c, (SQLiteDatabase) obj);
    }
}
