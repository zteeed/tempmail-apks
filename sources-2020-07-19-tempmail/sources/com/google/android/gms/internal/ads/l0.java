package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class l0 implements zzahc<zzbfn> {
    l0() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        if (map.keySet().contains("start")) {
            zzbfn.q().n();
        } else if (map.keySet().contains("stop")) {
            zzbfn.q().e();
        } else if (map.keySet().contains("cancel")) {
            zzbfn.q().g();
        }
    }
}
