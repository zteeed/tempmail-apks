package com.tempmail.utils;

import android.content.Context;
import b.a.a.a.a;
import com.android.billingclient.api.g;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: SharedPreferenceHelper */
public class s extends t {
    public static String A(Context context) {
        return t.g(context, "old_sid", (String) null);
    }

    public static g B(Context context) {
        String g = t.g(context, "json_one_month", (String) null);
        if (g == null) {
            return null;
        }
        try {
            return new g(g);
        } catch (JSONException e2) {
            a.f("ShPrefHelper", "Got a JSON exception trying to decode SkuDetails");
            e2.printStackTrace();
            return null;
        }
    }

    public static g C(Context context) {
        String g = t.g(context, "json_one_month_trial", (String) null);
        if (g == null) {
            return null;
        }
        try {
            return new g(g);
        } catch (JSONException e2) {
            a.f("ShPrefHelper", "Got a JSON exception trying to decode SkuDetails");
            e2.printStackTrace();
            return null;
        }
    }

    public static g D(Context context) {
        String g = t.g(context, "json_one_week", (String) null);
        if (g == null) {
            return null;
        }
        try {
            return new g(g);
        } catch (JSONException e2) {
            a.f("ShPrefHelper", "Got a JSON exception trying to decode SkuDetails");
            e2.printStackTrace();
            return null;
        }
    }

    public static String E(Context context) {
        return t.g(context, "saved_ots", (String) null);
    }

    public static float F(Context context) {
        return t.d(context, "play_market_version_float", 0.0f).floatValue();
    }

    public static int G(Context context) {
        return t.e(context, "premium_ad_count", 1);
    }

    public static boolean H(Context context) {
        return t.b(context, "is_purchase_started", false);
    }

    public static Boolean I(Context context) {
        return Boolean.valueOf(t.b(context, "push_state_updated", true));
    }

    public static String J(Context context) {
        return t.g(context, "push_token", (String) null);
    }

    public static int K(Context context) {
        return t.e(context, "counter", 0);
    }

    public static String L(Context context) {
        return t.g(context, "sid", (String) null);
    }

    public static g M(Context context) {
        String g = t.g(context, "json_six_month", (String) null);
        if (g == null) {
            return null;
        }
        try {
            return new g(g);
        } catch (JSONException e2) {
            a.f("ShPrefHelper", "Got a JSON exception trying to decode SkuDetails");
            e2.printStackTrace();
            return null;
        }
    }

    public static g N(Context context) {
        String g = t.g(context, "json_three_month", (String) null);
        if (g == null) {
            return null;
        }
        try {
            return new g(g);
        } catch (JSONException e2) {
            a.f("ShPrefHelper", "Got a JSON exception trying to decode SkuDetails");
            e2.printStackTrace();
            return null;
        }
    }

    public static int O(Context context) {
        return t.e(context, "ad_points_total_spend", 0);
    }

    public static int P(Context context) {
        return t.e(context, "update_dialog_count", 0);
    }

    public static g Q(Context context) {
        String g = t.g(context, "json_year", (String) null);
        if (g == null) {
            return null;
        }
        try {
            return new g(g);
        } catch (JSONException e2) {
            a.f("ShPrefHelper", "Got a JSON exception trying to decode SkuDetails");
            e2.printStackTrace();
            return null;
        }
    }

    public static Boolean R(Context context) {
        return t.c(context, "is_dark_mode_enabled", 0);
    }

    public static boolean S(Context context) {
        return t.b(context, "pref_first_email_created", false);
    }

    private static void T(Context context, int i) {
        t.l(context, "remote_config_load_time", i);
    }

    public static void U(Context context, boolean z) {
        m.b("ShPrefHelper", "saveDarkModeEnabled " + z);
        t.j(context, "is_dark_mode_enabled", Boolean.valueOf(z));
    }

    public static void V(Context context, boolean z) {
        t.i(context, "is_email_read_once", z);
    }

    public static void W(Context context, boolean z) {
        t.i(context, "pref_first_email_created", z);
    }

    public static void X(Context context, String str) {
        t.n(context, "saved_gaid", str);
    }

    public static void Y(Context context, int i) {
        t.l(context, "interstitial_inbox_count", i);
    }

    public static void Z(Context context, int i) {
        t.l(context, "interstitial_main_count", i);
    }

    public static void a0(Context context, boolean z) {
        t.i(context, "needShow", z);
    }

    public static void b0(Context context, long j) {
        t.m(context, "last_check", j);
    }

    public static void c0(Context context, int i) {
        t.l(context, "version", i);
        m.b("ShPrefHelper", "save last version code " + i);
        u0(context, 0);
    }

    public static void d0(Context context, String str) {
        t.n(context, "old_sid", str);
    }

    public static void e0(Context context, String str) {
        t.n(context, "json_one_month", str);
    }

    public static void f0(Context context, String str) {
        t.n(context, "json_one_month_trial", str);
    }

    public static void g0(Context context, String str) {
        t.n(context, "json_one_week", str);
    }

    public static void h0(Context context, String str) {
        t.n(context, "saved_ots", str);
    }

    public static void i0(Context context, float f2) {
        t.k(context, "play_market_version_float", f2);
    }

    public static void j0(Context context, int i) {
        t.l(context, "premium_ad_count", i);
    }

    public static void k0(Context context, boolean z) {
        t.i(context, "is_purchase_started", z);
    }

    public static void l0(Context context, boolean z) {
        m.b("ShPrefHelper", "savePushStateNeedUpdate " + z);
        t.i(context, "push_state_updated", z);
    }

    public static void m0(Context context, String str) {
        t.n(context, "push_token", str);
    }

    public static void n0(Context context, int i) {
        t.l(context, "counter", i);
    }

    public static void o(Context context, int i) {
        T(context, q(context) + i);
    }

    public static void o0(Context context, boolean z) {
        m.b("ShPrefHelper", "saveRemoteConfigLoaded " + z);
        t.i(context, "remote_config_loaded", z);
    }

    private static void p(Context context, int i) {
        m.b("Ad points", "new total spend points " + i);
        int O = O(context) + i;
        m.b("Ad points", "total spend points " + O);
        t.l(context, "ad_points_total_spend", O);
    }

    public static void p0(Context context, boolean z) {
        m.b("ShPrefHelper", "save push " + z);
        t.i(context, "is_show_push_notifications", z);
    }

    public static int q(Context context) {
        return t.e(context, "remote_config_load_time", 15);
    }

    public static void q0(Context context, String str) {
        if (str == null && L(context) != null) {
            d0(context, L(context));
        }
        t.n(context, "sid", str);
    }

    public static boolean r(Context context) {
        return t.b(context, "app_started", false);
    }

    public static void r0(Context context, String str) {
        t.n(context, "json_six_month", str);
    }

    public static int s(Context context) {
        return t.e(context, "interstitial_inbox_count", 1);
    }

    public static void s0(Context context, String str) {
        t.n(context, "json_three_month", str);
    }

    public static int t(Context context) {
        return t.e(context, "interstitial_main_count", 1);
    }

    public static void t0(Context context, boolean z) {
        t.i(context, "is_trial_purchased", z);
    }

    public static boolean u(Context context) {
        return t.b(context, "is_email_read_once", false);
    }

    public static void u0(Context context, int i) {
        t.l(context, "update_dialog_count", i);
    }

    public static boolean v(Context context) {
        return t.b(context, "needShow", false);
    }

    public static void v0(Context context, String str) {
        t.n(context, "json_year", str);
    }

    public static Boolean w(Context context) {
        return Boolean.valueOf(t.b(context, "is_show_push_notifications", true));
    }

    public static void w0(Context context, int i) {
        int q = q(context);
        int i2 = q - i;
        m.b("ShPrefHelper", "pointsLeft after " + i2);
        if (i2 < 0) {
            i2 = 0;
        }
        p(context, q - i2);
        T(context, i2);
    }

    public static boolean x(Context context) {
        return t.b(context, "is_trial_purchased", false);
    }

    public static String y(Context context) {
        long f2 = t.f(context, "last_check", 0);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(f2);
        String valueOf = f2 != 0 ? String.valueOf(seconds) : null;
        m.b("ShPrefHelper", "lastCheck " + new Date(seconds).toString());
        return valueOf;
    }

    public static int z(Context context) {
        return t.e(context, "version", 1);
    }
}
