package com.google.android.play.core.internal;

final class f extends b {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l f11487c;

    f(l lVar) {
        this.f11487c = lVar;
    }

    public final void a() {
        if (this.f11487c.k != null) {
            this.f11487c.f11493b.f("Unbind from service.", new Object[0]);
            this.f11487c.f11492a.unbindService(this.f11487c.j);
            this.f11487c.f11496e = false;
            this.f11487c.k = null;
            this.f11487c.j = null;
        }
    }
}
