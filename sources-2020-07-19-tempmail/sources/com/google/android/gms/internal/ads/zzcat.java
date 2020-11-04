package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcat implements zzela<zzcaq> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbtc> f6758a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdkk> f6759b;

    private zzcat(zzelj<zzbtc> zzelj, zzelj<zzdkk> zzelj2) {
        this.f6758a = zzelj;
        this.f6759b = zzelj2;
    }

    public static zzcat a(zzelj<zzbtc> zzelj, zzelj<zzdkk> zzelj2) {
        return new zzcat(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzcaq(this.f6758a.get(), this.f6759b.get());
    }
}
