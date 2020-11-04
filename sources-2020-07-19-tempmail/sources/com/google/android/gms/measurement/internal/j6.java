package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzw;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.4.3 */
final class j6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzw f10075b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzao f10076c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f10077d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f10078e;

    j6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzw zzw, zzao zzao, String str) {
        this.f10078e = appMeasurementDynamiteService;
        this.f10075b = zzw;
        this.f10076c = zzao;
        this.f10077d = str;
    }

    public final void run() {
        this.f10078e.zza.P().I(this.f10075b, this.f10076c, this.f10077d);
    }
}
