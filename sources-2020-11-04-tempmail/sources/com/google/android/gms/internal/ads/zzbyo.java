package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzbyo implements zzbyp {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f6889a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdpd f6890b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6891c;

    public zzbyo(zzdkk zzdkk, zzdpd zzdpd) {
        this.f6889a = zzdkk.n;
        this.f6890b = zzdpd;
    }

    public final void a() {
        if (!this.f6891c) {
            this.f6890b.h(this.f6889a);
            this.f6891c = true;
        }
    }
}
