package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsc implements zzela<String> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbrx f6616a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbqk> f6617b;

    private zzbsc(zzbrx zzbrx, zzelj<zzbqk> zzelj) {
        this.f6616a = zzbrx;
        this.f6617b = zzelj;
    }

    public static String a(zzbrx zzbrx, zzbqk zzbqk) {
        String b2 = zzbqk.b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public static zzbsc b(zzbrx zzbrx, zzelj<zzbqk> zzelj) {
        return new zzbsc(zzbrx, zzelj);
    }

    public final /* synthetic */ Object get() {
        return a(this.f6616a, this.f6617b.get());
    }
}
