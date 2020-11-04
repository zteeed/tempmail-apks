package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hq implements zzcxp<zzbpb> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxj f3988a;

    hq(zzcxj zzcxj) {
        this.f3988a = zzcxj;
    }

    public final void a() {
        synchronized (this.f3988a) {
            boolean unused = this.f3988a.f7678d = false;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbpb zzbpb = (zzbpb) obj;
        synchronized (this.f3988a) {
            boolean unused = this.f3988a.f7678d = false;
            zzyd unused2 = this.f3988a.f7677c = zzbpb.d();
            zzbpb.b();
        }
    }
}
