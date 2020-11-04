package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class dw implements zzduu<zzchj> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxp f3853a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hw f3854b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzdjq f3855c;

    dw(zzdjq zzdjq, zzcxp zzcxp, hw hwVar) {
        this.f3855c = zzdjq;
        this.f3853a = zzcxp;
        this.f3854b = hwVar;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        synchronized (this.f3855c) {
            zzchm zzchm = (zzchm) this.f3855c.f8281e.b();
            if (zzchm != null) {
                zzchm.e().onAdFailedToLoad(b2.f9355b);
                if (((Boolean) zzwg.e().c(zzaav.W3)).booleanValue()) {
                    this.f3855c.f8278b.execute(new fw(this, b2));
                }
            } else {
                this.f3855c.f8280d.onAdFailedToLoad(b2.f9355b);
                this.f3855c.i(this.f3854b).o().a().h().r();
            }
            zzdlj.a(b2.f9355b, th, "RewardedAdLoader.onFailure");
            this.f3853a.a();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzchj zzchj = (zzchj) obj;
        synchronized (this.f3855c) {
            if (((Boolean) zzwg.e().c(zzaav.W3)).booleanValue()) {
                zzchj.f().f(this.f3855c.f8280d);
            }
            this.f3853a.onSuccess(zzchj);
            if (((Boolean) zzwg.e().c(zzaav.W3)).booleanValue()) {
                this.f3855c.f8278b.execute(new gw(this));
            }
            this.f3855c.f8280d.onAdMetadataChanged();
        }
    }
}
