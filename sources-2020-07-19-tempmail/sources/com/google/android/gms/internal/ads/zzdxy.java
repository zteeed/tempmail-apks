package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxy extends zzdwj<zzebv> {
    zzdxy() {
        super(zzebv.class, new l20(zzdwc.class));
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.REMOTE;
    }

    public final zzdwm<zzeby, zzebv> g() {
        return new k20(this, zzeby.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzedv.b(((zzebv) zzehl).G(), 0);
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzebv.R(zzeer, zzefo.b());
    }
}
