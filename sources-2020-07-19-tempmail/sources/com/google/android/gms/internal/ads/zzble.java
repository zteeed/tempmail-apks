package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzble implements zzbld {

    /* renamed from: a  reason: collision with root package name */
    private zzaxx f6312a;

    public zzble(zzaxx zzaxx) {
        this.f6312a = zzaxx;
    }

    public final void a(Map<String, String> map) {
        this.f6312a.u(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
