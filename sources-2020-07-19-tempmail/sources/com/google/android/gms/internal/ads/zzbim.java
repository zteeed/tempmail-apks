package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbim implements zzela<zzcqu<zzdlm, zzcsd>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcix> f6273a;

    public zzbim(zzbie zzbie, zzelj<zzcix> zzelj) {
        this.f6273a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzcsv zzcsv = new zzcsv(this.f6273a.get());
        zzelg.b(zzcsv, "Cannot return null from a non-@Nullable @Provides method");
        return zzcsv;
    }
}
