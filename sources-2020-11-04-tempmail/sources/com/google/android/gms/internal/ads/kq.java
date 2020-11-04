package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kq implements zzduu<zzbpb> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxp f4419a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzcbc f4420b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzcxr f4421c;

    kq(zzcxr zzcxr, zzcxp zzcxp, zzcbc zzcbc) {
        this.f4421c = zzcxr;
        this.f4419a = zzcxp;
        this.f4420b = zzcbc;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        this.f4420b.d().onAdFailedToLoad(b2.f9355b);
        if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
            this.f4421c.f7867b.e().execute(new mq(this, b2));
        }
        zzdlj.a(b2.f9355b, th, "NativeAdLoader.onFailure");
        this.f4419a.a();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbpb zzbpb = (zzbpb) obj;
        synchronized (this.f4421c) {
            if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
                zzbpb.f().d(this.f4421c.f7869d.b());
            }
            this.f4419a.onSuccess(zzbpb);
            if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
                this.f4421c.f7867b.e().execute(new nq(this));
            }
        }
    }
}
