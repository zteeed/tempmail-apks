package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzden implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final AdvertisingIdClient.Info f8130a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8131b;

    public zzden(AdvertisingIdClient.Info info, String str) {
        this.f8130a = info;
        this.f8131b = str;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            JSONObject k = zzazy.k((JSONObject) obj, "pii");
            if (this.f8130a == null || TextUtils.isEmpty(this.f8130a.getId())) {
                k.put("pdid", this.f8131b);
                k.put("pdidtype", "ssaid");
                return;
            }
            k.put("rdid", this.f8130a.getId());
            k.put("is_lat", this.f8130a.isLimitAdTrackingEnabled());
            k.put("idtype", "adid");
        } catch (JSONException e2) {
            zzaxv.l("Failed putting Ad ID.", e2);
        }
    }
}
