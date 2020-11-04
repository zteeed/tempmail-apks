package com.tempmail.utils;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tempmail.R;
import com.tempmail.l.b;
import com.tempmail.splash.SplashActivity;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: AnalyticsUtils */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f13113a = "d";

    public static int a(Throwable th) {
        return ((HttpException) th).response().code();
    }

    public static String b(String str) {
        for (String next : b.j()) {
            if (str.contains(next)) {
                return next;
            }
        }
        return "/rpc/";
    }

    public static String c(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            m.b(f13113a, "e instanceof SocketTimeoutException");
            return "socket_timeout";
        } else if (th instanceof UnknownHostException) {
            m.b(f13113a, "e instanceof UnknownHostException");
            return "unknown_host";
        } else {
            m.b(f13113a, "e instanceof IOException");
            return "network_error";
        }
    }

    public static void d(FirebaseAnalytics firebaseAnalytics, String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString(str2, str3);
        firebaseAnalytics.a(str, bundle);
    }

    public static void e(Context context, FirebaseAnalytics firebaseAnalytics, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (e.P(context)) {
                j(firebaseAnalytics, context.getString(R.string.analytics_email_received_free));
            } else {
                j(firebaseAnalytics, context.getString(R.string.analytics_email_received_premium));
            }
        }
    }

    public static void f(Context context, String str, String str2, int i) {
        String str3;
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        if (context instanceof SplashActivity) {
            str3 = context.getString(R.string.analytics_screen_name_splash);
        } else {
            str3 = context.getString(R.string.analytics_screen_name_main_activity);
        }
        i(context, instance, str3, str, str2, i);
    }

    public static void g(Context context, FirebaseAnalytics firebaseAnalytics, String str, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(context.getString(R.string.analytics_event_type_error), context.getString(R.string.analytics_api_request_failed));
        bundle.putString(context.getString(R.string.analytics_event_url), str2);
        bundle.putString(context.getString(R.string.analytics_event_error_code_str), String.valueOf(i));
        bundle.putString(context.getString(R.string.analytics_event_error_method), str);
        bundle.putString(context.getString(R.string.analytics_event_error_sum), str + "_" + i);
        firebaseAnalytics.a(context.getString(R.string.analytics_event_category_error), bundle);
    }

    public static void h(Context context, FirebaseAnalytics firebaseAnalytics, String str, String str2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(context.getString(R.string.analytics_event_type_error), context.getString(R.string.analytics_premium_payment_failed));
        bundle.putString(context.getString(R.string.analytics_error_message), str2);
        bundle.putString(context.getString(R.string.analytics_event_error_code_str), String.valueOf(i));
        bundle.putString(context.getString(R.string.analytics_event_error_method), str);
        bundle.putString(context.getString(R.string.analytics_event_error_sum), str + "_" + i + "_" + str2);
        firebaseAnalytics.a(context.getString(R.string.analytics_event_category_error), bundle);
    }

    public static void i(Context context, FirebaseAnalytics firebaseAnalytics, String str, String str2, String str3, int i) {
        Bundle bundle = new Bundle();
        bundle.putString(context.getString(R.string.analytics_event_type_error), context.getString(R.string.analytics_api_request_failed));
        bundle.putString(context.getString(R.string.analytics_error_message), str3);
        bundle.putString(context.getString(R.string.analytics_event_error_code_str), String.valueOf(i));
        bundle.putString(context.getString(R.string.analytics_event_error_is_free), String.valueOf(e.P(context)));
        bundle.putString(context.getString(R.string.analytics_event_error_screen), str);
        bundle.putString(context.getString(R.string.analytics_event_error_method), str2);
        bundle.putString(context.getString(R.string.analytics_event_error_sum), str2 + "_" + str + "_" + i + "_" + str3);
        firebaseAnalytics.a(context.getString(R.string.analytics_event_category_error), bundle);
    }

    public static void j(FirebaseAnalytics firebaseAnalytics, String str) {
        d(firebaseAnalytics, "select_content", "content_type", str);
    }

    public static void k(Context context, Throwable th) {
        Response<?> response = ((HttpException) th).response();
        int code = response.code();
        String zVar = response.raw().q().i().toString();
        String str = f13113a;
        m.b(str, "error url " + zVar);
        g(context, FirebaseAnalytics.getInstance(context), b(zVar), zVar, code);
    }

    public static void l(Context context, Throwable th) {
        Response<?> response = ((HttpException) th).response();
        if (response != null) {
            String zVar = response.raw().q().i().toString();
            String str = f13113a;
            m.b(str, "error url " + zVar);
            f(context, b(zVar), c(th), 0);
        }
    }
}
