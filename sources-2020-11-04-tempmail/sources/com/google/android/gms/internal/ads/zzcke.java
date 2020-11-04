package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcke implements zzela<Set<zzbyg<zzdpa>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<String> f7320a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7321b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<Executor> f7322c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<Map<zzdor, zzckj>> f7323d;

    public zzcke(zzelj<String> zzelj, zzelj<Context> zzelj2, zzelj<Executor> zzelj3, zzelj<Map<zzdor, zzckj>> zzelj4) {
        this.f7320a = zzelj;
        this.f7321b = zzelj2;
        this.f7322c = zzelj3;
        this.f7323d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        Set set;
        String str = this.f7320a.get();
        Context context = this.f7321b.get();
        Executor executor = this.f7322c.get();
        Map map = this.f7323d.get();
        if (((Boolean) zzwg.e().c(zzaav.i2)).booleanValue()) {
            zztm zztm = new zztm(new zztr(context));
            zztm.b(new lk(str));
            set = Collections.singleton(new zzbyg(new zzckh(zztm, map), executor));
        } else {
            set = Collections.emptySet();
        }
        zzelg.b(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
