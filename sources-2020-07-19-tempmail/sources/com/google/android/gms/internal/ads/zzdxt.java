package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxt extends zzdwj<zzeac> {
    zzdxt() {
        super(zzeac.class, new g20(zzdwc.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzeaf, zzeac> g() {
        return new h20(this, zzeaf.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzeac zzeac = (zzeac) zzehl;
        zzedv.b(zzeac.G(), 0);
        if (zzeac.M().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzeac.Q(zzeer, zzefo.b());
    }
}
