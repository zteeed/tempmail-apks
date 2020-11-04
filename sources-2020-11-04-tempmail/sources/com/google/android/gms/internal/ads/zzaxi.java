package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaxi {

    /* renamed from: a  reason: collision with root package name */
    private final long f6205a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f6206b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f6207c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, zzamm> f6208d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private String f6209e;

    /* renamed from: f  reason: collision with root package name */
    private String f6210f;
    private JSONObject g;
    private boolean h;

    public zzaxi(String str, long j) {
        JSONObject optJSONObject;
        this.h = false;
        this.f6210f = str;
        this.f6205a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.h = false;
                    zzbba.i("App settings could not be fetched successfully.");
                    return;
                }
                this.h = true;
                this.f6209e = this.g.optString("app_id");
                JSONArray optJSONArray = this.g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f6207c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString) && (optJSONObject = jSONObject2.optJSONObject("mediation_config")) != null) {
                                    this.f6208d.put(optString2, new zzamm(optJSONObject));
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f6206b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e2) {
                zzbba.d("Exception occurred while processing app setting json", e2);
                zzq.zzla().e(e2, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long a() {
        return this.f6205a;
    }

    public final boolean b() {
        return this.h;
    }

    public final String c() {
        return this.f6210f;
    }

    public final String d() {
        return this.f6209e;
    }

    public final Map<String, zzamm> e() {
        return this.f6208d;
    }

    public final JSONObject f() {
        return this.g;
    }
}
