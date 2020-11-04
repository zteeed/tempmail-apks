package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzass {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f6104a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6105b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6106c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f6107d;

    /* renamed from: e  reason: collision with root package name */
    private String f6108e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6109f;
    private final JSONObject g;
    private final String h;

    public zzass(JSONObject jSONObject) {
        List<String> list;
        this.f6108e = jSONObject.optString("url");
        this.f6105b = jSONObject.optString("base_uri");
        this.f6106c = jSONObject.optString("post_parameters");
        String optString = jSONObject.optString("drt_include");
        int i = 1;
        this.f6107d = optString != null && (optString.equals("1") || optString.equals("true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString2 = jSONObject.optString("errors");
        if (optString2 == null) {
            list = null;
        } else {
            list = Arrays.asList(optString2.split(","));
        }
        this.f6104a = list;
        this.f6109f = jSONObject.optInt("valid", 0) == 1 ? -2 : i;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.g = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.h = jSONObject.optString("pool_key");
    }

    public final int a() {
        return this.f6109f;
    }

    public final String b() {
        return this.f6108e;
    }

    public final List<String> c() {
        return this.f6104a;
    }

    public final String d() {
        return this.f6105b;
    }

    public final String e() {
        return this.f6106c;
    }

    public final boolean f() {
        return this.f6107d;
    }

    public final JSONObject g() {
        return this.g;
    }

    public final String h() {
        return this.h;
    }
}
