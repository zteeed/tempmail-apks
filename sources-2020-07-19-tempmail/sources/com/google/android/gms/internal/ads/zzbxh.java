package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxh implements zzela<Set<zzbyg<zzuu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6682a;

    private zzbxh(zzbxa zzbxa) {
        this.f6682a = zzbxa;
    }

    public static zzbxh a(zzbxa zzbxa) {
        return new zzbxh(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzuu>> h = this.f6682a.h();
        zzelg.b(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
