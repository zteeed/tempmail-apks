package com.tempmail.utils;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.R;

/* compiled from: AnalyticsUtils */
public class d {
    public static void a(FirebaseAnalytics firebaseAnalytics, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(str2, str3);
        firebaseAnalytics.a(str, bundle);
    }

    public static void b(Context context, FirebaseAnalytics firebaseAnalytics, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(context.getString(R.string.analytics_event_type_error), context.getString(R.string.analytics_api_request_failed));
        if (str != null) {
            bundle.putString(context.getString(R.string.analytics_event_url), str);
        }
        bundle.putString(context.getString(R.string.analytics_event_error_cod_str), String.valueOf(i));
        firebaseAnalytics.a("select_content", bundle);
    }

    public static void c(Context context, FirebaseAnalytics firebaseAnalytics, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (e.O(context)) {
                e(firebaseAnalytics, context.getString(R.string.analytics_email_received_free));
            } else {
                e(firebaseAnalytics, context.getString(R.string.analytics_email_received_premium));
            }
        }
    }

    public static void d(Context context, FirebaseAnalytics firebaseAnalytics, String str, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(context.getString(R.string.analytics_event_type_error), context.getString(R.string.analytics_api_request_failed));
        bundle.putString(context.getString(R.string.analytics_error_message), str);
        bundle.putString(context.getString(R.string.analytics_event_error_cod_str), String.valueOf(i));
        firebaseAnalytics.a("select_content", bundle);
    }

    public static void e(FirebaseAnalytics firebaseAnalytics, String str) {
        a(firebaseAnalytics, "select_content", "content_type", str);
    }
}
