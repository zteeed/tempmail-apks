package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzceu {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f6939a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcey f6940b;

    /* renamed from: c  reason: collision with root package name */
    private final zzcfi f6941c;

    public zzceu(zzdvi zzdvi, zzcey zzcey, zzcfi zzcfi) {
        this.f6939a = zzdvi;
        this.f6940b = zzcey;
        this.f6941c = zzcfi;
    }

    public final zzdvf<zzcck> a(zzdkw zzdkw, zzdkk zzdkk, JSONObject jSONObject) {
        zzdvf j;
        JSONObject jSONObject2 = jSONObject;
        zzdkw zzdkw2 = zzdkw;
        zzdvf f2 = this.f6939a.f(new yh(this, zzdkw, zzdkk, jSONObject2));
        zzdvf<List<zzadf>> h = this.f6940b.h(jSONObject2, "images");
        zzdvf<zzadf> g = this.f6940b.g(jSONObject2, "secondary_image");
        zzdvf<zzadf> g2 = this.f6940b.g(jSONObject2, "app_icon");
        zzdvf<zzada> i = this.f6940b.i(jSONObject2, "attribution");
        zzdvf<zzbfn> n = this.f6940b.n(jSONObject2);
        zzcey zzcey = this.f6940b;
        if (!jSONObject2.optBoolean("enable_omid")) {
            j = zzdux.g(null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                j = zzdux.g(null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    j = zzdux.g(null);
                } else {
                    j = zzdux.j(zzdux.g(null), new bi(zzcey, optString), zzbbf.f6141e);
                }
            }
        }
        zzdvf zzdvf = j;
        zzdvf<List<zzcfn>> a2 = this.f6941c.a(jSONObject2, "custom_assets");
        return zzdux.b(f2, h, g, g2, i, n, zzdvf, a2).a(new xh(this, f2, h, g2, g, i, jSONObject, n, zzdvf, a2), this.f6939a);
    }
}
