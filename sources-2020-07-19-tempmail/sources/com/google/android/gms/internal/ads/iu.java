package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class iu implements zzduu<zzbmw> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxp f4077a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ju f4078b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzdgr f4079c;

    iu(zzdgr zzdgr, zzcxp zzcxp, ju juVar) {
        this.f4079c = zzdgr;
        this.f4077a = zzcxp;
        this.f4078b = juVar;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        synchronized (this.f4079c) {
            zzdvf unused = this.f4079c.h = null;
            zzbmq zzbmq = (zzbmq) this.f4079c.f8034e.b();
            if (zzbmq != null) {
                zzbmq.e().onAdFailedToLoad(b2.f9172b);
                if (((Boolean) zzwg.e().c(zzaav.X3)).booleanValue()) {
                    this.f4079c.f8031b.execute(new hu(this, b2));
                }
            } else {
                this.f4079c.f8033d.onAdFailedToLoad(b2.f9172b);
                this.f4079c.h(this.f4078b).b().a().h().r();
            }
            zzdlj.a(b2.f9172b, th, "AppOpenAdLoader.onFailure");
            this.f4077a.a();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbmw zzbmw = (zzbmw) obj;
        synchronized (this.f4079c) {
            zzdvf unused = this.f4079c.h = null;
            if (((Boolean) zzwg.e().c(zzaav.X3)).booleanValue()) {
                zzbmw.f().e(this.f4079c.f8033d);
            }
            this.f4077a.onSuccess(zzbmw);
        }
    }
}
