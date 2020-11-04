package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.a.a;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    Set<String> f11567a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public a.b f11568b;

    /* renamed from: c  reason: collision with root package name */
    private AppMeasurementSdk f11569c;

    /* renamed from: d  reason: collision with root package name */
    private c f11570d;

    public d(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f11568b = bVar;
        this.f11569c = appMeasurementSdk;
        c cVar = new c(this);
        this.f11570d = cVar;
        this.f11569c.r(cVar);
    }
}
