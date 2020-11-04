package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbub implements zzela<zzbtz> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<AdMetadataListener>>> f6639a;

    private zzbub(zzelj<Set<zzbyg<AdMetadataListener>>> zzelj) {
        this.f6639a = zzelj;
    }

    public static zzbub a(zzelj<Set<zzbyg<AdMetadataListener>>> zzelj) {
        return new zzbub(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbtz(this.f6639a.get());
    }
}
