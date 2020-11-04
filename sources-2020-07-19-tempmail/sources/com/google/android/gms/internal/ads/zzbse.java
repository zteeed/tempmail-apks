package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbse implements zzela<zzdla> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbrx f6619a;

    private zzbse(zzbrx zzbrx) {
        this.f6619a = zzbrx;
    }

    public static zzbse a(zzbrx zzbrx) {
        return new zzbse(zzbrx);
    }

    public static zzdla b(zzbrx zzbrx) {
        zzdla b2 = zzbrx.b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6619a);
    }
}
