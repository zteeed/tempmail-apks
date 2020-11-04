package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbkn implements zzela<zzdpx> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6308a;

    public zzbkn(zzelj<Context> zzelj) {
        this.f6308a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzdpx zzdpx = new zzdpx(this.f6308a.get(), zzq.zzlk().b());
        zzelg.b(zzdpx, "Cannot return null from a non-@Nullable @Provides method");
        return zzdpx;
    }
}
