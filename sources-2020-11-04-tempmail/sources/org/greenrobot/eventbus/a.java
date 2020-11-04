package org.greenrobot.eventbus;

/* compiled from: AsyncPoster */
class a implements Runnable, k {

    /* renamed from: b  reason: collision with root package name */
    private final j f14996b = new j();

    /* renamed from: c  reason: collision with root package name */
    private final c f14997c;

    a(c cVar) {
        this.f14997c = cVar;
    }

    public void a(p pVar, Object obj) {
        this.f14996b.a(i.a(pVar, obj));
        this.f14997c.d().execute(this);
    }

    public void run() {
        i b2 = this.f14996b.b();
        if (b2 != null) {
            this.f14997c.g(b2);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
