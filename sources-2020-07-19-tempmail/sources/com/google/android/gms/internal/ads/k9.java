package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class k9 implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzavr f4188b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbfq f4189c;

    k9(zzbfq zzbfq, zzavr zzavr) {
        this.f4189c = zzbfq;
        this.f4188b = zzavr;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f4189c.r(view, this.f4188b, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
