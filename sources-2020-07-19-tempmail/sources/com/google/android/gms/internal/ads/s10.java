package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdwy;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class s10 implements zzdwy.b {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdwv f4855a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzdwj f4856b;

    s10(zzdwv zzdwv, zzdwj zzdwj) {
        this.f4855a = zzdwv;
        this.f4856b = zzdwj;
    }

    public final <Q> zzdwi<Q> b(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdww(this.f4855a, this.f4856b, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public final Set<Class<?>> c() {
        return this.f4855a.e();
    }

    public final zzdwi<?> d() {
        zzdwv zzdwv = this.f4855a;
        return new zzdww(zzdwv, this.f4856b, zzdwv.f());
    }

    public final Class<?> e() {
        return this.f4855a.getClass();
    }

    public final Class<?> f() {
        return this.f4856b.getClass();
    }
}
