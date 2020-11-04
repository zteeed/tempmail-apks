package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class xs implements Callable {

    /* renamed from: b  reason: collision with root package name */
    private final List f5328b;

    xs(List list) {
        this.f5328b = list;
    }

    public final Object call() {
        List<zzdvf> list = this.f5328b;
        JSONArray jSONArray = new JSONArray();
        for (zzdvf zzdvf : list) {
            if (((JSONObject) zzdvf.get()) != null) {
                jSONArray.put(zzdvf.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new zzddb(jSONArray.toString());
    }
}
