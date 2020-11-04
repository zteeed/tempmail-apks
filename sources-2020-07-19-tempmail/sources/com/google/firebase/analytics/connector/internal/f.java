package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.4.3 */
final class f implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ g f11021a;

    public f(g gVar) {
        this.f11021a = gVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str != null && !str.equals("crash") && b.i(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(AnalyticsConnectorReceiver.EVENT_NAME_KEY, str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f11021a.f11022a.onMessageTriggered(3, bundle2);
        }
    }
}
