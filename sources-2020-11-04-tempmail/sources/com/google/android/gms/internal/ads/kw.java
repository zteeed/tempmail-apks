package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class kw implements zzcxp<zzchj> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdjy f4427a;

    kw(zzdjy zzdjy) {
        this.f4427a = zzdjy;
    }

    public final void a() {
        synchronized (this.f4427a) {
            zzchj unused = this.f4427a.g = null;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzchj zzchj = (zzchj) obj;
        synchronized (this.f4427a) {
            zzchj unused = this.f4427a.g = zzchj;
            this.f4427a.g.b();
        }
    }
}
