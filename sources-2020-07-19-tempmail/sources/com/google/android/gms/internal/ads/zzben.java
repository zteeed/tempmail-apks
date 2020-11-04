package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzben extends zzaxr {

    /* renamed from: a  reason: collision with root package name */
    final zzbdb f6210a;

    /* renamed from: b  reason: collision with root package name */
    final zzbes f6211b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6212c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f6213d;

    zzben(zzbdb zzbdb, zzbes zzbes, String str, String[] strArr) {
        this.f6210a = zzbdb;
        this.f6211b = zzbes;
        this.f6212c = str;
        this.f6213d = strArr;
        zzq.zzls().c(this);
    }

    public final void zzut() {
        try {
            this.f6211b.u(this.f6212c, this.f6213d);
        } finally {
            zzaye.h.post(new q8(this));
        }
    }
}
