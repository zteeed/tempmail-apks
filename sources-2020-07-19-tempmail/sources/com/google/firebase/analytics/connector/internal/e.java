package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.a.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    Set<String> f11017a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public a.b f11018b;

    /* renamed from: c  reason: collision with root package name */
    private AppMeasurementSdk f11019c;

    /* renamed from: d  reason: collision with root package name */
    private d f11020d;

    public e(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f11018b = bVar;
        this.f11019c = appMeasurementSdk;
        d dVar = new d(this);
        this.f11020d = dVar;
        this.f11019c.r(dVar);
    }

    public final a.b a() {
        return this.f11018b;
    }
}
