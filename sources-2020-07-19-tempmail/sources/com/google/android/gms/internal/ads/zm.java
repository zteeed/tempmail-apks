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
        jSONObject2.put("base_url", zzcpm.f7323c.d());
        jSONObject2.put("signals", zzcpm.f7322b);
        jSONObject3.put("body", zzcpm.f7321a.f7343c);
        jSONObject3.put("headers", zzq.zzkw().e0(zzcpm.f7321a.f7342b));
        jSONObject3.put("response_code", zzcpm.f7321a.f7341a);
        jSONObject3.put("latency", zzcpm.f7321a.f7344d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcpm.f7323c.g());
        return jSONObject;
    }
}
