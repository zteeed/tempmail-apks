package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final /* synthetic */ class a4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzgd f9908b;

    /* renamed from: c  reason: collision with root package name */
    private final zzn f9909c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f9910d;

    a4(zzgd zzgd, zzn zzn, Bundle bundle) {
        this.f9908b = zzgd;
        this.f9909c = zzn;
        this.f9910d = bundle;
    }

    public final void run() {
        this.f9908b.E(this.f9909c, this.f9910d);
    }
}
