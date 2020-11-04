package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ad implements zzdrx {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3368a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f3369b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f3370c;

    ad(Context context, zzbbd zzbbd, zzdla zzdla) {
        this.f3368a = context;
        this.f3369b = zzbbd;
        this.f3370c = zzdla;
    }

    public final Object apply(Object obj) {
        Context context = this.f3368a;
        zzbbd zzbbd = this.f3369b;
        zzdla zzdla = this.f3370c;
        zzdkk zzdkk = (zzdkk) obj;
        zzayv zzayv = new zzayv(context);
        zzayv.i(zzdkk.y);
        zzayv.j(zzdkk.z.toString());
        zzayv.g(zzbbd.f6131b);
        zzayv.a(zzdla.f8168f);
        return zzayv;
    }
}
