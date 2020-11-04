package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class mh implements zzahc {

    /* renamed from: a  reason: collision with root package name */
    private final zzcdo f4400a;

    mh(zzcdo zzcdo) {
        this.f4400a = zzcdo;
    }

    public final void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        zzbfn.q().b(new nh(this.f4400a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzbfn.loadData(str, "text/html", "UTF-8");
        } else {
            zzbfn.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
