package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfh implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f8163a;

    public zzdfh(JSONObject jSONObject) {
        this.f8163a = jSONObject;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f8163a);
        } catch (JSONException unused) {
            zzaxv.m("Unable to get cache_state");
        }
    }
}