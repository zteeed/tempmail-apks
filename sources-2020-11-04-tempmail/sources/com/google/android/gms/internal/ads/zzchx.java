package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchx implements zzela<zzcqt<zzchj>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f7259a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdvi> f7260b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzcuf> f7261c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzcva> f7262d;

    public zzchx(zzelj<zzdou> zzelj, zzelj<zzdvi> zzelj2, zzelj<zzcuf> zzelj3, zzelj<zzcva> zzelj4) {
        this.f7259a = zzelj;
        this.f7260b = zzelj2;
        this.f7261c = zzelj3;
        this.f7262d = zzelj4;
    }

    public final /* synthetic */ Object get() {
        zzcve zzcve = new zzcve(this.f7259a.get(), this.f7260b.get(), this.f7262d.get(), this.f7261c.get());
        zzelg.b(zzcve, "Cannot return null from a non-@Nullable @Provides method");
        return zzcve;
    }
}
