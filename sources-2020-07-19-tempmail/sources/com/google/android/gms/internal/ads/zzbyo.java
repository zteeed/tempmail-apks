package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyo implements zzbyp {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f6706a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdpd f6707b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6708c;

    public zzbyo(zzdkk zzdkk, zzdpd zzdpd) {
        this.f6706a = zzdkk.n;
        this.f6707b = zzdpd;
    }

    public final void a() {
        if (!this.f6708c) {
            this.f6707b.h(this.f6706a);
            this.f6708c = true;
        }
    }
}
