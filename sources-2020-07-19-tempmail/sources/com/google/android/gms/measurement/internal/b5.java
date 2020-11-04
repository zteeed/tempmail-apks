package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class b5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f9929b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f9930c;

    b5(zzhc zzhc, Bundle bundle) {
        this.f9930c = zzhc;
        this.f9929b = bundle;
    }

    public final void run() {
        this.f9930c.t0(this.f9929b);
    }
}
