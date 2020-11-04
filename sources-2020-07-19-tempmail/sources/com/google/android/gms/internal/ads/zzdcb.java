package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcb implements zzela<zzdbz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f7849a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdki> f7850b;

    private zzdcb(zzelj<zzdvi> zzelj, zzelj<zzdki> zzelj2) {
        this.f7849a = zzelj;
        this.f7850b = zzelj2;
    }

    public static zzdcb a(zzelj<zzdvi> zzelj, zzelj<zzdki> zzelj2) {
        return new zzdcb(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdbz(this.f7849a.get(), this.f7850b.get());
    }
}
