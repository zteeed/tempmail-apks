package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
final class c implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f11566a;

    public c(d dVar) {
        this.f11566a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        if (this.f11566a.f11567a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", a.j(str2));
            this.f11566a.f11568b.onMessageTriggered(2, bundle2);
        }
    }
}
