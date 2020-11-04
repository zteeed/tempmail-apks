package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class xp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcxb f5507b;

    private xp(zzcxb zzcxb) {
        this.f5507b = zzcxb;
    }

    static Runnable a(zzcxb zzcxb) {
        return new xp(zzcxb);
    }

    public final void run() {
        this.f5507b.onAdLoaded();
    }
}
