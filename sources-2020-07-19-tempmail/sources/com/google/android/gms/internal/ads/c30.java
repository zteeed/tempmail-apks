package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
class c30 implements zzdwt<zzdwp> {

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static class a implements zzdwp {

        /* renamed from: a  reason: collision with root package name */
        private final zzdwr<zzdwp> f3514a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f3515b;

        private a(zzdwr<zzdwp> zzdwr) {
            this.f3515b = new byte[]{0};
            this.f3514a = zzdwr;
        }

        public final byte[] a(byte[] bArr) throws GeneralSecurityException {
            if (this.f3514a.e().c().equals(zzebz.LEGACY)) {
                return zzecp.c(this.f3514a.e().d(), this.f3514a.e().a().a(zzecp.c(bArr, this.f3515b)));
            }
            return zzecp.c(this.f3514a.e().d(), this.f3514a.e().a().a(bArr));
        }
    }

    static {
        Logger.getLogger(c30.class.getName());
    }

    c30() {
    }

    public final Class<zzdwp> a() {
        return zzdwp.class;
    }

    public final /* synthetic */ Object b(zzdwr zzdwr) throws GeneralSecurityException {
        return new a(zzdwr);
    }
}
