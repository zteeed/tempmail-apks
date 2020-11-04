package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class s30 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5045b;

    s30(zzdy zzdy, Context context) {
        this.f5045b = context;
    }

    public final void run() {
        try {
            zzdy.z.zzb(this.f5045b);
        } catch (Exception e2) {
            zzdy.B.b(2019, -1, e2);
        }
    }
}
