package com.google.android.gms.common.api.internal;

final class t0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f2819b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2820c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zza f2821d;

    t0(zza zza, LifecycleCallback lifecycleCallback, String str) {
        this.f2821d = zza;
        this.f2819b = lifecycleCallback;
        this.f2820c = str;
    }

    public final void run() {
        if (this.f2821d.f2915c > 0) {
            this.f2819b.f(this.f2821d.f2916d != null ? this.f2821d.f2916d.getBundle(this.f2820c) : null);
        }
        if (this.f2821d.f2915c >= 2) {
            this.f2819b.j();
        }
        if (this.f2821d.f2915c >= 3) {
            this.f2819b.h();
        }
        if (this.f2821d.f2915c >= 4) {
            this.f2819b.k();
        }
        if (this.f2821d.f2915c >= 5) {
            this.f2819b.g();
        }
    }
}
