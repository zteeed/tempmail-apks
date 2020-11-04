package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class t4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10249b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10250c;

    t4(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw) {
        this.f10250c = appMeasurementDynamiteService;
        this.f10249b = zzw;
    }

    public final void run() {
        this.f10250c.zza.P().H(this.f10249b);
    }
}
