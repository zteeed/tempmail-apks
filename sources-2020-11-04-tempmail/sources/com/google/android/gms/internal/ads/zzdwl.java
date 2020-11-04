package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdwl<PrimitiveT, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<PrimitiveT> f8608a;

    public zzdwl(Class<PrimitiveT> cls) {
        this.f8608a = cls;
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> b() {
        return this.f8608a;
    }
}
