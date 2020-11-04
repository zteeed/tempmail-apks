package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class v7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10472b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10473c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10474d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10475e;

    v7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw, String str, String str2) {
        this.f10475e = appMeasurementDynamiteService;
        this.f10472b = zzw;
        this.f10473c = str;
        this.f10474d = str2;
    }

    public final void run() {
        this.f10475e.zza.P().J(this.f10472b, this.f10473c, this.f10474d);
    }
}
