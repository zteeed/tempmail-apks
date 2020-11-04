package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class p5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10172b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10173c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10174d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f10175e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10176f;

    p5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw, String str, String str2, boolean z) {
        this.f10176f = appMeasurementDynamiteService;
        this.f10172b = zzw;
        this.f10173c = str;
        this.f10174d = str2;
        this.f10175e = z;
    }

    public final void run() {
        this.f10176f.zza.P().K(this.f10172b, this.f10173c, this.f10174d, this.f10175e);
    }
}
