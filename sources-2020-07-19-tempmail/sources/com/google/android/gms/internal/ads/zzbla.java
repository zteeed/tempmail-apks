package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbla implements zzduh<zzdkw, zzdkw> {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, zzbld> f6310a;

    public zzbla(Map<String, zzbld> map) {
        this.f6310a = map;
    }

    public final /* synthetic */ zzdvf zzf(Object obj) throws Exception {
        zzdkw zzdkw = (zzdkw) obj;
        for (zzdkt next : zzdkw.f8162b.f8158c) {
            if (this.f6310a.containsKey(next.f8154a)) {
                this.f6310a.get(next.f8154a).a(next.f8155b);
            }
        }
        return zzdux.g(zzdkw);
    }
}
