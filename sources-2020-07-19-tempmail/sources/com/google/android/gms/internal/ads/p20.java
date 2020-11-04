package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class p20 extends zzdwl<zzdwg, zzeap> {
    p20(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object a(Object obj) throws GeneralSecurityException {
        zzeap zzeap = (zzeap) obj;
        zzeam N = zzeap.Q().N();
        zzeat G = N.G();
        zzede b2 = v20.b(G.G());
        byte[] c2 = zzeap.P().c();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, c2), zzedc.d(b2));
        return new zzecv((ECPrivateKey) zzedf.j.a("EC").generatePrivate(eCPrivateKeySpec), G.I().c(), v20.c(G.H()), v20.a(N.I()), new w20(N.H().G()));
    }
}
