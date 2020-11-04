package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdzt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d20 extends zzdwm<zzdzu, zzdzt> {
    d20(zzdxn zzdxn, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void b(zzehl zzehl) throws GeneralSecurityException {
        zzdzu zzdzu = (zzdzu) zzehl;
        zzedv.a(zzdzu.G());
        if (zzdzu.H().G() != 12 && zzdzu.H().G() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* synthetic */ Object c(zzehl zzehl) throws GeneralSecurityException {
        zzdzu zzdzu = (zzdzu) zzehl;
        zzdzt.zza R = zzdzt.R();
        R.y(zzeer.U(zzedu.c(zzdzu.G())));
        R.w(zzdzu.H());
        R.x(0);
        return (zzdzt) ((zzegb) R.O());
    }

    public final /* synthetic */ zzehl d(zzeer zzeer) throws zzegl {
        return zzdzu.L(zzeer, zzefo.b());
    }
}
