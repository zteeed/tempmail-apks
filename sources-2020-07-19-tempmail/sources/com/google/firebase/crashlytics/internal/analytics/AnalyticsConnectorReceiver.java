package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.analytics.a.a;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsReceiver;
import org.json.JSONException;
import org.json.JSONObject;

public class AnalyticsConnectorReceiver implements a.b, AnalyticsReceiver {
    public static final String APP_EXCEPTION_EVENT_NAME = "_ae";
    private static final String BREADCRUMB_PARAMS_KEY = "parameters";
    private static final String BREADCRUMB_PREFIX = "$A$:";
    static final String CRASHLYTICS_ORIGIN = "clx";
    public static final String EVENT_NAME_KEY = "name";
    private static final String EVENT_ORIGIN_KEY = "_o";
    private static final String EVENT_PARAMS_KEY = "params";
    static final String LEGACY_CRASH_ORIGIN = "crash";
    private final a analyticsConnector;
    private a.C0100a analyticsConnectorHandle;
    private final BreadcrumbHandler breadcrumbHandler;
    private AnalyticsReceiver.CrashlyticsOriginEventListener crashOriginEventListener;

    public interface BreadcrumbHandler {
        void dropBreadcrumb(String str);
    }

    public AnalyticsConnectorReceiver(a aVar, BreadcrumbHandler breadcrumbHandler2) {
        this.analyticsConnector = aVar;
        this.breadcrumbHandler = breadcrumbHandler2;
    }

    private void dispatchBreadcrumbEvent(String str, Bundle bundle) {
        try {
            this.breadcrumbHandler.dropBreadcrumb(BREADCRUMB_PREFIX + serializeEvent(str, bundle));
        } catch (JSONException unused) {
            Logger.getLogger().w("Unable to serialize Firebase Analytics event.");
        }
    }

    private void dispatchCrashlyticsOriginEvent(int i, Bundle bundle) {
        AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener = this.crashOriginEventListener;
        if (crashlyticsOriginEventListener != null) {
            crashlyticsOriginEventListener.onCrashlyticsOriginEvent(i, bundle);
        }
    }

    private static String serializeEvent(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(EVENT_NAME_KEY, str);
        jSONObject.put(BREADCRUMB_PARAMS_KEY, jSONObject2);
        return jSONObject.toString();
    }

    public AnalyticsReceiver.CrashlyticsOriginEventListener getCrashlyticsOriginEventListener() {
        return this.crashOriginEventListener;
    }

    public void onMessageTriggered(int i, Bundle bundle) {
        Logger logger = Logger.getLogger();
        logger.d("AnalyticsConnectorReceiver received message: " + i + " " + bundle);
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle(EVENT_PARAMS_KEY);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if (CRASHLYTICS_ORIGIN.equals(bundle2.getString(EVENT_ORIGIN_KEY))) {
                dispatchCrashlyticsOriginEvent(i, bundle);
                return;
            }
            String string = bundle.getString(EVENT_NAME_KEY);
            if (string != null) {
                dispatchBreadcrumbEvent(string, bundle2);
            }
        }
    }

    public boolean register() {
        a aVar = this.analyticsConnector;
        if (aVar == null) {
            Logger.getLogger().d("Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        a.C0100a d2 = aVar.d(CRASHLYTICS_ORIGIN, this);
        this.analyticsConnectorHandle = d2;
        if (d2 == null) {
            Logger.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a.C0100a d3 = this.analyticsConnector.d(LEGACY_CRASH_ORIGIN, this);
            this.analyticsConnectorHandle = d3;
            if (d3 != null) {
                Logger.getLogger().w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (this.analyticsConnectorHandle != null) {
            return true;
        }
        return false;
    }

    public void setCrashlyticsOriginEventListener(AnalyticsReceiver.CrashlyticsOriginEventListener crashlyticsOriginEventListener) {
        this.crashOriginEventListener = crashlyticsOriginEventListener;
    }

    public void unregister() {
        a.C0100a aVar = this.analyticsConnectorHandle;
        if (aVar != null) {
            aVar.unregister();
        }
    }
}
