package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ue0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f5063b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzri f5064c;

    ue0(zzri zzri, View view) {
        this.f5064c = zzri;
        this.f5063b = view;
    }

    public final void run() {
        this.f5064c.d(this.f5063b);
    }
}