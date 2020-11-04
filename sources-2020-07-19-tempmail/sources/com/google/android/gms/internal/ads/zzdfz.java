package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzq;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfz implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f8010a;

    public zzdfz(Bundle bundle) {
        this.f8010a = bundle;
    }

    public final /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f8010a != null) {
            try {
                zzazy.k(zzazy.k(jSONObject, "device"), "play_store").put("parental_controls", zzq.zzkw().R(this.f8010a));
            } catch (JSONException unused) {
                zzaxv.m("Failed putting parental controls bundle.");
            }
        }
    }
}
