package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzc;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class f0 implements zzahc<zzbfn> {
    f0() {
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        if (zzbfn.F() != null) {
            zzbfn.F().h0();
        }
        zzc o0 = zzbfn.o0();
        if (o0 != null) {
            o0.close();
            return;
        }
        zzc s0 = zzbfn.s0();
        if (s0 != null) {
            s0.close();
        } else {
            zzbba.i("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
