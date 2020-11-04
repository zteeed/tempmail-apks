package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zf0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzaa f5464b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaj f5465c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f5466d;

    public zf0(zzaa zzaa, zzaj zzaj, Runnable runnable) {
        this.f5464b = zzaa;
        this.f5465c = zzaj;
        this.f5466d = runnable;
    }

    public final void run() {
        this.f5464b.k();
        if (this.f5465c.f5735c == null) {
            this.f5464b.r(this.f5465c.f5733a);
        } else {
            this.f5464b.t(this.f5465c.f5735c);
        }
        if (this.f5465c.f5736d) {
            this.f5464b.u("intermediate-response");
        } else {
            this.f5464b.B("done");
        }
        Runnable runnable = this.f5466d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
