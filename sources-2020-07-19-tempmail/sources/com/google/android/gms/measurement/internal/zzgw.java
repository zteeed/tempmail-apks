package com.google.android.gms.measurement.internal;

import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public class zzgw {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f10459a = {"app_background", "app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter", "session_start_with_rollout", "firebase_campaign"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f10460b = {"_ab", "_cd", AnalyticsConnectorReceiver.APP_EXCEPTION_EVENT_NAME, "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep", "_ssr", "_cmp"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f10461c = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    protected zzgw() {
    }

    public static String a(String str) {
        return zzig.b(str, f10460b, f10459a);
    }

    public static String b(String str) {
        return zzig.b(str, f10459a, f10460b);
    }
}
