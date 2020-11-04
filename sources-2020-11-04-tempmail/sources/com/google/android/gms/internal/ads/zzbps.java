package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbps implements zzela<zzdkw> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbpr f6689a;

    private zzbps(zzbpr zzbpr) {
        this.f6689a = zzbpr;
    }

    public static zzbps a(zzbpr zzbpr) {
        return new zzbps(zzbpr);
    }

    public static zzdkw b(zzbpr zzbpr) {
        zzdkw a2 = zzbpr.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6689a);
    }
}
