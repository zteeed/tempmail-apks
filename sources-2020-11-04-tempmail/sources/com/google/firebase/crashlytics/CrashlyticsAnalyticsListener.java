package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.a.a;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;

class CrashlyticsAnalyticsListener implements a.b {
    static final String CRASHLYTICS_ORIGIN = "clx";
    static final String EVENT_NAME_KEY = "name";
    static final String EVENT_ORIGIN_KEY = "_o";
    static final String EVENT_PARAMS_KEY = "params";
    private AnalyticsEventReceiver breadcrumbEventReceiver;
    private AnalyticsEventReceiver crashlyticsOriginEventReceiver;

    CrashlyticsAnalyticsListener() {
    }

    private static void notifyEventReceiver(AnalyticsEventReceiver analyticsEventReceiver, String str, Bundle bundle) {
        if (analyticsEventReceiver != null) {
            analyticsEventReceiver.onEvent(str, bundle);
        }
    }

    private void notifyEventReceivers(String str, Bundle bundle) {
        AnalyticsEventReceiver analyticsEventReceiver;
        if (CRASHLYTICS_ORIGIN.equals(bundle.getString(EVENT_ORIGIN_KEY))) {
            analyticsEventReceiver = this.crashlyticsOriginEventReceiver;
        } else {
            analyticsEventReceiver = this.breadcrumbEventReceiver;
        }
        notifyEventReceiver(analyticsEventReceiver, str, bundle);
    }

    public void onMessageTriggered(int i, Bundle bundle) {
        String string;
        Logger logger = Logger.getLogger();
        logger.d("Received Analytics message: " + i + " " + bundle);
        if (bundle != null && (string = bundle.getString(EVENT_NAME_KEY)) != null) {
            Bundle bundle2 = bundle.getBundle(EVENT_PARAMS_KEY);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            notifyEventReceivers(string, bundle2);
        }
    }

    public void setBreadcrumbEventReceiver(AnalyticsEventReceiver analyticsEventReceiver) {
        this.breadcrumbEventReceiver = analyticsEventReceiver;
    }

    public void setCrashlyticsOriginEventReceiver(AnalyticsEventReceiver analyticsEventReceiver) {
        this.crashlyticsOriginEventReceiver = analyticsEventReceiver;
    }
}
