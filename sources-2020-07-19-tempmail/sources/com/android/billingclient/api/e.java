package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Purchase */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f2401a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2402b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f2403c = new JSONObject(this.f2401a);

    /* compiled from: Purchase */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private List<e> f2404a;

        /* renamed from: b  reason: collision with root package name */
        private int f2405b;

        public a(int i, List<e> list) {
            this.f2404a = list;
            this.f2405b = i;
        }

        public List<e> a() {
            return this.f2404a;
        }

        public int b() {
            return this.f2405b;
        }
    }

    public e(String str, String str2) throws JSONException {
        this.f2401a = str;
        this.f2402b = str2;
    }

    public String a() {
        return this.f2403c.optString("orderId");
    }

    public String b() {
        return this.f2401a;
    }

    public long c() {
        return this.f2403c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.f2403c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f2402b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!TextUtils.equals(this.f2401a, eVar.b()) || !TextUtils.equals(this.f2402b, eVar.e())) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.f2403c.optString("productId");
    }

    public int hashCode() {
        return this.f2401a.hashCode();
    }

    public String toString() {
        return "Purchase. Json: " + this.f2401a;
    }
}
