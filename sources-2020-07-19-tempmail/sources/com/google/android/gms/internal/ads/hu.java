package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class hu implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final iu f3993b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f3994c;

    hu(iu iuVar, zzuy zzuy) {
        this.f3993b = iuVar;
        this.f3994c = zzuy;
    }

    public final void run() {
        this.f3993b.f4079c.f8033d.onAdFailedToLoad(this.f3994c.f9172b);
    }
}
