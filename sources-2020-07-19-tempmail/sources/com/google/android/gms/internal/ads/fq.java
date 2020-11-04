package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class fq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final cq f3828b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f3829c;

    fq(cq cqVar, zzuy zzuy) {
        this.f3828b = cqVar;
        this.f3829c = zzuy;
    }

    public final void run() {
        this.f3828b.f3574b.g.onAdFailedToLoad(this.f3829c.f9172b);
    }
}
