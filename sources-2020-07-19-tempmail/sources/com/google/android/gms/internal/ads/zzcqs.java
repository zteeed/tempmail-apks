package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcqs<DelegateT, AdapterT> implements zzcqt<AdapterT> {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private final zzcqt<DelegateT> f7380a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdrx<DelegateT, AdapterT> f7381b;

    public zzcqs(zzcqt<DelegateT> zzcqt, zzdrx<DelegateT, AdapterT> zzdrx) {
        this.f7380a = zzcqt;
        this.f7381b = zzdrx;
    }

    public final zzdvf<AdapterT> a(zzdkw zzdkw, zzdkk zzdkk) {
        return zzdux.i(this.f7380a.a(zzdkw, zzdkk), this.f7381b, zzbbf.f6137a);
    }

    public final boolean b(zzdkw zzdkw, zzdkk zzdkk) {
        return this.f7380a.b(zzdkw, zzdkk);
    }
}
