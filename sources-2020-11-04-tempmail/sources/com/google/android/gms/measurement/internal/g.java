package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r4 f10193b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f10194c;

    g(f fVar, r4 r4Var) {
        this.f10194c = fVar;
        this.f10193b = r4Var;
    }

    public final void run() {
        this.f10193b.m();
        if (zzx.a()) {
            this.f10193b.g().z(this);
            return;
        }
        boolean d2 = this.f10194c.d();
        long unused = this.f10194c.f10174c = 0;
        if (d2) {
            this.f10194c.b();
        }
    }
}
