package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcyr implements zzela<zzdvf<zzcyv>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f7708a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzcyu> f7709b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzbrq> f7710c;

    public zzcyr(zzelj<zzdou> zzelj, zzelj<zzcyu> zzelj2, zzelj<zzbrq> zzelj3) {
        this.f7708a = zzelj;
        this.f7709b = zzelj2;
        this.f7710c = zzelj3;
    }

    public final /* synthetic */ Object get() {
        zzdod<E, O2> f2 = this.f7708a.get().b(zzdor.GENERATE_SIGNALS, this.f7710c.get().b()).b(this.f7709b.get()).a((long) ((Integer) zzwg.e().c(zzaav.y2)).intValue(), TimeUnit.SECONDS).f();
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
