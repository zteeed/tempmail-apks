package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class g7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10210b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10211c;

    g7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw) {
        this.f10211c = appMeasurementDynamiteService;
        this.f10210b = zzw;
    }

    public final void run() {
        this.f10211c.zza.G().T(this.f10210b, this.f10211c.zza.o());
    }
}
