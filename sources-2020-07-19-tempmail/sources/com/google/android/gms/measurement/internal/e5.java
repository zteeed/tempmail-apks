package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class e5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f9980b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzhc f9981c;

    e5(zzhc zzhc, Bundle bundle) {
        this.f9981c = zzhc;
        this.f9980b = bundle;
    }

    public final void run() {
        this.f9981c.w0(this.f9980b);
    }
}
