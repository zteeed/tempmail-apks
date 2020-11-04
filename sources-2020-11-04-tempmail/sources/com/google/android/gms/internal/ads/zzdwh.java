package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import com.google.android.gms.internal.ads.zzehl;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzdwh<PrimitiveT, KeyProtoT extends zzehl> implements zzdwi<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdwj<KeyProtoT> f8603a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f8604b;

    public zzdwh(zzdwj<KeyProtoT> zzdwj, Class<PrimitiveT> cls) {
        if (zzdwj.e().contains(cls) || Void.class.equals(cls)) {
            this.f8603a = zzdwj;
            this.f8604b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzdwj.toString(), cls.getName()}));
    }

    private final q10<?, KeyProtoT> g() {
        return new q10<>(this.f8603a.g());
    }

    private final PrimitiveT h(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (!Void.class.equals(this.f8604b)) {
            this.f8603a.h(keyprotot);
            return this.f8603a.b(keyprotot, this.f8604b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final Class<PrimitiveT> a() {
        return this.f8604b;
    }

    public final String b() {
        return this.f8603a.a();
    }

    public final zzehl c(zzeer zzeer) throws GeneralSecurityException {
        try {
            return g().a(zzeer);
        } catch (zzegl e2) {
            String valueOf = String.valueOf(this.f8603a.g().a().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e2);
        }
    }

    public final zzebf d(zzeer zzeer) throws GeneralSecurityException {
        try {
            zzehl a2 = g().a(zzeer);
            zzebf.zzb R = zzebf.R();
            R.y(this.f8603a.a());
            R.w(a2.e());
            R.x(this.f8603a.d());
            return (zzebf) ((zzegb) R.O());
        } catch (zzegl e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final PrimitiveT e(zzeer zzeer) throws GeneralSecurityException {
        try {
            return h(this.f8603a.i(zzeer));
        } catch (zzegl e2) {
            String valueOf = String.valueOf(this.f8603a.c().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e2);
        }
    }

    public final PrimitiveT f(zzehl zzehl) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.f8603a.c().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.f8603a.c().isInstance(zzehl)) {
            return h(zzehl);
        }
        throw new GeneralSecurityException(concat);
    }
}