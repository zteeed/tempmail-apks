package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeap;
import com.google.android.gms.internal.ads.zzeaq;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class o20 extends zzdwm<zzeal, zzeap> {
    o20(zzdye zzdye, Class cls) {
        super(cls);
    }

    public final /* synthetic */ void b(zzehl zzehl) throws GeneralSecurityException {
        v20.d(((zzeal) zzehl).G());
    }

    public final /* synthetic */ Object c(zzehl zzehl) throws GeneralSecurityException {
        zzeal zzeal = (zzeal) zzehl;
        KeyPair b2 = zzedc.b(zzedc.d(v20.b(zzeal.G().G().G())));
        ECPoint w = ((ECPublicKey) b2.getPublic()).getW();
        zzeaq.zza T = zzeaq.T();
        T.z(0);
        T.y(zzeal.G());
        T.w(zzeer.U(w.getAffineX().toByteArray()));
        T.x(zzeer.U(w.getAffineY().toByteArray()));
        zzeap.zza R = zzeap.R();
        R.y(0);
        R.x((zzeaq) ((zzegb) T.O()));
        R.w(zzeer.U(((ECPrivateKey) b2.getPrivate()).getS().toByteArray()));
        return (zzeap) ((zzegb) R.O());
    }

    public final /* synthetic */ zzehl d(zzeer zzeer) throws zzegl {
        return zzeal.I(zzeer, zzefo.b());
    }
}
