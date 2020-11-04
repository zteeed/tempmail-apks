package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzden implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final AdvertisingIdClient.Info f7947a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7948b;

    public zzden(AdvertisingIdClient.Info info, String str) {
        this.f7947a = info;
        this.f7948b = str;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject k = zzazy.k((JSONObject) obj, "pii");
            if (this.f7947a == null || TextUtils.isEmpty(this.f7947a.getId())) {
                k.put("pdid", this.f7948b);
                k.put("pdidtype", "ssaid");
                return;
            }
            k.put("rdid", this.f7947a.getId());
            k.put("is_lat", this.f7947a.isLimitAdTrackingEnabled());
            k.put("idtype", "adid");
        } catch (JSONException e2) {
            zzaxv.l("Failed putting Ad ID.", e2);
        }
    }
}
