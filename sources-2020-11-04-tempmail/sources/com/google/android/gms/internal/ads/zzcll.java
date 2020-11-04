package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcll {
    public static Set<zzbyg<zzbtg>> a(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    public static Set<zzbyg<AppEventListener>> b(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    public static Set<zzbyg<zzbua>> c(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    private static <T> Set<zzbyg<T>> d(T t, Executor executor) {
        if (zzack.f5778a.a().booleanValue()) {
            return Collections.singleton(new zzbyg(t, executor));
        }
        return Collections.emptySet();
    }

    public static Set<zzbyg<zzbsq>> e(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    public static Set<zzbyg<zzbsl>> f(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    public static Set<zzbyg<zzbtd>> g(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    public static Set<zzbyg<zzuu>> h(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    public static Set<zzbyg<zzdpa>> i(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }

    public static Set<zzbyg<zzbva>> j(zzclv zzclv, Executor executor) {
        return d(zzclv, executor);
    }
}
