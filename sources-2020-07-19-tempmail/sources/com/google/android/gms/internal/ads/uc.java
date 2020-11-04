package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class uc implements zzduu<zzbpb> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzduu f5059a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbpi f5060b;

    uc(zzbpi zzbpi, zzduu zzduu) {
        this.f5060b = zzbpi;
        this.f5059a = zzduu;
    }

    public final void a(Throwable th) {
        this.f5060b.g();
        this.f5059a.a(th);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f5060b.g();
        this.f5059a.onSuccess((zzbpb) obj);
    }
}
