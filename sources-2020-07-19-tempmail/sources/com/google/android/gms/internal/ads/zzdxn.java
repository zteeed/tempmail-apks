package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxn extends zzdwj<zzdzt> {
    zzdxn() {
        super(zzdzt.class, new c20(zzdwc.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzdzu, zzdzt> g() {
        return new d20(this, zzdzu.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzdzt zzdzt = (zzdzt) zzehl;
        zzedv.b(zzdzt.G(), 0);
        zzedv.a(zzdzt.P().size());
        if (zzdzt.Q().G() != 12 && zzdzt.Q().G() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzdzt.T(zzeer, zzefo.b());
    }
}
