package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyr implements zzela<zzbyo> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdkk> f6709a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdpd> f6710b;

    private zzbyr(zzelj<zzdkk> zzelj, zzelj<zzdpd> zzelj2) {
        this.f6709a = zzelj;
        this.f6710b = zzelj2;
    }

    public static zzbyr a(zzelj<zzdkk> zzelj, zzelj<zzdpd> zzelj2) {
        return new zzbyr(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzbyo(this.f6709a.get(), this.f6710b.get());
    }
}
