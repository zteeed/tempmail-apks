package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class sl implements zzduh {

    /* renamed from: a  reason: collision with root package name */
    private final zzuw f4917a;

    sl(zzcns zzcns, zzuw zzuw) {
        this.f4917a = zzuw;
    }

    public final zzdvf zzf(Object obj) {
        zzuw zzuw = this.f4917a;
        String str = (String) obj;
        String str2 = zzuw.f9170b;
        String str3 = zzuw.f9171c;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str2);
        jSONObject2.put("base_url", "");
        jSONObject2.put("signals", new JSONObject(str3));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return zzdux.g(jSONObject);
    }
}
