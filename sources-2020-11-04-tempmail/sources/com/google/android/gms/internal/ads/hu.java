package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class hu implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final iu f4176b;

    /* renamed from: c  reason: collision with root package name */
    private final zzuy f4177c;

    hu(iu iuVar, zzuy zzuy) {
        this.f4176b = iuVar;
        this.f4177c = zzuy;
    }

    public final void run() {
        this.f4176b.f4262c.f8216d.onAdFailedToLoad(this.f4177c.f9355b);
    }
}
