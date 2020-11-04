package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private zzbco f4971b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4972c = false;

    r7(zzbco zzbco) {
        this.f4971b = zzbco;
    }

    private final void c() {
        zzaye.h.removeCallbacks(this);
        zzaye.h.postDelayed(this, 250);
    }

    public final void a() {
        this.f4972c = true;
        this.f4971b.G();
    }

    public final void b() {
        this.f4972c = false;
        c();
    }

    public final void run() {
        if (!this.f4972c) {
            this.f4971b.G();
            c();
        }
    }
}
