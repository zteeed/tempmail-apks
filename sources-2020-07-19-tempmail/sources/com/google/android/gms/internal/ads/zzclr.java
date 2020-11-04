package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzclr implements zzela<Set<zzbyg<AppEventListener>>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzclv> f7216a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Executor> f7217b;

    private zzclr(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        this.f7216a = zzelj;
        this.f7217b = zzelj2;
    }

    public static zzclr a(zzcll zzcll, zzelj<zzclv> zzelj, zzelj<Executor> zzelj2) {
        return new zzclr(zzcll, zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        Set<zzbyg<AppEventListener>> b2 = zzcll.b(this.f7216a.get(), this.f7217b.get());
        zzelg.b(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
