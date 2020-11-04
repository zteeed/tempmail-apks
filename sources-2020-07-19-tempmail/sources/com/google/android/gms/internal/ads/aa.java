package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class aa implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f3354b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzavr f3355c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3356d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbhf f3357e;

    aa(zzbhf zzbhf, View view, zzavr zzavr, int i) {
        this.f3357e = zzbhf;
        this.f3354b = view;
        this.f3355c = zzavr;
        this.f3356d = i;
    }

    public final void run() {
        this.f3357e.w(this.f3354b, this.f3355c, this.f3356d - 1);
    }
}
