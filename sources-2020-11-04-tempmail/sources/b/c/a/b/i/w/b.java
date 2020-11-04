package b.c.a.b.i.w;

import b.c.a.b.i.h;
import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: DefaultScheduler */
final /* synthetic */ class b implements a.C0069a {

    /* renamed from: a  reason: collision with root package name */
    private final c f2275a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2276b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2277c;

    private b(c cVar, m mVar, h hVar) {
        this.f2275a = cVar;
        this.f2276b = mVar;
        this.f2277c = hVar;
    }

    public static a.C0069a a(c cVar, m mVar, h hVar) {
        return new b(cVar, mVar, hVar);
    }

    public Object execute() {
        return c.b(this.f2275a, this.f2276b, this.f2277c);
    }
}
