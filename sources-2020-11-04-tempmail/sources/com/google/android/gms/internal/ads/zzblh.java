package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblh implements zzbld {

    /* renamed from: a  reason: collision with root package name */
    private final zzdki f6498a;

    public zzblh(zzdki zzdki) {
        this.f6498a = zzdki;
    }

    public final void a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f6498a.d(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
