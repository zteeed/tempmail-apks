package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbil implements zzela<zzcqu<zzdlm, zzcsc>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzcix> f6455a;

    public zzbil(zzbie zzbie, zzelj<zzcix> zzelj) {
        this.f6455a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzcul zzcul = new zzcul(this.f6455a.get());
        zzelg.b(zzcul, "Cannot return null from a non-@Nullable @Provides method");
        return zzcul;
    }
}
