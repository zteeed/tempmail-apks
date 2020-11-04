package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdmd implements zzela<zzdlz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdlx> f8385a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<String> f8386b;

    private zzdmd(zzdmb zzdmb, zzelj<zzdlx> zzelj, zzelj<String> zzelj2) {
        this.f8385a = zzelj;
        this.f8386b = zzelj2;
    }

    public static zzdmd a(zzdmb zzdmb, zzelj<zzdlx> zzelj, zzelj<String> zzelj2) {
        return new zzdmd(zzdmb, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzdlz b2 = this.f8385a.get().b(this.f8386b.get());
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
