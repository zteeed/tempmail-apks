package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class iu implements zzduu<zzbmw> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxp f4260a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ju f4261b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ zzdgr f4262c;

    iu(zzdgr zzdgr, zzcxp zzcxp, ju juVar) {
        this.f4262c = zzdgr;
        this.f4260a = zzcxp;
        this.f4261b = juVar;
    }

    public final void a(Throwable th) {
        zzuy b2 = zzcmi.b(th);
        synchronized (this.f4262c) {
            zzdvf unused = this.f4262c.h = null;
            zzbmq zzbmq = (zzbmq) this.f4262c.f8217e.b();
            if (zzbmq != null) {
                zzbmq.e().onAdFailedToLoad(b2.f9355b);
                if (((Boolean) zzwg.e().c(zzaav.X3)).booleanValue()) {
                    this.f4262c.f8214b.execute(new hu(this, b2));
                }
            } else {
                this.f4262c.f8216d.onAdFailedToLoad(b2.f9355b);
                this.f4262c.h(this.f4261b).b().a().h().r();
            }
            zzdlj.a(b2.f9355b, th, "AppOpenAdLoader.onFailure");
            this.f4260a.a();
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbmw zzbmw = (zzbmw) obj;
        synchronized (this.f4262c) {
            zzdvf unused = this.f4262c.h = null;
            if (((Boolean) zzwg.e().c(zzaav.X3)).booleanValue()) {
                zzbmw.f().e(this.f4262c.f8216d);
            }
            this.f4260a.onSuccess(zzbmw);
        }
    }
}
