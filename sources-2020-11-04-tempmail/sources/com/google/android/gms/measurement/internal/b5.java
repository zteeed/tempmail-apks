package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class b5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f10115b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f10116c;

    b5(zzhc zzhc, Bundle bundle) {
        this.f10116c = zzhc;
        this.f10115b = bundle;
    }

    public final void run() {
        this.f10116c.t0(this.f10115b);
    }
}
