package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdmg implements zzela<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdmb f8390a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzdlz> f8391b;

    private zzdmg(zzdmb zzdmb, zzelj<zzdlz> zzelj) {
        this.f8390a = zzdmb;
        this.f8391b = zzelj;
    }

    public static Context a(zzdmb zzdmb, zzdlz zzdlz) {
        Context context = zzdlz.f8379a;
        zzelg.b(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    public static zzdmg b(zzdmb zzdmb, zzelj<zzdlz> zzelj) {
        return new zzdmg(zzdmb, zzelj);
    }

    public final /* synthetic */ Object get() {
        return a(this.f8390a, this.f8391b.get());
    }
}
