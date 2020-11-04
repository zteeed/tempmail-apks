package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcna implements zzela<zzcnw> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f7451a;

    private zzcna(zzelj<Context> zzelj) {
        this.f7451a = zzelj;
    }

    public static zzcna a(zzelj<Context> zzelj) {
        return new zzcna(zzelj);
    }

    public static zzcnw b(Context context) {
        zzcnw zzcnw = new zzcnw(context);
        zzelg.b(zzcnw, "Cannot return null from a non-@Nullable @Provides method");
        return zzcnw;
    }

    public final /* synthetic */ Object get() {
        return b(this.f7451a.get());
    }
}
