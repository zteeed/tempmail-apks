package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbiv implements zzela<zzata> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6462a;

    public zzbiv(zzelj<Context> zzelj) {
        this.f6462a = zzelj;
    }

    public final /* synthetic */ Object get() {
        Context context = this.f6462a.get();
        zzasy zzasy = new zzasy(context, new zzatb(context).a());
        zzelg.b(zzasy, "Cannot return null from a non-@Nullable @Provides method");
        return zzasy;
    }
}
