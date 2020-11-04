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
    public static final Date f12031e = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f12032a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f12033b;

    /* renamed from: c  reason: collision with root package name */
    private Date f12034c;

    /* renamed from: d  reason: collision with root package name */
    private JSONArray f12035d;

    /* compiled from: com.google.firebase:firebase-config@@19.1.4 */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f12036a;

        /* renamed from: b  reason: collision with root package name */
        private Date f12037b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f12038c;

        public f a() throws JSONException {
            return new f(this.f12036a, this.f12037b, this.f12038c);
        }

        public b b(Map<String, String> map) {
            this.f12036a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f12036a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f12038c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f12037b = date;
            return this;
        }

        private b() {
            this.f12036a = new JSONObject();
            this.f12037b = f.f12031e;
            this.f12038c = new JSONArray();
        }
    }

    static f b(JSONObject jSONObject) throws JSONException {
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
    }

    public static b f() {
        return new b();
    }

    public JSONArray c() {
        return this.f12035d;
    }

    public JSONObject d() {
        return this.f12033b;
    }

    public Date e() {
        return this.f12034c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f12032a.toString().equals(((f) obj).toString());
    }

    public int hashCode() {
        return this.f12032a.hashCode();
    }

    public String toString() {
        return this.f12032a.toString();
    }

    private f(JSONObject jSONObject, Date date, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.f12033b = jSONObject;
        this.f12034c = date;
        this.f12035d = jSONArray;
        this.f12032a = jSONObject2;
    }
}
