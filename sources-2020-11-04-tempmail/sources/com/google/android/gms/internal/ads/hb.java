package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hb implements zzdkb {

    /* renamed from: a  reason: collision with root package name */
    private Context f4132a;

    /* renamed from: b  reason: collision with root package name */
    private String f4133b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzbiz f4134c;

    private hb(zzbiz zzbiz) {
        this.f4134c = zzbiz;
    }

    public final /* synthetic */ zzdkb a(Context context) {
        zzelg.a(context);
        this.f4132a = context;
        return this;
    }

    public final zzdkc b() {
        zzelg.c(this.f4132a, Context.class);
        return new kb(this.f4134c, this.f4132a, this.f4133b);
    }

    public final /* synthetic */ zzdkb c(String str) {
        this.f4133b = str;
        return this;
    }
}
