package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ue0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f5246b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzri f5247c;

    ue0(zzri zzri, View view) {
        this.f5247c = zzri;
        this.f5246b = view;
    }

    public final void run() {
        this.f5247c.d(this.f5246b);
    }
}
