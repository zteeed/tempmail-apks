package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdkm {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f8320a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8321b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8322c;

    /* renamed from: d  reason: collision with root package name */
    public final String f8323d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8324e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8325f;

    zzdkm(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = "";
        String str2 = str;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = zzazy.b(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f8320a = emptyList;
        this.f8322c = i;
        this.f8321b = str;
        this.f8323d = str2;
        this.f8324e = i2;
        this.f8325f = j;
    }
}
