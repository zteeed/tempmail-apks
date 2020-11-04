package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbrp implements zzela<zzbus> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbus> f6585a;

    private zzbrp(zzelj<zzbus> zzelj) {
        this.f6585a = zzelj;
    }

    public static zzbrp a(zzelj<zzbus> zzelj) {
        return new zzbrp(zzelj);
    }

    public final /* synthetic */ Object get() {
        zzbus zzbus = this.f6585a.get();
        zzelg.b(zzbus, "Cannot return null from a non-@Nullable @Provides method");
        return zzbus;
    }
}
