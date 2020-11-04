package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdcb implements zzela<zzdbz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdvi> f8032a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdki> f8033b;

    private zzdcb(zzelj<zzdvi> zzelj, zzelj<zzdki> zzelj2) {
        this.f8032a = zzelj;
        this.f8033b = zzelj2;
    }

    public static zzdcb a(zzelj<zzdvi> zzelj, zzelj<zzdki> zzelj2) {
        return new zzdcb(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzdbz(this.f8032a.get(), this.f8033b.get());
    }
}
