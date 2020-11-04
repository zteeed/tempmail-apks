package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblc implements zzbld {

    /* renamed from: a  reason: collision with root package name */
    private zzaxx f6494a;

    public zzblc(zzaxx zzaxx) {
        this.f6494a = zzaxx;
    }

    public final void a(Map<String, String> map) {
        this.f6494a.E(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
