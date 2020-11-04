package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbpt implements zzela<String> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbpr f6690a;

    private zzbpt(zzbpr zzbpr) {
        this.f6690a = zzbpr;
    }

    public static zzbpt a(zzbpr zzbpr) {
        return new zzbpt(zzbpr);
    }

    public static String b(zzbpr zzbpr) {
        String c2 = zzbpr.c();
        zzelg.b(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6690a);
    }
}
