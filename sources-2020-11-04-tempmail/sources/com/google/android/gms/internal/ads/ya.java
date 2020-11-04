package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ya implements zzdhf {

    /* renamed from: a  reason: collision with root package name */
    private Context f5551a;

    /* renamed from: b  reason: collision with root package name */
    private String f5552b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbiz f5553c;

    private ya(zzbiz zzbiz) {
        this.f5553c = zzbiz;
    }

    public final zzdhg a() {
        zzelg.c(this.f5551a, Context.class);
        zzelg.c(this.f5552b, String.class);
        return new bb(this.f5553c, this.f5551a, this.f5552b);
    }

    public final /* synthetic */ zzdhf b(String str) {
        zzelg.a(str);
        this.f5552b = str;
        return this;
    }

    public final /* synthetic */ zzdhf c(Context context) {
        zzelg.a(context);
        this.f5551a = context;
        return this;
    }
}
