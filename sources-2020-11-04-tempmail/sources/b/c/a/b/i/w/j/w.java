package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.h;
import b.c.a.b.i.m;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class w implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f2353a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2354b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2355c;

    private w(b0 b0Var, m mVar, h hVar) {
        this.f2353a = b0Var;
        this.f2354b = mVar;
        this.f2355c = hVar;
    }

    public static b0.b a(b0 b0Var, m mVar, h hVar) {
        return new w(b0Var, mVar, hVar);
    }

    public Object apply(Object obj) {
        return b0.G(this.f2353a, this.f2354b, this.f2355c, (SQLiteDatabase) obj);
    }
}
