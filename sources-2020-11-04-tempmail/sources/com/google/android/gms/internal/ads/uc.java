package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class uc implements zzduu<zzbpb> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzduu f5242a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzbpi f5243b;

    uc(zzbpi zzbpi, zzduu zzduu) {
        this.f5243b = zzbpi;
        this.f5242a = zzduu;
    }

    public final void a(Throwable th) {
        this.f5243b.g();
        this.f5242a.a(th);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        this.f5243b.g();
        this.f5242a.onSuccess((zzbpb) obj);
    }
}
