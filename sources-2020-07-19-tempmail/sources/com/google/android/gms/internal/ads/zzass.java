package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzass {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f5921a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5922b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5923c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5924d;

    /* renamed from: e  reason: collision with root package name */
    private String f5925e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5926f;
    private final JSONObject g;
    private final String h;

    public zzass(JSONObject jSONObject) {
        List<String> list;
        this.f5925e = jSONObject.optString("url");
        this.f5922b = jSONObject.optString("base_uri");
        this.f5923c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.f5924d = optString != null && (optString.equals("1") || optString.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        if (optString2 == null) {
            list = null;
        } else {
            list = Arrays.asList(optString2.split(","));
        }
        this.f5921a = list;
        this.f5926f = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.g = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.h = jSONObject.optString("pool_key");
    }

    public final int a() {
        return this.f5926f;
    }

    public final String b() {
        return this.f5925e;
    }

    public final List<String> c() {
        return this.f5921a;
    }

    public final String d() {
        return this.f5922b;
    }

    public final String e() {
        return this.f5923c;
    }

    public final boolean f() {
        return this.f5924d;
    }

    public final JSONObject g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }
}
