package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxl implements zzela<Set<zzbyg<zzbsl>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6869a;

    private zzbxl(zzbxa zzbxa) {
        this.f6869a = zzbxa;
    }

    public static zzbxl a(zzbxa zzbxa) {
        return new zzbxl(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<zzbsl>> b2 = this.f6869a.b();
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
