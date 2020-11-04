package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class zp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final yp f5486b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f5487c;

    zp(yp ypVar, zzuy zzuy) {
        this.f5486b = ypVar;
        this.f5487c = zzuy;
    }

    public final void run() {
        this.f5486b.f5411b.f7663e.onAdFailedToLoad(this.f5487c.f9172b);
    }
}
