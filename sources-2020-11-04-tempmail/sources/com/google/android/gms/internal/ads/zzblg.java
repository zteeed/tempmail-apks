package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzblg implements zzbld {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6497a;

    public zzblg(Context context) {
        this.f6497a = context;
    }

    public final void a(Map<String, String> map) {
        CookieManager n;
        String str = map.get("cookie");
        if (!TextUtils.isEmpty(str) && (n = zzq.zzky().n(this.f6497a)) != null) {
            n.setCookie((String) zzwg.e().c(zzaav.m0), str);
        }
    }
}
