package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public final class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public a.b f11572a;

    /* renamed from: b  reason: collision with root package name */
    private AppMeasurementSdk f11573b;

    /* renamed from: c  reason: collision with root package name */
    private e f11574c;

    public f(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f11572a = bVar;
        this.f11573b = appMeasurementSdk;
        e eVar = new e(this);
        this.f11574c = eVar;
        this.f11573b.r(eVar);
    }
}
