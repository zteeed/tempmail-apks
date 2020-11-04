package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r4 f10007b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f10008c;

    g(f fVar, r4 r4Var) {
        this.f10008c = fVar;
        this.f10007b = r4Var;
    }

    public final void run() {
        this.f10007b.m();
        if (zzx.a()) {
            this.f10007b.g().z(this);
            return;
        }
        boolean d2 = this.f10008c.d();
        long unused = this.f10008c.f9988c = 0;
        if (d2) {
            this.f10008c.b();
        }
    }
}
