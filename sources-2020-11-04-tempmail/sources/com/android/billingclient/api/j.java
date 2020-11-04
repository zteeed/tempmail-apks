package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final String f2532a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2533b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f2534c = new JSONObject(this.f2532a);

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<j> f2535a;

        public a(g gVar, List<j> list) {
            this.f2535a = list;
        }

        public List<j> a() {
            return this.f2535a;
        }
    }

    public j(String str, String str2) throws JSONException {
        this.f2532a = str;
        this.f2533b = str2;
    }

    public String a() {
        return this.f2534c.optString("orderId");
    }

    public String b() {
        return this.f2532a;
    }

    public int c() {
        return this.f2534c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long d() {
        return this.f2534c.optLong("purchaseTime");
    }

    public String e() {
        JSONObject jSONObject = this.f2534c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return TextUtils.equals(this.f2532a, jVar.b()) && TextUtils.equals(this.f2533b, jVar.f());
    }

    public String f() {
        return this.f2533b;
    }

    public String g() {
        return this.f2534c.optString("productId");
    }

    public boolean h() {
        return this.f2534c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f2532a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2532a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
