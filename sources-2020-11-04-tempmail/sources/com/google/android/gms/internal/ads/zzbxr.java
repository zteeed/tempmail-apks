package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxr implements zzela<zzbxa> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6874a;

    private zzbxr(zzbxa zzbxa) {
        this.f6874a = zzbxa;
    }

    public static zzbxr a(zzbxa zzbxa) {
        return new zzbxr(zzbxa);
    }

    public final /* synthetic */ Object get() {
        zzbxa zzbxa = this.f6874a;
        if (zzbxa != null) {
            zzelg.b(zzbxa, "Cannot return null from a non-@Nullable @Provides method");
            return zzbxa;
        }
        throw null;
    }
}
