package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class hq implements zzcxp<zzbpb> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzcxj f4171a;

    hq(zzcxj zzcxj) {
        this.f4171a = zzcxj;
    }

    public final void a() {
        synchronized (this.f4171a) {
            boolean unused = this.f4171a.f7861d = false;
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        zzbpb zzbpb = (zzbpb) obj;
        synchronized (this.f4171a) {
            boolean unused = this.f4171a.f7861d = false;
            zzyd unused2 = this.f4171a.f7860c = zzbpb.d();
            zzbpb.b();
        }
    }
}
