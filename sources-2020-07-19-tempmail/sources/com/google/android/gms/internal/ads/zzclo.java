package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclo implements zzela<Set<zzbyg<zzbva>>> {
    public static Set<zzbyg<zzbva>> a(zzcll zzcll, zzclv zzclv, Executor executor) {
        Set<zzbyg<zzbva>> j = zzcll.j(zzclv, executor);
        zzelg.b(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }

    public final /* synthetic */ Object get() {
        throw new NoSuchMethodError();
    }
}
