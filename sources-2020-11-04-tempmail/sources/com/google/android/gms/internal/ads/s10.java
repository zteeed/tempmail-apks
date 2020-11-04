package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdwy;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class s10 implements zzdwy.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdwv f5038a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdwj f5039b;

    s10(zzdwv zzdwv, zzdwj zzdwj) {
        this.f5038a = zzdwv;
        this.f5039b = zzdwj;
    }

    public final <Q> zzdwi<Q> b(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdww(this.f5038a, this.f5039b, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public final Set<Class<?>> c() {
        return this.f5038a.e();
    }

    public final zzdwi<?> d() {
        zzdwv zzdwv = this.f5038a;
        return new zzdww(zzdwv, this.f5039b, zzdwv.f());
    }

    public final Class<?> e() {
        return this.f5038a.getClass();
    }

    public final Class<?> f() {
        return this.f5039b.getClass();
    }
}
