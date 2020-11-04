package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class dw implements zzduu<zzchj> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxp f3670a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hw f3671b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzdjq f3672c;

    dw(zzdjq zzdjq, zzcxp zzcxp, hw hwVar) {
        this.f3672c = zzdjq;
        this.f3670a = zzcxp;
        this.f3671b = hwVar;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        synchronized (this.f3672c) {
            zzchm zzchm = (zzchm) this.f3672c.f8098e.b();
            if (zzchm != null) {
                zzchm.e().onAdFailedToLoad(b2.f9172b);
                if (((Boolean) zzwg.e().c(zzaav.W3)).booleanValue()) {
                    this.f3672c.f8095b.execute(new fw(this, b2));
                }
            } else {
                this.f3672c.f8097d.onAdFailedToLoad(b2.f9172b);
                this.f3672c.i(this.f3671b).o().a().h().r();
            }
            zzdlj.a(b2.f9172b, th, "RewardedAdLoader.onFailure");
            this.f3670a.a();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzchj zzchj = (zzchj) obj;
        synchronized (this.f3672c) {
            if (((Boolean) zzwg.e().c(zzaav.W3)).booleanValue()) {
                zzchj.f().f(this.f3672c.f8097d);
            }
            this.f3670a.onSuccess(zzchj);
            if (((Boolean) zzwg.e().c(zzaav.W3)).booleanValue()) {
                this.f3672c.f8095b.execute(new gw(this));
            }
            this.f3672c.f8097d.onAdMetadataChanged();
        }
    }
}
