package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbla implements zzduh<zzdkw, zzdkw> {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, zzbld> f6493a;

    public zzbla(Map<String, zzbld> map) {
        this.f6493a = map;
    }

    public final /* synthetic */ zzdvf zzf(Object obj) throws Exception {
        zzdkw zzdkw = (zzdkw) obj;
        for (zzdkt next : zzdkw.f8345b.f8341c) {
            if (this.f6493a.containsKey(next.f8337a)) {
                this.f6493a.get(next.f8337a).a(next.f8338b);
            }
        }
        return zzdux.g(zzdkw);
    }
}
