package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzccr extends zzcco {

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f7025b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7026c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7027d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7028e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f7029f;

    public zzccr(zzdkk zzdkk, JSONObject jSONObject) {
        super(zzdkk);
        this.f7025b = zzazy.e(jSONObject, "tracking_urls_and_actions", "active_view");
        boolean z = false;
        this.f7026c = zzazy.i(false, jSONObject, "allow_pub_owned_ad_view");
        this.f7027d = zzazy.i(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f7028e = zzazy.i(false, jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z = true;
        }
        this.f7029f = z;
    }

    public final boolean a() {
        return this.f7028e;
    }

    public final JSONObject b() {
        JSONObject jSONObject = this.f7025b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f7023a.w);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean c() {
        return this.f7029f;
    }

    public final boolean d() {
        return this.f7026c;
    }

    public final boolean e() {
        return this.f7027d;
    }
}
