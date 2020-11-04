package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class cq implements zzduu<zzbzj> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcae f3756a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ zzcxd f3757b;

    cq(zzcxd zzcxd, zzcae zzcae) {
        this.f3757b = zzcxd;
        this.f3756a = zzcae;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        synchronized (this.f3757b) {
            zzdvf unused = this.f3757b.l = null;
            this.f3756a.c().onAdFailedToLoad(b2.f9355b);
            if (((Boolean) zzwg.e().c(zzaav.V3)).booleanValue()) {
                this.f3757b.f7853b.e().execute(new gq(this, b2));
                this.f3757b.f7853b.e().execute(new fq(this, b2));
            }
            zzdlj.a(b2.f9355b, th, "InterstitialAdManagerShim.onFailure");
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbzj zzbzj = (zzbzj) obj;
        synchronized (this.f3757b) {
            zzdvf unused = this.f3757b.l = null;
            zzbzj unused2 = this.f3757b.k = zzbzj;
            if (((Boolean) zzwg.e().c(zzaav.Y3)).booleanValue()) {
                zzbvy f2 = zzbzj.f();
                f2.d(this.f3757b.f7856e);
                f2.c(this.f3757b.f7857f);
                f2.a(this.f3757b.h);
                f2.f(this.f3757b.g);
            }
            zzbzj.b();
            if (((Boolean) zzwg.e().c(zzaav.Y3)).booleanValue()) {
                this.f3757b.f7853b.e().execute(new eq(this));
                this.f3757b.f7853b.e().execute(new dq(this));
            }
        }
    }
}
