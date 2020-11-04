package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private zzbco f4788b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4789c = false;

    r7(zzbco zzbco) {
        this.f4788b = zzbco;
    }

    private final void c() {
        zzaye.h.removeCallbacks(this);
        zzaye.h.postDelayed(this, 250);
    }

    public final void a() {
        this.f4789c = true;
        this.f4788b.G();
    }

    public final void b() {
        this.f4789c = false;
        c();
    }

    public final void run() {
        if (!this.f4789c) {
            this.f4788b.G();
            c();
        }
    }
}
