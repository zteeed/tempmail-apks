package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class lw implements zzcxp<zzchj> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdke f4328a;

    lw(zzdke zzdke) {
        this.f4328a = zzdke;
    }

    public final void a() {
        synchronized (this.f4328a) {
            zzchj unused = this.f4328a.f8119e = null;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzchj zzchj = (zzchj) obj;
        synchronized (this.f4328a) {
            zzchj unused = this.f4328a.f8119e = zzchj;
            this.f4328a.f8119e.b();
        }
    }
}
