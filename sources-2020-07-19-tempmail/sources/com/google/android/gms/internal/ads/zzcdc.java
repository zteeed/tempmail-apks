package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcdc implements zzela<zzcck> {

    /* renamed from: a  reason: collision with root package name */
    private final zzccw f6866a;

    private zzcdc(zzccw zzccw) {
        this.f6866a = zzccw;
    }

    public static zzcdc a(zzccw zzccw) {
        return new zzcdc(zzccw);
    }

    public static zzcck b(zzccw zzccw) {
        zzcck a2 = zzccw.a();
        zzelg.b(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6866a);
    }
}
