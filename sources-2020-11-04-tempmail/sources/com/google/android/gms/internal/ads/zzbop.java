package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbop implements zzela<Runnable> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbom f6640a;

    public zzbop(zzbom zzbom) {
        this.f6640a = zzbom;
    }

    public final /* synthetic */ Object get() {
        Runnable b2 = this.f6640a.b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
