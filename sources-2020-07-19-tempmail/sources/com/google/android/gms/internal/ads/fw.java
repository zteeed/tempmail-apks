package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class fw implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final dw f3834b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f3835c;

    fw(dw dwVar, zzuy zzuy) {
        this.f3834b = dwVar;
        this.f3835c = zzuy;
    }

    public final void run() {
        this.f3834b.f3672c.f8097d.onAdFailedToLoad(this.f3835c.f9172b);
    }
}
