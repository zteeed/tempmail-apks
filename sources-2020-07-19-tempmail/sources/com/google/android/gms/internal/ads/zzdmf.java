package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdmf implements zzela<zzaxs> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdlz> f8206a;

    private zzdmf(zzdmb zzdmb, zzelj<zzdlz> zzelj) {
        this.f8206a = zzelj;
    }

    public static zzdmf a(zzdmb zzdmb, zzelj<zzdlz> zzelj) {
        return new zzdmf(zzdmb, zzelj);
    }

    public final /* synthetic */ Object get() {
        zzaxs zzaxs = this.f8206a.get().f8198c;
        zzelg.b(zzaxs, "Cannot return null from a non-@Nullable @Provides method");
        return zzaxs;
    }
}
