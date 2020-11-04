package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdet implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final String f8142a;

    public zzdet(String str) {
        this.f8142a = str;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f8142a);
        } catch (JSONException e2) {
            zzaxv.l("Failed putting Ad ID.", e2);
        }
    }
}
