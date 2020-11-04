package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcfi {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f6969a;

    /* renamed from: b  reason: collision with root package name */
    private final zzcey f6970b;

    public zzcfi(Executor executor, zzcey zzcey) {
        this.f6969a = executor;
        this.f6970b = zzcey;
    }

    public final zzdvf<List<zzcfn>> a(JSONObject jSONObject, String str) {
        zzdvf<O> zzdvf;
        String optString;
        char c2;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzdux.g(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString(AnalyticsConnectorReceiver.EVENT_NAME_KEY)) == null)) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    c2 = 1;
                } else {
                    c2 = "image".equals(optString2) ? (char) 2 : 0;
                }
                if (c2 == 1) {
                    zzdvf = zzdux.g(new zzcfn(optString, optJSONObject.optString("string_value")));
                } else if (c2 == 2) {
                    zzdvf = zzdux.i(this.f6970b.g(optJSONObject, "image_value"), new hi(optString), this.f6969a);
                }
                arrayList.add(zzdvf);
            }
            zzdvf = zzdux.g(null);
            arrayList.add(zzdvf);
        }
        return zzdux.i(zzdux.m(arrayList), ii.f4060a, this.f6969a);
    }
}
