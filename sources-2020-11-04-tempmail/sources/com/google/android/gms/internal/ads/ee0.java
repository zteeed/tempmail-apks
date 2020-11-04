package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ee0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Surface f3903b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzqe f3904c;

    ee0(zzqe zzqe, Surface surface) {
        this.f3904c = zzqe;
        this.f3903b = surface;
    }

    public final void run() {
        this.f3904c.f9211b.k(this.f3903b);
    }
}
