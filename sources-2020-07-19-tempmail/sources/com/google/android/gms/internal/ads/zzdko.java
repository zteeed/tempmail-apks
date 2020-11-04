package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdko implements zzazz {

    /* renamed from: a  reason: collision with root package name */
    public final String f8144a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8145b = this.f8147d.optString("ad_base_url", (String) null);

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f8146c = this.f8147d.optJSONObject("ad_json");

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f8147d;

    zzdko(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject m = zzazy.m(jsonReader);
        this.f8147d = m;
        this.f8144a = m.optString("ad_html", (String) null);
    }

    public final void a(JsonWriter jsonWriter) throws IOException {
        zzazy.h(jsonWriter, this.f8147d);
    }
}
