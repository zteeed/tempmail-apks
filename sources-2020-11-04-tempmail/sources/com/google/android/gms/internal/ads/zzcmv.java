package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcmv implements zzela<zzdvf<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzdou> f7441a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<Context> f7442b;

    private zzcmv(zzelj<zzdou> zzelj, zzelj<Context> zzelj2) {
        this.f7441a = zzelj;
        this.f7442b = zzelj2;
    }

    public static zzcmv a(zzelj<zzdou> zzelj, zzelj<Context> zzelj2) {
        return new zzcmv(zzelj, zzelj2);
    }

    public final /* synthetic */ Object get() {
        zzdod<E, O> f2 = this.f7441a.get().g(zzdor.WEBVIEW_COOKIE).c(new fl(zzq.zzky().n(this.f7442b.get()))).a(1, TimeUnit.SECONDS).d(Exception.class, el.f3915a).f();
        zzelg.b(f2, "Cannot return null from a non-@Nullable @Provides method");
        return f2;
    }
}
