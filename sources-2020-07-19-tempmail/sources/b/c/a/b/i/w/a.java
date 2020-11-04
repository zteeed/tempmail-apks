package b.c.a.b.i.w;

import b.c.a.b.h;
import b.c.a.b.i.m;

/* compiled from: DefaultScheduler */
final /* synthetic */ class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final c f2173b;

    /* renamed from: c  reason: collision with root package name */
    private final m f2174c;

    /* renamed from: d  reason: collision with root package name */
    private final h f2175d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c.a.b.i.h f2176e;

    private a(c cVar, m mVar, h hVar, b.c.a.b.i.h hVar2) {
        this.f2173b = cVar;
        this.f2174c = mVar;
        this.f2175d = hVar;
        this.f2176e = hVar2;
    }

    public static Runnable a(c cVar, m mVar, h hVar, b.c.a.b.i.h hVar2) {
        return new a(cVar, mVar, hVar, hVar2);
    }

    public void run() {
        c.c(this.f2173b, this.f2174c, this.f2175d, this.f2176e);
    }
}
