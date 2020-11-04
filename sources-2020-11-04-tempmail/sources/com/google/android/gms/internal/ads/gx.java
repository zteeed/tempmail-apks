package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gx implements zzduu<zzdmw<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdne f4102a;

    gx(zzdne zzdne) {
        this.f4102a = zzdne;
    }

    public final void a(Throwable th) {
        synchronized (this.f4102a) {
            this.f4102a.g.a(th);
            this.f4102a.f8421c.j(th);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzdmw zzdmw = (zzdmw) obj;
        synchronized (this.f4102a) {
            this.f4102a.g.b(zzdmw);
            if (this.f4102a.f8423e != zzdmu.h) {
                this.f4102a.f8424f.e(this.f4102a.f8420b.b(), zzdmw);
            }
            if (this.f4102a.f8423e == zzdmu.g) {
                this.f4102a.l(this.f4102a.f8420b);
            }
            int unused = this.f4102a.f8423e = zzdmu.g;
            this.f4102a.f8421c.i(zzdmw);
        }
    }
}
