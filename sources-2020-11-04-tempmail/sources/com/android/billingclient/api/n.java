package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f2547a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f2548b = new JSONObject(this.f2547a);

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<n> f2549a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2550b;

        /* renamed from: c  reason: collision with root package name */
        private final String f2551c;

        public a(int i, String str, List<n> list) {
            this.f2550b = i;
            this.f2551c = str;
            this.f2549a = list;
        }

        public final List<n> a() {
            return this.f2549a;
        }

        public final int b() {
            return this.f2550b;
        }

        public final String c() {
            return this.f2551c;
        }
    }

    public n(String str) throws JSONException {
        this.f2547a = str;
        if (TextUtils.isEmpty(f())) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        } else if (TextUtils.isEmpty(g())) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public String a() {
        return this.f2548b.optString("freeTrialPeriod");
    }

    public String b() {
        return this.f2547a;
    }

    public String c() {
        return this.f2548b.optString("price");
    }

    public long d() {
        return this.f2548b.optLong("price_amount_micros");
    }

    public String e() {
        return this.f2548b.optString("price_currency_code");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        return TextUtils.equals(this.f2547a, ((n) obj).f2547a);
    }

    public String f() {
        return this.f2548b.optString("productId");
    }

    public String g() {
        return this.f2548b.optString("type");
    }

    public final String h() {
        return this.f2548b.optString("packageName");
    }

    public int hashCode() {
        return this.f2547a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final String i() {
        return this.f2548b.optString("skuDetailsToken");
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2547a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
