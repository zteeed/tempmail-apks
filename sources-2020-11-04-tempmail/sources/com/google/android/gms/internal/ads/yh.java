package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class yh implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final zzceu f5574b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdkw f5575c;

    /* renamed from: d  reason: collision with root package name */
    private final zzdkk f5576d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f5577e;

    yh(zzceu zzceu, zzdkw zzdkw, zzdkk zzdkk, JSONObject jSONObject) {
        this.f5574b = zzceu;
        this.f5575c = zzdkw;
        this.f5576d = zzdkk;
        this.f5577e = jSONObject;
    }

    public final Object call() {
        zzdkw zzdkw = this.f5575c;
        zzdkk zzdkk = this.f5576d;
        JSONObject jSONObject = this.f5577e;
        zzcck zzcck = new zzcck();
        zzcck.S(jSONObject.optInt("template_id", -1));
        zzcck.T(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzcck.U(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzdla zzdla = zzdkw.f8344a.f8332a;
        if (zzdla.g.contains(Integer.toString(zzcck.A()))) {
            if (zzcck.A() == 3) {
                if (zzcck.e() == null) {
                    throw new zzctw(zzdls.f8363a, "No custom template id for custom template ad response.");
                } else if (!zzdla.h.contains(zzcck.e())) {
                    throw new zzctw(zzdls.f8363a, "Unexpected custom template id in the response.");
                }
            }
            zzcck.q(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzdkk.E) {
                zzq.zzkw();
                String t0 = zzaye.t0();
                StringBuilder sb = new StringBuilder(String.valueOf(t0).length() + 3 + String.valueOf(optString).length());
                sb.append(t0);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            zzcck.Z("headline", optString);
            zzcck.Z("body", jSONObject.optString("body", (String) null));
            zzcck.Z("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzcck.Z("store", jSONObject.optString("store", (String) null));
            zzcck.Z("price", jSONObject.optString("price", (String) null));
            zzcck.Z("advertiser", jSONObject.optString("advertiser", (String) null));
            return zzcck;
        }
        int i = zzdls.f8363a;
        int A = zzcck.A();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(A);
        throw new zzctw(i, sb2.toString());
    }
}
