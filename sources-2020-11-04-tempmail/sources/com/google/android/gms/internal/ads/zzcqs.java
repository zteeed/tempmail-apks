package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqs<DelegateT, AdapterT> implements zzcqt<AdapterT> {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private final zzcqt<DelegateT> f7563a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdrx<DelegateT, AdapterT> f7564b;

    public zzcqs(zzcqt<DelegateT> zzcqt, zzdrx<DelegateT, AdapterT> zzdrx) {
        this.f7563a = zzcqt;
        this.f7564b = zzdrx;
    }

    public final zzdvf<AdapterT> a(zzdkw zzdkw, zzdkk zzdkk) {
        return zzdux.i(this.f7563a.a(zzdkw, zzdkk), this.f7564b, zzbbf.f6320a);
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        return this.f7563a.b(zzdkw, zzdkk);
    }
}
