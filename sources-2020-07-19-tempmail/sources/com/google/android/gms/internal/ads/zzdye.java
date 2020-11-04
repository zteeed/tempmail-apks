package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdye extends zzdwv<zzeap, zzeaq> {
    zzdye() {
        super(zzeap.class, zzeaq.class, new p20(zzdwg.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.ASYMMETRIC_PRIVATE;
    }

    public final zzdwm<zzeal, zzeap> g() {
        return new o20(this, zzeal.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzeap zzeap = (zzeap) zzehl;
        if (!zzeap.P().isEmpty()) {
            zzedv.b(zzeap.G(), 0);
            v20.d(zzeap.Q().N());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzeap.T(zzeer, zzefo.b());
    }
}
