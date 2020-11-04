package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcbs implements zzela<zzcco> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzccr> f6990a;

    public zzcbs(zzcbr zzcbr, zzelj<zzccr> zzelj) {
        this.f6990a = zzelj;
    }

    public final /* synthetic */ Object get() {
        zzccr zzccr = this.f6990a.get();
        zzelg.b(zzccr, "Cannot return null from a non-@Nullable @Provides method");
        return zzccr;
    }
}
