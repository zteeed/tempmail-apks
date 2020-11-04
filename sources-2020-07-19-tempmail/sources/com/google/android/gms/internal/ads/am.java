package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class am implements zzbva {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3391b;

    /* renamed from: c  reason: collision with root package name */
    private final zzavy f3392c;

    am(Context context, zzavy zzavy) {
        this.f3391b = context;
        this.f3392c = zzavy;
    }

    public final void B(zzdkw zzdkw) {
        if (!TextUtils.isEmpty(zzdkw.f8162b.f8157b.f8140d)) {
            this.f3392c.c(this.f3391b, zzdkw.f8161a.f8149a.f8166d);
            this.f3392c.z(this.f3391b, zzdkw.f8162b.f8157b.f8140d);
        }
    }

    public final void C(zzasm zzasm) {
    }
}
