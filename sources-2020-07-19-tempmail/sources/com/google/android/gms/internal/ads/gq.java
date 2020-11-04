package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class gq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final cq f3908b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f3909c;

    gq(cq cqVar, zzuy zzuy) {
        this.f3908b = cqVar;
        this.f3909c = zzuy;
    }

    public final void run() {
        this.f3908b.f3574b.f7673e.onAdFailedToLoad(this.f3909c.f9172b);
    }
}
