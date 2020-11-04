package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbzf implements zzela<zzbyz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<VideoController.VideoLifecycleCallbacks>>> f6714a;

    private zzbzf(zzelj<Set<zzbyg<VideoController.VideoLifecycleCallbacks>>> zzelj) {
        this.f6714a = zzelj;
    }

    public static zzbzf a(zzelj<Set<zzbyg<VideoController.VideoLifecycleCallbacks>>> zzelj) {
        return new zzbzf(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbyz(this.f6714a.get());
    }
}
