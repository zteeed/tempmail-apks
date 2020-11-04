package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzddc implements zzela<zzdda> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f8067a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<String> f8068b;

    private zzddc(zzelj<Context> zzelj, zzelj<String> zzelj2) {
        this.f8067a = zzelj;
        this.f8068b = zzelj2;
    }

    public static zzddc a(zzelj<Context> zzelj, zzelj<String> zzelj2) {
        return new zzddc(zzelj, zzelj2);
    }

    public static zzdda b(Context context, String str) {
        return new zzdda(context, str);
    }

    public final /* synthetic */ Object get() {
        return b(this.f8067a.get(), this.f8068b.get());
    }
}
