package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbmp implements zzela<Set<zzbyg<zzbua>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbos> f6400a;

    public zzbmp(zzbmn zzbmn, zzelj<zzbos> zzelj) {
        this.f6400a = zzelj;
    }

    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new zzbyg(this.f6400a.get(), zzbbf.f6142f));
        zzelg.b(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
