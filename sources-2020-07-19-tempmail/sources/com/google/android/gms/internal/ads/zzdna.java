package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdna {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<zzdmr, zzdmz<? extends zzbpb>> f8235a = new HashMap<>();

    public final <AdT extends zzbpb> zzdmz<AdT> a(zzdmr zzdmr, Context context, zzdmi zzdmi, zzdnh<AdT> zzdnh) {
        zzdmz<AdT> zzdmz = this.f8235a.get(zzdmr);
        if (zzdmz != null) {
            return zzdmz;
        }
        bx bxVar = new bx(zzdms.u(zzdmr, context));
        zzdmz<AdT> zzdmz2 = new zzdmz<>(bxVar, new zzdne(bxVar, zzdmi, zzdnh));
        this.f8235a.put(zzdmr, zzdmz2);
        return zzdmz2;
    }
}
