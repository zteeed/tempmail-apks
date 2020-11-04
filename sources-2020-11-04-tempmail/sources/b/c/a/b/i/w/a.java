package b.c.a.b.i.w;

import b.c.a.b.h;
import b.c.a.b.i.m;

/* compiled from: DefaultScheduler */
final /* synthetic */ class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final c f2271b;

    /* renamed from: c  reason: collision with root package name */
    private final m f2272c;

    /* renamed from: d  reason: collision with root package name */
    private final h f2273d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c.a.b.i.h f2274e;

    private a(c cVar, m mVar, h hVar, b.c.a.b.i.h hVar2) {
        this.f2271b = cVar;
        this.f2272c = mVar;
        this.f2273d = hVar;
        this.f2274e = hVar2;
    }

    public static Runnable a(c cVar, m mVar, h hVar, b.c.a.b.i.h hVar2) {
        return new a(cVar, mVar, hVar, hVar2);
    }

    public void run() {
        c.c(this.f2271b, this.f2272c, this.f2273d, this.f2274e);
    }
}
