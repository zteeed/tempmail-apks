package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class sm implements zzdob {

    /* renamed from: a  reason: collision with root package name */
    static final zzdob f5101a = new sm();

    private sm() {
    }

    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zzaxv.m("Ad request signals:");
        zzaxv.m(jSONObject.toString(2));
        return jSONObject;
    }
}
