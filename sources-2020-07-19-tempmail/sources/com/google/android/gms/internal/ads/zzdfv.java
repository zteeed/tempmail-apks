package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfv implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Location f8005a;

    public zzdfv(Location location) {
        this.f8005a = location;
    }

    public final /* synthetic */ void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (this.f8005a != null) {
                JSONObject jSONObject2 = new JSONObject();
                Float valueOf = Float.valueOf(this.f8005a.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.f8005a.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.f8005a.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.f8005a.getLongitude() * 1.0E7d));
                jSONObject2.put("radius", valueOf);
                jSONObject2.put("lat", valueOf3);
                jSONObject2.put("long", valueOf4);
                jSONObject2.put("time", valueOf2);
                jSONObject.put("uule", jSONObject2);
            }
        } catch (JSONException e2) {
            zzaxv.l("Failed adding location to the request JSON.", e2);
        }
    }
}
