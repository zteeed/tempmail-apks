package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdme implements zzela<zzaxx> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdmb f8387a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdlz> f8388b;

    private zzdme(zzdmb zzdmb, zzelj<zzdlz> zzelj) {
        this.f8387a = zzdmb;
        this.f8388b = zzelj;
    }

    public static zzaxx a(zzdmb zzdmb, zzdlz zzdlz) {
        zzaxx zzaxx = zzdlz.f8380b;
        zzelg.b(zzaxx, "Cannot return null from a non-@Nullable @Provides method");
        return zzaxx;
    }

    public static zzdme b(zzdmb zzdmb, zzelj<zzdlz> zzelj) {
        return new zzdme(zzdmb, zzelj);
    }

    public final /* synthetic */ Object get() {
        return a(this.f8387a, this.f8388b.get());
    }
}
