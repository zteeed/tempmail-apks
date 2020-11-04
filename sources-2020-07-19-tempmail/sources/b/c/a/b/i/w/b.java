package b.c.a.b.i.w;

import b.c.a.b.i.h;
import b.c.a.b.i.m;
import com.google.android.datatransport.runtime.synchronization.a;

/* compiled from: DefaultScheduler */
final /* synthetic */ class b implements a.C0070a {

    /* renamed from: a  reason: collision with root package name */
    private final c f2177a;

    /* renamed from: b  reason: collision with root package name */
    private final m f2178b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2179c;

    private b(c cVar, m mVar, h hVar) {
        this.f2177a = cVar;
        this.f2178b = mVar;
        this.f2179c = hVar;
    }

    public static a.C0070a a(c cVar, m mVar, h hVar) {
        return new b(cVar, mVar, hVar);
    }

    public Object execute() {
        return c.b(this.f2177a, this.f2178b, this.f2179c);
    }
}
