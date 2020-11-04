package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzamn {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f5791a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5792b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5793c;

    public zzamn(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f5791a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", (String) null);
        zzq.zzlo();
        zzamp.a(jSONObject, "clickurl");
        zzq.zzlo();
        zzamp.a(jSONObject, "imp_urls");
        zzq.zzlo();
        zzamp.a(jSONObject, "downloaded_imp_urls");
        zzq.zzlo();
        zzamp.a(jSONObject, "fill_urls");
        zzq.zzlo();
        zzamp.a(jSONObject, "video_start_urls");
        zzq.zzlo();
        zzamp.a(jSONObject, "video_complete_urls");
        zzq.zzlo();
        zzamp.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzq.zzlo();
            zzamp.a(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f5792b = optJSONObject2 != null ? optJSONObject2.toString() : null;
        if (optJSONObject2 != null) {
            optJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", (String) null);
        jSONObject.optString("ad_base_url", (String) null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        zzq.zzlo();
        zzamp.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.f5793c = jSONObject.optString("response_type", (String) null);
        jSONObject.optLong("ad_network_timeout_millis", -1);
    }
}
