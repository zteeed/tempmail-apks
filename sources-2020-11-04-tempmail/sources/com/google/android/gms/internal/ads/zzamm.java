package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzamm {

    /* renamed from: a  reason: collision with root package name */
    public final List<zzamn> f5973a;

    public zzamm(JSONObject jSONObject) throws JSONException {
        boolean z;
        if (zzbba.a(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzaxv.m(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzamn zzamn = new zzamn(jSONArray.getJSONObject(i2));
                boolean equalsIgnoreCase = "banner".equalsIgnoreCase(zzamn.f5976c);
                arrayList.add(zzamn);
                if (i < 0) {
                    Iterator<String> it = zzamn.f5974a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f5973a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzq.zzlo();
            zzamp.a(optJSONObject, "click_urls");
            zzq.zzlo();
            zzamp.a(optJSONObject, "imp_urls");
            zzq.zzlo();
            zzamp.a(optJSONObject, "downloaded_imp_urls");
            zzq.zzlo();
            zzamp.a(optJSONObject, "nofill_urls");
            zzq.zzlo();
            zzamp.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            int i3 = (optJSONObject.optLong("refresh", -1) > 0 ? 1 : (optJSONObject.optLong("refresh", -1) == 0 ? 0 : -1));
            zzaub u = zzaub.u(optJSONObject.optJSONArray("rewards"));
            if (u != null) {
                String str = u.f6144b;
                int i4 = u.f6145c;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
