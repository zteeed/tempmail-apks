package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcol implements zzcom {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, zzelj<zzcom>> f7492a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdvi f7493b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final zzbuv f7494c;

    public zzcol(Map<String, zzelj<zzcom>> map, zzdvi zzdvi, zzbuv zzbuv) {
        this.f7492a = map;
        this.f7493b = zzdvi;
        this.f7494c = zzbuv;
    }

    public final zzdvf<zzdkw> a(zzasm zzasm) {
        this.f7494c.C(zzasm);
        zzdvf<zzdkw> a2 = zzdux.a(new zzcmi(zzdls.f8365c));
        for (String trim : ((String) zzwg.e().c(zzaav.b4)).split(",")) {
            zzelj zzelj = this.f7492a.get(trim.trim());
            if (zzelj != null) {
                a2 = zzdux.k(a2, zzcmi.class, new bm(zzelj, zzasm), this.f7493b);
            }
        }
        zzdux.f(a2, new cm(this), zzbbf.f6325f);
        return a2;
    }
}
