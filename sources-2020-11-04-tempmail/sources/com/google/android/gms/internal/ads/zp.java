package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class zp implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final yp f5669b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f5670c;

    zp(yp ypVar, zzuy zzuy) {
        this.f5669b = ypVar;
        this.f5670c = zzuy;
    }

    public final void run() {
        this.f5669b.f5594b.f7846e.onAdFailedToLoad(this.f5670c.f9355b);
    }
}
