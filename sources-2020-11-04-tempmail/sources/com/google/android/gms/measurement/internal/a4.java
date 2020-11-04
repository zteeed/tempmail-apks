package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement@@17.4.3 */
final /* synthetic */ class a4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzgd f10094b;

    /* renamed from: c  reason: collision with root package name */
    private final zzn f10095c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f10096d;

    a4(zzgd zzgd, zzn zzn, Bundle bundle) {
        this.f10094b = zzgd;
        this.f10095c = zzn;
        this.f10096d = bundle;
    }

    public final void run() {
        this.f10094b.H(this.f10095c, this.f10096d);
    }
}
