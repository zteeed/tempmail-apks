package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdfp implements zzdec<zzdfq> {

    /* renamed from: a  reason: collision with root package name */
    private zzawz f7994a;

    /* renamed from: b  reason: collision with root package name */
    private String f7995b;

    public zzdfp(zzawz zzawz, zzdvi zzdvi, String str) {
        this.f7994a = zzawz;
        this.f7995b = str;
    }

    public final zzdvf<zzdfq> b() {
        new zzbbn();
        zzdvf<String> g = zzdux.g(null);
        if (((Boolean) zzwg.e().c(zzaav.K2)).booleanValue()) {
            g = this.f7994a.a(this.f7995b);
        }
        zzdvf<String> b2 = this.f7994a.b(this.f7995b);
        return zzdux.h(g, b2).a(new xt(g, b2), zzbbf.f6137a);
    }
}
