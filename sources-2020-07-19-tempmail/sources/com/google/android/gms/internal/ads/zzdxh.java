package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxh extends zzdwj<zzdzi> {
    zzdxh() {
        super(zzdzi.class, new y10(zzdwc.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzdzl, zzdzi> g() {
        return new z10(this, zzdzl.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzedv.b(((zzdzi) zzehl).G(), 0);
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzdzi.U(zzeer, zzefo.b());
    }
}
