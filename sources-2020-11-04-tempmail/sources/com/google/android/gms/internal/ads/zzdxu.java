package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxu extends zzdwj<zzebr> {
    zzdxu() {
        super(zzebr.class, new j20(zzdwc.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.REMOTE;
    }

    public final zzdwm<zzebu, zzebr> g() {
        return new i20(this, zzebu.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzedv.b(((zzebr) zzehl).G(), 0);
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzebr.R(zzeer, zzefo.b());
    }
}
