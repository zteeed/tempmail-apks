package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfq implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f8179a;

    /* renamed from: b  reason: collision with root package name */
    private String f8180b;

    public zzdfq(String str, String str2) {
        this.f8179a = str;
        this.f8180b = str2;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject k = zzazy.k((JSONObject) obj, "pii");
            k.put("doritos", this.f8179a);
            k.put("doritos_v2", this.f8180b);
        } catch (JSONException unused) {
            zzaxv.m("Failed putting doritos string.");
        }
    }
}
