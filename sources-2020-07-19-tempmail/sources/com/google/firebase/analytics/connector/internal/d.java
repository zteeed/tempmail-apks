package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
final class d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f11016a;

    public d(e eVar) {
        this.f11016a = eVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        if (this.f11016a.f11017a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.j(str2));
            this.f11016a.f11018b.onMessageTriggered(2, bundle2);
        }
    }
}
