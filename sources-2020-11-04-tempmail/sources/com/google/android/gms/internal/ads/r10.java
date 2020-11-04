package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdwy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class r10 implements zzdwy.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdwi f4954a;

    r10(zzdwi zzdwi) {
        this.f4954a = zzdwi;
    }

    public final <Q> zzdwi<Q> b(Class<Q> cls) throws GeneralSecurityException {
        if (this.f4954a.a().equals(cls)) {
            return this.f4954a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final Set<Class<?>> c() {
        return Collections.singleton(this.f4954a.a());
    }

    public final zzdwi<?> d() {
        return this.f4954a;
    }

    public final Class<?> e() {
        return this.f4954a.getClass();
    }

    public final Class<?> f() {
        return null;
    }
}
