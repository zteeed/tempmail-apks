package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i0 implements zzahc<zzbfn> {
    i0() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbfn.zzkd();
        } else if ("resume".equals(str)) {
            zzbfn.zzke();
        }
    }
}
