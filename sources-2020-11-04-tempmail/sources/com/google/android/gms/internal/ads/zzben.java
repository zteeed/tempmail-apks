package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzben extends zzaxr {

    /* renamed from: a  reason: collision with root package name */
    final zzbdb f6393a;

    /* renamed from: b  reason: collision with root package name */
    final zzbes f6394b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6395c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f6396d;

    zzben(zzbdb zzbdb, zzbes zzbes, String str, String[] strArr) {
        this.f6393a = zzbdb;
        this.f6394b = zzbes;
        this.f6395c = str;
        this.f6396d = strArr;
        zzq.zzls().c(this);
    }

    public final void zzut() {
        try {
            this.f6394b.u(this.f6395c, this.f6396d);
        } finally {
            zzaye.h.post(new q8(this));
        }
    }
}
