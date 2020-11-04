package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.zzq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyv {

    /* renamed from: a  reason: collision with root package name */
    public final String f7897a;

    /* renamed from: b  reason: collision with root package name */
    public String f7898b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f7899c = new Bundle();

    public zzcyv(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        Map<String, String> hashMap = new HashMap<>();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c2 = 1;
                }
            } else if (nextName.equals("params")) {
                c2 = 0;
            }
            if (c2 == 0) {
                str = jsonReader.nextString();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                hashMap = zzazy.j(jsonReader);
            }
        }
        this.f7897a = str;
        jsonReader.endObject();
        for (Map.Entry next : hashMap.entrySet()) {
            if (!(next.getKey() == null || next.getValue() == null)) {
                this.f7899c.putString((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzcyv a(Bundle bundle) {
        try {
            this.f7898b = zzq.zzkw().R(bundle).toString();
        } catch (JSONException unused) {
            this.f7898b = "{}";
        }
        return this;
    }
}
