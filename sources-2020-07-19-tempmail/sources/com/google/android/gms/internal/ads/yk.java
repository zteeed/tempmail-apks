package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class yk implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzbbn f5399b;

    yk(zzclx zzclx, zzbbn zzbbn) {
        this.f5399b = zzbbn;
    }

    public final void run() {
        zzbbn zzbbn = this.f5399b;
        String c2 = zzq.zzla().r().C().c();
        if (!TextUtils.isEmpty(c2)) {
            zzbbn.a(c2);
        } else {
            zzbbn.c(new Exception());
        }
    }
}
