package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g50 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f4033b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f4034c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f4035d;

    g50(zzdy zzdy, int i, int i2, int i3) {
        this.f4033b = i;
        this.f4034c = i2;
        this.f4035d = i3;
    }

    public final void run() {
        try {
            zzdy.z.zza(MotionEvent.obtain(0, (long) this.f4033b, 0, (float) this.f4034c, (float) this.f4035d, 0));
        } catch (Exception e2) {
            zzdy.B.b(2022, -1, e2);
        }
    }
}
