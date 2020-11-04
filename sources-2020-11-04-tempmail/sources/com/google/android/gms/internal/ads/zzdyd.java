package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdyd extends zzdwj<zzece> {
    zzdyd() {
        super(zzece.class, new m20(zzdwc.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzecf, zzece> g() {
        return new n20(this, zzecf.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzece zzece = (zzece) zzehl;
        zzedv.b(zzece.G(), 0);
        if (zzece.M().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzece.R(zzeer, zzefo.b());
    }
}
