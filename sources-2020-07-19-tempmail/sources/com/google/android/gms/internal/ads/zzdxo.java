package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxo extends zzdwj<zzdzy> {
    zzdxo() {
        super(zzdzy.class, new f20(zzdwc.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzeab, zzdzy> g() {
        return new e20(this, zzeab.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzdzy zzdzy = (zzdzy) zzehl;
        zzedv.b(zzdzy.G(), 0);
        zzedv.a(zzdzy.M().size());
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzdzy.Q(zzeer, zzefo.b());
    }
}
