package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class cu implements zzddz {

    /* renamed from: a  reason: collision with root package name */
    static final zzddz f3761a = new cu();

    private cu() {
    }

    public final void a(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
