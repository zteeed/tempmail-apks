package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzceq implements zzela<zzbyg<VideoController.VideoLifecycleCallbacks>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzchf> f7117a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7118b;

    public zzceq(zzcel zzcel, zzelj<zzchf> zzelj, zzelj<Executor> zzelj2) {
        this.f7117a = zzelj;
        this.f7118b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzbyg zzbyg = new zzbyg(this.f7117a.get(), this.f7118b.get());
        zzelg.b(zzbyg, "Cannot return null from a non-@Nullable @Provides method");
        return zzbyg;
    }
}
