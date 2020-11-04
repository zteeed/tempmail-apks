package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdwo {

    /* renamed from: a  reason: collision with root package name */
    private zzebn f8610a;

    private zzdwo(zzebn zzebn) {
        this.f8610a = zzebn;
    }

    static final zzdwo a(zzebn zzebn) throws GeneralSecurityException {
        if (zzebn != null && zzebn.I() > 0) {
            return new zzdwo(zzebn);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: package-private */
    public final zzebn b() {
        return this.f8610a;
    }

    public final String toString() {
        return w10.a(this.f8610a).toString();
    }
}
