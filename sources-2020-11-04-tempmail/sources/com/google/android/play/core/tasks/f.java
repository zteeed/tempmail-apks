package com.google.android.play.core.tasks;

final class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f11510b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f11511c;

    f(g gVar, c cVar) {
        this.f11511c = gVar;
        this.f11510b = cVar;
    }

    public final void run() {
        synchronized (this.f11511c.f11513b) {
            if (this.f11511c.f11514c != null) {
                this.f11511c.f11514c.b(this.f11510b.e());
            }
        }
    }
}
