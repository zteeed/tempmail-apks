package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class fh implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzcdg f3808b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f3809c;

    fh(zzcdg zzcdg, ViewGroup viewGroup) {
        this.f3808b = zzcdg;
        this.f3809c = viewGroup;
    }

    public final void run() {
        this.f3808b.f(this.f3809c);
    }
}
