package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final String f2537a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2538b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f2539c = new JSONObject(this.f2537a);

    public k(String str, String str2) throws JSONException {
        this.f2537a = str;
        this.f2538b = str2;
    }

    public String a() {
        return this.f2537a;
    }

    public String b() {
        JSONObject jSONObject = this.f2539c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String c() {
        return this.f2538b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return TextUtils.equals(this.f2537a, kVar.a()) && TextUtils.equals(this.f2538b, kVar.c());
    }

    public int hashCode() {
        return this.f2537a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2537a);
        return valueOf.length() != 0 ? "PurchaseHistoryRecord. Json: ".concat(valueOf) : new String("PurchaseHistoryRecord. Json: ");
    }
}
