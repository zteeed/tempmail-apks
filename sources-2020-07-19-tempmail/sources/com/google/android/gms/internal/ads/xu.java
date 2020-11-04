package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpb;
import com.google.android.gms.internal.ads.zzbrv;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class xu<R extends zzbrv<AdT>, AdT extends zzbpb> implements zzdnh<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdil<R, zzdmw<AdT>> f5331a;

    public xu(zzdil<R, zzdmw<AdT>> zzdil) {
        this.f5331a = zzdil;
    }

    public final void a(Throwable th) {
    }

    public final void b(zzdmw<AdT> zzdmw) {
        zzdmw.f8227a = ((zzbrv) this.f5331a.b()).a();
    }

    public final zzdvf<zzdmw<AdT>> c(zzdnk zzdnk) {
        zu zuVar = (zu) zzdnk;
        return this.f5331a.a(zuVar.f5495b, zuVar.f5494a);
    }
}
