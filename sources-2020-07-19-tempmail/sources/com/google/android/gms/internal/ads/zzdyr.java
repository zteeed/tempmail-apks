package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdyr extends zzdwj<zzdzd> {
    zzdyr() {
        super(zzdzd.class, new y20(zzdwp.class));
    }

    /* access modifiers changed from: private */
    public static void j(zzdzh zzdzh) throws GeneralSecurityException {
        if (zzdzh.G() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzdzh.G() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void l(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzdze, zzdzd> g() {
        return new x20(this, zzdze.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzdzd zzdzd = (zzdzd) zzehl;
        zzedv.b(zzdzd.G(), 0);
        l(zzdzd.N().size());
        j(zzdzd.P());
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzdzd.S(zzeer, zzefo.b());
    }
}
