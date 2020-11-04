package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class p5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10358b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10359c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10360d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f10361e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10362f;

    p5(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw, String str, String str2, boolean z) {
        this.f10362f = appMeasurementDynamiteService;
        this.f10358b = zzw;
        this.f10359c = str;
        this.f10360d = str2;
        this.f10361e = z;
    }

    public final void run() {
        this.f10362f.zza.P().K(this.f10358b, this.f10359c, this.f10360d, this.f10361e);
    }
}
