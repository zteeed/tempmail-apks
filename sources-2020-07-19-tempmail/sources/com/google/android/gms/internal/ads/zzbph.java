package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbph {

    /* renamed from: a  reason: collision with root package name */
    public final List<? extends zzdvf<? extends zzbpb>> f6497a;

    public zzbph(List<? extends zzdvf<? extends zzbpb>> list) {
        this.f6497a = list;
    }

    public static zzcqt<zzbph> a(zzcqt<? extends zzbpb> zzcqt) {
        return new zzcqs(zzcqt, pc.f4633a);
    }

    public static zzcqt<zzbph> b(zzcsu<? extends zzbpb> zzcsu) {
        return new zzcqs(zzcsu, oc.f4544a);
    }

    public zzbph(zzbpb zzbpb) {
        this.f6497a = Collections.singletonList(zzdux.g(zzbpb));
    }
}
