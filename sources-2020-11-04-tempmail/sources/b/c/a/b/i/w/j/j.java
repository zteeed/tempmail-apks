package b.c.a.b.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import b.c.a.b.i.m;
import b.c.a.b.i.w.j.b0;

/* compiled from: SQLiteEventStore */
final /* synthetic */ class j implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f2336a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2337b;

    private j(long j, m mVar) {
        this.f2336a = j;
        this.f2337b = mVar;
    }

    public static b0.b a(long j, m mVar) {
        return new j(j, mVar);
    }

    public Object apply(Object obj) {
        return b0.J(this.f2336a, this.f2337b, (SQLiteDatabase) obj);
    }
}
