package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.common.util.IOUtils;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdku {

    /* renamed from: a  reason: collision with root package name */
    public final List<zzdkk> f8156a;

    /* renamed from: b  reason: collision with root package name */
    public final zzdkm f8157b;

    /* renamed from: c  reason: collision with root package name */
    public final List<zzdkt> f8158c;

    private zzdku(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List<zzdkk> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzdkm zzdkm = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzdkk(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzdkm = new zzdkm(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    Map<String, String> map = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (AnalyticsConnectorReceiver.EVENT_NAME_KEY.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            map = zzazy.j(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzdkt(str, map));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f8158c = arrayList;
        this.f8156a = emptyList;
        this.f8157b = zzdkm == null ? new zzdkm(new JsonReader(new StringReader("{}"))) : zzdkm;
    }

    public static zzdku a(Reader reader) throws zzdkl {
        try {
            zzdku zzdku = new zzdku(new JsonReader(reader));
            IOUtils.a(reader);
            return zzdku;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e2) {
            throw new zzdkl("unable to parse ServerResponse", e2);
        } catch (Throwable th) {
            IOUtils.a(reader);
            throw th;
        }
    }
}
