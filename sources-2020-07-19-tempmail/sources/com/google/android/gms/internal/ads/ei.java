package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class ei implements zzduh {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvf f3729a;

    ei(zzdvf zzdvf) {
        this.f3729a = zzdvf;
    }

    public final zzdvf zzf(Object obj) {
        zzdvf zzdvf = this.f3729a;
        zzbfn zzbfn = (zzbfn) obj;
        if (zzbfn != null && zzbfn.m() != null) {
            return zzdvf;
        }
        throw new zzctw(zzdls.f8180a, "Retrieve video view in instream ad response failed.");
    }
}
