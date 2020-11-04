package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ya implements zzdhf {

    /* renamed from: a  reason: collision with root package name */
    private Context f5368a;

    /* renamed from: b  reason: collision with root package name */
    private String f5369b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbiz f5370c;

    private ya(zzbiz zzbiz) {
        this.f5370c = zzbiz;
    }

    public final zzdhg a() {
        zzelg.c(this.f5368a, Context.class);
        zzelg.c(this.f5369b, String.class);
        return new bb(this.f5370c, this.f5368a, this.f5369b);
    }

    public final /* synthetic */ zzdhf b(String str) {
        zzelg.a(str);
        this.f5369b = str;
        return this;
    }

    public final /* synthetic */ zzdhf c(Context context) {
        zzelg.a(context);
        this.f5368a = context;
        return this;
    }
}
