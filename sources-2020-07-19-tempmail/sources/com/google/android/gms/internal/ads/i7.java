package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class i7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbcm f4023b;

    private i7(zzbcm zzbcm) {
        this.f4023b = zzbcm;
    }

    static Runnable a(zzbcm zzbcm) {
        return new i7(zzbcm);
    }

    public final void run() {
        this.f4023b.i();
    }
}
