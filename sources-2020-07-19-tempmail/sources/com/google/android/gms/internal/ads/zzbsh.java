package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbsh implements zzela<zzavr> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<Context> f6624a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<zzbbd> f6625b;

    /* renamed from: c  reason: collision with root package name */
    private final zzelj<zzdkk> f6626c;

    /* renamed from: d  reason: collision with root package name */
    private final zzelj<zzavt> f6627d;

    private zzbsh(zzbsi zzbsi, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzavt> zzelj4) {
        this.f6624a = zzelj;
        this.f6625b = zzelj2;
        this.f6626c = zzelj3;
        this.f6627d = zzelj4;
    }

    public static zzbsh a(zzbsi zzbsi, zzelj<Context> zzelj, zzelj<zzbbd> zzelj2, zzelj<zzdkk> zzelj3, zzelj<zzavt> zzelj4) {
        return new zzbsh(zzbsi, zzelj, zzelj2, zzelj3, zzelj4);
    }

    public final /* synthetic */ Object get() {
        Context context = this.f6624a.get();
        zzbbd zzbbd = this.f6625b.get();
        zzdkk zzdkk = this.f6626c.get();
        zzavt zzavt = this.f6627d.get();
        if (zzdkk.x != null) {
            return new zzavi(context, zzbbd, zzdkk.x, zzdkk.p.f8145b, zzavt);
        }
        return null;
    }
}
