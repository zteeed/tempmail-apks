package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final cq f4091b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f4092c;

    gq(cq cqVar, zzuy zzuy) {
        this.f4091b = cqVar;
        this.f4092c = zzuy;
    }

    public final void run() {
        this.f4091b.f3757b.f7856e.onAdFailedToLoad(this.f4092c.f9355b);
    }
}
