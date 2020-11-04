package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbph {

    /* renamed from: a  reason: collision with root package name */
    public final List<? extends zzdvf<? extends zzbpb>> f6680a;

    public zzbph(List<? extends zzdvf<? extends zzbpb>> list) {
        this.f6680a = list;
    }

    public static zzcqt<zzbph> a(zzcqt<? extends zzbpb> zzcqt) {
        return new zzcqs(zzcqt, pc.f4816a);
    }

    public static zzcqt<zzbph> b(zzcsu<? extends zzbpb> zzcsu) {
        return new zzcqs(zzcsu, oc.f4727a);
    }

    public zzbph(zzbpb zzbpb) {
        this.f6680a = Collections.singletonList(zzdux.g(zzbpb));
    }
}
