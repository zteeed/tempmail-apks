package com.google.android.gms.common.api.internal;

final class u0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f2823b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2824c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzc f2825d;

    u0(zzc zzc, LifecycleCallback lifecycleCallback, String str) {
        this.f2825d = zzc;
        this.f2823b = lifecycleCallback;
        this.f2824c = str;
    }

    public final void run() {
        if (this.f2825d.a0 > 0) {
            this.f2823b.f(this.f2825d.b0 != null ? this.f2825d.b0.getBundle(this.f2824c) : null);
        }
        if (this.f2825d.a0 >= 2) {
            this.f2823b.j();
        }
        if (this.f2825d.a0 >= 3) {
            this.f2823b.h();
        }
        if (this.f2825d.a0 >= 4) {
            this.f2823b.k();
        }
        if (this.f2825d.a0 >= 5) {
            this.f2823b.g();
        }
    }
}
