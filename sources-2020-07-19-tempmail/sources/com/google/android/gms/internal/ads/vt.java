package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class vt implements zzdec<zzddz<JSONObject>> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f5163a;

    vt(Context context) {
        this.f5163a = zzasy.c(context);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f5163a);
        } catch (JSONException unused) {
            zzaxv.m("Failed putting version constants.");
        }
    }

    public final zzdvf<zzddz<JSONObject>> b() {
        return zzdux.g(new wt(this));
    }
}
