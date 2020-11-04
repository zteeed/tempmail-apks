package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxq implements zzela<Set<zzbyg<zzqs>>> {
    private zzbxq(zzbxa zzbxa) {
    }

    public static zzbxq a(zzbxa zzbxa) {
        return new zzbxq(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzelg.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
