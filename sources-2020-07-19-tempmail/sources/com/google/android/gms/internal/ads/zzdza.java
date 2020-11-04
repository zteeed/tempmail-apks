package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdza {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    private static final zzeca f8451a = zzeca.H();

    static {
        new zzdyw().a();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzdwy.k(new zzdyw(), true);
        zzdwy.k(new zzdyr(), true);
        zzdwy.l(new c30());
    }
}
