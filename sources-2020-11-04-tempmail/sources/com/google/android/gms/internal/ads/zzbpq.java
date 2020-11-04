package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpq implements zzela<zzdkk> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbpr f6685a;

    private zzbpq(zzbpr zzbpr) {
        this.f6685a = zzbpr;
    }

    public static zzbpq a(zzbpr zzbpr) {
        return new zzbpq(zzbpr);
    }

    public static zzdkk b(zzbpr zzbpr) {
        zzdkk b2 = zzbpr.b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6685a);
    }
}
