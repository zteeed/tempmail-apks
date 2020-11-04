package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hb implements zzdkb {

    /* renamed from: a  reason: collision with root package name */
    private Context f3949a;

    /* renamed from: b  reason: collision with root package name */
    private String f3950b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbiz f3951c;

    private hb(zzbiz zzbiz) {
        this.f3951c = zzbiz;
    }

    public final /* synthetic */ zzdkb a(Context context) {
        zzelg.a(context);
        this.f3949a = context;
        return this;
    }

    public final zzdkc b() {
        zzelg.c(this.f3949a, Context.class);
        return new kb(this.f3951c, this.f3949a, this.f3950b);
    }

    public final /* synthetic */ zzdkb c(String str) {
        this.f3950b = str;
        return this;
    }
}
