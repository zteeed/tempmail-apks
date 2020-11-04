package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcvy implements zzela<zzcvw> {

    /* renamed from: a  reason: collision with root package name */
    private final zzcvw f7802a;

    private zzcvy(zzcvw zzcvw) {
        this.f7802a = zzcvw;
    }

    public static zzcvy a(zzcvw zzcvw) {
        return new zzcvy(zzcvw);
    }

    public final /* synthetic */ Object get() {
        zzcvw zzcvw = this.f7802a;
        if (zzcvw != null) {
            zzelg.b(zzcvw, "Cannot return null from a non-@Nullable @Provides method");
            return zzcvw;
        }
        throw null;
    }
}
