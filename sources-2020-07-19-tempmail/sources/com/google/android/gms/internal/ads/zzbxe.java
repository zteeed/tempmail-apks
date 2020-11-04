package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxe implements zzela<Set<zzbyg<zzbwd>>> {
    private zzbxe(zzbxa zzbxa) {
    }

    public static zzbxe a(zzbxa zzbxa) {
        return new zzbxe(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzelg.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
