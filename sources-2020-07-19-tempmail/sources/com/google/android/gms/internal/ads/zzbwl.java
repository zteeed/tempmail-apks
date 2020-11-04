package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbwl implements zzela<zzbwj> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Set<zzbyg<AppEventListener>>> f6663a;

    private zzbwl(zzelj<Set<zzbyg<AppEventListener>>> zzelj) {
        this.f6663a = zzelj;
    }

    public static zzbwl a(zzelj<Set<zzbyg<AppEventListener>>> zzelj) {
        return new zzbwl(zzelj);
    }

    public final /* synthetic */ Object get() {
        return new zzbwj(this.f6663a.get());
    }
}
