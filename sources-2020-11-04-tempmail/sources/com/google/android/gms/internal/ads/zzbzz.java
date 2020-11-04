package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzz implements zzela<Set<zzbyg<zzbyd>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcas> f6916a;

    private zzbzz(zzelj<zzcas> zzelj) {
        this.f6916a = zzelj;
    }

    public static zzbzz a(zzelj<zzcas> zzelj) {
        return new zzbzz(zzelj);
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(zzbyg.a(this.f6916a.get(), zzbbf.f6325f));
        zzelg.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
