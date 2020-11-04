package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class qg0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzyt f4733b;

    /* renamed from: c  reason: collision with root package name */
    private final OnInitializationCompleteListener f4734c;

    qg0(zzyt zzyt, OnInitializationCompleteListener onInitializationCompleteListener) {
        this.f4733b = zzyt;
        this.f4734c = onInitializationCompleteListener;
    }

    public final void run() {
        this.f4733b.n(this.f4734c);
    }
}
