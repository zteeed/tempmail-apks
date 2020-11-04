package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class d40 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ MotionEvent f3786b;

    d40(zzdy zzdy, MotionEvent motionEvent) {
        this.f3786b = motionEvent;
    }

    public final void run() {
        try {
            zzdy.z.zza(this.f3786b);
        } catch (Exception e2) {
            zzdy.B.b(2022, -1, e2);
        }
    }
}
