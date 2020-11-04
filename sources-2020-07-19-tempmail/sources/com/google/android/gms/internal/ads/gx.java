package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gx implements zzduu<zzdmw<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdne f3919a;

    gx(zzdne zzdne) {
        this.f3919a = zzdne;
    }

    public final void a(Throwable th) {
        synchronized (this.f3919a) {
            this.f3919a.g.a(th);
            this.f3919a.f8238c.j(th);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdmw zzdmw = (zzdmw) obj;
        synchronized (this.f3919a) {
            this.f3919a.g.b(zzdmw);
            if (this.f3919a.f8240e != zzdmu.h) {
                this.f3919a.f8241f.e(this.f3919a.f8237b.b(), zzdmw);
            }
            if (this.f3919a.f8240e == zzdmu.g) {
                this.f3919a.l(this.f3919a.f8237b);
            }
            int unused = this.f3919a.f8240e = zzdmu.g;
            this.f3919a.f8238c.i(zzdmw);
        }
    }
}
