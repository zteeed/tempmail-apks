package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class fq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final cq f4011b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f4012c;

    fq(cq cqVar, zzuy zzuy) {
        this.f4011b = cqVar;
        this.f4012c = zzuy;
    }

    public final void run() {
        this.f4011b.f3757b.g.onAdFailedToLoad(this.f4012c.f9355b);
    }
}
