package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g50 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f3850b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3851c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f3852d;

    g50(zzdy zzdy, int i, int i2, int i3) {
        this.f3850b = i;
        this.f3851c = i2;
        this.f3852d = i3;
    }

    public final void run() {
        try {
            zzdy.z.zza(MotionEvent.obtain(0, (long) this.f3850b, 0, (float) this.f3851c, (float) this.f3852d, 0));
        } catch (Exception e2) {
            zzdy.B.b(2022, -1, e2);
        }
    }
}
