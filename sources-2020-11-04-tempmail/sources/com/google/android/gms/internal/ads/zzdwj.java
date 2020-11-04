package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebf;
import com.google.android.gms.internal.ads.zzehl;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzdwj<KeyProtoT extends zzehl> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyProtoT> f8605a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, zzdwl<?, KeyProtoT>> f8606b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f8607c;

    @SafeVarargs
    protected zzdwj(Class<KeyProtoT> cls, zzdwl<?, KeyProtoT>... zzdwlArr) {
        this.f8605a = cls;
        HashMap hashMap = new HashMap();
        int length = zzdwlArr.length;
        int i = 0;
        while (i < length) {
            zzdwl<?, KeyProtoT> zzdwl = zzdwlArr[i];
            if (hashMap.containsKey(zzdwl.b())) {
                String valueOf = String.valueOf(zzdwl.b().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(zzdwl.b(), zzdwl);
                i++;
            }
        }
        if (zzdwlArr.length > 0) {
            this.f8607c = zzdwlArr[0].b();
        } else {
            this.f8607c = Void.class;
        }
        this.f8606b = Collections.unmodifiableMap(hashMap);
    }

    public abstract String a();

    public final <P> P b(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzdwl zzdwl = this.f8606b.get(cls);
        if (zzdwl != null) {
            return zzdwl.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final Class<KeyProtoT> c() {
        return this.f8605a;
    }

    public abstract zzebf.zza d();

    public final Set<Class<?>> e() {
        return this.f8606b.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Class<?> f() {
        return this.f8607c;
    }

    public zzdwm<?, KeyProtoT> g() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract void h(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT i(zzeer zzeer) throws zzegl;
}
