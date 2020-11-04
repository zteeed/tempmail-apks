package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r20 extends zzdwj<zzeaq> {
    public r20() {
        super(zzeaq.class, new q20(zzdwf.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzeaq zzeaq = (zzeaq) zzehl;
        zzedv.b(zzeaq.G(), 0);
        v20.d(zzeaq.N());
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzeaq.W(zzeer, zzefo.b());
    }
}
