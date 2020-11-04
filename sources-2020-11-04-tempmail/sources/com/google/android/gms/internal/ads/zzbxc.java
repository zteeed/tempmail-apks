package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxc implements zzela<Set<zzbyg<zzbua>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6863a;

    private zzbxc(zzbxa zzbxa) {
        this.f6863a = zzbxa;
    }

    public static zzbxc a(zzbxa zzbxa) {
        return new zzbxc(zzbxa);
    }

    public static Set<zzbyg<zzbua>> b(zzbxa zzbxa) {
        Set<zzbyg<zzbua>> emptySet = Collections.emptySet();
        zzelg.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }

    public final /* synthetic */ Object get() {
        return b(this.f6863a);
    }
}
