package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ad implements zzdrx {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3551a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f3552b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f3553c;

    ad(Context context, zzbbd zzbbd, zzdla zzdla) {
        this.f3551a = context;
        this.f3552b = zzbbd;
        this.f3553c = zzdla;
    }

    public final Object apply(Object obj) {
        Context context = this.f3551a;
        zzbbd zzbbd = this.f3552b;
        zzdla zzdla = this.f3553c;
        zzdkk zzdkk = (zzdkk) obj;
        zzayv zzayv = new zzayv(context);
        zzayv.i(zzdkk.y);
        zzayv.j(zzdkk.z.toString());
        zzayv.g(zzbbd.f6314b);
        zzayv.a(zzdla.f8351f);
        return zzayv;
    }
}
