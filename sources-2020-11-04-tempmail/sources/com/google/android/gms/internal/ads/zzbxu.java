package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxu implements zzela<Set<zzbyg<VideoController.VideoLifecycleCallbacks>>> {
    private zzbxu(zzbxa zzbxa) {
    }

    public static zzbxu a(zzbxa zzbxa) {
        return new zzbxu(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzelg.b(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
