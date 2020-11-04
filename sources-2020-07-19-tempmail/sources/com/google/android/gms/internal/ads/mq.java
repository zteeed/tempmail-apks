package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class mq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final kq f4416b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f4417c;

    mq(kq kqVar, zzuy zzuy) {
        this.f4416b = kqVar;
        this.f4417c = zzuy;
    }

    public final void run() {
        this.f4416b.f4238c.f7686d.e().onAdFailedToLoad(this.f4417c.f9172b);
    }
}
