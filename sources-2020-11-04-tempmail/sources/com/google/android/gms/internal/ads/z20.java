package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class z20 extends zzdwl<zzdwp, zzeax> {
    z20(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object a(Object obj) throws GeneralSecurityException {
        zzeax zzeax = (zzeax) obj;
        zzeav H = zzeax.P().H();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzeax.N().c(), "HMAC");
        int G = zzeax.P().G();
        int i = a30.f3520a[H.ordinal()];
        if (i == 1) {
            return new zzeds("HMACSHA1", secretKeySpec, G);
        }
        if (i == 2) {
            return new zzeds("HMACSHA256", secretKeySpec, G);
        }
        if (i == 3) {
            return new zzeds("HMACSHA512", secretKeySpec, G);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
