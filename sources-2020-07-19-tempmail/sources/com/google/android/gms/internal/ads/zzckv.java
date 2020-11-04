package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckv {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f7171a;

    public zzckv(zzclc zzclc) {
        this.f7171a = zzclc.b();
    }

    public final void a(zzdkw zzdkw) {
        if (zzdkw.f8162b.f8156a.size() > 0) {
            int i = zzdkw.f8162b.f8156a.get(0).f8132b;
            if (i == 1) {
                this.f7171a.put("ad_format", "banner");
            } else if (i == 2) {
                this.f7171a.put("ad_format", "interstitial");
            } else if (i == 3) {
                this.f7171a.put("ad_format", "native_express");
            } else if (i == 4) {
                this.f7171a.put("ad_format", "native_advanced");
            } else if (i != 5) {
                this.f7171a.put("ad_format", "unknown");
            } else {
                this.f7171a.put("ad_format", "rewarded");
            }
        }
        if (!TextUtils.isEmpty(zzdkw.f8162b.f8157b.f8138b)) {
            this.f7171a.put("gqi", zzdkw.f8162b.f8157b.f8138b);
        }
    }

    public final void b(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f7171a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f7171a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> c() {
        return this.f7171a;
    }
}
