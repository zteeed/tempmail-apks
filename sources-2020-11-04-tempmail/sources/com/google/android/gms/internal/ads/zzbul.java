package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbul implements zzela<zzbui> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<zzo>>> f6824a;

    private zzbul(zzelj<Set<zzbyg<zzo>>> zzelj) {
        this.f6824a = zzelj;
    }

    public static zzbul a(zzelj<Set<zzbyg<zzo>>> zzelj) {
        return new zzbul(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbui(this.f6824a.get());
    }
}
