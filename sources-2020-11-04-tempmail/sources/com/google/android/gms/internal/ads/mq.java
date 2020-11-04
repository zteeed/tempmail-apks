package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class mq implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final kq f4599b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f4600c;

    mq(kq kqVar, zzuy zzuy) {
        this.f4599b = kqVar;
        this.f4600c = zzuy;
    }

    public final void run() {
        this.f4599b.f4421c.f7869d.e().onAdFailedToLoad(this.f4600c.f9355b);
    }
}
