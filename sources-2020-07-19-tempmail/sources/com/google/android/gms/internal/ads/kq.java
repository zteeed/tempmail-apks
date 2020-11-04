package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kq implements zzduu<zzbpb> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxp f4236a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzcbc f4237b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzcxr f4238c;

    kq(zzcxr zzcxr, zzcxp zzcxp, zzcbc zzcbc) {
        this.f4238c = zzcxr;
        this.f4236a = zzcxp;
        this.f4237b = zzcbc;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        this.f4237b.d().onAdFailedToLoad(b2.f9172b);
        if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
            this.f4238c.f7684b.e().execute(new mq(this, b2));
        }
        zzdlj.a(b2.f9172b, th, "NativeAdLoader.onFailure");
        this.f4236a.a();
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbpb zzbpb = (zzbpb) obj;
        synchronized (this.f4238c) {
            if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
                zzbpb.f().d(this.f4238c.f7686d.b());
            }
            this.f4236a.onSuccess(zzbpb);
            if (((Boolean) zzwg.e().c(zzaav.Z3)).booleanValue()) {
                this.f4238c.f7684b.e().execute(new nq(this));
            }
        }
    }
}