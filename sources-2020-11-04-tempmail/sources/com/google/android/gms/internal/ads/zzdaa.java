package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdaa implements zzdec<zzddz<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7947a;

    /* renamed from: b  reason: collision with root package name */
    private final zzaxh f7948b;

    zzdaa(Executor executor, zzaxh zzaxh) {
        this.f7947a = executor;
        this.f7948b = zzaxh;
    }

    public final zzdvf<zzddz<Bundle>> b() {
        if (((Boolean) zzwg.e().c(zzaav.d1)).booleanValue()) {
            return zzdux.g(null);
        }
        return zzdux.i(this.f7948b.s(), or.f4763a, this.f7947a);
    }
}
