package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxf implements zzela<Set<zzbyg<zzo>>> {
    private zzbxf(zzbxa zzbxa) {
    }

    public static zzbxf a(zzbxa zzbxa) {
        return new zzbxf(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzelg.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
