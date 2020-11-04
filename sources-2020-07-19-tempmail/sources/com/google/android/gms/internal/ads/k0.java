package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class k0 implements zzahc<zzbfn> {
    k0() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        if (map.keySet().contains("start")) {
            zzbfn.i0(true);
        }
        if (map.keySet().contains("stop")) {
            zzbfn.i0(false);
        }
    }
}
