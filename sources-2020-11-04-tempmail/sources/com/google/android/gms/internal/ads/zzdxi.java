package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxi extends zzdwj<zzdzm> {
    zzdxi() {
        super(zzdzm.class, new b20(zzedp.class));
    }

    /* access modifiers changed from: private */
    public static void k(zzdzq zzdzq) throws GeneralSecurityException {
        if (zzdzq.G() < 12 || zzdzq.G() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final zzebf.zza d() {
        return zzebf.zza.SYMMETRIC;
    }

    public final zzdwm<zzdzp, zzdzm> g() {
        return new a20(this, zzdzp.class);
    }

    public final /* synthetic */ void h(zzehl zzehl) throws GeneralSecurityException {
        zzdzm zzdzm = (zzdzm) zzehl;
        zzedv.b(zzdzm.G(), 0);
        zzedv.a(zzdzm.N().size());
        k(zzdzm.P());
    }

    public final /* synthetic */ zzehl i(zzeer zzeer) throws zzegl {
        return zzdzm.U(zzeer, zzefo.b());
    }
}
