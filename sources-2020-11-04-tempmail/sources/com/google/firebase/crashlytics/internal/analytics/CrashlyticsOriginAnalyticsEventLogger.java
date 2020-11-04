package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.a.a;

public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    private final a analyticsConnector;

    public CrashlyticsOriginAnalyticsEventLogger(a aVar) {
        this.analyticsConnector = aVar;
    }

    public void logEvent(String str, Bundle bundle) {
        this.analyticsConnector.W(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, str, bundle);
    }
}
