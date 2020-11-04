package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzdxd implements zzdwt<zzdwc> {

    /* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
    static class a implements zzdwc {

        /* renamed from: a  reason: collision with root package name */
        private final zzdwr<zzdwc> f8443a;

        private a(zzdwr<zzdwc> zzdwr) {
            this.f8443a = zzdwr;
        }

        public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzecp.c(this.f8443a.e().d(), this.f8443a.e().a().a(bArr, bArr2));
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
