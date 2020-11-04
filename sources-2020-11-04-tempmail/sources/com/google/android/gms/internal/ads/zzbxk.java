package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxk implements zzela<Set<zzbyg<zzbua>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6868a;

    private zzbxk(zzbxa zzbxa) {
        this.f6868a = zzbxa;
    }

    public static zzbxk a(zzbxa zzbxa) {
        return new zzbxk(zzbxa);
    }

    public static Set<zzbyg<zzbua>> b(zzbxa zzbxa) {
        Set<zzbyg<zzbua>> c2 = zzbxa.c();
        zzelg.b(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6868a);
    }
}
