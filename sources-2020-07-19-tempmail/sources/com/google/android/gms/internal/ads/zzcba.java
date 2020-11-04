package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcba implements zzela<zzcay> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcay f6783a;

    private zzcba(zzcay zzcay) {
        this.f6783a = zzcay;
    }

    public static zzcba a(zzcay zzcay) {
        return new zzcba(zzcay);
    }

    public final /* synthetic */ Object get() {
        zzcay zzcay = this.f6783a;
        if (zzcay != null) {
            zzelg.b(zzcay, "Cannot return null from a non-@Nullable @Provides method");
            return zzcay;
        }
        throw null;
    }
}
