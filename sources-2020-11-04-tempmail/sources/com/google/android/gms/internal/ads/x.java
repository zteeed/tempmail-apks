package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class x implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ PublisherAdView f5452b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzww f5453c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzagf f5454d;

    x(zzagf zzagf, PublisherAdView publisherAdView, zzww zzww) {
        this.f5454d = zzagf;
        this.f5452b = publisherAdView;
        this.f5453c = zzww;
    }

    public final void run() {
        if (this.f5452b.zza(this.f5453c)) {
            this.f5454d.f5868b.onPublisherAdViewLoaded(this.f5452b);
        } else {
            zzbba.i("Could not bind.");
        }
    }
}
