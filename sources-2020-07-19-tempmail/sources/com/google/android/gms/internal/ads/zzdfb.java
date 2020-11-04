package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfb implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f7969a;

    public zzdfb(String str) {
        this.f7969a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject k = zzazy.k((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.f7969a)) {
                k.put("attok", this.f7969a);
            }
        } catch (JSONException e2) {
            zzaxv.l("Failed putting attestation token.", e2);
        }
    }
}
