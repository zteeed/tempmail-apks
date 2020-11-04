package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
final class e implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f f11571a;

    public e(f fVar) {
        this.f11571a = fVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && a.i(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f11571a.f11572a.onMessageTriggered(3, bundle2);
        }
    }
}
