package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class am implements zzbva {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3574b;

    /* renamed from: c  reason: collision with root package name */
    private final zzavy f3575c;

    am(Context context, zzavy zzavy) {
        this.f3574b = context;
        this.f3575c = zzavy;
    }

    public final void B(zzdkw zzdkw) {
        if (!TextUtils.isEmpty(zzdkw.f8345b.f8340b.f8323d)) {
            this.f3575c.c(this.f3574b, zzdkw.f8344a.f8332a.f8349d);
            this.f3575c.z(this.f3574b, zzdkw.f8345b.f8340b.f8323d);
        }
    }

    public final void C(zzasm zzasm) {
    }
}
