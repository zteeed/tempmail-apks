package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class fw implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final dw f4017b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f4018c;

    fw(dw dwVar, zzuy zzuy) {
        this.f4017b = dwVar;
        this.f4018c = zzuy;
    }

    public final void run() {
        this.f4017b.f3855c.f8280d.onAdFailedToLoad(this.f4018c.f9355b);
    }
}
