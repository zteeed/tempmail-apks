package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdgn implements zzddz<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f8211a;

    public zzdgn(Map<String, Object> map) {
        this.f8211a = map;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzq.zzkw().e0(this.f8211a));
        } catch (JSONException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            zzaxv.m(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
