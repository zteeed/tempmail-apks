package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsa implements zzela<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final zzbrx f6613a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f6614b;

    private zzbsa(zzbrx zzbrx, zzelj<Context> zzelj) {
        this.f6613a = zzbrx;
        this.f6614b = zzelj;
    }

    public static zzbsa a(zzbrx zzbrx, zzelj<Context> zzelj) {
        return new zzbsa(zzbrx, zzelj);
    }

    public final /* synthetic */ Object get() {
        Context f2 = this.f6613a.f(this.f6614b.get());
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
