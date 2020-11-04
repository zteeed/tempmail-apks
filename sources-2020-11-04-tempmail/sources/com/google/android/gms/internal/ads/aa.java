package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class aa implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f3537b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzavr f3538c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3539d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbhf f3540e;

    aa(zzbhf zzbhf, View view, zzavr zzavr, int i) {
        this.f3540e = zzbhf;
        this.f3537b = view;
        this.f3538c = zzavr;
        this.f3539d = i;
    }

    public final void run() {
        this.f3540e.w(this.f3537b, this.f3538c, this.f3539d - 1);
    }
}
