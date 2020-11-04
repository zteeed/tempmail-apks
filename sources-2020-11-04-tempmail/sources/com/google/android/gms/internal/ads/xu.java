package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbrv;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xu<R extends zzbrv<AdT>, AdT extends zzbpb> implements zzdnh<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdil<R, zzdmw<AdT>> f5514a;

    public xu(zzdil<R, zzdmw<AdT>> zzdil) {
        this.f5514a = zzdil;
    }

    public final void a(Throwable th) {
    }

    public final void b(zzdmw<AdT> zzdmw) {
        zzdmw.f8410a = ((zzbrv) this.f5514a.b()).a();
    }

    public final zzdvf<zzdmw<AdT>> c(zzdnk zzdnk) {
        zu zuVar = (zu) zzdnk;
        return this.f5514a.a(zuVar.f5678b, zuVar.f5677a);
    }
}
