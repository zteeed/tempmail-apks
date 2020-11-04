package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class vc implements zzduu<zzbph> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzduu f5317a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbpi f5318b;

    vc(zzbpi zzbpi, zzduu zzduu) {
        this.f5318b = zzbpi;
        this.f5317a = zzduu;
    }

    public final void a(Throwable th) {
        this.f5317a.a(th);
        this.f5318b.g();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f5318b.f(((zzbph) obj).f6680a, this.f5317a);
    }
}
