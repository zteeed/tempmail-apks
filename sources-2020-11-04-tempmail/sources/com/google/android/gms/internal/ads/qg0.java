package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class qg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzyt f4916b;

    /* renamed from: c  reason: collision with root package name */
    private final OnInitializationCompleteListener f4917c;

    qg0(zzyt zzyt, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.f4916b = zzyt;
        this.f4917c = onInitializationCompleteListener;
    }

    public final void run() {
        this.f4916b.n(this.f4917c);
    }
}
