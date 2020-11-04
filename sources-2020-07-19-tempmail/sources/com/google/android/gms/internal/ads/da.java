package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class da implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzavr f3622b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbhf f3623c;

    da(zzbhf zzbhf, zzavr zzavr) {
        this.f3623c = zzbhf;
        this.f3622b = zzavr;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f3623c.w(view, this.f3622b, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
