package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.4 */
public class f {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Date f11482e = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f11483a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f11484b;

    /* renamed from: c  reason: collision with root package name */
    private Date f11485c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f11486d;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f11487a;

        /* renamed from: b  reason: collision with root package name */
        private Date f11488b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f11489c;

        public f a() throws JSONException {
            return new f(this.f11487a, this.f11488b, this.f11489c);
        }

        public b b(Map<String, String> map) {
            this.f11487a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f11487a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f11489c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f11488b = date;
            return this;
        }

        private b() {
            this.f11487a = new JSONObject();
            this.f11488b = f.f11482e;
            this.f11489c = new JSONArray();
        }
    }

    static f b(JSONObject jSONObject) throws JSONException {
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
    }

    public static b f() {
        return new b();
    }

    public JSONArray c() {
        return this.f11486d;
    }

    public JSONObject d() {
        return this.f11484b;
    }

    public Date e() {
        return this.f11485c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f11483a.toString().equals(((f) obj).toString());
    }

    public int hashCode() {
        return this.f11483a.hashCode();
    }

    public String toString() {
        return this.f11483a.toString();
    }

    private f(JSONObject jSONObject, Date date, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.f11484b = jSONObject;
        this.f11485c = date;
        this.f11486d = jSONArray;
        this.f11483a = jSONObject2;
    }
}
