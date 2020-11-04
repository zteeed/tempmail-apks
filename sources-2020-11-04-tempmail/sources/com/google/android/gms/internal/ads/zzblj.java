package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblj implements zzbld {

    /* renamed from: a  reason: collision with root package name */
    private final zzaxx f6500a;

    public zzblj(zzaxx zzaxx) {
        this.f6500a = zzaxx;
    }

    public final void a(Map<String, String> map) {
        String str = map.get("value");
        if ("auto_collect_location".equals(map.get("key"))) {
            this.f6500a.x(Boolean.parseBoolean(str));
        }
    }
}
