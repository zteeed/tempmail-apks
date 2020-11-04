package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class fh implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcdg f3991b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f3992c;

    fh(zzcdg zzcdg, ViewGroup viewGroup) {
        this.f3991b = zzcdg;
        this.f3992c = viewGroup;
    }

    public final void run() {
        this.f3991b.f(this.f3992c);
    }
}
