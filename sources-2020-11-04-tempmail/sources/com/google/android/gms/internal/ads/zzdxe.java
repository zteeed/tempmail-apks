package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdxe {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8627a = new zzdxh().a();

    /* renamed from: b  reason: collision with root package name */
    public static final String f8628b = new zzdxo().a();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private static final zzeca f8629c = zzeca.H();

    static {
        new zzdxn().a();
        new zzdxu().a();
        new zzdxy().a();
        new zzdxt().a();
        new zzdyd().a();
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzdza.a();
        zzdwy.k(new zzdxh(), true);
        zzdwy.k(new zzdxn(), true);
        zzdwy.k(new zzdxo(), true);
        zzdwy.k(new zzdxt(), true);
        zzdwy.k(new zzdxu(), true);
        zzdwy.k(new zzdxy(), true);
        zzdwy.k(new zzdyd(), true);
        zzdwy.l(new zzdxd());
    }
}
