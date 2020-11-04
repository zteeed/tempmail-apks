package com.google.android.gms.common.api.internal;

final class u0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f3011b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3012c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzc f3013d;

    u0(zzc zzc, LifecycleCallback lifecycleCallback, String str) {
        this.f3013d = zzc;
        this.f3011b = lifecycleCallback;
        this.f3012c = str;
    }

    public final void run() {
        if (this.f3013d.Z > 0) {
            this.f3011b.f(this.f3013d.a0 != null ? this.f3013d.a0.getBundle(this.f3012c) : null);
        }
        if (this.f3013d.Z >= 2) {
            this.f3011b.j();
        }
        if (this.f3013d.Z >= 3) {
            this.f3011b.h();
        }
        if (this.f3013d.Z >= 4) {
            this.f3011b.k();
        }
        if (this.f3013d.Z >= 5) {
            this.f3011b.g();
        }
    }
}
