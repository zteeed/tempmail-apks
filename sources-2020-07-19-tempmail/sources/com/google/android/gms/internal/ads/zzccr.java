package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccr extends zzcco {

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f6842b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6843c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6844d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6845e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6846f;

    public zzccr(zzdkk zzdkk, JSONObject jSONObject) {
        super(zzdkk);
        this.f6842b = zzazy.e(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f6843c = zzazy.i(false, jSONObject, "allow_pub_owned_ad_view");
        this.f6844d = zzazy.i(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f6845e = zzazy.i(false, jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z = true;
        }
        this.f6846f = z;
    }

    public final boolean a() {
        return this.f6845e;
    }

    public final JSONObject b() {
        JSONObject jSONObject = this.f6842b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f6840a.w);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean c() {
        return this.f6846f;
    }

    public final boolean d() {
        return this.f6843c;
    }

    public final boolean e() {
        return this.f6844d;
    }
}
