package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzciz {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, JSONObject>> f7294a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7295b;

    public zzciz(Executor executor) {
        this.f7295b = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized void e() {
        Map map;
        zzaxi C = zzq.zzla().r().C();
        if (C != null) {
            JSONObject f2 = C.f();
            if (f2 != null) {
                f2.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f2.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f7294a.containsKey(optString2)) {
                                    map = this.f7294a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f7294a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        zzq.zzla().r().y(new xj(this));
        this.f7295b.execute(new zj(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        this.f7295b.execute(new yj(this));
    }
}
