package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcbd implements zzela<zzccv> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcay f6785a;

    private zzcbd(zzcay zzcay) {
        this.f6785a = zzcay;
    }

    public static zzcbd a(zzcay zzcay) {
        return new zzcbd(zzcay);
    }

    public static zzccv b(zzcay zzcay) {
        zzccv a2 = zzcay.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6785a);
    }
}
