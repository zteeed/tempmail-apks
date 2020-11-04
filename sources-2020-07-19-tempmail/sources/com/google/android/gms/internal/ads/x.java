package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class x implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ PublisherAdView f5269b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzww f5270c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzagf f5271d;

    x(zzagf zzagf, PublisherAdView publisherAdView, zzww zzww) {
        this.f5271d = zzagf;
        this.f5269b = publisherAdView;
        this.f5270c = zzww;
    }

    public final void run() {
        if (this.f5269b.zza(this.f5270c)) {
            this.f5271d.f5685b.onPublisherAdViewLoaded(this.f5269b);
        } else {
            zzbba.i("Could not bind.");
        }
    }
}
