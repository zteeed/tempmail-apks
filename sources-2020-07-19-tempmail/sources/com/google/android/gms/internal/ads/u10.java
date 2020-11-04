package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdwy;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class u10 implements zzdwy.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdwj f5025a;

    u10(zzdwj zzdwj) {
        this.f5025a = zzdwj;
    }

    public final <Q> zzdwi<Q> b(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdwh(this.f5025a, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public final Set<Class<?>> c() {
        return this.f5025a.e();
    }

    public final zzdwi<?> d() {
        zzdwj zzdwj = this.f5025a;
        return new zzdwh(zzdwj, zzdwj.f());
    }

    public final Class<?> e() {
        return this.f5025a.getClass();
    }

    public final Class<?> f() {
        return null;
    }
}
