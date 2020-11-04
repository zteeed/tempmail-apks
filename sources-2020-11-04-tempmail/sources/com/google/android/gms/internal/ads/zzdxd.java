package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzdxd implements zzdwt<zzdwc> {

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static class a implements zzdwc {

        /* renamed from: a  reason: collision with root package name */
        private final zzdwr<zzdwc> f8626a;

        private a(zzdwr<zzdwc> zzdwr) {
            this.f8626a = zzdwr;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzecp.c(this.f8626a.e().d(), this.f8626a.e().a().a(bArr, bArr2));
        }
    }

    static {
        Logger.getLogger(zzdxd.class.getName());
    }

    zzdxd() {
    }

    public final Class<zzdwc> a() {
        return zzdwc.class;
    }

    public final /* synthetic */ Object b(zzdwr zzdwr) throws GeneralSecurityException {
        return new a(zzdwr);
    }
}
