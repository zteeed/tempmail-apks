package org.greenrobot.eventbus;

/* compiled from: AsyncPoster */
class a implements Runnable, k {

    /* renamed from: b  reason: collision with root package name */
    private final j f14438b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final c f14439c;

    a(c cVar) {
        this.f14439c = cVar;
    }

    public void a(p pVar, Object obj) {
        this.f14438b.a(i.a(pVar, obj));
        this.f14439c.d().execute(this);
    }

    public void run() {
        i b2 = this.f14438b.b();
        if (b2 != null) {
            this.f14439c.g(b2);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
