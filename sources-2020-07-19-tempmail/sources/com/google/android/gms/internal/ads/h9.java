package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class h9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f3944b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzavr f3945c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3946d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ zzbfq f3947e;

    h9(zzbfq zzbfq, View view, zzavr zzavr, int i) {
        this.f3947e = zzbfq;
        this.f3944b = view;
        this.f3945c = zzavr;
        this.f3946d = i;
    }

    public final void run() {
        this.f3947e.r(this.f3944b, this.f3945c, this.f3946d - 1);
    }
}
