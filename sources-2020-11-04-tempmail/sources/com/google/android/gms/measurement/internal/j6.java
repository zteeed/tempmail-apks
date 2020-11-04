package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class j6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10261b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzao f10262c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10263d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10264e;

    j6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw, zzao zzao, String str) {
        this.f10264e = appMeasurementDynamiteService;
        this.f10261b = zzw;
        this.f10262c = zzao;
        this.f10263d = str;
    }

    public final void run() {
        this.f10264e.zza.P().I(this.f10261b, this.f10262c, this.f10263d);
    }
}
