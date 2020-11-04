package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxt implements zzela<Set<zzbyg<zzbyp>>> {
    private zzbxt(zzbxa zzbxa) {
    }

    public static zzbxt a(zzbxa zzbxa) {
        return new zzbxt(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzelg.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
