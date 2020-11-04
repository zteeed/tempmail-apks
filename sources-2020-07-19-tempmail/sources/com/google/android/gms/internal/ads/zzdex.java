package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdex implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f7964a;

    public zzdex(JSONObject jSONObject) {
        this.f7964a = jSONObject;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject k = zzazy.k((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f7964a;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                k.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            zzaxv.m("Failed putting app indexing json.");
        }
    }
}
