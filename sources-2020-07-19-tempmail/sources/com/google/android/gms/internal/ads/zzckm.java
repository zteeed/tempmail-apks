package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzckm implements zzela<zzckn> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzckv> f7158a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzclc> f7159b;

    private zzckm(zzelj<zzckv> zzelj, zzelj<zzclc> zzelj2) {
        this.f7158a = zzelj;
        this.f7159b = zzelj2;
    }

    public static zzckm a(zzelj<zzckv> zzelj, zzelj<zzclc> zzelj2) {
        return new zzckm(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        return new zzckn(this.f7158a.get(), this.f7159b.get());
    }
}
