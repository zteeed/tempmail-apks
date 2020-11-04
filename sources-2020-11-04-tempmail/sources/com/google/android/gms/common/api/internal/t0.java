package com.google.android.gms.common.api.internal;

final class t0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f3007b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3008c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zza f3009d;

    t0(zza zza, LifecycleCallback lifecycleCallback, String str) {
        this.f3009d = zza;
        this.f3007b = lifecycleCallback;
        this.f3008c = str;
    }

    public final void run() {
        if (this.f3009d.f3103c > 0) {
            this.f3007b.f(this.f3009d.f3104d != null ? this.f3009d.f3104d.getBundle(this.f3008c) : null);
        }
        if (this.f3009d.f3103c >= 2) {
            this.f3007b.j();
        }
        if (this.f3009d.f3103c >= 3) {
            this.f3007b.h();
        }
        if (this.f3009d.f3103c >= 4) {
            this.f3007b.k();
        }
        if (this.f3009d.f3103c >= 5) {
            this.f3007b.g();
        }
    }
}
