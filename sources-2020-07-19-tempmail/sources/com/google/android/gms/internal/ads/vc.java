package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class vc implements zzduu<zzbph> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzduu f5134a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbpi f5135b;

    vc(zzbpi zzbpi, zzduu zzduu) {
        this.f5135b = zzbpi;
        this.f5134a = zzduu;
    }

    public final void a(Throwable th) {
        this.f5134a.a(th);
        this.f5135b.g();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f5135b.f(((zzbph) obj).f6497a, this.f5134a);
    }
}
