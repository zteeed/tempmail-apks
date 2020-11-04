package com.tempmail.billing;

import java.util.Arrays;
import java.util.List;

/* compiled from: BillingConstants */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f12832a = {"subscription_monthly_trial", "subscription_monthly", "subscription_annual", "subscription_six_month", "subscription_one_week", "subscription_three_months", "remove_ad_subscription"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f12833b = {"remove_ad_purchase", "remove_ad_purchase_second"};

    public static final List<String> a() {
        return Arrays.asList(f12833b);
    }

    public static final List<String> b() {
        return Arrays.asList(f12832a);
    }

    public static boolean c(String str) {
        return !d(str);
    }

    public static boolean d(String str) {
        return Arrays.asList(f12832a).contains(str);
    }
}
