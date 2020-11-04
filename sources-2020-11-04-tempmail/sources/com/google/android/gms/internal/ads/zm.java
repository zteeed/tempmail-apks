package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class zm implements zzalk<zzcpm> {
    zm() {
    }

    public final /* synthetic */ JSONObject b(Object obj) throws JSONException {
        zzcpm zzcpm = (zzcpm) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcpm.f7506c.d());
        jSONObject2.put("signals", zzcpm.f7505b);
        jSONObject3.put("body", zzcpm.f7504a.f7526c);
        jSONObject3.put("headers", zzq.zzkw().e0(zzcpm.f7504a.f7525b));
        jSONObject3.put("response_code", zzcpm.f7504a.f7524a);
        jSONObject3.put("latency", zzcpm.f7504a.f7527d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcpm.f7506c.g());
        return jSONObject;
    }
}
