package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public final class g implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public a.b f11022a;

    /* renamed from: b  reason: collision with root package name */
    private AppMeasurementSdk f11023b;

    /* renamed from: c  reason: collision with root package name */
    private f f11024c;

    public g(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f11022a = bVar;
        this.f11023b = appMeasurementSdk;
        f fVar = new f(this);
        this.f11024c = fVar;
        this.f11023b.r(fVar);
    }

    public final a.b a() {
        return this.f11022a;
    }
}
