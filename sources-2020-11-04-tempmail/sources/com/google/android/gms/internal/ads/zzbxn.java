package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbxn implements zzela<Set<zzbyg<AdMetadataListener>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbxa f6871a;

    private zzbxn(zzbxa zzbxa) {
        this.f6871a = zzbxa;
    }

    public static zzbxn a(zzbxa zzbxa) {
        return new zzbxn(zzbxa);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<AdMetadataListener>> f2 = this.f6871a.f();
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
