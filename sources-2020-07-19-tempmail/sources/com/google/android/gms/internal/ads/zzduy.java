package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzduy<V> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8412a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdss<zzdvf<? extends V>> f8413b;

    private zzduy(boolean z, zzdss<zzdvf<? extends V>> zzdss) {
        this.f8412a = z;
        this.f8413b = zzdss;
    }

    public final <C> zzdvf<C> a(Callable<C> callable, Executor executor) {
        return new p00(this.f8413b, this.f8412a, executor, callable);
    }

    /* synthetic */ zzduy(boolean z, zzdss zzdss, u00 u00) {
        this(z, zzdss);
    }
}
