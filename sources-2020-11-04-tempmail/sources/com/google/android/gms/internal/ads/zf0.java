package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zf0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzaa f5647b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaj f5648c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f5649d;

    public zf0(zzaa zzaa, zzaj zzaj, Runnable runnable) {
        this.f5647b = zzaa;
        this.f5648c = zzaj;
        this.f5649d = runnable;
    }

    public final void run() {
        this.f5647b.k();
        if (this.f5648c.f5918c == null) {
            this.f5647b.r(this.f5648c.f5916a);
        } else {
            this.f5647b.t(this.f5648c.f5918c);
        }
        if (this.f5648c.f5919d) {
            this.f5647b.u("intermediate-response");
        } else {
            this.f5647b.B("done");
        }
        Runnable runnable = this.f5649d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
