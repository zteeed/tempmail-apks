package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SkuDetails */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f2406a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f2407b = new JSONObject(this.f2406a);

    /* compiled from: SkuDetails */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private List<g> f2408a;

        /* renamed from: b  reason: collision with root package name */
        private int f2409b;

        public a(int i, List<g> list) {
            this.f2408a = list;
            this.f2409b = i;
        }

        public int a() {
            return this.f2409b;
        }

        public List<g> b() {
            return this.f2408a;
        }
    }

    public g(String str) throws JSONException {
        this.f2406a = str;
    }

    public String a() {
        return this.f2407b.optString("freeTrialPeriod");
    }

    public String b() {
        return this.f2406a;
    }

    public String c() {
        return this.f2407b.optString("price");
    }

    public long d() {
        return this.f2407b.optLong("price_amount_micros");
    }

    public String e() {
        return this.f2407b.optString("price_currency_code");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f2406a, ((g) obj).f2406a);
    }

    public String f() {
        return this.f2407b.optString("productId");
    }

    public String g() {
        return this.f2407b.optString("type");
    }

    public boolean h() {
        return this.f2407b.has("rewardToken");
    }

    public int hashCode() {
        return this.f2406a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return this.f2407b.optString("rewardToken");
    }

    public String toString() {
        return "SkuDetails: " + this.f2406a;
    }
}
