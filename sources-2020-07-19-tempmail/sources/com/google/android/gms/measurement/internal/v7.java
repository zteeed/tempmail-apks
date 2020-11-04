package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class v7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10286b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10287c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10288d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10289e;

    v7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw, String str, String str2) {
        this.f10289e = appMeasurementDynamiteService;
        this.f10286b = zzw;
        this.f10287c = str;
        this.f10288d = str2;
    }

    public final void run() {
        this.f10289e.zza.P().J(this.f10286b, this.f10287c, this.f10288d);
    }
}
