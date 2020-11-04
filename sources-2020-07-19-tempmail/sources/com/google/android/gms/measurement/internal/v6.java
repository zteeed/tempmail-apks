package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class v6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzji f10285b;

    v6(zzji zzji) {
        this.f10285b = zzji;
    }

    public final void run() {
        zzir zzir = this.f10285b.f10494c;
        Context f2 = this.f10285b.f10494c.f();
        this.f10285b.f10494c.m();
        zzir.F(new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
